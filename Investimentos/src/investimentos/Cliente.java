/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package investimentos;

/**
 *
 * @author aluno
 */
public class Cliente {
    
    private int Idade;
    /**
     * @return the cod_cli
     */
    public int getCod_cli() {
        return cod_cli;
    }

    /**
     * @param cod_cli the cod_cli to set
     */
    public void setCod_cli(int cod_cli) {
        this.cod_cli = cod_cli;
    }

    /**
     * @return the cpf
     */
    public int getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    /**
     * @return the nome
     */
    public char getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(char nome) {
        this.nome = nome;
    }

    /**
     * @return the rg
     */
    public int getRg() {
        return rg;
    }

    /**
     * @param rg the rg to set
     */
    public void setRg(int rg) {
        this.rg = rg;
    }

    /**
     * @return the dt_nasc
     */
    public int getDt_nasc() {
        return dt_nasc;
    }
    
    public int getIdade(){
        return Idade;
    }

    /**
     * @param dt_nasc the dt_nasc to set
     */
    public void setDt_nasc(int dt_nasc) {
        this.dt_nasc = dt_nasc;
    }
    private int cod_cli;
    private int cpf;
    private char nome;
    private int rg;
    private int dt_nasc;
    
}
