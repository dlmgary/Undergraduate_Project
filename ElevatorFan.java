package Undergraduate_Project;

	public class ElevatorFan {
	
	//Added fanOn
	private boolean fanOn = false;

	//Accessor 
	public boolean fanOn(){
		return fanOn;
	}
	//Mutator 
	public void setFan(boolean state){
		fanOn = state;
	}
	//Constructor
	public ElevatorFan(){
		fanOn = false;
	}
}
