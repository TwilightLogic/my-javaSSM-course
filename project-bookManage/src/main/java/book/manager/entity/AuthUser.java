package book.manager.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class AuthUser {
    int id;
    String name;
    String password;
    String role;
}
