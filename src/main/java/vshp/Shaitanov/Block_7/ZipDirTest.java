package vshp.Shaitanov.Block_7;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ZipDirTest {

    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java zipDirTest <имя_архива <имя_папкм>");
            return;
        }

        String zipFile = args[0];
        String zippedDir = args[1];

        try {
            System.out.println("Начало архивации папки: " + zippedDir);
            ZipDir.exec(zipFile, zippedDir);
            System.out.println("Аръив был записан успешно: " + zipFile);
        } catch (FileNotFoundException fnfe) {
            System.out.println(fnfe.getMessage());
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }
    } //main
} //ZipDirTest class

