package com.app.vocation.Entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "tbl_hotelRoom")
public class HotelRoom {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long hotelRoomId;
    private String bed;
    private int peopleAllowed;
    private boolean active;

    @OneToMany(mappedBy = "hotelRoom")
    @JsonIgnoreProperties("hotelRoom")
    private List<AddOn> addOns;

    @OneToMany(mappedBy = "hotelRoom")
    @JsonIgnoreProperties("hotelRoom")
    private List<Reservation> reservations;

    public HotelRoom() {
    }

    public long getHotelRoomId() {
        return hotelRoomId;
    }

    public void setHotelRoomId(long hotelRoomId) {
        this.hotelRoomId = hotelRoomId;
    }

    public String getBed() {
        return bed;
    }

    public void setBed(String bed) {
        this.bed = bed;
    }

    public int getPeopleAllowed() {
        return peopleAllowed;
    }

    public void setPeopleAllowed(int peopleAllowed) {
        this.peopleAllowed = peopleAllowed;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public List<AddOn> getAddOns() {
        return addOns;
    }

    public void setAddOns(List<AddOn> addOns) {
        this.addOns = addOns;
    }

    public List<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(List<Reservation> reservations) {
        this.reservations = reservations;
    }
}
