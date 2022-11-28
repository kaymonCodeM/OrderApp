package com.app.vocation.Service;

import com.app.vocation.Entity.CardPayment;

import java.util.List;

public interface CrudService <T> {
    List<T> findAll();
    T add (T elm);
    T update(T elm);
    T findById(long id);
    String delete(long id);
}
