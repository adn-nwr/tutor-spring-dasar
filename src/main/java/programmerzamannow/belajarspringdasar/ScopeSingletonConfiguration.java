package programmerzamannow.belajarspringdasar;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import programmerzamannow.belajarspringdasar.data.Foo;

@Slf4j
@Configuration
public class ScopeSingletonConfiguration {

    @Bean
    Foo foo() {
        log.info("bean foo hanya dibuat sekali saja");
        return new Foo();
    }

}
