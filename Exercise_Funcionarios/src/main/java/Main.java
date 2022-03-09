
import java.text.DecimalFormat;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Pedro
 */
public class Main {

    public static void main(String args[]) {
        Gerente gerente = new Gerente();
        Presidente presidente = new Presidente();
        Secretaria secretaria = new Secretaria();

        System.out.println("O salário de um Presidente com bonificação é: " + new DecimalFormat("#,###.00").format(presidente.getBonificacao()) +"R$");
        System.out.println( "O salário de um Gerente com bonificação é:  " + new DecimalFormat("#,###.00").format(gerente.getBonificacao()) + "R$");
        System.out.println("O salário de uma Secretária com bonificação é: " + new DecimalFormat("#,###.00").format(secretaria.getBonificacao()) +" R$");

    }
}
