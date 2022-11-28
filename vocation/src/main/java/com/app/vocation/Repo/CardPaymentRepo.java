package com.app.vocation.Repo;

import com.app.vocation.Entity.CardPayment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CardPaymentRepo extends JpaRepository<CardPayment,Long> {
}
