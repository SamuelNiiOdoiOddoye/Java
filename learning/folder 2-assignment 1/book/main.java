public class main {
     

    public static void main(String[] args){

        Book book1 = new Book();
        book1.setTitle("Day In The Life Of Telix");
        book1.setAuthor("Samuel Oddoye");
        book1.setISBN("9789988830311");
        book1.setPage_Count(55);
        book1.setPrice(50.60);

        System.out.println("Title: " + book1.getTitle());
        System.out.println("Author: " + book1.getAuthor());
        System.out.println("ISBN: " + book1.getISBN());
        System.out.println("Page count: " + book1.getPage_Count());
        System.out.println("Price: " + book1.getPrice());


        Book book2 = new Book();
        book2.setTitle("BAKana");
        book2.setAuthor("Samuel");
        book2.setISBN("10984gfh");
        book2.setPrice(53.24);
        book2.setPage_Count(90);

        System.out.println("Title : " + book2.getTitle());
        System.out.println("Author: " + book2.getAuthor());
        System.out.println("ISBN: " + book2.getISBN());
        System.out.println("Page count: " + book2.getPage_Count());
        System.out.println("Price: " + book2.getPrice());
        
    }
      
}
