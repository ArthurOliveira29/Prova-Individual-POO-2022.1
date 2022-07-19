package Main;

import java.io.Serializable;


public class AvaliacaoOO2022 implements Serializable {

private String nome;
private String matrícula;
private double nota;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatrícula() {
        return matrícula;
    }

    public void setMatrícula(String matrícula) {
        this.matrícula = matrícula;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public AvaliacaoOO2022(String nome, String matrícula, double nota) {
        this.nome = nome;
        this.matrícula = matrícula;
        this.nota = nota;
    }


}
