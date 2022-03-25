package br.com.iteris.universidade;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class Main {

    public static void main(String[] args) throws Exception {
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
