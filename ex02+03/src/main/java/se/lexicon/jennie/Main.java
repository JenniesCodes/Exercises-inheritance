package se.lexicon.jennie;

public class Main {
    public static void main(String[] args) {

        ChildBook cb = new ChildBook();
        cb.setTitle("The child book");
        cb.setAuthor("Child book author");
        cb.setCategory(Category.CHILD);
        cb.setYear(2023);
        cb.setPages(20);
        cb.loan();

        YoungAdultBook yab = new YoungAdultBook();
        yab.setTitle("The young adult book");
        yab.setAuthor("Young adult book author");
        yab.setCategory(Category.ADULT);
        yab.setYear(2023);
        yab.setPages(250);
        yab.loan();

        ReferenceBook rb = new ReferenceBook();
        rb.setTitle("The reference book");
        rb.setAuthor("Reference book author");
        rb.setCategory(Category.NOT_LOANABLE);
        rb.setYear(2023);
        rb.setPages(100);

        // Array of type Book:
        Book[] allBooks = {cb, yab, rb};

        /*
        Alt. 2:
        Book[] allBooks = new Book[]{cb, yab, rb};

        Alt. 3:
        Book[] allBooks = new Book[3];
        allBooks[0] = cb;
        allBooks[1] = yab;
        allBooks[2] = rb;
         */

        System.out.println("\nLOANABLE BOOKS:");

        /*
        Iterates through the array and only prints out the books
        that are instanceof the Loanable interface:
         */
        for(int i = 0; i < allBooks.length; i++) {
            if(allBooks[i] instanceof Loanable) {
                System.out.println("- " + allBooks[i].getTitle());
            }
        }

        System.out.println("\nNOT LOANABLE BOOKS:");

        // Prints out the books that are not loanable:
        for(int i = 0; i < allBooks.length; i++) {
            if(allBooks[i].getCategory() == Category.NOT_LOANABLE) {
                System.out.println("- " + allBooks[i].getTitle());
            }
        }

        System.out.println("\nCHILD BOOKS:");

        // Prints out the books that have the category CHILD:
        for(int i = 0; i < allBooks.length; i++) {
            if(allBooks[i].getCategory() == Category.CHILD) {
                System.out.println("- " + allBooks[i].getTitle());
            }
        }

        System.out.println("\nADULT BOOKS:");

        // Prints out the books that have the category ADULT:
        for(int i = 0; i < allBooks.length; i++) {
            if(allBooks[i].getCategory() == Category.ADULT) {
                System.out.println("- " + allBooks[i].getTitle());
            }
        }
    }
}