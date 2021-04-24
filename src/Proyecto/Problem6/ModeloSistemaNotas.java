
package Proyecto.Problem6;

/**
 *
 * @author JGR
 */
public class ModeloSistemaNotas {
    
    public double[] calificaciones;
    public int indice;
    public String[] nombresAlumnos;
    public String[] nombreDePadres;
    public String[] puntosObtenidos;
     public ModeloSistemaNotas(int cantidadDeEstudiantes) {
        calificaciones = new double[cantidadDeEstudiantes];
        
        
       nombresAlumnos=new String[cantidadDeEstudiantes];
        nombreDePadres=new String[cantidadDeEstudiantes];
        puntosObtenidos=new String[cantidadDeEstudiantes];
        indice = 0;
    }
     
     public void agregarNota(double notaEstudiante,String ptsObtenidos,String NombreEst,String NombrePadres) {
         
         
         try {
        
            try {
                calificaciones[indice] = notaEstudiante;
                nombresAlumnos[indice]=NombreEst;
                nombreDePadres[indice]=NombrePadres;
                puntosObtenidos[indice]=ptsObtenidos;
                indice++;
            } catch (ArrayIndexOutOfBoundsException ae) {
                
                indice--;
            } 
        }
        catch(Exception e){
               
        } 
    }
      public double notaMinima(){
        double notaBaja=calificaciones[70];
        
        for (double nota:calificaciones){
            notaBaja=nota;
            if(nota<notaBaja)
                notaBaja=nota;
        }
       
       return notaBaja; 
    }
    
    public double notaMaxima(){
        double notaAlta=calificaciones[70];
        
        for (double nota:calificaciones){
            notaAlta=nota;
            if(nota>=notaAlta)
                notaAlta=nota;
        }
       return notaAlta; 
    }
    
    public double promedio(){
        int total=0;
        
        for (double nota:calificaciones)
            total +=nota;
        
        return (double) total/calificaciones.length;  
    }
   
    
    
    public double getNota(int array){
        
        return calificaciones[array];
        
    }
    
    public String getNombreAlumno(int array){
        return nombresAlumnos[array];
    }
    
    public String getNombrePadre(int array){
        return nombreDePadres[array];
    }
    public String getPuntosObtenidos(int array){
        
        return puntosObtenidos[array];
        
    }

    
    public int getIndice(){
        
        return indice;
    }
    
    
}
