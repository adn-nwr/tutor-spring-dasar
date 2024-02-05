package programmerzamannow.belajarspringdasar;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import programmerzamannow.belajarspringdasar.data.Foo;

public class ScopeTes {

    @Test
    void tesScope() {
        AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext(ScopePrototypeConfiguration.class);
        Foo foo = appContext.getBean(Foo.class);
        Foo foo2 = appContext.getBean(Foo.class);
        Assertions.assertNotSame(foo,foo2);
    }

    @Test
    void tesSingletonScope() {
        AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext(ScopeSingletonConfiguration.class);
        Foo foo = appContext.getBean(Foo.class);
        Foo foo2 = appContext.getBean(Foo.class);
        Assertions.assertSame(foo,foo2);
    }
}
