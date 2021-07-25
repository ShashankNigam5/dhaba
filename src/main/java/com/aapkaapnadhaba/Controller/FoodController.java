package com.aapkaapnadhaba.Controller;

import Model.Customer;
import com.aapkaapnadhaba.service.FoodAppServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

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
}
