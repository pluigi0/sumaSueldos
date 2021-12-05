
package SumaSueldos;

import javax.swing.JOptionPane;

/*
Pedir 10 sueldos. Mostrar su suma y cuantos hay mayores $1000
*/
public class SumaSueldos {
    public static void main(String[] args) {
        
        float sueldos, sumaSueldo=0, mayores=0;
        
        for (int i= 1; i <=10; i++){
            
            sueldos = Float.parseFloat(JOptionPane.showInputDialog("Dame tu sueldo: "));
            
            sumaSueldo += sueldos;
            
            if (sueldos>1000){
                mayores++;
            }
        }
        System.out.println("Suma total de los salarios es: "+sumaSueldo);
        
        System.out.println("Existen : "+mayores+ " sueldos mayores a 1000");
    }
}
