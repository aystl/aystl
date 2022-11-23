package org.apache.commons.lang3;

//import static org.junit.Assert.assertEquals;

public class mytest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(NumberUtils.toInt("123")!=123)
			System.err.println("toInt error!");
		if(NumberUtils.toInt("zbc",123)!=123)
			System.err.println("toInt error!");
		if(NumberUtils.min(10,20,30,50)!=10)
			System.err.println("min error!");
		if(NumberUtils.min(10,20,30,5)!=5)
			System.err.println("min error!");
		if(NumberUtils.max(10,20,30,5)!=30)
			System.err.println("max error!");
		if(NumberUtils.max(10,20,30,50)!=50)
			System.err.println("max error!");
	}

}
