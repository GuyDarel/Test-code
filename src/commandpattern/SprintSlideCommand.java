package commandpattern;

public class SprintSlideCommand implements Command {
	Sprint sprint;
	
	public SprintSlideCommand(Sprint sprint) {
		this.sprint = sprint;
	}
	
	public void execute() {
		sprint.slide();
	}
}
