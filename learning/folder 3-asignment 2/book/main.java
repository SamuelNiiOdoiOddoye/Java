public class main {
    public static void main(String[] args) {
        book Book1 = new book("Telix's Travels", "Telix","TeLiX0115112004" , 2004, 15112004 );
        
        System.out.println("Book Title: " + Book1.getTitle());
        System.out.println("Author: " + Book1.getauthor());
        System.out.println("ISBN: " + Book1.getISBN());
        System.outprintln("Producton Date:" + Book1.getPublicationDate());
        System.out.println("Number Of pages: " + Book1.getNumberofPages());
        System.out.println("Is the book long:  " + Book1.isLongBook());
    }
}