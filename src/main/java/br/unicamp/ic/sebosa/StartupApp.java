package br.unicamp.ic.sebosa;

import static spark.Spark.*;

public class StartupApp {
    public static void main(String[] args) {
        get("/hello", (req, res) -> "Hello World");
    }
}