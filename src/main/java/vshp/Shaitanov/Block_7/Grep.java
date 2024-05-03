package vshp.Shaitanov.Block_7;

import java.io.FileInputStream;
import java.io.IOException;

public class Grep {

    public static void main(String[] args) {

        if ((args.length == 0) || (args.length > 2)) {
            System.out.println("Usage: java Grep <образец> <имя_файла>");
            System.exit(0);
        }
        try {
            FileInputStream fis = new FileInputStream(args[1]);
            GrepInputStream gis =
                    new GrepInputStream((InputStream) fis, args[0]);
            String line;
            for (;;) {
                line = gis.readLine();
                if (line == null) break;
                System.out.println(line);
            } //for (;;)
            gis.close();

        } catch (IOException ioe) {
            System.err.println(ioe.getMessage());
        }
    }
}

