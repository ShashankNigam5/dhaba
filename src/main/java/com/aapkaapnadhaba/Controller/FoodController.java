package com.aapkaapnadhaba.Controller;

import com.aapkaapnadhaba.Model.Customer;
import com.aapkaapnadhaba.service.FoodAppServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api")
public class FoodController {

    @Autowired
    FoodAppServiceImpl foodAppService;

    @RequestMapping(method = RequestMethod.GET,path = "create/user")
    public ResponseEntity<Customer> createCustomer(){
        Customer customer = foodAppService.save(Customer.builder().id("C0001").name("Shashank").pincode("208011")
                .city("kanpur").state("UP").createdAt( java.time.LocalDateTime.now().toString()).build());

        ResponseEntity<Customer> customerResponseEntity = new ResponseEntity<>(customer, HttpStatus.CREATED);
        return customerResponseEntity;
    }

    @PostMapping("/create/user")
    public ResponseEntity<Customer> createCustomer(@RequestBody Customer customer){
        Customer savedCustomer = foodAppService.save(customer);

        ResponseEntity<Customer> customerResponseEntity = new ResponseEntity<>(customer, HttpStatus.CREATED);
        return customerResponseEntity;
    }

    @GetMapping("/user/{customerId}")
    public ResponseEntity<Customer> getUserById(@PathVariable("customerId") String id){
        Optional<Customer> customer =  foodAppService.findById(id);
        if(customer.isPresent()){
            ResponseEntity<Customer> customerResponseEntity = new ResponseEntity<>(customer.get(), HttpStatus.CREATED);
            return customerResponseEntity;
        }

        return new ResponseEntity<>(HttpStatus.NOT_FOUND);

    }

    @GetMapping("/users")
    public ResponseEntity<Iterable<Customer>> findAllUsers(){
        Iterable<Customer> customers = foodAppService.findAllCustomers();
        return new ResponseEntity<>(customers, HttpStatus.OK);
    }
}
