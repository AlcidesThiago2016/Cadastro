package org.example.controller;

import org.example.model.Usuario;

import java.io.*;

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

    public void ler(Usuario usuario) throws IOException {
        InputStream is = new FileInputStream("cadastros.txt");
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);
        String linha = br.readLine();
    }
}
