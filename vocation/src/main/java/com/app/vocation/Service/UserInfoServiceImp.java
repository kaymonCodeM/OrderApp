package com.app.vocation.Service;

import com.app.vocation.Entity.*;
import com.app.vocation.Repo.UserInfoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserInfoServiceImp implements CrudService<UserInfo>{

    @Autowired
    private UserInfoRepo userInfoRepo;

    @Autowired
    ReservationServiceImp reservationServiceImp;

    @Autowired
    AddressServiceImp addressServiceImp;

    @Autowired
    CardPaymentServiceImp cardPaymentServiceImp;

    @Autowired
    ContactServiceImp contactServiceImp;

    @Override
    public List<UserInfo> findAll() {
        return userInfoRepo.findAll();
    }

    @Override
    public UserInfo add(UserInfo elm) {
        return userInfoRepo.save(elm);
    }

    @Override
    public UserInfo update(UserInfo elm) {
        return userInfoRepo.save(elm);
    }

    @Override
    public UserInfo findById(long id) {
        return userInfoRepo.findById(id).orElse(null);
    }

    @Override
    public String delete(long id) {
        UserInfo userInfo = findById(id);
        for(Reservation reservation: userInfo.getReservations()){
            reservationServiceImp.delete(reservation.getReservationId());
        }
        Address address = userInfo.getAddress();
        CardPayment cardPayment = userInfo.getCardPayment();
        Contact contact = userInfo.getContact();

        if(address!=null){
            addressServiceImp.delete(address.getAddressId());
        }

        if(cardPayment!=null){
            cardPaymentServiceImp.delete(cardPayment.getCardPaymentId());
        }

        if(contact!=null){
            contactServiceImp.delete(contact.getContactId());
        }

        userInfoRepo.deleteById(id);
        return "User Information deleted by id: " + id;
    }
}
