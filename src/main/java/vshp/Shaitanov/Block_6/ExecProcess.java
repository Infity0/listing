package vshp.Shaitanov.Block_6;

import java.io.IOException;

public class ExecProcess {
    public static void main(String[] args) {
        try {
            /*Запуск программы Блокнот
             * в Windows */
            Runtime.getRuntime().exec("notepad.exe");
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}

