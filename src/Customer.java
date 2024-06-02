public class Customer {
     private String Name;
     private  ShoppingCart shoppingCart;

    public void addProduct(Product product) {
     shoppingCart.addProduct(product);
    }
    

     public Customer(String name, ShoppingCart shoppingCart) {
          Name = name;
          this.shoppingCart = shoppingCart;
     }
     public String getName() {
          return Name;
     }

     public void setName(String name) {
          Name = name;
     }
     public ShoppingCart getShoppingCart() {
          return shoppingCart;
     }
     public void setShoppingCart(ShoppingCart shoppingCart) {
          this.shoppingCart = shoppingCart;
     }

     

}
