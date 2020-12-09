/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pregunta02;

/**
 *
 * @author Usuario iTC
 */
public class Pregunta02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     String cadena = "jamil erasmo";
        double sumaMay =0 ;
        double sumaMin = 0;
        char valor;
        String cadenaF ="";
        String cadenam ="";
          for (int i = 0; i < cadena.length(); i++) {
             valor = cadena.charAt(i);
              if (((char)valor >= 65) && ((char)valor<=90)){
                  sumaMay = sumaMay + 1;
                  cadenam= String.format("%.2f\n",(sumaMay));
                }else{
                  if (((char)valor >= 97) && ((char)valor<=122)){
                  sumaMin = sumaMin + 1;
                  cadenaF = String.format("%.2f\n",(sumaMin));     
              }
            }
       
        }
       
      //valorNumerico = (int) valor; // 
           System.out.printf("Suma mayúscula:\n%sSuma minúscula:\n%s",cadenam,
                cadenaF);
    }
    
     }