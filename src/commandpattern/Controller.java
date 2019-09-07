package commandpattern;

public class Controller {
	//slot holds command type used
	Command slot;
	
	public Controller() {}

	// set the command for controller to execute
    public void setCommand(Command command) 
    { 
        slot = command; 
    }
    
    public void buttonWasPressed() 
    {
        slot.execute(); 
    }
}
