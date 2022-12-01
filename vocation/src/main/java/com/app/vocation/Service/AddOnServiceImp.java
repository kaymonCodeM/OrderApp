package com.app.vocation.Service;

import com.app.vocation.Entity.AddOn;
import com.app.vocation.Repo.AddOnRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddOnServiceImp implements CrudService<AddOn>{
    @Autowired
    private AddOnRepo addOnRepo;

    @Override
    public List<AddOn> findAll() {
        return addOnRepo.findAll();
    }

    @Override
    public AddOn add(AddOn elm) {
        return addOnRepo.save(elm);
    }

    @Override
    public AddOn update(AddOn elm) {
        return addOnRepo.save(elm);
    }

    @Override
    public AddOn findById(long id) {

        return addOnRepo.findById(id).orElse(null);
    }

    @Override
    public String delete(long id) {
        addOnRepo.deleteById(id);
        return "Add on deleted by id: " + id;
    }
}
