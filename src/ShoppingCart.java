import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
     // array list oluşturma
     private List<Product> products;

     // toplam ücret
     private double totalPrice;

     // ürünler hakkında liste oluşturmasını talep etmek
     public ShoppingCart() {
          products = new ArrayList<>();
     }

     // Toplam fiyatı getirme metodu
     public double getTotalPrice() {
          return totalPrice;
     }

     // Ürün ekleme komutu
     public void addProduct(Product product) {
          products.add(product);
     }

     // ürünleri listeleme
     public void productList() {
          if (products.isEmpty()) {
               System.out.println("Sepet Boş");
          } else {
               for (Product product : products) {
                    System.out.println(product.getName() + " - Fiyat : " + product.getPrice());
               }
          }
     }

}
