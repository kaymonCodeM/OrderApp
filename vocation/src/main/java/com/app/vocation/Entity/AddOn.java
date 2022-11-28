package com.app.vocation.Entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name = "tbl_addOn")
public class AddOn {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long addOnId;

    @ManyToOne
    @JoinColumn(name = "amenityId",updatable = false)
    @JsonIgnoreProperties("addOns")
    private Amenity amenity;

    @ManyToOne
    @JoinColumn(name = "hotelRoomId",updatable = false)
    @JsonIgnoreProperties("addOns")
    private HotelRoom hotelRoom;

    public AddOn() {
    }

    public long getAddOnId() {
        return addOnId;
    }

    public void setAddOnId(long addOnId) {
        this.addOnId = addOnId;
    }

    public Amenity getAmenity() {
        return amenity;
    }

    public void setAmenity(Amenity amenity) {
        this.amenity = amenity;
    }

    public HotelRoom getHotelRoom() {
        return hotelRoom;
    }

    public void setHotelRoom(HotelRoom hotelRoom) {
        this.hotelRoom = hotelRoom;
    }
}
