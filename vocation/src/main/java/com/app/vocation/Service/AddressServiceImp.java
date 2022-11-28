package com.app.vocation.Service;

import com.app.vocation.Entity.Address;
import com.app.vocation.Repo.AddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AddressServiceImp implements CrudService<Address> {

    @Autowired
    AddressRepo addressRepo;

    @Override
    public List<Address> getAll() {
        return addressRepo.findAll();
    }

    @Override
    public Address create(Address elm) {
        return addressRepo.save(elm);
    }

    @Override
    public Address update(Address elm) {
        return addressRepo.save(elm);
    }

    @Override
    public Address getById(long id) {
        Optional<Address> a = addressRepo.findById(id);
        return a.orElse(null);
    }

    @Override
    public String delete(long id) {
        try {
            addressRepo.deleteById(id);
        }catch (Exception e){
            return "ERROR: Address was not found by id: " + id;
        }
        return "Success Address deleted by id: " + id;
    }
}
