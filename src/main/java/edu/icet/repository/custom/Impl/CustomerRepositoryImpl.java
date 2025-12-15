package edu.icet.repository.custom.Impl;

import edu.icet.dto.Customer;
import edu.icet.repository.custom.CustomerRepository;
import edu.icet.util.CrudUtil;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CustomerRepositoryImpl implements CustomerRepository {

    @Override
    public boolean save(Customer customer) throws SQLException {
       return CrudUtil.execute("INSERT INTO customer VALUES(?,?,?,?)",customer.getId(),customer.getName(),customer.getContactNo(),customer.getEmail());
    }

    @Override
    public boolean delete(String id) throws SQLException {
        return CrudUtil.execute("DELETE FROM customer WHERE id = ?",id);
    }

    @Override
    public List<Customer> getAll() throws SQLException {
        ResultSet resultSet = CrudUtil.execute("SELECT * FROM customer");
        ArrayList<Customer> cusList = new ArrayList<>();
        while (resultSet.next()){
            cusList.add(new Customer(resultSet.getString(1),resultSet.getString(2),resultSet.getString(3),resultSet.getString(4)));
        }
        return cusList;
    }

    @Override
    public boolean update(Customer customer) throws SQLException {
        return false;
    }

    @Override
    public Customer search(String id) throws SQLException {
        return CrudUtil.execute("SELECT * FROM customer WHERE id = ?",id);
    }
}
