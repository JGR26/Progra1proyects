
package Tarea_libro;

import java.util.Scanner;

/**
 *
 * @author HP USER
 */
public class Sistemanotas {
    public void sistema(){
        
        Scanner sca=new Scanner(System.in);
       
        
       System.out.print("Digite el nombre del primer estudiante: ");
       String nomEstudiante1=sca.next();
       System.out.print("Digite la calificación del primer estudiante: ");
       int nota1=sca.nextInt();
       System.out.println("Codigo de estudiante en el sistema: Est 1");
       
       System.out.print("Digite el nombre del segundo estudiante: ");
       String nomEstudiante2=sca.next();
       System.out.print("Digite la calificación del segundo estudiante: ");
       int nota2=sca.nextInt();
       System.out.println("Codigo de estudiante en el sistema: Est 2");
       
       System.out.print("Digite el nombre del tercer estudiante: ");
       String nomEstudiante3=sca.next();
       System.out.print("Digite la calificación del tercer estudiante: ");
       int nota3=sca.nextInt();
       System.out.println("Codigo de estudiante en el sistema: Est 3");
       
       System.out.print("Digite el nombre del cuarto estudiante: ");
       String nomEstudiante4=sca.next();
       System.out.print("Digite la calificación del cuarto estudiante: ");
       int nota4=sca.nextInt();
       System.out.println("Codigo de estudiante en el sistema: Est 4");
       
       System.out.print("Digite el nombre del quinto estudiante: ");
       String nomEstudiante5=sca.next();
       System.out.print("Digite la calificación del quinto estudiante: ");
       int nota5=sca.nextInt();
       System.out.println("Codigo de estudiante en el sistema: Est 5");
       
       System.out.print("Digite el nombre del sexto estudiante: ");
       String nomEstudiante6=sca.next();
       System.out.print("Digite la calificación del sexto estudiante: ");
       int nota6=sca.nextInt();
       System.out.println("Codigo de estudiante en el sistema: Est 6");
       
       System.out.print("Digite el nombre del septimo estudiante: ");
       String nomEstudiante7=sca.next();
       System.out.print("Digite la calificación del septimo estudiante: ");
       int nota7=sca.nextInt();
       System.out.println("Codigo de estudiante en el sistema: Est 7");
       
       System.out.print("Digite el nombre del octavo estudiante: ");
       String nomEstudiante8=sca.next();
    
       System.out.print("Digite la calificación del octavo estudiante: ");
       int nota8=sca.nextInt();
       System.out.println("Codigo de estudiante en el sistema: Est 8");
       
       System.out.print("Digite el nombre del noveno estudiante: ");
       String nomEstudiante9=sca.next();
       System.out.print("Digite la calificación del noveno estudiante: ");
       int nota9=sca.nextInt();
       System.out.println("Codigo de estudiante en el sistema: Est 9");
       
       System.out.print("Digite el nombre del decimo estudiante: ");
       String nomEstudiante10=sca.next();
       System.out.print("Digite la calificación del decimo estudiante: ");
       int nota10=sca.nextInt();
       System.out.println("Codigo de estudiante en el sistema: Est 10");
       
       int[] califi={nota1,nota2,nota3,nota4,nota5,nota6,nota7,nota8,nota9,nota10};
        LibroCalificaciones libnotas=new LibroCalificaciones(califi);
        System.out.println("Digite los datos del curso a los que pertenecen los estudiantes: ");
        libnotas.DatosCurso(); 
       
       libnotas.procesarNotas();
       
        
    }
   
    
    
    
}
