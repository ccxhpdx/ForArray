public class ForArray{
	
	public static void main(String[]args){
	int[]array = new int[(int)(Math.random() * 10 )	+ 1];
	for( int i = 0; i<array.lenth; i++)
		array[i] = (int)(Math.random() * 100);
	for( int value: array )
		system.out.println(value);
	
		}
	}