package some.sample.code;

public class ListHelper {
	
	public getArrayLength(List list) {
		int length= 0;
	
		for(int idx = 0; idx < list.length; idx++){
			length++;
		}
	
		System.out.println("length is : " + length);
	}
}