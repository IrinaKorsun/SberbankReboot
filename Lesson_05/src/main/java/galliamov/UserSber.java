package galliamov;

import java.util.Arrays;

public class UserSber {
    private String username;
    private String email;
    private byte[] passwordHash;
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
    public boolean equals(Object obj) {
        //проверим чтобы входящий объект был не пустым и такого же типа как и внутренний
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        UserSber rUser = (UserSber) obj;

        if (((username == rUser.username) || (username != null && username.equals(rUser.getUsername()))) &&
                ((email == rUser.email) || (email != null && email.equals(rUser.getEmail()))) &&
                Arrays.equals(this.passwordHash, rUser.passwordHash)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        int iHash = 2;
        int iPassHash = 0;
        for (int i = 0; i < passwordHash.length; i++) {
            iPassHash = iPassHash + passwordHash[i];
        }
        iHash = iPassHash + username.hashCode() + email.hashCode();
        return iHash;
    }
}
