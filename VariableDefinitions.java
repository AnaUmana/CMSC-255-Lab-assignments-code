public class VariableDefinitions {
	public static void main(String[] args){
		// initial declaration of numPeople variable
		byte numPeople = 3;
		System.out.println("The numPeople variable has a value of " + numPeople);

		//initial declaration of itemPrice variable
		double itemPrice = 32.32;
		System.out.println("The itemPrice variable has a value of " + itemPrice);

		//initial declaration of roomNum variable
		int roomNum = 207;
		System.out.println("The roomNum variable has a value of " + roomNum);

		//initial declaration of dinnerPrice variable
		float dinnerPrice = 30.0F;
		System.out.println("The dinnerPrice variable has a value of " + dinnerPrice);


		
		// modified value of the numPeople variable
		numPeople = 6;
		System.out.println("The numPeople variable now has a value of " + numPeople);

		// modified value of the itemPrice variable
		itemPrice = 74.99;
		System.out.println("The itemPrice variable now has a value of " + itemPrice);

		// modified value of the roomNum variable
		roomNum = 4008;
		System.out.println("The roomNum variable now has a value of " + roomNum);

		// modified value of the dinnerPrice variable
		dinnerPrice = 60.0F;
		System.out.println("The dinnerPrice variable now has a value of " + dinnerPrice);



		// initial declaration of count constant
		final int COUNT = 42;
		System.out.println("The COUNT constant has a value of " + COUNT);

		//initial declaration of TOTAL constant
		final double TOTAL = 94.99;
		System.out.println("The TOTAL constant has a value of " + TOTAL);

		// initial declaration of TEMPERATURE_READING constant
		final float TEMPERATURE_READING = 45.0f;
		System.out.println("The TEMPERATURE_READING constant has a value of " + TEMPERATURE_READING);

		// initial declaration of LITTLE_NUM constant
		final short LITTLE_NUM = 2468;
		System.out.println("The LITTLE_NUM constant has a value of " + LITTLE_NUM);
	


		// initial declaration of count constant
		// COUNT = 80
		// this line of code will create a compilation error
		//because we already established the final int and final cannot be changed



	}
}