package com.app.vocation.Service;

import com.app.vocation.Entity.HotelRoom;
import com.app.vocation.Repo.HotelRoomRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HotelRoomServiceImp {

    @Autowired
    HotelRoomRepo hotelRoomRepo;

}
