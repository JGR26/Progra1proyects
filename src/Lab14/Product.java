
package Lab14;

/**
 *
 * @author HP USER
 */
public class Product {
   private String id;
   private String  name;
   private String suplier;

    public Product(String id, String name, String suplier) {
        this.id = id;
        this.name = name;
        this.suplier = suplier;
    }
   
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSuplier() {
        return suplier;
    }

    public void setSuplier(String suplier) {
        this.suplier = suplier;
    }
   
   
}
