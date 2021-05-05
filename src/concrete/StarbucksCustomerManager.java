package concrete;
import entities.Customer;
import interfaces.BaseCustomerManager;
import interfaces.CustomerCheckService;

public class StarbucksCustomerManager extends BaseCustomerManager {
	  CustomerCheckService customerCheckService;
	  public StarbucksCustomerManager(CustomerCheckService customerCheckService){
		  super();
	      this.customerCheckService=customerCheckService;
	  }
	   
	    public void save(Customer customer)
	    {
	        if (customerCheckService.checkPerson(customer)){
	            System.out.println("Starbuck Müþterisi Bilgileri Doðrulandý");
	            super.save(customer);
	        }
	        else{
	            System.out.println("Starbucks Müþterisi Bilgileri Doðrulanamadý");
	        }
	    }
}

