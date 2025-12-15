package edu.icet.service.custom;

import edu.icet.dto.Customer;
import edu.icet.service.SuperService;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;
@Service
public interface CustomerService extends SuperService {
    boolean save(Customer customer) throws SQLException;
    List<Customer> getAll() throws SQLException;
    boolean update(Customer customer);
    boolean delete(String id);
    Customer search(String id);
    List<String> getAllContactNo() throws SQLException;

}
