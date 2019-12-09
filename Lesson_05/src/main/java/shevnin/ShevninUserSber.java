package shevnin;

import javax.xml.bind.DatatypeConverter;

public final class ShevninUserSber {
    private String username;
    private String email;
    private byte[] passwordHash;

    public ShevninUserSber(String username, byte[] passwordHash){
        this.username = username;
        this.email = username + "@sberbank.ru";
        this.passwordHash = passwordHash;
    }

    public String getUsername() {
        return username;
    }
    public void setUsername(String username){
        this.username = username;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }

    public byte[] getPasswordHash(){
        return passwordHash;
    }
    public String getHEXPasswordHash(){return DatatypeConverter.printHexBinary(passwordHash);}
    public void setPasswordHash(byte [] passwordHash){
        this.passwordHash = passwordHash;
    }

    public String getHash() {
        return this.getUsername() + (char)0 + this.getEmail() + (char)0 + this.getHEXPasswordHash();
    }
}
