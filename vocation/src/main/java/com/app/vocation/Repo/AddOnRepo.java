package com.app.vocation.Repo;

import com.app.vocation.Entity.AddOn;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AddOnRepo extends JpaRepository<AddOn,Long> {

}
