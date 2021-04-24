
package Lab14;

/**
 *
 * @author JGR
 */
public class LineItem {
    
    private Integer quantity;
    private float price;
    private Product product;
    
    public LineItem(Integer quantity, float price, Product product) {
        this.quantity = quantity;
        this.price = price;
        this.product = product;
       
    }
    
    
    
    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
    
    
}
