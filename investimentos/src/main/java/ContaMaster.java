/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aluno
 */
public class ContaMaster extends Conta{

    /**
     * @return the saldoinvet
     */
    public float getSaldoinvet() {
        return saldoinvet;
    }

    /**
     * @param saldoinvet the saldoinvet to set
     */
    public void setSaldoinvet(float saldoinvet) {
        this.saldoinvet = saldoinvet;
    }

    /**
     * @return the limiteextra
     */
    public float getLimiteextra() {
        return limiteextra;
    }

    /**
     * @param limiteextra the limiteextra to set
     */
    public void setLimiteextra(float limiteextra) {
        this.limiteextra = limiteextra;
    }
    private float saldoinvet;
    private float limiteextra;
    
}
