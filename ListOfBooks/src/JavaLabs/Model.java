package JavaLabs;

import java.util.ArrayList;
import java.util.HashMap;


public class Model {

    public ArrayList<Integer> bookList;

    HashMap<Integer, Book> tm;

    public Model(){
        bookList = new ArrayList<>();
        tm = new HashMap<>();
    }

    public void addArticle (Integer art, Book book){
        bookList.add(art);
        tm.put(art, book);
    }

    public Integer getBook(int index){
        return bookList.get(index);
    }

    public void removeBook(int index){
        for (int i = 0; i < bookList.size(); i++ ) {
         if (bookList.get(i) == index) bookList.remove(i);
        }
        tm.remove(index);
    }

    public Book getArticleObj (Integer art){
        return tm.get(art);
    }

    public int getListSize(){
        return bookList.size();
    }
}
