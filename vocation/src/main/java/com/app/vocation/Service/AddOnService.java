package com.app.vocation.Service;

import com.app.vocation.Entity.AddOn;

import java.util.List;

public interface AddOnService extends CrudService<AddOn>{

    public List<AddOn> findByReservationId(long reservationId);

    public List<AddOn> findByAmenityId(long amenityId);
}
