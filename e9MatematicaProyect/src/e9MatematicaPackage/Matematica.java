
package e9MatematicaPackage;

public class Matematica {
    
    private double nro1;
    private double nro2;
    //
    public Matematica() {
    }

    public Matematica(double nro1, double nro2) {
        this.nro1 = nro1;
        this.nro2 = nro2;
    }
    //

    public double getNro1() {
        return nro1;
    }

    public void setNro1(double nro1) {
        this.nro1 = nro1;
    }
    //
    public double getNro2() {
        return nro2;
    }

    public void setNro2(double nro2) {
        this.nro2 = nro2;
    }
    
    //• Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
    public double devolverMayor(){
        
        return Math.max(nro1, nro2);
    }
    
    //• Método calcularPotencia() para calcular la potencia del mayor valor de la clase
    //elevado al menor número. Previamente se deben redondear ambos valores.
    public double calcularPotencia(){
        
        return Math.pow(Math.round(Math.max(nro1, nro2)),Math.round(Math.min(nro1, nro2)));
    }
    
    //Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
    //Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
    public double calculaRaiz(){
        
        return Math.sqrt(Math.abs(Math.min(nro1, nro2)));
        
    }
}
/*9. Realizar una clase llamada Matemática 

que tenga como atributos dos números reales
con los cuales se realizarán diferentes operaciones matemáticas. 

La clase deber tener un constructor vacío, parametrizado y get y set. 

En el main se creará el objeto y se usará el Math.random para generar los dos números y se guardaran en el objeto con
su respectivos set. 

Deberá además implementar los siguientes métodos:
• Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor
valor
• Método calcularPotencia() para calcular la potencia del mayor valor de la clase
elevado al menor número. Previamente se deben redondear ambos valores.
• Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.*/
