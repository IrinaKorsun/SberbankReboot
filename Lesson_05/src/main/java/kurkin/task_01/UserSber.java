package kurkin.task_01;

final class UserSber {
    private String username;
    private String email;
    private byte[] passwordHash;

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public byte[] getPasswordHash() {
        return passwordHash;
    }

    public String getStrPasswordHash() {
        return new String(passwordHash);
    }

    public void setPasswordHash(byte[] passwordHash) {
        this.passwordHash = passwordHash;
    }

    public int hashCode() {
        String str = this.username + this.email + this.getStrPasswordHash();
        int res = 0;
        if (str == null) return res;
        char[] ch = str.toCharArray();
        for (char c : ch) {
            int temp = (int) c;
            res += temp;
        }
        return res;
    }

    @Override
    public boolean equals(Object user) {
        boolean res = false;
        if (user == null || this == null) return false;
        UserSber usr = (UserSber) user;
        if (usr.username.equals(this.username)
                && usr.email.equals(this.email)
                && usr.getStrPasswordHash().equals(this.getStrPasswordHash())) res = true;
        return res;
    }

    ;
}
