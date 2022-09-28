import com.liu.dao.bookDao;
import com.liu.service.Service;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class app {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        Service service = (Service
                ) ctx.getBean("Service");

        service.save();
    }
}
