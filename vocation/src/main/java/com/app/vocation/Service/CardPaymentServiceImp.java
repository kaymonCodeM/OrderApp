package com.app.vocation.Service;

import com.app.vocation.Entity.CardPayment;
import com.app.vocation.Repo.CardPaymentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CardPaymentServiceImp implements CrudService<CardPayment>{
    @Autowired
    CardPaymentRepo cardPaymentRepo;

    @Override
    public List<CardPayment> findAll() {
        return cardPaymentRepo.findAll();
    }

    @Override
    public CardPayment add(CardPayment c) {
        return cardPaymentRepo.save(c);
    }

    @Override
    public CardPayment update(CardPayment c) {
        return cardPaymentRepo.save(c);
    }

    @Override
    public CardPayment findById(long id) {
        Optional<CardPayment> c = cardPaymentRepo.findById(id);
        return c.orElse(null);
    }

    @Override
    public String delete(long id) {
        cardPaymentRepo.deleteById(id);
        return "Card Payment deleted by id: " + id;
    }
}
