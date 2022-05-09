public class Product {
    public String id;
    public String name;
    public String fabricante;

    Product(String name, String fabricante) {
        this.name = name;
        this.fabricante = fabricante;
    }

    public String getFabricante() {
        return fabricante;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", fabricante='" + fabricante + '\'' +
                '}';
    }
}
