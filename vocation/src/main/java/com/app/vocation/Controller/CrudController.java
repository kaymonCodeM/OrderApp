package com.app.vocation.Controller;


import java.util.List;

public interface CrudController<T> {
    List<T> findAll();

    T add(T elm);

    String delete(String id);

    T getById(String id);

    T update(T elm);
}
