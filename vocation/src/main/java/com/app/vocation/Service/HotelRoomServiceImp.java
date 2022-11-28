package com.app.vocation.Service;

import com.app.vocation.Entity.HotelRoom;
import com.app.vocation.Repo.HotelRoomRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HotelRoomServiceImp implements CrudService<HotelRoom> {

    @Autowired
    HotelRoomRepo hotelRoomRepo;

    @Override
    public List<HotelRoom> getAll() {
        return hotelRoomRepo.findAll();
    }

    @Override
    public HotelRoom create(HotelRoom elm) {
        return hotelRoomRepo.save(elm);
    }

    @Override
    public HotelRoom update(HotelRoom elm) {
        return hotelRoomRepo.save(elm);
    }

    @Override
    public HotelRoom getById(long id) {
        Optional<HotelRoom> a = hotelRoomRepo.findById(id);
        return a.orElse(null);
    }

    @Override
    public String delete(long id) {
        try {
            hotelRoomRepo.deleteById(id);
        }catch (Exception e){
            return "ERROR: Hotel Room was not found by id: " + id;
        }
        return "Success Hotel Room deleted by id: " + id;
    }
}
