package programmerzamannow.belajarspringdasar.user;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class UserEventListener {

    @EventListener(classes = LoginSuccessEvent.class)
    public void onLoginSuccessEvent(LoginSuccessEvent loginSuccessEvent) {
        log.info("Success login for user {}",loginSuccessEvent.getUser());
    }

}
