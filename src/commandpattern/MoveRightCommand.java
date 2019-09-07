package commandpattern;

public class MoveRightCommand implements Command {
	Move move;
	
	public MoveRightCommand(Move move) {
		this.move = move;
	}
	
	public void execute() {
		move.right();
	}

}
