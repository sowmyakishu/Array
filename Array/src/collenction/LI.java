package Iteraror;
import java.util.ArrayList;
import java.util.Iterator;

class Book {
	int pid;
	String title;
	double price;

	Book() {} 
	
	public Book(int pid, String title, double price) {
		super();
		this.pid = pid;
		this.title = title;
		this.price = price;
	}

	@Override
	public String toString() {
		return "book [pid=" + pid + ", price=" + price + ", title=" + title + "]";
		
	}
}

public class LI {

	public static void main(String[] args) {
    ArrayList ls=new ArrayList();
    ls.add(new Book(101,"Manual", 250));
    ls.add(new Book(102,"java", 500));
    ls.add(new Book(103,"SQL", 300));
    ls.add(new Book(104,"Selenium", 550));
    System.out.println("Before removing:"+ ls);
    
    Iterator i= ls.iterator();
    while(li.hasNext());
    Book b= (Book)i.next();
    if ( b.title=="java")
    {
         i.remove();
    }
    
	}	
	}

	