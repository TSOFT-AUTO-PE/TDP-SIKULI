package com.tsoft.bot.frontend.utility;

import org.apache.commons.lang3.StringUtils;
import java.io.*;
import java.util.Properties;

public class Constants {

    private static final String ENCODING = "UTF-8";
    /**Para pruebas**/
    private static final String FOLDER_PROPERTIES = System.getProperty("user.dir") + "/src/test/resources/locators/";


    /**Para Compilar**/
//	  private static final String FOLDER_PROPERTIES = System.getProperty("user.dir") + "/test-classes/locators/";



    private static Properties INSTANCE = null;

    private static Properties getInstance() {

        try {

//	            if (INSTANCE == null) {

            INSTANCE = new Properties();

            if (new File(FOLDER_PROPERTIES).exists()) {

                for (File file : new File(FOLDER_PROPERTIES).listFiles()) {

                    if (file.isFile() && file.getName().endsWith(".loc")) {


                        FileInputStream is = new FileInputStream(file);

                        INSTANCE.load(new InputStreamReader(is, ENCODING));

                    }
                }
            }
//	            }

        } catch (Exception e) {

            System.out.println("[ERROR] - Ocurrió un error al leer archivo de propiedades: " + e.getMessage());

        }

        return INSTANCE;
    }
    public static String getString(String key) {

        return getInstance().getProperty(key, StringUtils.EMPTY);

    }

    public static String get(String key) {

        return getInstance().getProperty(key, StringUtils.EMPTY);

    }
}

