package e10ArrayPackage;

import java.util.Arrays;

public class e10ArrayMain {

    public static void main(String[] args) {

        double[] arrayA = new double[50];
      
        for (int i = 0; i < arrayA.length; i++) {
            arrayA[i] = (double) Math.round(((Math.random() * -21)+10) * 100) / 100;//*100/100 artilugio para recortar decimales, ver abajo
        }
        System.out.println("\nArreglo A:");
        System.out.println(Arrays.toString(arrayA));
        System.out.println("\nArreglo A ordenado de menor a mayor:");
        Arrays.sort(arrayA);
        System.out.println(Arrays.toString(arrayA));
        System.out.println("\nArreglo B combinado:");
        double[] arrayB = Arrays.copyOfRange(arrayA, 0, 20);
        Arrays.fill(arrayB, 10, 20, 0.5);
        System.out.println(Arrays.toString(arrayB));
    }

}

/*10. Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo
A de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por
pantalla. Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros
10 números ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos
elementos con el valor 0.5. Mostrar los dos arreglos resultantes: el ordenado de 50
elementos y el combinado de 20

Usando DecimalFormat

 DecimalFormat df = new DecimalFormat("#.00");
 System.out.println(df.format(number));
 Salida : 1.42
Usando String.Format

System.out.println(String.format("%.2f", number));
 Salida : 1.42
Si solo desea a que la salida tenga ese formato aplicaría numberformat

System.out.printf("Valor: %.2f", number ); 
Salida : 1.42
Mediante Math.Round() donde la cantidad de ceros es la cantidad de decimales a limitar

System.out.println((double)Math.round(number * 100d) / 100d);
 Salida : 1.42
Usando la clase BigDecimal , usando el método setScale que recibe dos parámetros la cantidad de decimales a limitar y el modo de redondeo

BigDecimal bd = new BigDecimal(number);
bd = bd.setScale(2, RoundingMode.HALF_UP);
System.out.println(bd.doubleValue());
 Salida 1.42


 */
