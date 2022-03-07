import javax.swing.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ChainOfResponsibility {

    public static void main(String[] args) {
        String name ="SahanMaduka";
        String password ="Sahan.123";
        String email ="sahanmaduka06@gmail.com";
        String mobile ="0717454563";

        UserNameFilter1 filter1 = new UserNameFilter1();
        UserMobileFilter2 filter2 = new UserMobileFilter2();
        UserPasswordFilter2 filter21 = new UserPasswordFilter2();
        UserEmailFilter2 emailFilter2 = new UserEmailFilter2();

        filter1.setUserChain(filter2);
        filter2.setUserChain(filter21);
        filter21.setUserChain(emailFilter2);

        User u = new User(name, mobile, password, email);
        filter1.proccess(u);


    }
}
class User {

    private String name;
    private String mobile;
    private String password;
    private String email;

    public User(String name, String mobile, String password, String email) {
        this.name = name;
        this.mobile = mobile;
        this.password = password;
        this.email = email;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the mobile
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * @param mobile the mobile to set
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

}

abstract class UserChain {

    UserChain userChain;

    public void setUserChain(UserChain userChain) {
        this.userChain = userChain;
    }

    public abstract void proccess(User user);
}

class UserNameFilter1 extends UserChain {

    @Override
    public void proccess(User user) {
        if (!user.getName().isEmpty() || !user.getName().equals("null")) {
            System.out.println("Correct Username");
          //  JOptionPane.showMessageDialog(null, "User Registration Successfull ", "Successfull", JOptionPane.INFORMATION_MESSAGE);
            this.userChain.proccess(user);
        } else {
            JOptionPane.showMessageDialog(null, "Please Enter Name", "Error", JOptionPane.WARNING_MESSAGE);

        }
    }
}

class UserMobileFilter2 extends UserChain {

    @Override
    public void proccess(User user) {

        if (!user.getMobile().isEmpty()) {

            if (user.getMobile().length() == 10) {
                System.out.println("Correct Mobile");
                this.userChain.proccess(user);
            } else if (user.getMobile().length() > 10) {
                JOptionPane.showMessageDialog(null, "Please Enter 10 Digits", "Error", JOptionPane.WARNING_MESSAGE);

            } else if (user.getMobile().length() < 10) {
                JOptionPane.showMessageDialog(null, "Please Enter 10 Digits", "Error", JOptionPane.WARNING_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please Enter Mobile Number", "Error", JOptionPane.WARNING_MESSAGE);
        }
    }
}

class UserPasswordFilter2 extends UserChain {

    @Override
    public void proccess(User user) {

        Pattern specailCharPatten = Pattern.compile("[^a-z0-9 ]", Pattern.CASE_INSENSITIVE);
        Pattern UpperCasePatten = Pattern.compile("[A-Z ]");
        Pattern lowerCasePatten = Pattern.compile("[a-z ]");
        Pattern digitCasePatten = Pattern.compile("[0-9 ]");

        if (user.getPassword().length() < 8) {
            JOptionPane.showMessageDialog(null, "Password lenght must have alleast 8 character !!", "Error", JOptionPane.WARNING_MESSAGE);
        } else if (!specailCharPatten.matcher(user.getPassword()).find()) {
            JOptionPane.showMessageDialog(null, "Password must have atleast one specail character !!", "Error", JOptionPane.WARNING_MESSAGE);
        } else if (!UpperCasePatten.matcher(user.getPassword()).find()) {
            JOptionPane.showMessageDialog(null, "Password must have atleast one uppercase character !!", "Error", JOptionPane.WARNING_MESSAGE);
        } else if (!lowerCasePatten.matcher(user.getPassword()).find()) {
            JOptionPane.showMessageDialog(null, "Password must have atleast one lowercase character !!", "Error", JOptionPane.WARNING_MESSAGE);
        } else if (!digitCasePatten.matcher(user.getPassword()).find()) {
            JOptionPane.showMessageDialog(null, "Password must have atleast one digit character !!", "Error", JOptionPane.WARNING_MESSAGE);
        } else {
            System.out.println("Correct password");
            this.userChain.proccess(user);
        }

    }
}

class UserEmailFilter2 extends UserChain {

    @Override
    public void proccess(User user) {
        String regex = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(user.getEmail());
        if (!user.getEmail().isEmpty() || !user.getEmail().equals("null")) {
            if (matcher.matches()) {
                System.out.println("Correct email");
            } else {
                JOptionPane.showMessageDialog(null, "Given email id is not valid", "Error", JOptionPane.WARNING_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please Enter Email", "Error", JOptionPane.WARNING_MESSAGE);
        }

    }
}


