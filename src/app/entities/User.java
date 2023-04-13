package app.entities;

import java.io.Serializable;
import java.time.LocalDate;

public class User implements Serializable {

    private Long id;
    private String name;
    private String firstname;
    private LocalDate birthdate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public int getAge(){
        return LocalDate.now().getYear() - this.birthdate.getYear();
    }
    public User(Long id, String name, String firstname, LocalDate birthdate) {
        this.id = id;
        this.name = name;
        this.firstname = firstname;
        this.birthdate = birthdate;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", firstname='" + firstname + '\'' +
                ", birthdate=" + birthdate +
                '}';
    }
}
