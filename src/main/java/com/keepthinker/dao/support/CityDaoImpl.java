package com.keepthinker.dao.support;

import java.util.List;

import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.keepthinker.dao.CityDao;
import com.keepthinker.dao.entity.City;

@Repository
public class CityDaoImpl extends AbstractDaoImpl<City, Integer> implements CityDao {

    protected CityDaoImpl() {
        super(City.class);
        System.out.println("city dao impl");
    }

    @Override
    public void saveUser(City city) {
        saveOrUpdate(city);
    }

    @Override
    public List<City> findUsers(Integer id) {
        return findByCriteria(Restrictions.like("id", id.toString(), MatchMode.START));
    }
}
