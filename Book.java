public class Book {
    private String author="", ISBN="", title="", availability="";

    public Book(String a, String i, String t, String x){
        author = a;
        ISBN = i;
        title = t;
        availability = x;
    }
    
    public String getTitle(){
        return title;
    }

}
