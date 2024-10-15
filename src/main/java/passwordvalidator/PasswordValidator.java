package passwordvalidator;

import java.util.Scanner;

public class PasswordValidator {
    private String username;
    private String oldPassword;

    public PasswordValidator(String username, String oldPassword) {
        this.username = username;
        this.oldPassword = oldPassword;
    }

    public String getUsername() {
        return username;
    }

    public String getOldPassword() {
        return oldPassword;
    }

    public void passwordRules(){
        System.out.println("*at least 8 characters long");
        System.out.println("*containt an uppercase letter");
        System.out.println("*contain a special character");
        System.out.println("* not contain the username");
        System.out.println("*not the same as the old password");
    }

    public boolean longEnough(String newPassword){
        if (newPassword.length() >= 8){
            return true;
        }
        System.out.println("Your password must be at least 8 characters long.");
        return false;
    }


    public boolean containAnUppercase(String newPassword){
        if (newPassword.equals(newPassword.toLowerCase())){
            System.out.println("Your password must contain at least one uppercase letter.");
            return false;
        }
        return true;
    }


    public boolean specialCharacter(String newPassword){
        if(newPassword.matches("[a-zA-Z0-9 ]*")){
            System.out.println("Your password must include a special character (e.g. %,$[:).");
            return false;
        }
        return true;
    }

    public boolean containUsername(String newPassword){
        if(newPassword.toUpperCase().contains(username.toUpperCase())){
            System.out.println("Your password cannot contain your username.");
            return false;
        }
        return true;
    }


    public boolean containOldPassword(String newPassword){
        if(newPassword.toUpperCase().equals(oldPassword.toUpperCase())){
            System.out.println("You can't use your old password");
            return false;
        }
        return true;
    }

    public void setNewPassword(){
        Scanner scanner = new Scanner(System.in);

        passwordRules();

        System.out.println("Type your new password: ");
        String newPassword = scanner.nextLine();

        if (longEnough(newPassword) && containAnUppercase(newPassword) && specialCharacter(newPassword) && containUsername(newPassword) &&
                containOldPassword(newPassword)){
            System.out.println("Your password has been changed.");
        } else {
            System.out.println("Read the rules carefully and try again.");
        }

        scanner.close();
    }


}
