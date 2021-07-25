
package com.aapkaapnadhaba.Repository;

import com.aapkaapnadhaba.Model.Customer;
import org.springframework.data.repository.CrudRepository;

public interface FoodAppRepository extends CrudRepository<Customer, String> {

}

