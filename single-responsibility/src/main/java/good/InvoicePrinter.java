package good;

import bad.Book;

public class InvoicePrinter extends Invoice{
    public InvoicePrinter(Book book, int quantity, long discount, long total) {
        super(book, quantity, discount, total);
    }

    public void printInvoice() {
        //TO_DO
    }
}
