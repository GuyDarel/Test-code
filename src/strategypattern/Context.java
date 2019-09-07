package strategypattern;

public class Context {
	private Strategy strategy;

	public Context(Strategy strategy){
		this.strategy = strategy;
	}

	public String [] executeStrategy(String [] str){
		return strategy.organize(str);
	}
}
