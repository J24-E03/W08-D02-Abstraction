import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Getter @Setter
public class Book {
    @NotBlank(message = "Name cannot be empty.")
    private String name;
    @NotNull
    private Author author;
    private double price = 0.0;
    @Min(1)
    private int qty = 1;

    public Book(String name, Author author, double price) {
        this.setName(name);
        this.setAuthor(author);
        this.setPrice(price);
    }

    public Book(String name, Author author, double price, int qty) {
        this.setName(name);
        this.setAuthor(author);
        this.setPrice(price);
        this.setQty(qty);
    }

    @Override
    public String toString() {
        return
            "Book[name=" + this.getName() +
            ", " + this.getAuthor() +
            ", price=" + this.getPrice() +
            ", qty=" + this.getQty() + "]";
    }
}
