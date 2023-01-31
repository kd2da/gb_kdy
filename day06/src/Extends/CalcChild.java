package Extends;

public class CalcChild extends CalcParent {

	public int times( int x, int y ) {
		return x * y;
	}
	
	public int divide( int x, int y ) {
		int result = 0;
		if( y != 0 ) {
			return x / y;
		}
		return result;
	}
}
