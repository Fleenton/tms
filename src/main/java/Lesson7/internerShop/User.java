package Lesson7.internerShop;

public class User {
    private String login;
    private int password;

    public User() {
    }

    public User(String login, int password) {
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    Basket basket = new Basket();
    User user = new User();
}
