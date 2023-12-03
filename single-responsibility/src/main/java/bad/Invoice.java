package bad;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Invoice {
    private Book book;
    private int quantity;
    private long discount;
    private long total;

    public long calculateTotal() {
        //TO_DO
        return 0;
    }

    public void saveInvoiceToDb() {
        //TO_DO
    }

    public void printInvoice() {
        //TO_DO
    }
}
