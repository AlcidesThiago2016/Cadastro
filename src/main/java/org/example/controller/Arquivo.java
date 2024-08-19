package org.example.controller;

import org.example.model.Usuario;

import java.io.*;
import java.util.ArrayList;

public class Arquivo {

    public Arquivo(){

    }

    public void salvar(Usuario usuario) throws IOException {
        OutputStream os = new FileOutputStream("cadastros.txt", true);
        OutputStreamWriter osw = new OutputStreamWriter(os);
        BufferedWriter bw = new BufferedWriter(osw);

        // Texto
        String texto = usuario.getNome()+ ","+usuario.getIdade()+","+usuario.getSexo()+".";
        bw.append(texto);
        bw.newLine();

        bw.close();
        osw.close();
        os. close();

        System.out.println("Usuario: " + usuario.getNome() +" salvo com sucesso!");
    }

    public ArrayList<String> ler() throws IOException {
        ArrayList<String> arquivo = new ArrayList<>();
        InputStream is = new FileInputStream("cadastros.txt");
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);

        String linha = br.readLine();
        while (linha != null) {
            System.out.println(linha);
            arquivo.add(linha);
            linha = br.readLine();
        }
        br.close();
        isr.close();
        is.close();

        System.out.println("A leitura do arquivo foi concluida com sucesso!");
        return arquivo;
    }
}
