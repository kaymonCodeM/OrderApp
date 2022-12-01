package com.app.vocation.Repo;

import com.app.vocation.Entity.Amenity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AmenityRepo extends JpaRepository<Amenity,Long> {
}
