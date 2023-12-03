package good;

import bad.Book;
import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Invoice {
    private bad.Book book;
    private int quantity;
    private long discount;
    private long total;

    public long calculateTotal() {
        //TO_DO
        return 0;
    }
}
