package lu.lllc.jakson.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import lu.lllc.jakson.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
