
package sumaproducto;

import java.util.Scanner;

public class SumaProducto {
  
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num1,num2,num3,num4,suma,producto;
        System.out.print("Ingrese el primer valor: ");
        num1=teclado.nextInt();
        System.out.print("Ingrese el segundo valor: ");
        num2=teclado.nextInt();
        System.out.print("Ingrese el tercer valor: ");
        num3=teclado.nextInt();
        System.out.print("Ingrese el cuarto valor: ");
        num4=teclado.nextInt();
        suma=num1+num2;
        producto=num3*num4;
        System.out.print("La suma de los dos primeros valores es: ");
        System.out.print(suma);
        System.out.print("\nEl producto de los dos ultimos valores es: ");
        System.out.print(producto);
    }
    
}
