package com.app.vocation.Controller;

import com.app.vocation.Entity.Amenity;
import com.app.vocation.Service.AmenityServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AmenityController implements CrudController<Amenity> {

    @Autowired
    private AmenityServiceImp amenityServiceImp;


    @GetMapping("amenity/all")
    @Override
    public List<Amenity> findAll() {
        return amenityServiceImp.findAll();
    }

    @PostMapping("/amenity/add")
    @Override
    public Amenity add(@RequestBody Amenity elm) {
        return amenityServiceImp.add(elm);
    }

    @DeleteMapping("/amenity/delete/{id}")
    @Override
    public String delete(@PathVariable String id) {
        return amenityServiceImp.delete(Long.parseLong(id));
    }

    @GetMapping("/amenity/get/{id}")
    @Override
    public Amenity getById(@PathVariable String id) {
        return amenityServiceImp.findById(Long.parseLong(id));
    }

    @PutMapping("amenity/update")
    @Override
    public Amenity update(@RequestBody Amenity elm) {
        return amenityServiceImp.update(elm);
    }
}
