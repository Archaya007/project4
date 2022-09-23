package com.kgisl.springHibernate.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kgisl.springHibernate.Entity.Customer;


@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private Customer customerDAO;

    @Override
    @Transactional
    public List <Customer> getCustomers() {
        return customerDAO.getCustomers();
    }

    @Override
    @Transactional
    public Customer getCustomer(int theId) {
        return customerDAO.getCustomer(theId);
    }

    @Override
    @Transactional
    public void deleteCustomer(int theId) {
        customerDAO.deleteCustomer(theId);
    }

    @Override
    public Customer saveCustomer(int theId) {
        // TODO Auto-generated method stub
        return null;
    }
}
