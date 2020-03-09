package hibernate;

import org.hibernate.Session;  
import org.hibernate.SessionFactory;  
import org.hibernate.Transaction;  
import org.hibernate.boot.Metadata;  
import org.hibernate.boot.MetadataSources;  
import org.hibernate.boot.registry.StandardServiceRegistry;  
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import hibernate.Book;  

public class BookData {
	public static void main (String[] args) {
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();  
        Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();  
      
    SessionFactory factory = meta.getSessionFactoryBuilder().build();  
    Session session = factory.openSession();  
    Transaction t = session.beginTransaction();  
      
     Book book1=new Book();        
        book1.setTitle("The Hobbit");    
        book1.setAuthor("Tolkien");
        book1.setPrice(15.50);
        book1.setBookId(1);
     
   session.save(book1);  
   t.commit();  
   System.out.println("successfully saved");    
    factory.close();  
    session.close();  
	}
}
