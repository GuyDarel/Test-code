package strategypattern;
import java.util.*;

public class Ascend implements Strategy{

	@Override
	public String []  organize(String [] str) {
		ArrayList<String> string = new ArrayList<String>(Arrays.asList(str));//convert array to arraylist
		int len = string.size();
		for(int i = 0; i != len; i++) {
			for(int j = i; j != len; j++) {
				String key = (String)string.get(i);
				if( key.compareToIgnoreCase( (String)string.get(j) ) > 0 ){//compare ival to jval an swap if necessary
					Collections.swap(string,i,j);//swap istring with jstring
				}
			}
		}
		str = string.toArray(str);
		return str;	
	}
}