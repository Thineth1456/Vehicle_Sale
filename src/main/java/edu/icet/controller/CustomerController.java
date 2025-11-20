package edu.icet.controller;

import edu.icet.dto.Customer;
import edu.icet.service.ServiceFactory;
import edu.icet.service.custom.CustomerService;
import edu.icet.util.ServiceEnum;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@CrossOrigin
@RestController("/customer")
public class CustomerController {
    CustomerService customerService = ServiceFactory.getInstance().getFactory(ServiceEnum.CUSTOMER);

    @GetMapping("/getAllCustomers")
    public List<Customer> getCustomers(){

        return customerService.getAll();
    }
    @PostMapping("/addCustomer")
    public List<Customer> addCustomer(@RequestBody Customer customer){
        customerService.save(customer);

        return customerService.getAll();
    }
    @DeleteMapping("/deleteCustomer")
    public void delete(@RequestBody String id){
        customerService.delete(id);
    }
    @GetMapping("/GetContacts")
    public  List<String> getAllContactNo(){

        return null;
    }
}
