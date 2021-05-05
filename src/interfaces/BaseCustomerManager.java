package interfaces;

import entities.Customer;

public abstract class BaseCustomerManager implements CustomerService  {
   @Override
    public void save(Customer customer)
    {
        System.out.println("Müşteri veritabanına eklendi "+customer.getFirstName());
    }
}