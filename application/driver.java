package application;

public class driver 
{
  private String dname;
  private String car;
  public int xCor,yCor;
  private boolean status;
  public double earning=0;
  
  driver(String dname,String car,int x,int y)
  {
	  this.dname=dname;
	  this.car=car;
	  this.xCor=x;
	  this.yCor=y;
	  
  }
  
  public void update(int x,int y)
  {
	  this.xCor=x;
	  this.yCor=y;
  }
  
  public void setStatus(boolean status)
  {
	  this.status=status;
  }
  
  public int[] getCordinate()
  {
	  int core[] = new int[2];
	  core[0]=xCor;
	  core[1]=yCor;
	  return  core;
  }
  
  public void setCordinate(int cor[])
  {
	  int des[] = new int[2];
	  xCor=cor[0];
		yCor=	  cor[1];
  }
  
  public boolean getStatus()
  {
	  return this.status;
  }
  
  
  
  public String getDname() {
	return dname;
}

public void setDname(String dname) {
	this.dname = dname;
}

public void total(double price)
  {
	  earning+=price;
  }
  @Override
  public String toString()
  {
	  return "name = "+dname +"\ncar = "+car+"\nCrrent position = "+ xCor+" , "+ yCor +".";
  }
  
  
}
