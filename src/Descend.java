
public class Descend implements Strategy{

	@Override
	public String [] organize(String [] str) {
		// TODO Auto-generated method stub
		//System.out.println("HUH");
		for(int i = 0; i != 50; i++) {
			for(int j = 0; j != 50; j++) {
				String key   = str[i];
				if( key.compareToIgnoreCase( str[j] ) < 0 ){
					for(int k = j; k != i-1 ;j++) {
						str[k+1] = str[k];
					}
					str[j] = key;
					break;
				}
			}
		}
		return str;
	}

}
