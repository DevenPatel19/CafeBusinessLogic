import java.util.ArrayList;
public class CafeUtil {
	public int  getStreakGoal(){
		int sum = 0;
		for (int i=0; i < 10; i++){
			sum += i;
		}
		return sum;
	};
	public double getOrderTotal(double[] prices){
		double sum  = 0;
		for (double lineItems : prices ){
			sum += lineItems;
		}
		return sum;
	};
	public void displayMenu(ArrayList<String> menuItems) {
		for (int i = 0; i < menuItems.size(); i++) {
			String menuItem = menuItems.get(i); // Change variable name here
			System.out.println(i + " " + menuItem);
    }
}
	public void addCustomer(ArrayList<String> customers){
		System.out.println("Please enter your name:");
		String username = System.console().readLine();
		System.out.println("Hello, " + username + "!");
		int numOfPeople = customers.size();
		System.out.println("There are " + numOfPeople + " people in front of you");
        customers.add(username);
        System.out.println(customers);
	};
}