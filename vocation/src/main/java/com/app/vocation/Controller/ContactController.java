package com.app.vocation.Controller;

import com.app.vocation.Entity.Contact;
import com.app.vocation.Service.ContactServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ContactController implements CrudController<Contact> {

    @Autowired
    private ContactServiceImp contactServiceImp;

    @GetMapping("/contact/all")
    @Override
    public List<Contact> findAll() {
        return contactServiceImp.findAll();
    }

    @PostMapping("/contact/add")
    @Override
    public Contact add(@RequestBody Contact elm) {
        return contactServiceImp.add(elm);
    }

    @DeleteMapping("/contact/delete/{id}")
    @Override
    public String delete(@PathVariable String id) {
        return contactServiceImp.delete(Long.parseLong(id));
    }

    @GetMapping("/contact/get/{id}")
    @Override
    public Contact getById(String id) {
        return contactServiceImp.findById(Long.parseLong(id));
    }

    @GetMapping("/contact/update")
    @Override
    public Contact update(@RequestBody Contact elm) {
        return contactServiceImp.update(elm);
    }
}
