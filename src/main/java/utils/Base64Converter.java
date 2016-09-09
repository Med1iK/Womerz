/*
package utils;

import org.apache.xerces.impl.dv.util.Base64;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.util.ArrayList;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
//import org.apache.commons.codec.binary.Base64;

public class Base64Converter {


    public void Converter() {

        File file = new File("C:\\Users\\Soko\\Desktop\\Work projects\\BN-GC341_thorin_G_20141219095006.jpg");

        try {
            // Reading a Image file from file system
            FileInputStream imageInFile = new FileInputStream(file);
            byte imageData[] = new byte[(int) file.length()];
            imageInFile.read(imageData);

            // Converting Image byte array into Base64 String
            String imageDataString = encodeImage(imageData);
            System.out.println(imageData.toString());

            // Converting a Base64 String into Image byte array
            byte[] imageByteArray = decodeImage(imageDataString);
            System.out.println(imageDataString.toString());

            // Write a image byte array into file system
            FileOutputStream imageOutFile = new FileOutputStream("C:\\Users\\Soko\\Desktop\\Work projects\\BN-GC341_thorin_G_20141219095006AfterConvert.jpg");

            imageOutFile.write(imageByteArray);

            imageInFile.close();
            imageOutFile.close();

            System.out.println("Image Successfully Manipulated!");
        } catch (FileNotFoundException e) {
            System.out.println("Image not found" + e);
        } catch (IOException ioe) {
            System.out.println("Exception while reading the Image " + ioe);
        }
    }

    */
/**
     * Encodes the byte array into base64 string
     *
     * @param imageByteArray - byte array
     * @return String a {@link java.lang.String}
     *//*

    public static String encodeImage(byte[] imageByteArray) {
        return org.apache.commons.codec.binary.Base64.encodeBase64URLSafeString(imageByteArray);
    }

    */
/**
     * Decodes the base64 string into byte array
     *
     * @param imageDataString - a {@link java.lang.String}
     * @return byte array
     *//*

    public static byte[] decodeImage(String imageDataString) {
        return org.apache.commons.codec.binary.Base64.decodeBase64(imageDataString);
    }
}

*/
/*public class Base64Converter {

*//*
*/
/*        public static void main(String[] args)
        {
            try
            {
                FileWriter fstream = new FileWriter("C:\\Users\\Soko\\Desktop\\Work projects\\BN-GC341_thorin_G_20141219095006.jpg");
                BufferedWriter out = new BufferedWriter(fstream);

                File folder = new File("./flags/");
                File[] listOfFiles = folder.listFiles();

                for (int i = 0; i < listOfFiles.length; i++)
                {
                    if (listOfFiles[i].isFile())
                    {
                        Base64Converter.readFile(out, listOfFiles[i]);
                    }
                }

                out.close();
                System.out.println("Done");
            }
            catch (Exception e) {}
        }

    public static void readFile(BufferedWriter out, File file)
    {
        try
        {
            byte[] byteArray = new byte[102400];
            FileInputStream fis = new FileInputStream(file);
            String base64String;
            int bytesRead = 0;
            while ((bytesRead = fis.read(byteArray)) != -1)
            {
                new String(byteArray, 0, bytesRead);
                base64String = Base64.encode(byteArray);
                out.write("public static ImageIcon getFlag" + file.getName() + "()");
                out.newLine();
                out.write("{");
                out.newLine();
                ArrayList<String> array = Base64Converter.cut(base64String);
                out.write("return Utils.toImage(\"" + array.get(0) + "\"");
                for (int i=1; i<array.size()-1; i++)
                {
                    out.write("<tab>+\"" + array.get(i) + "\"");
                }
                out.write("<tab>\"" + array.get(array.size() - 1) + "\");");
                out.newLine();
                out.write("}");
                out.newLine();
                out.newLine();
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public static ArrayList<String> cut(String in)
    {
        ArrayList<String> array = new ArrayList<String>();
        while (in.length() > 76)
        {
            array.add( in.substring(0, 77) );
            in = in.substring(77);
        }
        return array;
    }*//*
*/
/*

}*//*


*/
