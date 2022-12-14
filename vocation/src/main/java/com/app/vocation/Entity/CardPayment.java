package com.app.vocation.Entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "tbl_cardPayment")
public class CardPayment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long cardPaymentId;
    private String cardHolder;
    private String cardNumber;
    private LocalDate ExpirationDate;
    private int cvv;

    @OneToOne
    @JoinColumn(name = "userInfoId")
    @JsonIgnoreProperties("cardPayment")
    private UserInfo userInfo;

    public CardPayment() {
    }

    public long getCardPaymentId() {
        return cardPaymentId;
    }

    public void setCardPaymentId(long cardPaymentId) {
        this.cardPaymentId = cardPaymentId;
    }

    public String getCardHolder() {
        return cardHolder;
    }

    public void setCardHolder(String cardHolder) {
        this.cardHolder = cardHolder;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public LocalDate getExpirationDate() {
        return ExpirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        ExpirationDate = expirationDate;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    public UserInfo getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }
}
