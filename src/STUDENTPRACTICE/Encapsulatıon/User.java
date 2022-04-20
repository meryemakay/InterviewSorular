package STUDENTPRACTICE.Encapsulatıon;

public class User {
    private int userId;
    private String username;
    private String password;
    private boolean isActive;
    private boolean isSignedin;

    public User() {
    }

    public User(int id, String username, String password, boolean isActive, boolean isSignedin) {
        this.userId = id;
        this.username = username;
        this.password = password;
        this.isActive = isActive;
        this.isSignedin = isSignedin;
    }

    public int getId() {
        return userId;
    }

    public void setId(int id) {
        this.userId = id;
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

    public boolean setPassword(String password) {
        if (password.length() >= 6) {

            return true;
        } else {
            return false;

        }
    }


public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public boolean isSignedin() {
        return isSignedin;
    }

    public void setSignedin(boolean signedin) {
        isSignedin = signedin;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + userId +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", isActive=" + isActive +
                ", isSignedin=" + isSignedin +
                '}';
    }
}