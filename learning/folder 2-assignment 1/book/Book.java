public class Book{
    public String	Title ;
    public String	Author ;
    public String	ISBN ;
    public int	Page_Count ;
    public  double	Price ;


    // these are the methods that set author, ISBN, Page_Count, Price and Title
    public void setTitle(String newTitle){
        Title = newTitle;
    }

    public void setAuthor(String newAuthor){
        Author = newAuthor;
    }

    public void setISBN(String newISBN){
        ISBN = newISBN;
    }

    public void setPage_Count(int newPage_Count){
        Page_Count = newPage_Count;
    }

    public void setPrice(double newPrice){
        Price = newPrice;
    }


    // these are the methods that get author, ISBN, Page_Count, Price and Title
    public String getTitle(){
        return Title;
    }

    public String getAuthor(){
        return Author;
    }

    public String getISBN(){
        return ISBN;
    }

    public int getPage_Count(){
        return Page_Count;
    }

    public double getPrice(){
        return Price;
    }
}

