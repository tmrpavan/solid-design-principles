## Introduction to Single Responsibility Principle
A class should have only one reason to change its implementation. A call should have only one goal or functionality.

In Development we tend to integrate everything into one class. Which makes it very difficult to add new features or 
fix bugs. So Single Responsibility helps to create classes which are very simple and all methods of the call to
achieve a single goal.

### Book invoice application
We are building a Book invoice application. Which have two classes **Book** and **Invoice**.

1. Book
    Book class contains the data members of the book.

2. Invoice class contains the following functionalities
   1. Calculate the book price
   2. Printing the invoice
   3. Save the invoice to that database.

The following class diagram provides a blueprint of these classes:

![](/single-responsibility/src/main/resources/bad.png "")

### Violations 
If you see The Invoice violate the single responsibility principle many ways.
1. Invoices should only handle invoices. But it is also handling print and saving the invoices.
2. We need to split it into multiple classes to follow single responsibility.

Instead of modifying the Invoice class for these uses, we can create two new classes for printing and persistence logic: 
**InvoicePrinter** and **InvoiceStorage**, and move the methods accordingly, as shown below.

![](/single-responsibility/src/main/resources/good.png "")



