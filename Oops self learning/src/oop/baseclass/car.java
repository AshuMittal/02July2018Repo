package oop.baseclass;

public class car extends vechicle{
  int maxspeed=180;
  
  void message() {
	  
	  System.out.println("This is car class");
  				}
  
  public void display(){
	      super.message();
	      message();  //this will call current class method.
	       
	      
	  
  				}
}
