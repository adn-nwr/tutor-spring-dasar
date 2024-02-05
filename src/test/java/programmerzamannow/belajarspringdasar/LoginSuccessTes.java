package programmerzamannow.belajarspringdasar;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Import;
import programmerzamannow.belajarspringdasar.user.UserEventListener;
import programmerzamannow.belajarspringdasar.user.UserService;

@Import({
        UserService.class,
        UserEventListener.class
})
public class LoginSuccessTes {

    @Test
    void tesLoginUser() {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(LoginSuccessTes.class);
        UserService bean = applicationContext.getBean(UserService.class);
        System.out.println("login= " + bean.login("adnan","rahasia"));

    }
}
