
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    ShoppingCart car1 = new ShoppingCart();
    Customer customer1 = new Customer("Emir", car1);

    Product product1 = new Product("Ekran Kartı Nvidia 4090", 20_000);
    Product product2 = new Product("Monitör", 5_000);

    Scanner scanner = new Scanner(System.in);
 
    System.out.println("Hoşgeldiniz...");
    boolean devam = true;
    while(devam){
    System.out.println(
     
        " 1- Ürünleri Gör \n 2- Sepete Ürün Ekle  \n 3- Sepeti Görüntüle \n 4- Çıkış ");
    System.out.println("Lütfen İşleminizi Seçiniz: ");
    int choice = scanner.nextInt();

    switch (choice) {
      case 1: 
        System.out.print("Ürünler : ");
        car1.productList();
        break;
      case 2:
        System.out.println("Sepete eklemek istediğiniz ürünün adını girin:");
        scanner.nextLine(); // Bir önceki nextInt() ile oluşan new line karakterini tüketmek için
        String productName = scanner.nextLine();
        System.out.println("Sepete eklemek istediğiniz ürünün fiyatını girin:");
        double productPrice = scanner.nextDouble();
        Product newProduct = new Product(productName, productPrice);
        car1.addProduct(newProduct);
        System.out.println("Ürün sepete eklendi.");
        break;
      case 3:
        System.out.println("Sepetinizdeki ürünler : ");
        car1.productList();
        break;
      case 4:
        System.out.println("Çıkış yapılıyor...");
        devam=false;
        break;
      default:
        System.out.println("Geçersiz işlem, lütfen tekrar deneyin.");
    }
  }
  }
}