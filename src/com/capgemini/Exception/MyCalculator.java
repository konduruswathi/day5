package com.capgemini.Exception;

public class MyCalculator {

	public static long Power(int n, int p)throws Exception {
		long result=1;
		if(n<0||p<0)
		throw new Exception("n and p should not be negative");
		else if(n==0&&p==0)
			throw new Exception("n and p should not be zero");
		else {
			for(int i=1;i<=p;i++)
				result=result*n;
		}
		return result;
	}

	
}
