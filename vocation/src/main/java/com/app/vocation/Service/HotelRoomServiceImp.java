package com.app.vocation.Service;

import com.app.vocation.Entity.HotelRoom;
import com.app.vocation.Entity.Reservation;
import com.app.vocation.Repo.HotelRoomRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HotelRoomServiceImp implements CrudService<HotelRoom> {

    @Autowired
    private HotelRoomRepo hotelRoomRepo;

    @Autowired
    private ReservationServiceImp reservationServiceImp;


    @Override
    public List<HotelRoom> findAll() {
        return hotelRoomRepo.findAll();
    }

    @Override
    public HotelRoom add(HotelRoom elm) {

        return hotelRoomRepo.save(elm);
    }

    @Override
    public HotelRoom update(HotelRoom elm) {
        return hotelRoomRepo.save(elm);
    }

    @Override
    public HotelRoom findById(long id) {
        return hotelRoomRepo.findById(id).orElse(null);
    }

    @Override
    public String delete(long id) {
        HotelRoom hotelRoom = findById(id);
        for(Reservation r: hotelRoom.getReservations()){
            reservationServiceImp.delete(r.getReservationId());
        }
        hotelRoomRepo.deleteById(id);
        return "Hotel Room deleted by id: " + id;
    }
}
