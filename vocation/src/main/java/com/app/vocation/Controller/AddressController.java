package com.app.vocation.Controller;

import com.app.vocation.Entity.Address;
import com.app.vocation.Service.AddressServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AddressController implements CrudController<Address> {

    @Autowired
    private AddressServiceImp addressServiceImp;

    @GetMapping("/address/all")
    @Override
    public List<Address> findAll() {
        return addressServiceImp.findAll();
    }

    @PostMapping("/address/add")
    @Override
    public Address add(@RequestBody Address elm) {
        return addressServiceImp.add(elm);
    }

    @DeleteMapping("/address/delete/{id}")
    @Override
    public String delete(@PathVariable String id) {
        return addressServiceImp.delete(Long.getLong(id));
    }

    @GetMapping("/address/get/{id}")
    @Override
    public Address getById(@PathVariable String id) {
        return addressServiceImp.findById(Long.getLong(id));
    }

    @PutMapping("/address/update")
    @Override
    public Address update(@RequestBody Address elm) {
        return addressServiceImp.update(elm);
    }
}
