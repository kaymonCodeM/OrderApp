package com.app.vocation.Entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "tbl_reservation")
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long reservationId;
    private LocalDate checkIn;
    private LocalDate checkOut;
    private int people;
    private String amenitiesSelected;

    @OneToOne
    @JoinColumn(name = "addressId",updatable = false)
    @JsonIgnoreProperties("reservations")
    private Address address;

    @OneToOne
    @JoinColumn(name = "contactId",updatable = false)
    @JsonIgnoreProperties("reservations")
    private Contact contact;

    @OneToOne
    @JoinColumn(name = "cardPaymentId",updatable = false)
    @JsonIgnoreProperties("reservations")
    private CardPayment cardPayment;

    @ManyToOne
    @JoinColumn(name = "hotelRoomId", updatable = false)
    @JsonIgnoreProperties("reservations")
    private HotelRoom hotelRoom;

    @ManyToOne
    @JoinColumn(name = "userId", updatable = false)
    @JsonIgnoreProperties("reservations")
    private User user;

    public Reservation() {
    }

    public long getReservationId() {
        return reservationId;
    }

    public void setReservationId(long reservationId) {
        this.reservationId = reservationId;
    }

    public LocalDate getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(LocalDate checkIn) {
        this.checkIn = checkIn;
    }

    public LocalDate getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(LocalDate checkOut) {
        this.checkOut = checkOut;
    }

    public int getPeople() {
        return people;
    }

    public void setPeople(int people) {
        this.people = people;
    }

    public String getAmenitiesSelected() {
        return amenitiesSelected;
    }

    public void setAmenitiesSelected(String amenitiesSelected) {
        this.amenitiesSelected = amenitiesSelected;
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

    public HotelRoom getHotelRoom() {
        return hotelRoom;
    }

    public void setHotelRoom(HotelRoom hotelRoom) {
        this.hotelRoom = hotelRoom;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
