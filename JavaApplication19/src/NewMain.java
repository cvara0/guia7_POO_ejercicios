/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cvara
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NewClass1 ob=new NewClass1();
        //System.out.println("esaasasas");
        ob.prueba=2;
        System.out.println(ob.prueba);
    }
    
}
public class NewClass1 {
    private int prueba;
}