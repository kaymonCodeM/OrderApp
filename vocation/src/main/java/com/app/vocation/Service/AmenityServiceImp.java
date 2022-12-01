package com.app.vocation.Service;

import com.app.vocation.Entity.AddOn;
import com.app.vocation.Entity.Amenity;
import com.app.vocation.Repo.AmenityRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AmenityServiceImp implements CrudService<Amenity> {

    @Autowired
    private AmenityRepo amenityRepo;

    @Autowired
    private AddOnServiceImp addOnServiceImp;

    @Override
    public List<Amenity> findAll() {
        return amenityRepo.findAll();
    }

    @Override
    public Amenity add(Amenity a) {
        return amenityRepo.save(a);
    }

    @Override
    public Amenity update(Amenity a) {
        return amenityRepo.save(a);
    }

    @Override
    public Amenity findById(long id) {
        return amenityRepo.findById(id).orElse(null);
    }

    @Override
    public String delete(long id) {
        Amenity amenity = findById(id);
        for (AddOn a: amenity.getAddOns()){
            System.out.println(addOnServiceImp.delete(a.getAddOnId()));
        }
        amenityRepo.deleteById(id);
        return "Amenity deleted by id: " + id;
    }
}
