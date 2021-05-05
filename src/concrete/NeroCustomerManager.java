package concrete;
import entities.Customer;
import interfaces.BaseCustomerManager;
import interfaces.CustomerCheckService;

public class NeroCustomerManager extends BaseCustomerManager {
    CustomerCheckService customerCheckService;
    public NeroCustomerManager(CustomerCheckService customerCheckService){
    	super();
        this.customerCheckService=customerCheckService;
    }
  
    public void save(Customer customer)
    {
        if (customerCheckService.checkPerson(customer)){
            System.out.println("Nero Müþterisi Bilgileri Doðrulandý");
            super.save(customer);
        }
        else{
            System.out.println("Nero Müþterisi Bilgileri Doðrulanamadý");
        }
    }
}
