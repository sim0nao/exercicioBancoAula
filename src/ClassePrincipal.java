/*

 */

import java.util.Random;

public class ClassePrincipal {
    public static void main (String args[]){
        
         //instância um objeto da classe Random usando o construtor padrão
         Random gerador = new Random();
         
         ContaBanco p1= new ContaBanco();
         p1.setNumConta(gerador.nextInt(9999));
         p1.setCliente("Jubileia");
         p1.abrirConta("CC");
         p1.depositar(300);
         p1.mostraStatus();
         
         ContaBanco p2 = new ContaBanco();
         p2.setNumConta(gerador.nextInt(9999));
         p2.setCliente("Astolfa");
         p2.abrirConta("CP");
         p2.sacar(30);
         p2.mostraStatus();
    }
    
}
