package commandpattern;

public class MoveUpCommand implements Command {
	Move move;
	
	public MoveUpCommand(Move move) {
		this.move = move;
	}
	
	public void execute() {
		move.up();
	}
}
