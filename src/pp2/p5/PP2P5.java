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
        for(i=1; i<n+1; i++){
            if(n%i==0){
                p++;
            }
        }
        return p;
    }
    public static boolean determinar (double p){
        boolean r;
        if(p!=2){
            r=true;
        }else{
            r=false;
        }
        return r;
    }
    public static void mostrar(boolean r, double n){
        if(r=false){
            System.out.println("El número " +n +" si es primo");
        }if(r=true){
            System.out.println("El número " +n +" no es primo");
        }
    }
}
    
    

