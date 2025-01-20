package utils;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigManager {

    private Properties properties = new Properties();
    FileReader reader;

    public ConfigManager()  {
        try {
           // reader = new FileReader("backendconfig/config.properties");
            String rootpath = Thread.currentThread().getContextClassLoader().getResource("").getPath();

            InputStream reader = Thread.currentThread().getContextClassLoader().getResourceAsStream("backendconfig/config.properties");
            properties.load(reader);
        }catch (Exception e)
        {
          e.printStackTrace();
        }

    }

    public String get(String key) {
        return properties.getProperty(key);
    }
}
