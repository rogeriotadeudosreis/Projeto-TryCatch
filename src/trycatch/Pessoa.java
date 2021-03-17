/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trycatch;

/**
 *
 * @author roger
 */
public class Pessoa {

    private String nome = "";
    private int idade = 0;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws Exception {
        if (nome.equals("")) {
            throw new Exception("Nome não pode ficar em branco");

        }
        if (nome.length() < 2) {
            throw new Exception("Nome precisa ter pelo menos duas letras!");

        }
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) throws Exception {
        if (idade <= 0) {
            throw new Exception("Idade não pode ser <= 0");
        }
        this.idade = idade;
    }

}
