package passwordvalidator;

public class Main {
    public static void main(String[] args) {
        PasswordValidator passwordValidator = new PasswordValidator("chicken", "12345");
        passwordValidator.setNewPassword();
    }
}
