package com.app.vocation.Controller;

import com.app.vocation.Entity.AddOn;
import com.app.vocation.Service.AddOnServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AddOnController implements CrudController<AddOn> {

    @Autowired
    private AddOnServiceImp addOnServiceImp;

    @GetMapping("/addOn/all")
    @Override
    public List<AddOn> findAll() {
        return addOnServiceImp.findAll();
    }

    @PostMapping("/addOn/add")
    @Override
    public AddOn add(@RequestBody AddOn elm) {
        return addOnServiceImp.add(elm);
    }

    @DeleteMapping("/addOn/delete/{id}")
    @Override
    public String delete(@PathVariable String id) {
        return addOnServiceImp.delete(Long.parseLong(id));
    }

    @GetMapping("/addOn/get/{id}")
    @Override
    public AddOn getById(String id) {
        return addOnServiceImp.findById(Long.parseLong(id));
    }

    @PutMapping("/addOn/update")
    @Override
    public AddOn update(AddOn elm) {
        return addOnServiceImp.update(elm);
    }
}
