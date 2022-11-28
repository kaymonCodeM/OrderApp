package com.app.vocation.Service;

import com.app.vocation.Entity.Address;
import com.app.vocation.Entity.CardPayment;
import com.app.vocation.Entity.Contact;
import com.app.vocation.Entity.Reservation;
import com.app.vocation.Repo.ReservationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservationServiceImp implements CrudService<Reservation> {

    @Autowired
    ReservationRepo reservationRepo;

    @Autowired
    AddressServiceImp addressServiceImp;

    @Autowired
    ContactServiceImp contactServiceImp;

    @Autowired
    CardPaymentServiceImp cardPaymentServiceImp;

    @Override
    public List<Reservation> findAll() {
        return reservationRepo.findAll();
    }

    @Override
    public Reservation add(Reservation elm) {
        Address address = addressServiceImp.add(elm.getAddress());
        Contact contact = contactServiceImp.add(elm.getContact());
        CardPayment cardPayment = cardPaymentServiceImp.add(elm.getCardPayment());
        elm.setAddress(address);
        elm.setContact(contact);
        elm.setCardPayment(cardPayment);
        return reservationRepo.save(elm);
    }

    @Override
    public Reservation update(Reservation elm) {
        Address address = addressServiceImp.add(elm.getAddress());
        Contact contact = contactServiceImp.add(elm.getContact());
        CardPayment cardPayment = cardPaymentServiceImp.add(elm.getCardPayment());
        elm.setAddress(address);
        elm.setContact(contact);
        elm.setCardPayment(cardPayment);
        return reservationRepo.save(elm);
    }

    @Override
    public Reservation findById(long id) {
        return reservationRepo.findById(id).orElse(null);
    }

    @Override
    public String delete(long id) {
        reservationRepo.deleteById(id);
        return "Reservation deleted by id: " + id;
    }
}
