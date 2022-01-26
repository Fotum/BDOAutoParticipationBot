package org.fotum.app;

import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

import java.io.File;

public class MainApp
{
    public static void main(String[] args)
    {
        File imageFile = new File("C:\\Users\\user\\Desktop\\TessTest\\tessTest.png");
        ITesseract instance = new Tesseract();
        instance.setDatapath("D:\\Progs\\TesseractOCR\\tessdata");
        instance.setPageSegMode(4);
        instance.setLanguage("eng+rus");

        try
        {
            String result = instance.doOCR(imageFile);
            System.out.println(result);
        }
        catch (TesseractException ex)
        {
            ex.printStackTrace();
        }
    }
}
