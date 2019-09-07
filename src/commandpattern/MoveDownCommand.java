package commandpattern;

public class MoveDownCommand implements Command {
	Move move;
	
	public MoveDownCommand(Move move) {
		this.move = move;
	}
	
	public void execute() {
		move.down();
	}
}
