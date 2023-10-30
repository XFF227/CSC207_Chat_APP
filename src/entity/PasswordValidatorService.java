package entity;

public class PasswordValidatorService {
    public boolean passwordIsValid(String password) {
        return password != null && password.length() > 5;
    }
}
