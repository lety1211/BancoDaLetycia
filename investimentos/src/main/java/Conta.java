/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aluno
 */
public class Conta {

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
    public int getAgencia() {
        return agencia;
    }

    /**
     * @param agencia the agencia to set
     */
    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    /**
     * @return the saldo
     */
    public float getSaldo() {
        return saldo;
    }

    
    /**
     * @return the limite
     */
    public float getLimite() {
        return limite;
    }

    /**
     * @param limite the limite to set
     */
    public void setLimite(float limite) {
        this.limite = limite;
    }
  
    public float depositar (float valor){
        saldo= getSaldo()+ valor;
        return getSaldo();
    }
    
    public float sacar (float valor){
        float saque = getLimite()+getSaldo();
        if (valor>saque){
            System.out.println ("não há saldo suficiente");
            
        }else {
                System.out.println ("saque aprovado");
                saldo= getSaldo()-valor;    
                    }
        return getSaldo();
    }
    
    private int numero;
    private int agencia;
    private float saldo;
    private float limite;
    
}
