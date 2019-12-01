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
        return (this.hashCode() == obj.hashCode());
    }

    @Override
    public int hashCode() {
//        System.out.println("hashCode--------------");
//        System.out.println("name = " + this.getUsername());

        String sName = this.getUsername();
        String sEmail = this.getEmail();
        byte[] bPassHash = this.getPasswordHash();
        int iIndex = Integer.valueOf(sName.substring(sName.indexOf('_') + 1));
        //System.out.println("iIndex = " + iIndex);

        String sTmp = sName + sEmail + bPassHash[0];
        int ret = 0;
        for (int i = 0; i < sTmp.length(); i++) {
            ret += (int)sTmp.charAt(i);
        }
        //System.out.println("ret = " + ret);
        ret += iIndex;
        //System.out.println("ret = " + ret);

        return ret;
    }
}