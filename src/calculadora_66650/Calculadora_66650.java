/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora_66650;
import javax.swing.JOptionPane;
/**
 *
 * @author Adriana
 */
public class Calculadora_66650 {

    public static void main(String[] args) {
        
        Calculadora_66650 calculadora = new Calculadora_66650();

        calculadora.suma(7,3,8);
        calculadora.resta(5);
        calculadora.multiplicacion(4);
        calculadora.division(9,7);
        calculadora.eliminar();
        calculadora.resultado();
    }

    public double resultado;
    private int resultadoC;
    private int numero;
    private String signo;
    
    public Calculadora_66650(){
        
    }
    
    public void valorI(int resultado){
        this.resultado = resultado;
    }
    
    public void suma(int ...numero){
        this.signo = "+";
        for (int i = 0; i < numero.length; i++) {
            this.numero = numero[i];
            this.resultado += this.numero;
        }
    }
    
    public void multiplicacion(int ...numero){
        this.signo = "*";
        for (int i = 0; i < numero.length; i++) {
            this.numero = numero[i];
            this.resultado *= this.numero;
        }
    }
    
    public void resta(int ...numero){
        this.signo = "-";
        for (int i = 0; i < numero.length; i++) {
            this.numero = numero[i];
            this.resultado -= this.numero;
        }
    }
    
    public void division(int ...numero){
        this.signo = "/";
        for (int i = 0; i < numero.length; i++) {
            if(numero[i] == 0){
                resultado = 0;
                JOptionPane.showMessageDialog(null, "Introduce un numero correcto para la división", "¡ERROR!", 0);
                break;
            } else {
                this.numero = numero[i];
                resultado /= this.numero;
            }
        }
    }
    
    public void eliminar(){
        if(this.signo.equalsIgnoreCase("+")){
            this.resultado -= this.numero;
        } else if(this.signo.equalsIgnoreCase("-")){
            this.resultado += this.numero;
        } else if(this.signo.equalsIgnoreCase("*")){
            this.resultado /= this.numero;
        } else if(this.signo.equalsIgnoreCase("/")){
            this.resultado *= this.numero;
        }
    }
    
    public void resultado(){
        resultadoC = (int)resultado;
        if(resultado % resultadoC == 0){
            System.out.println("resultado = " + resultadoC);
        } else{
            System.out.println("resultado = " + resultado);
        } 
    }
    
    
}
