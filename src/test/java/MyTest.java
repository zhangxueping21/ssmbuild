import com.pojo.Books;
import com.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void test(){
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("application_context.xml");
        BookService bookService = (BookService)applicationContext.getBean("BookServiceImpl");
        for(Books books:bookService.queryAllBook()){
            System.out.println(books);
        }
    }
}
