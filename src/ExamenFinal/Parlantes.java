
package ExamenFinal;

/**
 *
 * @author JGR
 */
public class Parlantes {
    String parlanteDerecho;
    String ParlanteIzquierdo;
    String parlanteSubwoof;
    String volumen;
    public String getParlanteDerecho() {
        return parlanteDerecho;
    }

    public void setParlanteDerecho(String parlanteDerecho) {
        this.parlanteDerecho = parlanteDerecho;
    }

    public String getParlanteIzquierdo() {
        return ParlanteIzquierdo;
    }

    public void setParlanteIzquierdo(String ParlanteIzquierdo) {
        this.ParlanteIzquierdo = ParlanteIzquierdo;
    }

    public String getParlanteSubwoof() {
        return parlanteSubwoof;
    }

    public void setParlanteSubwoof(String parlanteSubwoof) {
        this.parlanteSubwoof = parlanteSubwoof;
    }

    public Parlantes() {
    }

    public Parlantes(String parlanteDerecho, String ParlanteIzquierdo, String parlanteSubwoof) {
        this.parlanteDerecho = parlanteDerecho;
        this.ParlanteIzquierdo = ParlanteIzquierdo;
        this.parlanteSubwoof = parlanteSubwoof;
    }

    @Override
    public String toString() {
        return "\nConfiguración de Parlantes: \n" + "Esta Activado Parlante derecho?" + parlanteDerecho + "\nEsta Activado Parlante Izquierdo?" + ParlanteIzquierdo + "\nEsta Activado Parlante Subwoof?" + parlanteSubwoof + "\nNivel de volumen: " + volumen + "\n----------------------\n";
    }

    

    public String getVolumen() {
        return volumen;
    }

    public void setVolumen(String volumen) {
        this.volumen = volumen;
    }
    
    
    
}
