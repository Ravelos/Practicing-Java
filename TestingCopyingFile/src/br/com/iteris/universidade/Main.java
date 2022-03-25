package br.com.iteris.universidade;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        InputStream fis = new FileInputStream("lorem.txt");
        Reader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);

        OutputStream fos = new FileOutputStream("lorem2.txt");
        Writer osw =new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(osw);

        String line = br.readLine();

        while (line != null) {
            bw.write(line);
            bw.newLine();
            line = br.readLine();

        }

        br.close();
        bw.close();
        /*
        A leitura não necessariamente precisa ser de um arquivo.
         Acima, se você utilizar o System.in,
         você irá gravar no arquivo o que o usuário digitar.
         Mas para conseguir parar o console, verifique também se a linha não estará vazia
         */
    }
}
