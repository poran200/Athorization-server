package com.seu.athorization.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;


@Data
@AllArgsConstructor
@EqualsAndHashCode(of = {"username"})
public class LoginToken {
    @Id
    private  String username;
    private   String loginpassword;
    private Role role;

    public LoginToken() {
       this.role= Role.NO_ROLE;
    }
}
