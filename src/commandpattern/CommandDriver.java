package commandpattern;

public class CommandDriver {
	//Goal Create Command Class which tells player which direction they run and sprint.
    public static void main(String[] args) 
    {
    	Controller controller = new Controller();
    	//effected object
    	Move move = new Move();
    	//another effected object
    	Sprint sprint = new Sprint();
    	
    	controller.setCommand(new MoveLeftCommand(move));
    	controller.buttonWasPressed();
    	
    	controller.setCommand(new SprintRightCommand(sprint));
    	controller.buttonWasPressed();
    	controller.buttonWasPressed();
    	
    	controller.setCommand(new MoveUpCommand(move));
    	controller.buttonWasPressed();
    	
    	controller.setCommand(new MoveStopCommand(move));
    	controller.buttonWasPressed();
    	
    	controller.setCommand(new MoveDownCommand(move));
    	controller.buttonWasPressed();
    	
    	controller.setCommand(new SprintSlideCommand(sprint));
    	controller.buttonWasPressed();

    }
}
