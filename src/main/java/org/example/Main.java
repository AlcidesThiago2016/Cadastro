package org.example;

import org.example.controller.Arquivo;
import org.example.model.Usuario;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("*****---SISTEMA DE CADASTRO---******");

        Usuario user1 = new Usuario("Alcides", 30, 'M');
        Usuario user2 = new Usuario("Ricardo", 24, 'M');
        Usuario user3 = new Usuario("Vanessa", 26, 'F');
        Usuario user4 = new Usuario("Ana", 18, 'F');

        Arquivo arquivo = new Arquivo();
        arquivo.salvar(user3);
        arquivo.salvar(user2);
        arquivo.salvar(user1);
        arquivo.salvar(user4);

        System.out.println("--------------");

    }
}