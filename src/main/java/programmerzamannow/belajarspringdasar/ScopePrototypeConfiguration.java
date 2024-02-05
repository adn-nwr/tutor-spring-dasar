package programmerzamannow.belajarspringdasar;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import programmerzamannow.belajarspringdasar.data.Foo;

@Slf4j
@Configuration
public class ScopePrototypeConfiguration {

    @Bean
    @Scope("prototype")
    Foo foo() {
        log.info("membuat bean foo");
        return new Foo();
    }

}
