package com.tsoft.bot.frontend.utility;


import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.*;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.sikuli.script.Screen;


public class Helpers {



    private static String  NOMBRE_CARPETA     				  = Constants.get("nombre_carpeta");
    private static String RUTA_EVIDENCIA                     = Constants.get("ruta_evidencia");
    private static String RUTA_PRINCIPAL	     			  = Constants.getString("ruta_principal");
    private static String RUTA_INPUT	     				  = Constants.get("ruta_Input");
    private static String RUTA_OUTPUT	     				  = Constants.getString("ruta_Output");
    private static String RUTA_LOG	     				  	  = Constants.getString("ruta_Log");
//	 private static String NOMBRE_INPUT	     				  = Constants.get("nombre_input");



    public void sleepSeconds(int seg) {
        // TODO Auto-generated method stub
        try {
            Thread.sleep(seg*1000);
        }catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }


    }

    public static void CapturaJava(String Nombre) {


        try {
            BufferedImage captura;
            captura = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()) );
            File file = new File(RUTA_EVIDENCIA+"/"+NOMBRE_CARPETA +"/CAPTURAS/" + Nombre+ ".png");

            try {
                ImageIO.write(captura, "png", file);
            } catch (IOException e) {

                e.printStackTrace();
            }

        } catch (AWTException e) {
            //Enviar log error al capturar la imagen desde java
            e.printStackTrace();
        }


    }

    public void CapturaSikuli(String Ruta,String Nombre) {

        Screen screen = new Screen();
        screen.saveScreenCapture(RUTA_EVIDENCIA+"/"+NOMBRE_CARPETA+"/CAPTURAS/", Nombre);

    }


    public void CrearCarpeta() {

        File directorio = new File(RUTA_EVIDENCIA+"/"+NOMBRE_CARPETA);
        File directorioca = new File(RUTA_EVIDENCIA+"/"+NOMBRE_CARPETA+"/CAPTURAS");
        if (!directorio.exists()) {
            if (directorio.mkdirs()) {
                directorioca.mkdirs();
                System.out.println("Directorio creado");
            } else {
                System.out.println("ErrorTest al crear directorio");
            }
        }

    }
    public void CopiarExcel() {

        InputStream inputStream = null;
        OutputStream outputStream = null;
        try {
            String NOMBRE_INPUT	     =  Constants.get("nombre_input");

            File archivoOriginal = new File(RUTA_INPUT+"/"+NOMBRE_INPUT);
            File archivoCopia = new File(RUTA_EVIDENCIA+"/"+NOMBRE_CARPETA+"/"+NOMBRE_INPUT);
            inputStream = new FileInputStream(archivoOriginal);
            outputStream = new FileOutputStream(archivoCopia);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = inputStream.read(buffer)) > 0) {
                outputStream.write(buffer, 0, length);
            }
            inputStream.close();
            outputStream.close();
            System.out.println("Archivo copiado");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public void CrearArbol() {

        File directorioPrincipal = new File(RUTA_PRINCIPAL);
        File directorioInput = new File(RUTA_INPUT);
        File directorioOutput = new File(RUTA_OUTPUT);
        File directorioLog = new File(RUTA_LOG);
        File directorioEvidencia = new File(RUTA_EVIDENCIA);

        if (!directorioPrincipal.exists()) {
            if (directorioPrincipal.mkdirs()) {

                directorioPrincipal.mkdirs();
                directorioPrincipal.canWrite();
                directorioPrincipal.canRead();
                directorioPrincipal.canExecute();

                directorioInput.mkdirs();
                directorioInput.canWrite();
                directorioInput.canRead();
                directorioInput.canExecute();


                directorioOutput.mkdirs();
                directorioOutput.canWrite();
                directorioOutput.canRead();
                directorioOutput.canExecute();

                directorioLog.mkdirs();
                directorioLog.canWrite();
                directorioLog.canRead();
                directorioLog.canExecute();

                directorioEvidencia.mkdirs();
                directorioEvidencia.canWrite();
                directorioEvidencia.canRead();
                directorioEvidencia.canExecute();

                System.out.println("Directorio creado");
            } else {
                System.out.println("Directorio ya existe");
            }

        }else {
            System.out.println("Directorio ya existe");
        }
    }

    public void CopiarInput() {
        InputStream inputStream = null;
        OutputStream outputStream = null;
        try {
            String NOMBRE_INPUT	     				  = Constants.get("nombre_input");
            String currentDirectory = System.getProperty("user.dir");
            String ruta_src = "/src/test/resources";

            File archivoOriginal = new File(currentDirectory+ruta_src+"//Demo.xlsx");
            File archivoCopia = new File(RUTA_INPUT+"/"+NOMBRE_INPUT);
            inputStream = new FileInputStream(archivoOriginal);

            outputStream = new FileOutputStream(archivoCopia);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = inputStream.read(buffer)) > 0) {
                outputStream.write(buffer, 0, length);
            }
            inputStream.close();
            outputStream.close();
            System.out.println("Archivo copiado.");
        } catch (IOException r) {
            r.printStackTrace();
        }
    }







}

