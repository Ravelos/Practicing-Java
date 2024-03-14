package br.com.i.universidade;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("lorem.txt");

        // importing reader in a general way
        Reader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);
        String line = br.readLine();


        // printing everything

        while (line != null){
            System.out.println(line);
            line = br.readLine();
        }
        br.close();

    }
}
