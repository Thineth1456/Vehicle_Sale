package edu.icet.service.custom.Impl;

import edu.icet.dto.Customer;
import edu.icet.service.custom.CustomerService;

import java.util.List;

public class CustomerServiceImpl implements CustomerService {
    @Override
    public boolean save(Customer customer) {
        return false;
    }

    @Override
    public List<Customer> getAll() {
        return List.of();
    }

    @Override
    public boolean update(Customer customer) {
        return false;
    }

    @Override
    public boolean delete(String id) {
        return false;
    }
}
