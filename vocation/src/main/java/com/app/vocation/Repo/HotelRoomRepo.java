package com.app.vocation.Repo;

import com.app.vocation.Entity.HotelRoom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HotelRoomRepo extends JpaRepository<HotelRoom,Long> {
}
