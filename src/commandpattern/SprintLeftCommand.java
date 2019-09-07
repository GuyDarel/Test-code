package commandpattern;

public class SprintLeftCommand implements Command {
	Sprint sprint;
	
	public SprintLeftCommand(Sprint sprint) {
		this.sprint = sprint;
	}
	
	public void execute() {
		sprint.down();
	}
}
