package e5g7cuenta;

public class e5g7Cuenta_main {

    public static void main(String[] args) {
        Cuenta objeto1 = new Cuenta();
        
        objeto1.crearCuenta();
        objeto1.ingresoDinero(10);
        objeto1.retiroDinero(2);
        objeto1.extraccionRapida();
        objeto1.consultarSaldo();
        objeto1.consultarDatos();
    }

}
