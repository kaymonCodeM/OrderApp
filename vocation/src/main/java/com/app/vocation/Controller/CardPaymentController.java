package com.app.vocation.Controller;

import com.app.vocation.Entity.CardPayment;
import com.app.vocation.Service.CardPaymentServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CardPaymentController implements CrudController<CardPayment> {

    @Autowired
    private CardPaymentServiceImp cardPaymentServiceImp;

    @GetMapping("/cardPayment/all")
    @Override
    public List<CardPayment> findAll() {
        return cardPaymentServiceImp.findAll();
    }

    @PostMapping("/cardPayment/add")
    @Override
    public CardPayment add(@RequestBody CardPayment elm) {
        return cardPaymentServiceImp.add(elm);
    }

    @DeleteMapping("/cardPayment/delete/{id}")
    @Override
    public String delete(@PathVariable String id) {
        return cardPaymentServiceImp.delete(Long.parseLong(id));
    }

    @GetMapping("/cardPayment/get/{id}")
    @Override
    public CardPayment getById(@PathVariable String id) {
        return cardPaymentServiceImp.findById(Long.getLong(id));
    }

    @PutMapping("/cardPayment/update")
    @Override
    public CardPayment update(@RequestBody CardPayment elm) {
        return cardPaymentServiceImp.update(elm);
    }
}
