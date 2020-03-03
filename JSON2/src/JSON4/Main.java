package JSON4;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.HashMap;
import json.quickconnectfamily.json.JSONException;
import json.quickconnectfamily.json.JSONInputStream;
import json.quickconnectfamily.json.JSONOutputStream;
import json.quickconnectfamily.json.JSONUtilities;


public class Main {

    public static void main(String[] args) {

        System.out.println("This creates an object string:");
        Car charger = new Car("Dodge", "Charger", 2009, false);

        try {
            String jsonString = JSONUtilities.stringify(charger);
            System.out.println(jsonString);
        } catch (JSONException e) {
            System.out.println("Error Creating File");
        }

        System.out.println("\nThis writes the object string out to a file:");
        Car impala = new Car("Chevy", "Impala", 2005, false);

        File guestFile = new File("carFile.json");

        System.out.println(impala.getModel() + " has been written to a file.");

        try {
            FileOutputStream fileStream = new FileOutputStream(guestFile);
            JSONOutputStream jsonOut = new JSONOutputStream(fileStream);
            jsonOut.writeObject(impala);
            jsonOut.close();
        } catch (Exception e) {
            System.out.println("Error Writing File Out");
        }

        // Read Object from file
        System.out.println("\nThis reads the object string in from a file:");

        try {
            FileInputStream guestIn = new FileInputStream(guestFile);
            JSONInputStream jsonIn = new JSONInputStream(guestIn);
            HashMap jsonMap = (HashMap) jsonIn.readObject();
            jsonIn.close();

            Car carInfo = new Car();
            long year = (long) jsonMap.get("year");
            boolean convertible = (boolean) jsonMap.get("convertible");
            carInfo.setYear((int) year);
            carInfo.setConvertible(convertible);
            carInfo.setMake((String) jsonMap.get("make"));
            carInfo.setModel((String) jsonMap.get("model"));

            String outputString = JSONUtilities.stringify(carInfo);
            System.out.println(outputString);
        } catch (Exception e) {
            System.out.println("Error Reading File Input");
            e.printStackTrace();

        }

        // Error formats - image files
        try {
            FileInputStream fileOut = new FileInputStream("img.jpg");
            JSONInputStream jsonIn = new JSONInputStream(fileOut);
            jsonIn.close();

        } catch (Exception e) {
            System.out.println("\nCannot Read File: IMG");

        }
        //Catching Null Obects
        try {
            FileInputStream fileInput = new FileInputStream("test1.txt");
            JSONInputStream jsonIn = new JSONInputStream(fileInput);

            HashMap jsonMap = (HashMap) jsonIn.readObject();
            jsonIn.close();
        } catch (Exception e) {
            System.out.println("\nCannot Read an Empty File");
            e.printStackTrace();
        }
    }
}
