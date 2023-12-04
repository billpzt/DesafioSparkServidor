package org.example;

import javax.swing.*;

import static spark.Spark.get;
import static spark.Spark.port;

public class Main {
    static int acesso = 0;

    public static void main(String[] args) {
        PainelGrafico pg = new PainelGrafico();

        port(8080);

        get("/nome", (req, res) -> {
            acesso++;
            String nome = req.queryParams("p");
            pg.inputFieldAcesso.setText(Integer.toString(acesso));
            pg.inputFieldNome.setText(nome);
            return Integer.toString(acesso);
        });
    }
}