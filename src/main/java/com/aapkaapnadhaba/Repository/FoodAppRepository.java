
package com.aapkaapnadhaba.Repository;

import Model.Customer;
import org.springframework.data.repository.CrudRepository;


import java.util.List;

public interface FoodAppRepository extends CrudRepository<Customer, String> {

}

