package com.kgisl.springHibernate.Service;

import java.util.List;

import org.springframework.http.codec.CodecConfigurer.CustomCodecs;

import com.kgisl.springHibernate.Entity.Customer;


public interface CustomerService {

    public List<Customer> getCustomers();

    public Customer saveCustomer(int theId);

    public Customer getCustomer(int theId);

    public void deleteCustomer(int theId);

}
