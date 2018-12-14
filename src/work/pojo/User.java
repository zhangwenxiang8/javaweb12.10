package work.pojo;

public class User {
    private int id;
    private String username;
    private String password;
    private String tele;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTele() {
        return tele;
    }

    public void setTele(String tele) {
        this.tele = tele;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", tele='" + tele + '\'' +
                '}';
    }

    public User(int id, String username, String password, String tele) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.tele = tele;
    }

    public User() {
    }
}

