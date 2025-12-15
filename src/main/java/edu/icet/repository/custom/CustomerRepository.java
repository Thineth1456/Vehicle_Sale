package edu.icet.repository.custom;

import edu.icet.dto.Customer;
import edu.icet.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.sql.SQLException;

@Service
public interface CustomerRepository extends CrudRepository<Customer> {
    Customer search(String id) throws SQLException;

}
