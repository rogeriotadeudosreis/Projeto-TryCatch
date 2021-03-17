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
public class TelaConsole {

    private Pessoa pessoa = new Pessoa();

    public void mostrarDados() {
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());

    }

    public void construirPessoa()throws Exception {
      
            String nome = "jó";
            int idade = 12;
            pessoa.setIdade(idade);
            pessoa.setNome(nome);
       
    }
}
