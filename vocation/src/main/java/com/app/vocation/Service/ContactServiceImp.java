package com.app.vocation.Service;
import com.app.vocation.Entity.Contact;
import com.app.vocation.Repo.ContactRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContactServiceImp implements CrudService<Contact> {

    @Autowired
    ContactRepo contactRepo;

    @Override
    public List<Contact> getAll() {
        return contactRepo.findAll();
    }

    @Override
    public Contact create(Contact elm) {
        return contactRepo.save(elm);
    }

    @Override
    public Contact update(Contact elm) {
        return contactRepo.save(elm);
    }

    @Override
    public Contact getById(long id) {
        Optional<Contact> a = contactRepo.findById(id);
        return a.orElse(null);
    }

    @Override
    public String delete(long id) {
        try {
            contactRepo.deleteById(id);
        }catch (Exception e){
            return "ERROR: Contact was not found by id: " + id;
        }
        return "Success Contact deleted by id: " + id;
    }
}
