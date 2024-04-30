package co.com.automation.screenplay.mobile.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class LoginData {
    private String user;
    private String password;
}
