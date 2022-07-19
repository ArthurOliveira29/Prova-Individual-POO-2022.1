package Main;

import java.io.Serializable;

public class Funcionario extends Pessoa implements Serializable {
    private int cadastro;
    private String tipoFuncionario;
    private AvaliacaoOO2022 avaliacaoOO2022;

    public AvaliacaoOO2022 getAvaliacaoOO2022() {
        return avaliacaoOO2022;
    }

    public void setAvaliacaoOO2022(AvaliacaoOO2022 avaliacaoOO2022) {
        this.avaliacaoOO2022 = avaliacaoOO2022;
    }
    
    public Funcionario(String nome, int idade, int cadastro, String tipoFuncionario, AvaliacaoOO2022 avaliacaoOO2022) { //construtor da classe Funcionario
        super(nome, idade);
        this.cadastro = cadastro;
        this.tipoFuncionario = tipoFuncionario;
        this.avaliacaoOO2022 = avaliacaoOO2022;
    }
    
    //gets e sets dos atributos da classe

    public void setCadastro(int cadastro) {
        this.cadastro = cadastro;
    }

    public void setTipoFuncionario(String tipoFuncionario) {
        this.tipoFuncionario = tipoFuncionario;
    }

    public int getCadastro() {
        return cadastro;
    }

    public String getTipoFuncionario() {
        return tipoFuncionario;
    }
    
    //Arthur & Folly
    @Override
    public String toString() { //para printa os funcionarios sem formatar na hora
	return "Nome: " + this.getNome() + "\nCadastro: " + this.cadastro + "\nTipo Funcionario: " + this.tipoFuncionario + "\n";
    }
    
}