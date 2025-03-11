package gr.aueb.cf.schoolapp.dao;

import gr.aueb.cf.schoolapp.model.City;

import java.sql.SQLDataException;
import java.sql.SQLException;
import java.util.List;

public interface ICityDAO {

    //ALL CRUD methods need to be implemented

    List<City> getAll() throws SQLDataException, SQLException;
}
