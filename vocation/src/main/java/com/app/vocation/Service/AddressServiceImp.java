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
    private AddressRepo addressRepo;

    @Override
    public List<Address> findAll() {
        return addressRepo.findAll();
    }

    @Override
    public Address add(Address a) {
        return addressRepo.save(a);
    }

    @Override
    public Address update(Address a) {
        return addressRepo.save(a);
    }

    @Override
    public Address findById(long id) {
        Optional<Address> a = addressRepo.findById(id);
        return a.orElse(null);
    }

    @Override
    public String delete(long id) {
        addressRepo.deleteById(id);
        return "Address deleted by id: "+id;
    }
}
