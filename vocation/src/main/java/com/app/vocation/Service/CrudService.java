package com.app.vocation.Service;

import java.util.List;

public interface CrudService<T> {
    List<T> getAll();
    T create(T elm);
    T update(T elm);
    T getById(long id);
    String delete(long id);
}
