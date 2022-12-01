package com.app.vocation.Service;

import com.app.vocation.Entity.*;
import com.app.vocation.Repo.ReservationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservationServiceImp implements CrudService<Reservation> {

    @Autowired
    private ReservationRepo reservationRepo;

    @Autowired
    private AddOnServiceImp addOnServiceImp;


    @Override
    public List<Reservation> findAll() {
        return reservationRepo.findAll();
    }

    @Override
    public Reservation add(Reservation elm) {
        return reservationRepo.save(elm);
    }

    @Override
    public Reservation update(Reservation elm) {

        return reservationRepo.save(elm);
    }

    @Override
    public Reservation findById(long id) {
        return reservationRepo.findById(id).orElse(null);
    }

    @Override
    public String delete(long id) {
        Reservation reservation = findById(id);
        for (AddOn addOn: reservation.getAddOns()){
            addOnServiceImp.delete(addOn.getAddOnId());
        }
        reservationRepo.deleteById(id);
        return "Reservation deleted by id: " + id;
    }
}
