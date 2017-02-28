//Serafin Escobar
package base;

public class MyInteger
{
	private static int iValue;

	public MyInteger(int iValue) 
	{
		this.iValue = iValue;

	}

	public static int getiValue() 
	{
		return iValue;
	}

	public void setiValue(int iValue)
	{
		this.iValue = iValue;
	}

	public boolean isEven()
	{
		if (iValue % 2 == 0) 
		{
			return true;
		}
		else
		{
			return false;
		}

	}

	public boolean isOdd()
	{
		if(iValue % 2 == 1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public boolean isPrime()
	{
		for (int i = 2; i <= iValue; i++)
		{
			if (iValue % i == 0)
			{
				return false;
			}
		}
		return true;
	}

	public static boolean isEven(int val)
	{
		if(val % 2 == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public static boolean isOdd(int val)
	{
		if(val % 2 == 1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public static boolean isPrime(int val)
	{
		for (int i = 2; i <= val; i++)
		{
			if (val % i == 0)
			{
				return false;
			}
		}
		return true;
	}
	public static boolean isEven(MyInteger value)
	{
		if(getiValue() % 2 == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public static boolean isOdd(MyInteger value)
	{
		if(getiValue() % 2 == 1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public static boolean isPrime(MyInteger value)
	{
		for (int i = 2; i <= getiValue(); i++)
		{
			if (getiValue() % i == 0)
			{
				return false;
			}
		}
		return true;
	}
	public boolean equals(int val)
	{
		if (iValue == val) {
			return true;
		} else {
			return false;
		}
	}

	public boolean equals(MyInteger value)
	{
		if (iValue == getiValue()) 
		{
			return true;
		} 
		else
		{
			return false;
		}
	}
}
