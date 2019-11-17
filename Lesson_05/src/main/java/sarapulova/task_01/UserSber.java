package sarapulova.task_01;

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

    public boolean isEquals(UserSber obj) {
        Boolean retRes = false;
//        System.out.println(this.getPasswordHash().length);
//        System.out.println(obj.getPasswordHash().length);

        if (this.getEmail().equals(obj.getEmail()) && this.getUsername().equals(obj.getUsername()) && this.getPasswordHash().length == obj.getPasswordHash().length) {
            retRes = true;
            for (int i = 0; i < this.getPasswordHash().length; i++)  {
               if (this.getPasswordHash()[i] != obj.getPasswordHash()[i]) {
                   retRes = false;
                   break;
               }
            }
        }
        return retRes;
    }

    @Override
    public String toString() {
        return this.getUsername() + "/" + this.getEmail() + "/" + this.getPasswordHash()[0];
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        String s = this.getUsername();
        return Integer.valueOf(s.substring(s.indexOf('_')));
    }
}