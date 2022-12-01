package com.app.vocation.Service;
import com.app.vocation.Entity.Contact;
import com.app.vocation.Repo.ContactRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactServiceImp implements CrudService<Contact> {

    @Autowired
    private ContactRepo contactRepo;

    @Override
    public List<Contact> findAll() {
        return contactRepo.findAll();
    }

    @Override
    public Contact add(Contact c) {
        return contactRepo.save(c);
    }

    @Override
    public Contact update(Contact c) {
        return contactRepo.save(c);
    }

    @Override
    public Contact findById(long id) {
        return contactRepo.findById(id).orElse(null);
    }

    @Override
    public String delete(long id) {
        contactRepo.deleteById(id);
        return "Contact deleted by id: " + id;
    }
}
