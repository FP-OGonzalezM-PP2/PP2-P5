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
        // TODO code application logic here
        int n;
        double p;
        boolean r;
        n = pedirNumero(); 
        p = calculo(n);
        r = determinar(p);
        mostrar(r,n);
     }
    public static int pedirNumero (){
        int n;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escriba el número que quiera analizar para saber si es primo o no ");
        n = entrada.nextInt();
        return n;
    }
    public static double calculo(int n){
        int i,p = 0;
        //busco un numero que el residuo de la division de el numero en el valor i seas solo con 1 y con el mismo numero
        for(i=1; i<n+1; i++){
            if(n%i==0){
                //solo si el residuo es 0 a p se le sumara 1
                p++;
            }
        }
        return p;
    }
    public static boolean determinar (double p){
        //en r guardare un valor booleano para analizarlo despues
        boolean r;
        if(p!=2){
            //usa la p del metodo anterior para analizarla
            r=true;
        }else{
            r=false;
        }
        return r;
    }
    public static void mostrar(boolean r, double n){
        if(r=false){
            //si p es diferente de 2 el numero no es primo
            System.out.println("El número " +n +" si es primo");
        }if(r=true){
            System.out.println("El número " +n +" no es primo");
        }
    }
}
    
    

