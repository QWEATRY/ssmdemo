import com.xxx.domain.Books;
import com.xxx.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;

import java.util.List;

public class test1 {

    @Test
    public void test1()
    {
        String config="applicationContext.xml";
        ApplicationContext ac=new ClassPathXmlApplicationContext(config);
        BookService bookService= (BookService) ac.getBean("BookServiceImpl");
        List<Books> list=bookService.selectBooks();
        for(Books books:list)
        {
            System.out.println(books);
        }
    }
}
