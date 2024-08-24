package interfaceSample;

interface Member{
	void callBack();
}
class Store{
	Member mem[] = new Member[100];
	int count =0;
	void register(Member m) {
		mem[count++] = m;
	}
	void inviteSale() {
		for(int i=0;i<count;i++) {
			mem[i].callBack();
		}
	}
	
}

class Customer implements Member{
	
	String name;
	public Customer(String m) {
		name =m;
	}
	@Override
	public void callBack() {
		System.out.println("Ok, I will visit "+ name);
	}
	
}

public class StoreCustomerMain {

	public static void main(String args[]) {
		Store s = new Store();
		Customer c1 = new Customer("John");
		Customer c2 = new Customer("cena");
		s.register(c1);
		s.register(c2);
		s.inviteSale();
	}
}
