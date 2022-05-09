
public class Main {

    public static void main(String[] args) {
        Product product = new Product("Smart TV 40pol", "Samsung");
        Lote lote = new Lote(product, 10);

        System.out.println(lote.toString());

    }
}
