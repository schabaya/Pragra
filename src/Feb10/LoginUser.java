package Feb10;

public class LoginUser {
    private String userName;
    private String password;


    public LoginUser(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }


    public String getUserName() {
        return userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void loginUser(String userName, String password){
        if(userName.equalsIgnoreCase(this.userName) && password.equalsIgnoreCase(this.password)){
            System.out.println("User is authenticated, welcome to my app ");
        }else {
            System.out.println("Invalid credentials");
        }
    }
}