/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package telaLogin;

/**
 *
 * @author Guilherme
 */
public class Aluno {
    private String nome;
    private int idade;
    private String sexo;
    private String curso;
    private int ra;
    private String cidade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    
    public String imprimir(){
        return "\n-------------------------------------------"
               + "\nNOME: " + nome
               +"\nIDADE: " + idade
               +"\nSEXO: " + sexo
               +"\nCIDADE: " + cidade
               +"\nCURSO: " + curso
               +"\nRA: " + ra
               +"\n-------------------------------------------";
    }   
    public String imprimirVazio(){
        return " ";
    }
}
