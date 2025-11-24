package edu.icet.service.custom;

import edu.icet.dto.Customer;
import edu.icet.service.SuperService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface CustomerService extends SuperService {
    boolean save(Customer customer);
    List<Customer> getAll();
    boolean update(Customer customer);
    boolean delete(String id);

}
