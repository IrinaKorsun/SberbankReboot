package melnikov;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public final class UserSber {
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
    public int hashCode()
    {
        int hash = 0;
        ByteArrayOutputStream tmp = new ByteArrayOutputStream();
        try {
            tmp.write(username.getBytes());
            tmp.write(email.getBytes());
            tmp.write(passwordHash);
        } catch (IOException e) {
            e.printStackTrace();
        }
        tmp.toByteArray();
        byte[] s = tmp.toByteArray();
        for(int i = 0; i < s.length; i++ ) {
            hash = (hash * 1664525) + s[i]+1013904223;
        }
        return hash;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (this == obj)
        return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        UserSber o = (UserSber)obj;
        if (passwordHash.length != o.passwordHash.length) {
            return false;
        }
        for(int i = 0; i < passwordHash.length; i++) {
            if ( passwordHash[i] != o.passwordHash[i] ) {
                return false;
            }
        }
        if (!username.equals(o.username) || !email.equals(o.email)) {
            return false;
        }
        return true;
    }
}
