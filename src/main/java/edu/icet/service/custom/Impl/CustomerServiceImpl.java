package edu.icet.service.custom.Impl;

import edu.icet.dto.Customer;
import edu.icet.repository.custom.CustomerRepository;
import edu.icet.service.custom.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {

    final CustomerRepository repository;

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
