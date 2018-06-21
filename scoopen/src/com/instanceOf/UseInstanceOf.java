package com.instanceOf;

public class UseInstanceOf 
{
	public static void main(String[] args) {
		
		
		UseInstanceOf [] ob = new UseInstanceOf[5];
		ob[0]=new Y();
		ob[1]=new Y();
		ob[2]=new Z();
		ob[3]=new UseInstanceOf();
		
		for(UseInstanceOf item : ob)
		{
			if(item instanceof Y) {  //instanceof used to check haa object kontya class la belong karato .
						Y y = (Y)item;
		
						y.y1();
			}
			
			else if(item instanceof Z){
				Z z=(Z) item;
			z.z1();
			}
		
		
		}
		
	}
	
	
	
}
class Y extends UseInstanceOf

{
	int id;
	void y1()
	{
		System.out.println("In Y's Y1");
		System.out.println("");
	}

}

class Z extends UseInstanceOf

{

	int id;
	void y1()
	{
		System.out.println("In Z's Y1");
	}
	void z1()
	{
		System.out.println("In Z's Z1");
	}
	
}
