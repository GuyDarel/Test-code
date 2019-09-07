package commandpattern;

public class SprintDownCommand implements Command {
	Sprint sprint;
	
	public SprintDownCommand(Sprint sprint) {
		this.sprint = sprint;
	}
	
	public void execute() {
		sprint.down();
	}
}
