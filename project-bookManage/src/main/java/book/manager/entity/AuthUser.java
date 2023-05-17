package book.manager.entity;

import lombok.Data;

@Data
public class AuthUser {
    String username;
    String password;
    String role;
}
