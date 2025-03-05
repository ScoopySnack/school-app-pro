package gr.aueb.cf.schoolapp.dao;

import gr.aueb.cf.schoolapp.model.City;

import java.util.List;

public interface ICityDAO {

    //ALL CRUD methods need to be implemented

    List<City> getAll() throws Exception;
}
