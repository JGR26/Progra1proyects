
package ExamenFinal;

/**
 *
 * @author JGR
 */
public class Parlantes {
    public String parlanteDerecho;
    public String parlanteIzquierdo;
    public String parlanteSubwoof;
    public String volumen;
    public String getParlanteDerecho() {
        return parlanteDerecho;
    }

    public void setParlanteDerecho(String parlanteDerecho) {
        this.parlanteDerecho = parlanteDerecho;
    }

    public String getParlanteIzquierdo() {
        return parlanteIzquierdo;
    }

    public void setParlanteIzquierdo(String parlanteIzquierdo) {
        this.parlanteIzquierdo = parlanteIzquierdo;
    }

    public String getParlanteSubwoof() {
        return parlanteSubwoof;
    }

    public void setParlanteSubwoof(String parlanteSubwoof) {
        this.parlanteSubwoof = parlanteSubwoof;
    }

    public Parlantes() {
    }

    public Parlantes(String parlanteDerecho, String parlanteIzquierdo, String parlanteSubwoof) {
        this.parlanteDerecho = parlanteDerecho;
        this.parlanteIzquierdo = parlanteIzquierdo;
        this.parlanteSubwoof = parlanteSubwoof;
    }

    @Override
    public String toString() {
        return "\nConfiguración de Parlantes: \n" + "Esta Activado Parlante derecho?" + parlanteDerecho + "\nEsta Activado Parlante Izquierdo?" + parlanteIzquierdo + "\nEsta Activado Parlante Subwoof?" + parlanteSubwoof + "\nNivel de volumen: " + volumen + "\n----------------------\n";
    }

    

    public String getVolumen() {
        return volumen;
    }

    public void setVolumen(String volumen) {
        this.volumen = volumen;
    }
    
    
    
}
