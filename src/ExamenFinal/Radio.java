package ExamenFinal;

/**
 *
 * @author JGR
 */
public class Radio {

    String audio;
    Parlantes par;
    ClaseVista vista;
    EquipoSonido es;

    public Radio(Parlantes par, ClaseVista vista, EquipoSonido es) {
        this.par = par;
        this.vista = vista;
        this.es = es;
    }

    public String getAudio() {
        return audio;
    }

    public void setAudio(String audio) {
        this.audio = audio;
    }

    @Override
    public String toString() {
        return "Radio:\n" + "Audio de la radio:" + audio;
    }

}
