package commandpattern;

public class MoveStopCommand implements Command {
	Move move;
	
	public MoveStopCommand(Move move) {
		this.move = move;
	}
	
	public void execute() {
		move.stop();
	}
}
