package programmerzamannow.belajarspringdasar;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import programmerzamannow.belajarspringdasar.data.Bar;
import programmerzamannow.belajarspringdasar.data.Foo;
import programmerzamannow.belajarspringdasar.data.FooBar;

@Configuration
public class DependencyInjectionConfiguration {

    @Bean
    Foo foo() {
        return new Foo();
    }

    @Bean
    Bar bar() {
        return new Bar();
    }

    @Bean
    FooBar foobar(@Qualifier("foo") Foo foo, Bar bar) {
        return new FooBar(foo,bar);
    }

}
