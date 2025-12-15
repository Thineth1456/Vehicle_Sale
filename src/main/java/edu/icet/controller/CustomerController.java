package edu.icet.controller;

import edu.icet.dto.Customer;
import edu.icet.service.ServiceFactory;
import edu.icet.service.custom.CustomerService;
import edu.icet.util.ServiceEnum;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.List;


@CrossOrigin
@RestController
public class CustomerController {
    CustomerService customerService = ServiceFactory.getInstance().getFactory(ServiceEnum.CUSTOMER);

    @GetMapping("/getAllCustomers")
    public List<Customer> getCustomers(){

        try {
            return customerService.getAll();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    @PostMapping("/addCustomer")
    public List<Customer> addCustomer(@RequestBody Customer customer){
        try {
            customerService.save(customer);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        try {
            return customerService.getAll();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    @DeleteMapping("/deleteCustomer")
    public void delete(@RequestBody String id){
        customerService.delete(id);
    }
    @GetMapping("/GetContacts")
    public  List<String> getAllContactNo(){

        try {
            return customerService.getAllContactNo();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
