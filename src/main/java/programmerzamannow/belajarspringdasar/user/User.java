package programmerzamannow.belajarspringdasar.user;

import lombok.Data;

@Data
public class User {

    private String username;
    private String password;

    User(String username) {
        this.username = username;
    }
}
