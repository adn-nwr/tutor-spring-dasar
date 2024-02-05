package programmerzamannow.belajarspringdasar;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import programmerzamannow.belajarspringdasar.data.Server;

@Slf4j
@Configuration
public class LifeCycleConfiguration {

    @Bean(initMethod = "start", destroyMethod = "stop")
    public Server server() {
        log.info("bean dibuat");
        return new Server();
    }

}
