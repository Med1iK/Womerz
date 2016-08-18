package utils;

import org.apache.xerces.impl.dv.util.Base64;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.util.ArrayList;




public class Base64Converter {

        public static void main(String[] args)
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
    }
}