package radionov;

import java.util.Arrays;

public class UserSber {
    private String username;
    private String email;
    private byte[] passwordHash;

    public UserSber(String username, String email) {
        this.username = username;
        this.email = email;
        this.passwordHash = username.getBytes();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public byte[] getPasswordHash() {
        return passwordHash;
    }

    public void setPasswordHash(byte[] passwordHash) {
        this.passwordHash = passwordHash;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserSber userSber = (UserSber) o;
        return username.equals(userSber.username) &&
                email.equals(userSber.email) &&
                Arrays.equals(passwordHash, userSber.passwordHash);
    }

    @Override
    public int hashCode() {
        int result = Arrays.hashCode(passwordHash);
        result = 31*result + username.hashCode();
        result = 31*result + email.hashCode();
        return result;
    }
}

