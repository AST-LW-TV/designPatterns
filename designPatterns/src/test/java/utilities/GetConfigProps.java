package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class GetConfigProps {
    private static Properties prop = new Properties();
    private static FileInputStream file;

    // static initializer - runs once when the class is called ...
    static {
        try {
            file = new FileInputStream("./src/test/resources/config.properties");
        } catch (FileNotFoundException e) {
            System.out.println("File not Found");
            System.exit(-1); // unsuccessful termination
        }
    }

    // searches the value from the properties file
    public static String getValue(String key) {
        try {
            prop.load(file);
        } catch (IOException e) {
            System.out.println("File Error...");
            System.exit(-1);
        }
        return prop.getProperty(key);
    }
}
