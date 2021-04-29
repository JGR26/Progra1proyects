package Proyecto.Problem6;

/**
 *
 * @author JGR
 */
public class ModeloSistemaNotas {

    public double[] calificaciones;
    private int indice;
    private String[] nombresAlumnos;
    private String[] nombreDePadres;
    private String[] puntosObtenidos;
    private String nombreProfesor;
    private String nombreCurso;
    private String codigoCurso;
    /**
     *Este metodo es el constructor al cual se le pasa el numero total de estudiantes 
     * que se subiran al sisteman
     * @param cantidadDeEstudiantes
     */
    public ModeloSistemaNotas(int cantidadDeEstudiantes) {
        calificaciones = new double[cantidadDeEstudiantes];

        nombresAlumnos = new String[cantidadDeEstudiantes];
        nombreDePadres = new String[cantidadDeEstudiantes];
        puntosObtenidos = new String[cantidadDeEstudiantes];

        indice = 0;
    }

    /**
     *Recibe las variables necesarias para agregar los datos del examen
     * @param notaEstudiante
     * @param ptsObtenidos
     * @param NombreEst
     * @param NombrePadres
     */
    public void agregarNota(double notaEstudiante, String ptsObtenidos, String NombreEst, String NombrePadres) {

        try {

            try {
                calificaciones[indice] = notaEstudiante;
                nombresAlumnos[indice] = NombreEst;
                nombreDePadres[indice] = NombrePadres;
                puntosObtenidos[indice] = ptsObtenidos;

                indice++;
            } catch (ArrayIndexOutOfBoundsException ae) {

                indice--;
            }
        } catch (Exception e) {

        }
    }

    /**
     * Agrega los datos necesarios del profesor y el curso
     * @param nombre
     * @param nomCurso
     * @param codigo
     */
    public void agregarDatosProfesor(String nombre, String nomCurso, String codigo) {
        this.nombreProfesor = nombre;
        this.nombreCurso = nomCurso;
        this.codigoCurso = codigo;
    }

    /**
     *Este metodo retorna la nota mas baja dentro del arreglo calificaciones
     * @return
     */
    public double notaMinima() {
        double notaBaja = calificaciones[0];

        for (double nota : calificaciones) {

            if (nota < notaBaja) {
                notaBaja = nota;
            }
        }

        return notaBaja;
    }

    void bubbleSortCalifi() {

        int n = calificaciones.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (calificaciones[i] > calificaciones[i + 1]) {

                    double temp = calificaciones[i];
                    calificaciones[i] = calificaciones[i + 1];
                    calificaciones[i + 1] = temp;
                    String nomAlumnos = nombresAlumnos[i];
                    nombresAlumnos[i] = nombresAlumnos[i + 1];
                    nombresAlumnos[i + 1] = nomAlumnos;
                    String nombrepadre = nombreDePadres[i];
                    nombreDePadres[i] = nombreDePadres[i + 1];
                    nombreDePadres[i + 1] = nombrepadre;
                    String ptsObte = puntosObtenidos[i];
                    puntosObtenidos[i] = puntosObtenidos[i + 1];
                    puntosObtenidos[i + 1] = ptsObte;
                }
            }
        }

    }

    /**
     *Retorna la nota mas alta dentro del arreglo calificaciones
     * @return
     */
    public double notaMaxima() {
        double notaAlta = calificaciones[0];

        for (double nota : calificaciones) {

            if (nota > notaAlta) {
                notaAlta = nota;

            }
        }
        return notaAlta;
    }

    /**
     *Retorna el promedio ponderado de la clase
     * @return
     */
    public double promedio() {
        int total = 0;

        for (double nota : calificaciones) {
            total += nota;
        }

        return (double) total / calificaciones.length;
    }

    /**
     *Retorna todas las notas que estan dentro del arreglo calificaciones
     * @param array
     * @return
     */
    public double getNota(int array) {

        return calificaciones[array];

    }

    /**
     *Retorna todos los nombres de los alumnos que estan dentro del arreglo nombresAlumnos
     * @param array
     * @return
     */
    public String getNombreAlumno(int array) {
        return nombresAlumnos[array];
    }

    /**
     *Retorna el nombre de todos los padres 
     * @param array
     * @return
     */
    public String getNombrePadre(int array) {
        return nombreDePadres[array];
    }

    /**
     *Retorna todos los puntos totales obtenidos por cada alumno
     * @param array
     * @return
     */
    public String getPuntosObtenidos(int array) {

        return puntosObtenidos[array];

    }

    /**
     *Retorna el indice de elementos
     * @return
     */
    public int getIndice() {

        return indice;
    }

    /**
     *Retorna el nombre del profesor
     * @return
     */
    public String getNombreProfesor() {
        return nombreProfesor;
    }

    /**
     *Retorna el nombre del curso
     * @return
     */
    public String getNombreCurso() {
        return nombreCurso;
    }

    public String getCodigoCurso() {
        return codigoCurso;
    }

}
