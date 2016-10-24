package pBuildShop;

import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.NoSuchFileException;
import java.util.Calendar;

public class DefaultData {
	public static String defFolder = "C:/BuildShop";
		
	public static void newData(NoSuchFileException error) throws IOException{
    	new File(defFolder+"/DB").mkdirs(); // if (Folder not found) {Create Folder}
    	String[][] data = new String[][]
    			//Usuario,Contraseña,Tipo,Nombre,ApellidoP,ApellidoM,Email
    			{{"admin","admin","admin","Admin","null","null","null"}};
    	try {
    		wFile2D(defFolder+"/DB","/users.buildshop",data);
    		wLog(defFolder+"/LOG",error, "DataBase Error : System Restored to Default Data\n\n");
    	} catch (IOException e) {	}
    }
	
	public static void wFile2D(String folder, String file, String data[][]) throws IOException {
    	new File(folder).mkdirs(); // if (Folder not found) {Create Folder}
    	PrintWriter pw = new PrintWriter(new FileWriter(folder+file));
    	for (int d = 0; d < data.length; d++) {
    		for (int D = 0; D < data[d].length; D++){
    			pw.write(data[d][D]);
        		if (d < data.length-1 || D < data[d].length-1){
            		pw.write("¦»»»¦"); // «««
        		}
    		}
    	}
    	pw.close();
    }
	public static void wLog(String folder, IOException e, String error) throws IOException{
		new File(folder).mkdirs(); // if (Folder not found) {Create Folder}
        Calendar date = Calendar.getInstance();
        String time = Integer.toString(date.get(Calendar.YEAR))+"_";
        if (date.get(Calendar.DAY_OF_YEAR) < 10){time += "00";}
        else if (date.get(Calendar.DAY_OF_YEAR) < 100){time += "0";}
        time += Integer.toString(date.get(Calendar.DAY_OF_YEAR))+"_";
        if (date.get(Calendar.HOUR_OF_DAY) < 10){time += "0";}
        time += Integer.toString(date.get(Calendar.HOUR_OF_DAY))+"_";
        if (date.get(Calendar.MINUTE) < 10){time += "0";}
        time += Integer.toString(date.get(Calendar.MINUTE))+"_";
        if (date.get(Calendar.SECOND) < 10){time += "0";}
        time += Integer.toString(date.get(Calendar.SECOND));
    	PrintWriter pw = new PrintWriter(new FileWriter(folder+"/"+time+".txt"));
    	pw.write(error);
    	e.printStackTrace(pw);
    	pw.close();
	}

}

