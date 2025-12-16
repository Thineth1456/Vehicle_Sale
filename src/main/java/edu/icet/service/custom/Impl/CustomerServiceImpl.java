package edu.icet.service.custom.Impl;

import edu.icet.dto.Customer;
import edu.icet.repository.custom.CustomerRepository;
import edu.icet.service.custom.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {

    final CustomerRepository repository;

    @Override
    public boolean save(Customer customer) throws SQLException {
        return repository.save(customer);
    }

    @Override
    public List<Customer> getAll() throws SQLException {
        return repository.getAll();
    }

    @Override
    public boolean update(Customer customer) {
        return false;
    }

    @Override
    public boolean delete(String id) {
        return false;
    }

    @Override
    public Customer search(String id) throws SQLException {
        return repository.search(id);
    }

    @Override
    public List<String> getAllContactNo() throws SQLException {
        ArrayList<String> contactNo = new ArrayList<>();
        getAll().forEach(customer -> {
            contactNo.add(customer.getContactNo());

        });
        return contactNo;
    }
}
