package com.app.vocation.Entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "tbl_userInfo")
public class UserInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long userInfoId;

    @OneToOne(mappedBy = "userInfo")
    @JsonIgnoreProperties("userInfo")
    private Address address;

    @OneToOne(mappedBy = "userInfo")
    @JsonIgnoreProperties("userInfo")
    private Contact contact;

    @OneToOne(mappedBy = "userInfo")
    @JsonIgnoreProperties("userInfo")
    private CardPayment cardPayment;

    @OneToOne
    @JoinColumn(name = "userId")
    @JsonIgnoreProperties("userInfo")
    private User user;

    @OneToMany(mappedBy = "userInfo")
    @JsonIgnoreProperties("userInfo")
    private List<Reservation> reservations;

    public UserInfo() {
    }

    public long getUserInfoId() {
        return userInfoId;
    }

    public void setUserInfoId(long userInfoId) {
        this.userInfoId = userInfoId;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public CardPayment getCardPayment() {
        return cardPayment;
    }

    public void setCardPayment(CardPayment cardPayment) {
        this.cardPayment = cardPayment;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(List<Reservation> reservations) {
        this.reservations = reservations;
    }
}
