import java.util.ArrayList;

public class BookShelf {
    public char firstLetter;
    public ArrayList<Book> shelf = new ArrayList<>(8); 


    public BookShelf(char firstLetter){
        this.firstLetter = firstLetter;
        shelf = new ArrayList<>(8);
    }

    public char getLetter(){
        return firstLetter;
    }

    public void setLetter(char firstLetter){
        this.firstLetter = firstLetter;
    }

    public ArrayList<Book> getShelf(){
        return shelf;
    }

    public void setShelf(ArrayList<Book> shelf){
        this.shelf= shelf;
    }

    public void addBook(Book newBook){
        char ch = newBook.title.charAt(0);
        if(firstLetter == ch ){
            shelf.add(newBook);
        }
        else{
            return;
        }

    }

    public void removeBook(Book newBook){
        for(int i = 0 ; i < shelf.size() ; i++){
            Book book1 = shelf.get(i);
            if(book1.title == newBook.title){
                shelf.remove(i);
            }
        }
    }

    public String toString(){
        String newStr = "";
        for(int i = 0 ; i < shelf.size() ; i++){
            Book book1 = shelf.get(i);
            newStr += book1.title + "   ";
        }
        if(newStr == ""){
            return "Empty";
        }
        return newStr;
    }

}    