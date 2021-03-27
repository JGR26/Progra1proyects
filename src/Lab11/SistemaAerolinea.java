package Lab11;

import java.util.Scanner;

/**
 *
 * @author HP USER
 */
public class SistemaAerolinea {

    Scanner sca = new Scanner(System.in);
    Cliente primerCliente;//se crean las propiedades de la clase
    Cliente segundoCliente;
    Cliente dueñoAerolinea;
    destinoviaje destino1;
    Cliente[] clientes = new Cliente[1000];
    int numClientes;
    destinoviaje[] Destino=new destinoviaje[1000];
    int numDestinos;

    public void iniciar() {
        Scanner sca = new Scanner(System.in);
        primerCliente = new Cliente();  //se declaran los objetos;
        segundoCliente = new Cliente();
        dueñoAerolinea = new Cliente("Marito", "Mortadela", "1-1233-1643", "CR");

        while (true) {
            System.out.println("Digite 1 para especificar datos del cliente\nDigite 2 para elegir destino de viaje\nDigite 3 para generar información\nDigite 4 generar reporte de destino");
            Byte menu = sca.nextByte();

            switch (menu) {
                case 1:
                    //solidatosCliente();
                    Cliente cliente = new Cliente();
                    cliente.Datos();
                    clientes[numClientes] = cliente;
                    numClientes++;

                    break;
                case 2:
                    destinoviaje destino=new destinoviaje();
                    destino.solicitardatosdestino();
                    Destino[numDestinos]=destino;
                    numDestinos++;
                    break;
                case 3:
                    for (int i = 0; i < clientes.length; i++) {
                        if (clientes[i] != null) {
                            System.out.println(clientes[i].toString());

                        }

                    }
                    break;
                case 4:
                    //generar reporte destinos
                    for(int i=0;i<Destino.length;i++){
                        if(Destino[i]!=null){
                          System.out.println(Destino[i].toString());
                          
                        }
                        
                    }
                    
                    break;
            }
            //System.out.println("Desea imprimir la información del cliente?");
            /* Boolean gn= sca.nextBoolean();
      if(gn=true)
      generarReporte1();//se llama al metodo
      else{
          System.out.println("Gracias por utilizar nuestro servicio");
    }
      solidatosCliente2();//se crea un segundo par de metodos para solicitar datos a un segundo cliente
      System.out.println("Desea imprimir la información del cliente?");
      gn= sca.nextBoolean();
      if(gn=true)
      generarReporte2(); 
      
      else 
          System.out.println("Gracias por utilizar nuestro servicio");
      
    
             */
        }
    }

    public void solidatosCliente() {
        primerCliente.Datos();//se llama al metodo datos que le pedira al cliente sus datos personales
        segundoCliente.Datos();
    }

    /*public void solidatosCliente2(){
        segundoCliente.Datos();
        
    }
    public void generarReporte1(){
        String infocliente=this.primerCliente.toString();//se imprime la info del cliente
        System.out.println(infocliente);
        
    }*/
    public void generarReporte() {
        String infocliente = this.primerCliente.toString();//se imprime la info del cliente
        System.out.println(infocliente);
        infocliente = this.segundoCliente.toString();
        System.out.println(infocliente);

    }

}
