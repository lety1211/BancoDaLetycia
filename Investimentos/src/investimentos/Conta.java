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
public class Conta {
       private int sacar;
    private float Limite;
    private float Saldo;

    /**
     * @return the numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * @return the agencia
     */
    public char getAgencia() {
        return agencia;
    }

    /**
     * @param agencia the agencia to set
     */
    public void setAgencia(int agencia) {
        this.agencia = (char) agencia;
    }

    /**
     * @return the saldo
     */
    public float getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    /**
     * @return the limite
     */
    public float getLimite() {
        int sacar;
            
        return limite;
   }

    /**
     * @param limite the limite to set
     */
    public void setLimite(float limite) {
        this.limite = limite;
    }
    public float depositar(float valor) {
        saldo= saldo+valor;
        return saldo;
    }
    public boolean sacar(float valor) {
        float saque = Limite+Saldo;
        if(valor > saque){
            System.out.println("O saque não foi aprovado");
            return false;
        } else {
            System.out.println("O saldo foi aprovado.");
            saldo= saldo-valor;
            return true;
        }
        
    }
    private int numero;
    private char agencia;
    private float saldo;
    protected float limite;
}

