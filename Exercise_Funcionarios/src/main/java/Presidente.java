/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Pedro
 */
public class Presidente extends Funcionarios {
    private static final Double SALARIO_PRESIDENTE = 30000.00;
    @Override
    Double getBonificacao() {
        return (SALARIO_PRESIDENTE * 0.2) + SALARIO_PRESIDENTE;
    }

}
