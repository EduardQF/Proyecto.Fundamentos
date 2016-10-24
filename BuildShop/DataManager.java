package buildshop;

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

	public static void setAcces(boolean admin, boolean inventory, boolean dealer) {
		user_access[0] = admin;
		user_access[1] = inventory;
		user_access[2] = dealer;
	}
	
	public static boolean getAccess(int i){
		return user_access[i];
	}

	public static void readDB() {
		System.out.println("Reading DB");
		String temp_db[] = DataReader.readData("C:/BuildShop/DB/users.buildshop", "¦»»»¦");
		System.out.println("DataBase Size: "+temp_db.length+"\n"+(temp_db.length/7)+" Users Detected");
		for (int i = 0; i < temp_db.length; i += 6){
			db_user.add(new User(temp_db[i], temp_db[i + 1], temp_db[i + 2], temp_db[i + 3], temp_db[i + 4],
					temp_db[i + 5]));
			System.out.println("Reading ID: "+temp_db[i]);}
	}
	
	public static boolean findUser(String user, String pass) {
		for (int i = 0; i < db_user.size(); i++) {
			if (user.equalsIgnoreCase(db_user.get(i).getID()) && pass.equals(db_user.get(i).getPassword())) {
				user_id = i;
				if (db_user.get(i).getAccess().equals("admin")){
					user_access[0] = true; user_access[1] = true;
					user_access[2] = true;
				} else if (db_user.get(i).getAccess().equals("fulluser")){
					user_access[0] = true; user_access[1] = true; 
					user_access[2] = false;
				} else if (db_user.get(i).getAccess().equals("inventory")){
					user_access[0] = false; user_access[1] = true; 
					user_access[2] = false;
				} else if (db_user.get(i).getAccess().equals("seller")){
					user_access[0] = true; user_access[1] = false; 
					user_access[2] = false;
				}
				return true;
			}
		}
		return false;
	}

}
