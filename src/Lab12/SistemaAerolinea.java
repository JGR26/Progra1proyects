
package Lab12;

import java.util.Scanner;

/**
 *
 * @author HP USER
 */
public class SistemaAerolinea {
    
private DestinoViaje destino1;
    private Empleado empleado;
    
    private Cliente[] clientes = new Cliente[1000];
    private int numClientes;
    
    private Empleado[] empleados = new Empleado[1000];
    private int numEmpleados;
    
    public void iniciar(){
        
       

        Scanner sca = new Scanner(System.in);
      
        while(true){
            System.out.println("Digite \n1: Ingresar cliente \n2: Configurar Destinos Viaje "
                + "\n3: Generar reporte clientes\n4: Generar reporte destinos viaje");
            int opcion = sca.nextInt();
            switch(opcion){
                case 1:
                   
                    
                    Cliente cliente = new Cliente();
                    cliente.solicitarDatos();
                    
                    clientes[numClientes] = cliente;
                    numClientes++;
                    
                    break;
                case 2:
                    destino1 = new DestinoViaje();
                    destino1.solicitarDatosDestino();
                    break;
                    
                case 3:
                    
                    
                    for(int i=0;i<clientes.length;i++){
                        if(clientes[i]!=null){
                            System.out.println(clientes[i].toString());
                        }
                    }
                    
                    break;
                    
                case 4:
                    
                    System.out.println(this.destino1.toString());
                    break;
            }

        }
    }
    
}
