package vshp.Shaitanov.Block_7;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

class GrepInputStream extends FileInputStream {
    String substring = null; //Образец для поиска
    BufferedReader br;

    public GrepInputStream(InputStream in, String substring)
    {
        super(in);
        this.br = new BufferedReader(new InputStreamReader(in));
        this.substring = substring;
    }

    public final String readLine() throws IOException {

        String line;

        do {
            line = br.readLine();
        } while ((line != null) && line.indexOf(substring) == -1);
        return line;
    }
}

