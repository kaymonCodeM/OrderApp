package com.app.vocation.Entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name = "tbl_saveContact")
public class SaveContact {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long saveContactId;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;

    @OneToOne(mappedBy = "saveContact")
    @JsonIgnoreProperties("saveContact")
    private User user;

    public SaveContact() {
    }

    public long getSaveContactId() {
        return saveContactId;
    }

    public void setSaveContactId(long saveContactId) {
        this.saveContactId = saveContactId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
