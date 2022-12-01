package com.app.vocation.Controller;

import com.app.vocation.Entity.Reservation;
import com.app.vocation.Service.ReservationServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ReservationController implements CrudController<Reservation> {

    @Autowired
    private ReservationServiceImp reservationServiceImp;


    @GetMapping("/reservation/all")
    @Override
    public List<Reservation> findAll() {
        return reservationServiceImp.findAll();
    }

    @PostMapping("/reservation/add")
    @Override
    public Reservation add(@RequestBody Reservation elm) {
        return reservationServiceImp.add(elm);
    }

    @DeleteMapping("/reservation/delete/{id}")
    @Override
    public String delete(@PathVariable String id) {
        return reservationServiceImp.delete(Long.parseLong(id));
    }

    @GetMapping("/reservation/get/{id}")
    @Override
    public Reservation getById(@PathVariable String id) {
        return reservationServiceImp.findById(Long.parseLong(id));
    }

    @PutMapping("/reservation/update")
    @Override
    public Reservation update(@RequestBody Reservation elm) {
        return reservationServiceImp.update(elm);
    }
}
