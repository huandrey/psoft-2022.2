public class Lote {
    public String id;
    public Product product;
    public int amount;

    Lote(Product product, int amount) {
        this.product = product;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Lote{" +
                "id='" + id + '\'' +
                ", product=" + product +
                ", amount=" + amount +
                '}';
    }
}
