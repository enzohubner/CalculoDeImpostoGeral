/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projeto.calculo.imposto;
import java.util.Scanner;
/**
 *
 * @author Enzo Hubner
 */
public class ProjetoCalculoImposto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        // Váriaveis FGTS
        double fgts;
        double calculoFgts = 0;
        
        // Váriaveis INSS
        double aliquota;
        double calculoInss = 0;
        
        //Váriaveis Imposto
        double deducao = 0;
        double calculoImposto = 0;
        
        
        System.out.println("Digite o seu salario:");
        double salario = scan.nextDouble();
        
        //FGTS
        System.out.println("Você e jovem aprendiz? (S/N)");
        String resposta = scan.next();
        
        if (resposta.equalsIgnoreCase("S")){
            fgts = 0.02;
            calculoFgts = salario * fgts;
            
            System.out.println("Seu FGTS e de 2% do seu salario, o total foi: " + calculoFgts);    
        }
        else if(resposta.equalsIgnoreCase("N")){
            System.out.println("Você e um trabalhador domestico? (S/N)");
            String resposta2 = scan.next();
            if(resposta2.equalsIgnoreCase("S")){
                fgts = 0.112;
                calculoFgts = salario * fgts;
                System.out.println("Seu FGTS e de 11.2% do seu salário, o total foi: " + calculoFgts);
            }
            else if(resposta2.equalsIgnoreCase("N")){
                fgts = 0.08;
                calculoFgts = salario * fgts;
                System.out.println("Seu FGTS e de 8% do seu salario, o total foi: " + calculoFgts);        
            }
            
        }
        
        //INSS
        if(salario <= 1302){
            aliquota = 0.075;
            calculoInss = salario * aliquota;
            System.out.println("Seu INSS e de 7,5% do seu salario, o total foi: " + calculoInss);
        }
        else if(salario > 1302 &  salario <= 2571.29){
            aliquota = 0.09;
            calculoInss = salario * aliquota;
            System.out.println("Seu INSS e de 9% do seu salario, o total foi: " + calculoInss);
        }
        else if(salario > 2571.29 & salario <= 3856.94){
            aliquota = 0.12;
            calculoInss = salario * aliquota;
            System.out.println("Seu INSS e de 12% do seu salario, o total foi: " + calculoInss);
        }
        else if(salario > 3856.94 & salario <= 7507.49 || salario > 7507.49){
            aliquota = 0.14;
            calculoInss = salario * aliquota;
            System.out.println("Seu INSS e de 14% do seu salario, o total foi: " + calculoInss);
        }
        
        //Váriavel auxiliar
        double salarioInss = salario - calculoInss;
        
        //Imposto
         if(salario <= 1903.98){
            aliquota = 0;
            deducao = 0;
            calculoImposto = salarioInss * aliquota - deducao;
            System.out.println("Seu imposto e de 0% do seu salario, o total foi: " + calculoImposto);
        }
        else if(salario > 1903.99 &  salario <= 2826.65){
            aliquota = 0.075;
            deducao = 142.80;
            calculoImposto = salarioInss * aliquota - deducao;
            System.out.println("Seu imposto e de 7,5% do seu salario, o total foi: " + calculoImposto);
        }
        else if(salario > 2826.66 & salario <= 3751.05){
            aliquota = 0.15;
            deducao = 354.80;
            calculoImposto = salarioInss * aliquota - deducao;
            System.out.println("Seu imposto e de 15% do seu salario, o total foi: " + calculoImposto);
        }
        else if(salario > 3751.06 & salario <= 4664.68){
            aliquota = 0.225;
            deducao = 636.13;
            calculoImposto = salarioInss * aliquota - deducao;
             System.out.println("Seu imposto e de 22,5% do seu salario, o total foi: " + calculoImposto);
        }
        else if(salario > 4664.68){
            aliquota = 0.275;
            deducao = 869.36;
            calculoImposto = salarioInss * aliquota - deducao;
            System.out.println("Seu imposto e de 27,5% do seu salario, o total foi: " + calculoImposto);
        }
        
        //Cálculo Final
        double calculoFinal = salario - calculoFgts - calculoImposto;
        System.out.println("Salário líquido é: " + calculoFinal);
    }
        
}
    

