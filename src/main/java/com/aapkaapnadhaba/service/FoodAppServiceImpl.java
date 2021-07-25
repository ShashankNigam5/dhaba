package com.aapkaapnadhaba.service;

import com.aapkaapnadhaba.Model.Customer;
import com.aapkaapnadhaba.Repository.FoodAppRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class FoodAppServiceImpl {

    private FoodAppRepository foodAppRepository;

    @Autowired
    public FoodAppServiceImpl(FoodAppRepository theFoodAppRepository){
        foodAppRepository = theFoodAppRepository;
    }

    public Customer save(Customer customer){
        return foodAppRepository.save(customer);
    }

    public Optional<Customer> findById(String id){
        return foodAppRepository.findById(id);
    }

    public Iterable<Customer> findAllCustomers(){
        return foodAppRepository.findAll();
    }
}
