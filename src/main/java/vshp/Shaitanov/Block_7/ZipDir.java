package vshp.Shaitanov.Block_7;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

class ZipDir {
    public static void exec(String zipFile, String zippedDir)
            throws FileNotFoundException, IOException {

        ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(zipFile));
        walkingDir(zos, zippedDir);
        zos.close();
    } //exec(String, String)

    public static void walkingDir(ZipOutputStream zos, String zippedDir) {

        File zipDir = new File(zippedDir);
        String[] dirList = zipDir.list();

        for (int i = 0; i < dirList.length; i++) {

            File f = new File(dirList[i]);
            if (f.isDirectory()) {
                String filePath = f.getPath();
                walkingDir(zos, filePath);
                continue;
            } else {

                try {
                    byte[] readBuffer = new byte[2048];
                    int bytesReaded = 0;

                    String  fullPath = zippedDir + "\\" + f.getPath();
                    System.out.println("\t архивируется " + fullPath);
                    FileInputStream fis =
                            new FileInputStream(fullPath);
                    ZipEntry ze = new ZipEntry(fullPath);
                    zos.write(readBuffer, 0, bytesReaded);
                }
                fis.close();
            } catch (FileNotFoundException fnfe) {
                System.out.println(fnfe.getMessage());
            } catch (IOException ioe) {
                System.out.println(ioe.getMessage());
            }
        } // ! isDirectory
    }
}


