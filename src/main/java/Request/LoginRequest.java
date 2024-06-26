package Request;

/**
 * Stores everything needed to make a login request
 */
public class LoginRequest {
    /**
     * the username to be validated
     */
    private String username;
    /**
     * the password to be validated
     */
    private String password;

    /**
     * The constructor for a login request
     * @param username
     * @param password
     */
    public LoginRequest(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return this.username;
    }
    public String getPassword() {
        return this.password;
    }
}
