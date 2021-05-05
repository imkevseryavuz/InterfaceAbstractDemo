package interfaceAbstractDemo;
import adapters.MernisServiceAdapter;
import concrete.CustomerCheckManager;
import concrete.NeroCustomerManager;
import concrete.StarbucksCustomerManager;
import entities.Customer;
import interfaces.BaseCustomerManager;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		Customer realCustomer = new Customer(1,"Kevser","Yavuz",new Date(1997,6,10),"42664570802");
		Customer fakeCustomer = new Customer(2,"Kevser","Yavuz",new Date(1997,6,10),"12345678964");
		
		BaseCustomerManager neroCustomerManager = new NeroCustomerManager(new CustomerCheckManager());
		neroCustomerManager.save(realCustomer);
		
		BaseCustomerManager starbucksCustomerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		starbucksCustomerManager.save(realCustomer);
		starbucksCustomerManager.save(fakeCustomer);
	}

}
