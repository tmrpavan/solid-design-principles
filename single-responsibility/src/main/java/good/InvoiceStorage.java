package good;

import bad.Book;

public class InvoiceStorage extends Invoice{
    public InvoiceStorage(Book book, int quantity, long discount, long total) {
        super(book, quantity, discount, total);
    }

    public void saveInvoiceToDb() {
        //TO_DO
    }
}
