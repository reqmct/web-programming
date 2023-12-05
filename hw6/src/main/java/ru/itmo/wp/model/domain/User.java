package ru.itmo.wp.model.domain;

public class User extends BasicEntity {
    private String login;

    private String email;


    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
