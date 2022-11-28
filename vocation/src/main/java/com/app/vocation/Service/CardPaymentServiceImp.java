package com.app.vocation.Service;

import com.app.vocation.Entity.CardPayment;
import com.app.vocation.Repo.CardPaymentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CardPaymentServiceImp implements CrudService<CardPayment> {
    @Autowired
    CardPaymentRepo cardPaymentRepo;

    @Override
    public List<CardPayment> getAll() {
        return cardPaymentRepo.findAll();
    }

    @Override
    public CardPayment create(CardPayment elm) {
        return cardPaymentRepo.save(elm);
    }

    @Override
    public CardPayment update(CardPayment elm) {
        return cardPaymentRepo.save(elm);
    }

    @Override
    public CardPayment getById(long id) {
        Optional<CardPayment> a = cardPaymentRepo.findById(id);
        return a.orElse(null);
    }

    @Override
    public String delete(long id) {
        try {
            cardPaymentRepo.deleteById(id);
        }catch (Exception e){
            return "ERROR: Card Payment was not found by id: " + id;
        }
        return "Success Card Payment deleted by id: " + id;
    }
}
