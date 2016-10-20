/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp2.p5;
import java.util.*;
/**
 *
 * @author Osvaldo
 */
public class PP2P5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n,p;
        n = pedirNumero(); 
        p = calculo(n);
        //En el calculo solo utiliza a n para analizarla y regresa p 
        determinar(n,p);
        //Usa p para analizarlo y emitir un mensaje
     }
    public static int pedirNumero (){
        int n;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escriba el número que quiera analizar para saber si es primo o no ");
        n = entrada.nextInt();
        return n;
    }
    public static int calculo(int n){
        int i,p = 0;
        //busco un numero que el residuo de la division de el numero en el valor i seas solo con 1 y con el mismo numero
        for(i=1; i<=n; i++){
            if(n%i==0){
                //solo si el residuo es 0 a p se le sumara 1
                p++;
            }
        }
        return p;
        //Si el número primo p siempre se regresara valiendo 2
    }
    public static void determinar (int n, int p){
        if(p==2){
            //usa la p del metodo anterior para analizarla
            System.out.println("El número  " +n  +"  es primo");
        }else{
            //Si p no es igual a 2 significa que el numero no es primo
            System.out.println("El número  " +n  +"  no es primo");
        }
    }
    
}
    
    

