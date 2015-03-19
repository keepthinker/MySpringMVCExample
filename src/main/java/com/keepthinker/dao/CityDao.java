package com.keepthinker.dao;

import java.util.List;

import com.keepthinker.dao.entity.City;

public interface CityDao extends AbstractDao<City, Integer> {
    void saveUser(City user);
    List<City> findUsers(Integer id);
}
