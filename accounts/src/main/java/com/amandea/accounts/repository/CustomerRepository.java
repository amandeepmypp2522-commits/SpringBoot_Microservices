package com.amandea.accounts.repository;

import com.amandea.accounts.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

    // we are defining optional because in database there may or may not be the customer with given mobile number
    Optional<Customer> findByMobileNumber(String mobileNumber);


}
