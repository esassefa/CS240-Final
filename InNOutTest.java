 import java.util.Scanner;
 import java.util.Random;
 
 
public class InNOutTest {
	
	public static void main(String[] args) {
		int lostCustomerDay;
		int wasteCheese;
		int wasteBun;
		int wastePatty;
		int wasteLettuce;
		int wasteTomato;
		int wasteOnion;
		
		
		
		ArrayList<String> one = new ArrayList<String>();
		ArrayList<String> two = new ArrayList<String>();
		ArrayList<String> three = new ArrayList<String>();
		ArrayList<String> four = new ArrayList<String>();
		ArrayList<String> five = new ArrayList<String>();
		ArrayList<String> six = new ArrayList<String>();
		
		one.add("Bun");
		one.add("Patty");
		one.add("Lettuce");
		one.add("Tomato");
		one.add("Onion");
		two.add("Cheese");
		two.add("Bun");
		two.add("Patty");
		two.add("Lettuce");
		two.add("Tomato");
		two.add("Onion");
		three.add("Lettuce");
		three.add("Lettuce");
		three.add("Tomato");
		three.add("Onion");
		four.add("Bun");
		four.add("Patty");
		four.add("Lettuce");
		four.add("Tomato");
		five.add("Cheese");
		five.add("Bun");
		five.add("Patty");
		five.add("Lettuce");
		five.add("Tomato");
		six.add("Bun");
		six.add("Patty");
		six.add("Lettuce");
		six.add("Onion");
		
		
		StackLinkedArray<Integer>  Bun = new StackLinkedArray<Integer>();
		StackLinkedArray<Integer> Patty = new StackLinkedArray<Integer>();
		StackLinkedArray<Integer> Lettuce = new StackLinkedArray<Integer>();
		StackLinkedArray<Integer> Tomato = new StackLinkedArray<Integer>();
		StackLinkedArray<Integer> Onion = new StackLinkedArray<Integer>();
		StackLinkedArray<Integer> Cheese = new StackLinkedArray<Integer>();
		StackLinkedArray<Integer> temp = new StackLinkedArray<Integer>();
		
		
		
		Random rand = new Random();
		
		
		int[] shipmentSize = new int[20];
		for(int i = 0; i< shipmentSize.length; i++) {
			shipmentSize[i] = rand.nextInt(301) + 700;
			
		}
		
		int[] randomItem = new int[1000];
		
		for(int i = 0; i < randomItem.length; i++) {
			randomItem[i] = rand.nextInt(6) + 1;
		}
		
	/**	for( int i = 0; i < randomItem.length; i++ ) {
			if (randomItem[i] == 1) {
				Bun.push(1);
			} else if( randomItem[i] == 2) {
				Patty.push(2);
			} else if( randomItem[i] == 3){
				Lettuce.push(3);
			} else if( randomItem[i] == 4) {
				Tomato.push(4);
			} else if( randomItem[i] == 5) {
				Onion.push(5);
			} else if( randomItem[i] == 6) {
				Cheese.push(6);
			}
		}	*/
		
		System.out.println(" ");
		
		int[] shipmentInterval = new int[20];			// creates and array of different shipment intervals form 3 to 6
		for(int i = 0; i< shipmentInterval.length; i++) {
			shipmentInterval[i] = rand.nextInt(4) + 3;
			
		}
		
		int shipmentDay = 1201;
		int[] shipmentDays = new int[20];
		
		while (shipmentDay < 1231) {			// each item in array contains a shipment day
		for (int i = 0; i < shipmentDays.length; i++) {
			
			shipmentDays[i] = shipmentDay + shipmentInterval[i];
			shipmentDay = shipmentDays[i];

			}
		}
		
		
		//int shipmentSizeForEachItem = rand.nextInt(700);
		
		int[] customersPerHour = new int[9];
		int sum = 0;
		int lostSum = 0;
		
		for(int i = 0; i < customersPerHour.length; i++ ) {
			customersPerHour[i] = rand.nextInt(100) + 1;
			 sum += customersPerHour[i];
		}
		int customersPerDay = sum;
		int[] customersLostPerHour = new int[9];
		
	//	for( int i = 0; i < customersLostPerHour.length; i++) {
	//		customersLostPerHour[i] = customersPerHour[i] - 50;
	//		 lostSum += customersLostPerHour[i];
		}
		
		int customersLostPerDay = sum;
		
		ArrayQueue<Integer> customers = new ArrayQueue<Integer>();
	/**	for(int i = 0; i < customersPerHour.length; i++)  {
			
		for(int j = 0; j < customersPerHour[i]; j++) {
			customers.enqueue(j+1);
			//System.out.print(customers.toString() + " ");
		}
		} */
		
		
		int day = 1201;
		
		int hour = 10;
		
		while(day <= 1231) {
			for(int i = 0; i < shipmentDays.length; i++) {
				if( day == shipmentDays[i]) {
					for( int j = 0; j < randomItem.length; j++ ) {
						for(int k = 0; k < randomItem[j]; k++)
						if (randomItem[k] == 1) {
							Bun.push(1);
						} else if( randomItem[k] == 2) {
							Patty.push(2);
						} else if( randomItem[k] == 3){
							Lettuce.push(3);
						} else if( randomItem[k] == 4) {
							Tomato.push(4);
						} else if( randomItem[k] == 5) {
							Onion.push(5);
						} else if( randomItem[k] == 6) {
							Cheese.push(6);
						}
						
					}
				}
				while( hour <= 19) {
					for (int j = 0; j < customersPerHour.length; j++) {
						for(int k = 0; k < customersPerHour[j]; k++) {
							customers.enqueue(k+1);
						}
						for( int j = 0; customersLostPerHour.length; j++) {
							customersLostPerHour[j] = customersPerHour[j] - 50;
						
						}
						
					}
					
					
					hour++;
				}
			}
			
		}
		
		
		// coud'nt finish
		for(int i = 1201; i < 1203; i++ ) {
		
		System.out.println("Customers lost day :" + day + ) ;
		
		
		
		
		//System.out.println(shipmentSize);
		//System.out.print(shipmentSize);

		
		

		
		
	}

}
