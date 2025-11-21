package edu.icet.repository.custom;

import edu.icet.dto.Customer;
import edu.icet.repository.CrudRepository;
import org.springframework.stereotype.Service;
@Service
public interface CustomerRepository extends CrudRepository<Customer> {

}
