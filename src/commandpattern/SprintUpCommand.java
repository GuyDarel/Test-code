package commandpattern;

public class SprintUpCommand implements Command {
	Sprint sprint;
	
	public SprintUpCommand(Sprint sprint) {
		this.sprint = sprint;
	}
	
	public void execute() {
		sprint.down();
	}
}
