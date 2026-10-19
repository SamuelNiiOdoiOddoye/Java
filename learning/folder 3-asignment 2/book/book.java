public class book{
    String Title;
    String Author;
    String ISBN;
   int PublicationDate;
    int NumberofPages;
    
    public class book(String Title, String Author, String ISBN, int PublicationDate, int NumberofPages ){
        // this.Title = Title;
        // this.Author = Author;
        // this.ISBN = ISBN;
        // this.PublicationDate = PublicationDate;
        // this.Numberofpages= NumberofPages;
        
        public void setTitle(String Title){
            this.Title = Title;
        }
        
        public String getTitle(){
            return title;
        }
        
        public void setAuthor(String Author){
            this.Author = Author;
        }
        
        public String getAuthor(){
            return Author;
        }
        
        public void setISBN(){
            this.ISBN = ISBN
        }
        
        public String getISBN(){
            return.ISBN ;
        }
        
        public void setPublicationDate(int PublicationDate){
            this.PublicationDate = PublicationDate;
        }
        
        public int getPublicationDate(){
            return PublicationDate;
        }
        
        public void setNumberofpages(int NumberofPages){
            this.NumberofPages = NumberofPages;
        }
        
        public int getNumberofPages(){
            return NumberofPages;
        }
        
        public boolean isLongBook(Numberofpages){
            return (NumberofPages>500);
        }
        
        public boolean isRecent (PublicationDate){
            return (PublicationDate < 5);
        }
    }
    
    
}

