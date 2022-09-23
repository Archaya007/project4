package com.kgisl.springHibernate.DAO;

import java.util.List;

import net.javaguides.springmvc.entity.Customer;

public interface CustomerDAO {

    public List < Customer > getCustomers();

    public void saveCustomer(Customer theCustomer);

    public Customer getCustomer(int theId);

    public void deleteCustomer(int theId);
}