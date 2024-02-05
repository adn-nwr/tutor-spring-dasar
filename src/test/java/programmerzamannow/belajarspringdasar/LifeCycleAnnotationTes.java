package programmerzamannow.belajarspringdasar;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import programmerzamannow.belajarspringdasar.data.Server;

@Slf4j
public class LifeCycleAnnotationTes {

    private AnnotationConfigApplicationContext appContext;
    @BeforeEach
    void setUp() {
        appContext = new AnnotationConfigApplicationContext(LifeCycleConfiguration.class);
    }

    @AfterEach
    void tearDown() {
        appContext.close();
    }

    @Test
    void tesAnnotation() {
        log.info("bean diakses");
        Server server = appContext.getBean(Server.class);
    }
}
