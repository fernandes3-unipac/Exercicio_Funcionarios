/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Pedro
 */
public class Gerente extends Funcionarios {
private static final Double SALARIO_GERENTE = 8000.00;
    
    Double getBonificacao() {
        return (SALARIO_GERENTE * 0.1) + SALARIO_GERENTE;
    }
    
}
