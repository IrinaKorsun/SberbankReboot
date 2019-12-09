package yushchenko;


import java.util.Arrays;

public final class UserSber {
    private String username;
    private String email;
    private byte[] passwordHash;

    public UserSber(String name, String email, byte[] passwordHash) {
        setUsername(name);
        setEmail(email);
        setPasswordHash(passwordHash);

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
    public int hashCode() {
        return username.hashCode() + email.hashCode() + passwordHash.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public boolean equals(UserSber obj) {
        if (this == obj) return true;
        if (this.hashCode() != obj.hashCode()) return false;
        if (getClass() != obj.getClass()) return false;
        UserSber userSber = (UserSber) obj;
        return username.equals(userSber.username) &&
                email.equals(userSber.email) &&
                Arrays.equals(passwordHash, userSber.passwordHash);
    }

}

