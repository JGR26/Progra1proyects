
package Lab14;

/**
 *
 * @author HP USER
 */
public class TesterWebStore {
    public static void main(String[] args) {
      Customer  c1=new Customer("Jairo","LLano Grande","jari@gmail.com","122-3442","8-5 Sj.Box","22340.22f");
      Product producto=new Product("1","Reloj","Cassio");
      LineItem line1=new LineItem(2,2100.00f,producto);
      CarritoDecompras carrito=c1.getCarrito();
      carrito.agregarLinea(line1);
    }
    
}
