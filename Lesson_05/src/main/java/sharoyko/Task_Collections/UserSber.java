package sharoyko.Task_Collections;

import java.util.Arrays;

public final class UserSber {
    private String username;
    private String email;
    private byte[] passwordHash;

    @Override
    public boolean equals(Object obj) {
        //проверим чтобы входящий объект был не пустым и такого же типа как и внутренний
        if (obj == this) {
            System.out.println("1");
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            System.out.println("2");
            return false;
        }

        UserSber ghost = (UserSber) obj;
        
        if (((username == ghost.username) || (username != null && username.equals(ghost.getUsername()))) &&
                ((email == ghost.email) || (email != null && email.equals(ghost.getEmail()))) &&
                Arrays.equals(this.passwordHash, ghost.passwordHash)) {
            System.out.println("3");
            return true;
        } else {
         //   System.out.println("4");
            return false;
        }
    }

    @Override
    public int hashCode() {
        final int myGenHash = 25;
        int myHash = 2;
        int myPassHash = 0;
        for (int i = 0; i < passwordHash.length; i++) {
            myPassHash = myPassHash + passwordHash[i];
        }
        myHash = myGenHash * 2 + myPassHash + username.hashCode() + email.hashCode();
        return myHash;
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
}
