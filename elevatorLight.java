package Undergraduate_Project;

	public class elevatorLight {
	public boolean lightOn = true;
	//Accessor 
	public boolean lightOn(){
		return lightOn;
	}
	//Mutator 
	public void setLight(boolean value){
		lightOn = value;
	}
	//Constructor
	public elevatorLight(){
		lightOn = false;
	}
}
