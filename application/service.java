package application;

import java.util.*;

public class service {
	List<user> list = new ArrayList<>();
	List<driver> driver = new ArrayList<>();
	Scanner in = new Scanner(System.in);

	public user adduser(String name, int age, char gen) {
		user u = new user(name, age, gen);
		list.add(u);
		return u;
	}

	public driver addDriver(String name, String car, int x, int y) {
		driver d = new driver(name, car, x, y);
		driver.add(d);
		return d;
	}

	public void findRide(String name, int source[], int des[]) {
		List<driver> newDriver = new ArrayList<>();

		for(user u:list)
		{
			if(name.equals(u.getName()))
			{
				u.updateLoaction(source[0],source[1]);
				break;
			}
		}
		
		
		for (driver d : driver) {
			if (getDistance(source, d.getCordinate()) <= 5 && !d.getStatus()) {
				newDriver.add(d);
			}

		}
        
		if(newDriver.size()==0)
		{
			System.out.println("No Ride Available");
			return;
		}
		int count=1;
		Iterator itr = newDriver.iterator();
		
		System.out.println("Driver's Details\n-----------------------");
		while(itr.hasNext())
		{
			System.out.println("--------------------------------------------");
			System.out.println(count+". "+ itr.next());
			System.out.println("--------------------------------------------");
			count+=1;
		}
		
		System.out.println(" enter name of Driver you want to choose\n");
		String DriverName =in.next();
		
		chooseRide(name,DriverName,des);
		bill(name,DriverName,des);
		
		

	}

	public void chooseRide(String name, String Dname, int des[]) {
		for (driver d : driver) {
			if (Dname.equals(d.getDname())) {
				d.setStatus(true);
				d.setCordinate(des);
				//System.out.println("Setting co ordinate = "+ des[0] +","+des[1]);
				//System.out.println(d.getCordinate());
				break;
			}
		}
	}

	public void bill(String name, String dname,int des[]) {

		user temp = null;

		for (user u : list) {
			if (name.equals(u.getName())) {
				temp = u;
				break;
			}
		}

		for (driver d : driver) {
			if (dname.equals(d.getDname())) {
				double dis = getDistance(temp.getLocation(), des);
				double price = (dis * 5);
				System.out.println("Your Bill is = " + price+"\n");
				d.total(price);
				temp.updateLoaction(des[0], des[1]);
				d.setStatus(false);
				//System.out.println(d);
				d.setCordinate(des);
				break;
			}
		}
		
		
	}

	
	public void totalEarning(String dname)
	{
		for(driver d:driver)
		{
			if(dname.equals(d.getDname()))
			{
				System.out.println("Total earning of "+d.getDname()+" = "+d.earning);
				break;
			}
		}
	}
	
	public double getDistance(int source[], int des[]) {
		double ans = 0;

		ans += Math.pow(des[0] - source[0], 2);
		ans += Math.pow(des[1] - source[1], 2);

		return Math.sqrt(ans);

	}

}
