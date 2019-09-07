package commandpattern;

public class SprintRightCommand implements Command {
	Sprint sprint;
	
	public SprintRightCommand(Sprint sprint) {
		this.sprint = sprint;
	}
	
	public void execute() {
		sprint.down();
	}
}
