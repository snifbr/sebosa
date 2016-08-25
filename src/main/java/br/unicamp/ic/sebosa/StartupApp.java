package br.unicamp.ic.sebosa;

import static spark.Spark.*;

public class StartupApp {
    public static void main(String[] args) {
    	//book
        get("/book", (req, res) -> "Olá, eu sou um livro!");
        post("/book/:isbn", (request, response) -> {
        	return "Adicionar livro, isbn = " + request.params(":isbn");
        });
        put("/book/update/:isbn", (request, response) -> {
        	return "Atualizar livro, isbn = " + request.params(":isbn");
        });
        delete("/book/delete/:isbn", (request, response) -> {
        	return "Deletar livro, isbn = " + request.params(":isbn");
        });
        options("/options", (request, response) -> "Options");
    }
}