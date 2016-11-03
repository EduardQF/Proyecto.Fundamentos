package  builshop;

import java.util.ArrayList;

public class DataManager {
	private static LoadingScreen ls = new LoadingScreen();
	private static ArrayList<User> db_user = new ArrayList<User>();
	private static ArrayList<Client> db_client = new ArrayList<Client>();
	private static ArrayList<Product> db_product = new ArrayList<Product>();
	private static int user_id = -1;
	private static boolean[] user_access = new boolean[] { false, false, false };

	public static void showLS() {
		ls.setVisible(true);
	}

	public static void hideLS() {
		ls.setVisible(false);
	}

	public static void setID(int id) {
		user_id = id;
	}

	public static int getID() {
		return user_id;
	}

	public static void setAcces(boolean admin, boolean inventory, boolean seller) {
		user_access[0] = admin;
		user_access[1] = inventory;
		user_access[2] = seller;
	}

	public static boolean getAccess(int i) {
                user_access[0]=true;
		return user_access[i];
	}

	public static void newProduct(String id, String code, String name, int cost, int price, int stock, String unit) {
		db_product.add(new Product(id, code, name, cost, price, stock, unit));
	}

	public static void readUsers() {
		System.out.println("Reading DB");
		String temp_db[] = DataReader.readData("C:/BuildShop/DB/users.buildshop");
		System.out.println("DataBase Size: " + temp_db.length + "\n" + (temp_db.length / 7) + " Users Detected");
		for (int i = 0; i < temp_db.length; i += 6) {
			db_user.add(new User(temp_db[i], temp_db[i + 1], temp_db[i + 2], temp_db[i + 3], temp_db[i + 4],
					temp_db[i + 5]));
			System.out.println("Reading ID: " + temp_db[i]);
		}
	}

	public static void readProducts() {
		System.out.println("Reading Products");
		String temp_db[] = DataReader.readData("C:/BuildShop/DB/products.buildshop");
		System.out.println("DataBase Size: " + temp_db.length + "\n" + (temp_db.length / 8) + " Products Detected");
		for (int i = 0; i < temp_db.length; i += 7) {
			db_product.add(new Product(temp_db[i], temp_db[i + 1], temp_db[i + 2], Integer.valueOf(temp_db[i + 3]),
					Integer.valueOf(temp_db[i + 4]), Integer.valueOf(temp_db[i + 5]), temp_db[i + 6]));
			System.out.println("Reading ID: " + temp_db[i]);
		}
	}

	public static void readClients() {
		System.out.println("Reading Clients");
		String temp_db[] = DataReader.readData("C:/BuildShop/DB/clients.buildshop");
		System.out.println("DataBase Size: " + temp_db.length + "\n" + (temp_db.length / 1) + " Clients Detected");
		for (int i = 0; i < temp_db.length; i += 1) {
			db_client.add(new Client());
			System.out.println("Reading ID: " + "null");
		}
	}
	
	public static void writeUsers() {
		String data = "";
		for (int i = 0; i < db_user.size(); i++) {
			if (i != 0) {
				data += "�����";
			}
			data += db_user.get(i).getID();
			data += "�����";
			data += db_user.get(i).getPassword();
			data += "�����";
			data += db_user.get(i).getAccess();
			data += "�����";
			data += db_user.get(i).getFirstName();
			data += "�����";
			data += db_user.get(i).getLastName();
			data += "�����";
			data += db_user.get(i).getEmail();
		}
		DataReader.writeData("C:/BuildShop/DB/users.buildshop", data);
	}

	public static void writeProducts() {
		String data = "";
		for (int i = 0; i < db_product.size(); i++) {
			if (i != 0) {
				data += "�����";
			}
			data += db_product.get(i).getID();
			data += "�����";
			data += db_product.get(i).getCode();
			data += "�����";
			data += db_product.get(i).getName();
			data += "�����";
			data += String.valueOf(db_product.get(i).getCost());
			data += "�����";
			data += String.valueOf(db_product.get(i).getPrice());
			data += "�����";
			data += String.valueOf(db_product.get(i).getStock());
			data += "�����";
			data += db_product.get(i).getUnit();
		}
		DataReader.writeData("C:/BuildShop/DB/products.buildshop", data);
	}

	public static void writeClients() {
		String data = "";
		for (int i = 0; i < db_client.size(); i++) {
			if (i != 0) {
				data += "�����";
			}
		}
		DataReader.writeData("C:/BuildShop/DB/clients.buildshop", data);
	}

	public static boolean findUser(String user, String pass) {
		for (int i = 0; i < db_user.size(); i++) {
			if (user.equalsIgnoreCase(db_user.get(i).getID()) && pass.equals(db_user.get(i).getPassword())) {
				user_id = i;
				if (db_user.get(i).getAccess().equals("admin")) {
					user_access[0] = true;
					user_access[1] = true;
					user_access[2] = true;
				} else if (db_user.get(i).getAccess().equals("fulluser")) {
					user_access[0] = false;
					user_access[1] = true;
					user_access[2] = true;
				} else if (db_user.get(i).getAccess().equals("inventory")) {
					user_access[0] = false;
					user_access[1] = true;
					user_access[2] = false;
				} else if (db_user.get(i).getAccess().equals("seller")) {
					user_access[0] = false;
					user_access[1] = false;
					user_access[2] = true;
				}
				return true;
			}
		}
		return false;
	}

}
