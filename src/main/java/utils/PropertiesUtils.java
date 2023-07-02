package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class PropertiesUtils {

    public static final Properties properties = new Properties();

    //Using hashmap is recommended
    // Using try with resources as it will close the connection once the block is executed &
    // we can implement failsafe mechanism of throwing the meaningful exception & the execution will  exit

    private static Map<String, String> MAP = new HashMap<>();

    static {
        // try with resources
        try (FileInputStream fileInputStream =
                     new FileInputStream(System.getProperty("user.dir") +
                "/src/test/resources/configs/Config.properties")) {

            properties.load(fileInputStream);

            for (Map.Entry<Object, Object> entry : properties.entrySet()) {
                String key = entry.getKey().toString();
                String value = String.valueOf(entry.getValue());
                MAP.put(key, value);
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(0);
        }
    }

    public static String getValue(String key) {
        return MAP.get(key);
    }
}
