
package e11DatePackage;

import java.util.Date;


public class Reloj {
    private Date horas;
  

    public Reloj() {
    }

    public Reloj(Date horas) {
        this.horas = horas;
        
    }

    public Date getHoras() {
        return horas;
    }

    public void setHoras(Date horas) {
        this.horas = horas;
    }


    
    public void queHoraEs(){
    
        System.out.println(horas.getHours()+":"+horas.getMinutes()+":"+horas.getSeconds());
    
    }
    
}
