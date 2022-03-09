/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Pedro
 */
public class Secretaria extends Funcionarios{
private static final Double SALARIO_SECRETARIA = 2500.00;
    @Override
    Double getBonificacao() {
        return (SALARIO_SECRETARIA * 0.05) + SALARIO_SECRETARIA;
    }
    
}
