package package1;          //This java file is inside package named package1 inside src folder.

/*
 * This assignment helped me to understand the concepts of constructor chaining in
 * same class and in parent class by this and super keywords respectively.
 */

class baseClass        //Declaring baseClass as a parent class.
{
	String name;       //Declaring default String object name as an instance variable.
	
	public baseClass()        //Creating default constructor of baseClass.
	{
		System.out.println("Callling the parameterless default constructor of baseClass");    //printing the statement.
	}
	
	public  baseClass(String name)      //Creating one parameterized constructor of baseClass.
	{
		this();         //Calling the default constructor of baseclass.
		this.name=name;        //Assigning the value of parameter to the instance variable of class.
		System.out.println("Calling the one parameter constructor of baseClass and value of parameter is "+this.name);      //printing the statement.
	}
}        //End of baseClass


class derivedClass extends baseClass      //Declaring derivedClass as a child class by inheriting the baseClass.
{
	String name;       //Declaring default String object name as an instance variable.
	
	public derivedClass()       //Creating default constructor of derivedClass.
	{   
		this("Ashutosh");       //Calling the one parameterized constructor of derivedClass.
		System.out.println("Callling the parameterless default constructor of derivedClass");       //printing the statement.
	}
	
	public derivedClass(String name)       //Creating one parameterized constructor of derivedClass.
	{
		super("Hathidara");            //Calling the one parameterized constructor of baseClass.
		this.name=name;    //Assigning the value of parameter to the instance variable of class.
		System.out.println("Calling the one parameter constructor of derivedClass and value of parameter is "+this.name);     //printing the statement.
	}
}     //End of derivedClass.




public class Assignment3_3        //Class declaration containing main function.
{
	public static void main(String[] args)        //main function declaration. and because it is static, program execution starts from main function.
	{
		derivedClass objTemp=new derivedClass();     //Creating the new object of derivedClass.
		/*
		 * In new created object, we have not passed anything to its constructor. So, we are calling its constructor first.
		 * 
		 * Call sequence is shown as below.
		 * derivedClass() -> derivedClass(String name) -> baseClass(String name) -> baseClass()
		 * Above sequence is called constructor chaining. 
		 * 
		 * Remember that it is the sequence in which the constructors are called, not printing the contents of constructors in this sequence.
		 * Printing order You can see in the output of this code. 
		 */
	}      //End  of main function. 
}    //End of class.