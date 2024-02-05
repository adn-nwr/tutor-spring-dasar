package programmerzamannow.belajarspringdasar;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import programmerzamannow.belajarspringdasar.data.Bar;
import programmerzamannow.belajarspringdasar.data.Foo;
import programmerzamannow.belajarspringdasar.data.FooBar;

public class DependencyInjectionTes {

    @Test
    void tesNoDI() {
        var foo = new Foo();
        var bar = new Bar();
        var fooBar = new FooBar(foo,bar);
        Assertions.assertSame(foo,fooBar.getFoo());
        Assertions.assertSame(bar,fooBar.getBar());
    }

    @Test
    void tesWithDI() {
        ApplicationContext appctx = new AnnotationConfigApplicationContext(DependencyInjectionConfiguration.class);
        Foo beanFoo = appctx.getBean(Foo.class);
        Bar beanBar = appctx.getBean(Bar.class);
        FooBar beanFooBar = appctx.getBean(FooBar.class);
        Assertions.assertSame(beanFoo,beanFooBar.getFoo());
        Assertions.assertSame(beanBar,beanFooBar.getBar());
    }
}
