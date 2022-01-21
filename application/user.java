package application;

public class user {
	public String name;
	private int age;
	private char gender;
	int xCor, yCor;

	public String getName() {
		return name;
	}

	int d1, d2;

	public user(String name, int age, char gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;

	}

	public void updateLoaction(int x, int y) {
		this.xCor = x;
		this.yCor = y;
	}
	
	
	
	
	public int[] getLocation()
	{
		int arr[] = new int[2];
		arr[0]=xCor;
		arr[1]=yCor;
		return arr;
	}

}
