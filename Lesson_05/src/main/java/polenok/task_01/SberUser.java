package polenok.task_01;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public final class SberUser{
    private String firstname;
    private String lastname;
    private String patronymic;
    private String email;
    private byte[] passwordHash;

    private String pathPatronymic = "./Lesson_05/src/main/java/polenok/task_01/patronymic.txt";
    private String pathFirst = "./Lesson_05/src/main/java/polenok/task_01/first_names.txt";
    private String pathLast = "./Lesson_05/src/main/java/polenok/task_01/last-names.txt";

    public void genAll(){
        try {
            BufferedReader reader = new BufferedReader(new FileReader(pathPatronymic));
            List<String> patronymics = new ArrayList<String>();
            String line;
            while ((line = reader.readLine()) != null) {
                patronymics.add(line);
            }

            BufferedReader reader1 = new BufferedReader(new FileReader(pathFirst));
            List<String> firstnames = new ArrayList<String>();
            String line1;
            while ((line1 = reader1.readLine()) != null) {
                firstnames.add(line1);
            }

            BufferedReader reader2 = new BufferedReader(new FileReader(pathLast));
            List<String> lastnames = new ArrayList<String>();
            String line2;
            while ((line2 = reader2.readLine()) != null) {
                lastnames.add(line2);
            }

            this.firstname=firstnames.get((int) (Math.random()*firstnames.size()));
            this.patronymic=patronymics.get((int) (Math.random()*patronymics.size()));
            this.lastname=lastnames.get((int) (Math.random()*lastnames.size()));
            this.email=this.lastname+"@sberbank.ru";
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void setAll(String firstname, String patronymic, String lastname, String email){
        this.firstname = firstname;
        this.patronymic = patronymic;
        this.lastname = lastname;
        this.email = email;
    }

    @Override
    public int hashCode() {
        String username = this.firstname + this.patronymic + this.lastname;
        return Objects.hash(username, this.email);
    }

    public String getUsername() {
        return firstname+' '+patronymic+' '+lastname;
    }

    public String getEmail() {
        return email;
    }

    public byte[] getPasswordHash() {
        return passwordHash;
    }

    public void setPasswordHash(byte[] passwordHash) {
        this.passwordHash = passwordHash;
    }
}
