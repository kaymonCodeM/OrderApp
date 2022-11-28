package com.app.vocation.Entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "tbl_amenity")
public class Amenity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long amenityId;
    private String name;
    private double cost;

    @OneToMany(mappedBy = "amenity")
    @JsonIgnoreProperties("amenity")
    private List<AddOn> addOns;

    public Amenity() {
    }

    public long getAmenityId() {
        return amenityId;
    }

    public void setAmenityId(long amenityId) {
        this.amenityId = amenityId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public List<AddOn> getAddOns() {
        return addOns;
    }

    public void setAddOns(List<AddOn> addOns) {
        this.addOns = addOns;
    }
}
