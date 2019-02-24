
public class Main {
	public static void main(String[] args) {
		  String [] str = {"Plesiorycteropus", "was", "a", "mammal", "from", "Madagascar",
				  "that", "became", "extinct", "sometime", "after", "200", "BCE,", "as", "evidenced",
				  "by", "radiocarbon", "dating.", "Upon", "its", "description", "in", "1895", "by",
				  "French", "naturalist", "Henri", "Filhol,", "Plesiorycteropus", "was", "classified",
				  "with", "the", "aardvark,", "but", "more", "recent", "studies", "have", "found", "little", "evidence",
				  "for", "that", "linkage.", "Molecular", "evidence", "instead", "suggests", "that", "it"};
		  
		  //System.out.println("HUH");
		  
	      Context context = new Context(new Descend());		
	      context.executeStrategy(str);
	      for(String s:str) {
	    	  System.out.println(s);
	      }
	      
	      context = new Context(new Ascend());
	      context.executeStrategy(str);
	      for(String s:str) {
	    	  System.out.println(s);
	      }
	      
	      //System.out.println("HUH");
	}
}
