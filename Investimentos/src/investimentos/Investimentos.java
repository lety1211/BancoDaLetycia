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
public class Investimentos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO como se fosse o TercaFeira
        
        //chegou Jose no banco e criou uma conta
        Conta ccJose = new Conta();
        // daí Jose depositou 100 reais
        ccJose.depositar(100);
        
        // chegou Maria no banco e criou uma conta Master
        ContaMaster cmMaria = new ContaMaster();
        // ela deposita 1000 conto
        cmMaria.depositar(1000);
        // e investe 500
        cmMaria.investir(500);
        
        //será q deu certo?
        System.out.println("Saldo do Jose: "+ccJose.getSaldo());
        System.out.println("Saldo da Maria: " + cmMaria.getSaldo());
        System.out.println("Investimentos da Maria: " + cmMaria.getSaldoInvestimento());
        
        cmMaria.resgatar(400);
        cmMaria.sacar(300);
        System.out.println("Saldo da Maria: " + cmMaria.getSaldo());
        System.out.println("Investimentos da Maria: " + cmMaria.getSaldoInvestimento());
        
    }
    
}
