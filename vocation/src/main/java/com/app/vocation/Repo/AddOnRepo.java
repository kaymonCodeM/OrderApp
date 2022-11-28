package com.app.vocation.Repo;

import com.app.vocation.Entity.AddOn;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AddOnRepo extends JpaRepository<AddOn,Long> {

    @Query(value = "SELECT * FROM tbl_addOn WHERE amenity_id = ?1",nativeQuery = true)
    List<AddOn> findAddOnsByAmenityId(long amenityId);

    @Query(value = "SELECT * FROM tbl_addOn WHERE reservation_id = ?1",nativeQuery = true)
    List<AddOn> findAddOnsByReservationId(long reservationId);
}
