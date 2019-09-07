package commandpattern;

public class MoveLeftCommand implements Command {
	Move move;
	
	public MoveLeftCommand(Move move) {
		this.move = move;
	}
	
	public void execute() {
		move.left();
	}
}
