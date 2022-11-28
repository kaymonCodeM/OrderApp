package com.app.vocation.Service;

import com.app.vocation.Entity.AddOn;
import com.app.vocation.Repo.AddOnRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class AddOnServiceImp implements AddOnService{
    @Autowired
    AddOnRepo addOnRepo;

    @Override
    public List<AddOn> findByAmenityId(long amenityId){
        return addOnRepo.findAddOnsByAmenityId(amenityId);
    }

    @Override
    public List<AddOn> findByReservationId(long reservationId){
        return addOnRepo.findAddOnsByReservationId(reservationId);
    }

    @Override
    public List<AddOn> findAll() {
        return addOnRepo.findAll();
    }

    @Override
    public AddOn add(AddOn elm) {
        return addOnRepo.save(elm);
    }

    @Override
    public AddOn update(AddOn elm) {
        return null;
    }

    @Override
    public AddOn findById(long id) {
        return null;
    }

    @Override
    public String delete(long id) {
        return null;
    }
}
