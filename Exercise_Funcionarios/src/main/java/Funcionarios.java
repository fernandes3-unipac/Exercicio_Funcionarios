
import java.util.Date;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Pedro
 */
public abstract class Funcionarios {
    
    private String cpf;
    private String name;
    private Date DataNascimento;
    private String setor;
    private Double salario;
    
    
    
    abstract Double getBonificacao();
    
    
}
