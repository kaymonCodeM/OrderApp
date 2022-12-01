package com.app.vocation.Controller;

import com.app.vocation.Entity.HotelRoom;
import com.app.vocation.Service.HotelRoomServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HotelRoomController implements CrudController<HotelRoom>{

    @Autowired
    private HotelRoomServiceImp hotelRoomServiceImp;

    @GetMapping("/hotelRoom/all")
    @Override
    public List<HotelRoom> findAll() {
        return hotelRoomServiceImp.findAll();
    }

    @PostMapping("/hotelRoom/add")
    @Override
    public HotelRoom add(@RequestBody HotelRoom elm) {
        return hotelRoomServiceImp.add(elm);
    }

    @DeleteMapping("/hotelRoom/delete/{id}")
    @Override
    public String delete(@PathVariable String id) {
        return hotelRoomServiceImp.delete(Long.parseLong(id));
    }

    @GetMapping("/hotelRoom/get/{id}")
    @Override
    public HotelRoom getById(@PathVariable String id) {
        return hotelRoomServiceImp.findById(Long.parseLong(id));
    }

    @PutMapping("/hotelRoom/update")
    @Override
    public HotelRoom update(@RequestBody HotelRoom elm) {
        return hotelRoomServiceImp.update(elm);
    }
}
