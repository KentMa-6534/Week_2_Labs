
public class Week2ConditionalsLoops {

	public static void main(String[] args) {
		//Create a variable and assign it a value of 14.
		int age = 14;
		//Print the boolean expression age >=16 to the console and note the results.
		//Prints false on the terminal since int age is 14.
		System.out.println(age >=16);
		
		//Change the value of age to 18 and run it again.
		age = 18;
		System.out.println(age >=16);
		//Prints true on the terminal since int age is 18.
		
		//Using a conditional, print "You can drive" if age is greater than or equal to 16.
		//Otherwise, print "You cannot drive".
		//Change the value of age and rerun to see the result.
		if(age>=16) {
			System.out.println("You can drive");
		}
		else {
			System.out.println("You cannot drive");
		}
		//At age = 18, the conditional prints out "You can drive"
		age = 15;
		if(age>=16) {
			System.out.println("You can drive");
		}
		else {
			System.out.println("You cannot drive");
		}
		//At age = 15, the conditional prints out "You cannot drive"
		
		//Add a new variable called hasLicense before the conditional.
		//Change the boolean expression in the conditional to additionally include the need for hasLicense to be true.
		//Try changing the values of age and hasLicense and note the different results.
		boolean hasLicense = false;
		age = 20;
		if(age>=16 && hasLicense == true) {
			System.out.println("You can drive");
		}
		else {
			System.out.println("You cannot drive");
		}
		//Setting the age = 20 and hasLicense = false will prompt "You cannot drive".
		
		//Create two new variables - costOfMilk and thirstLevel
		//Create a new conditional that prints "Milk Please" if costofMilk is less than 2.50 or if thirstLevel is greater than 6.
		//Print "No Thanks" otherwise. Change the values and note the different results.
		
		double costOfMilk = 2.25;
		int thirstLevel = 5;
		
		if(costOfMilk<=2.50 || thirstLevel>6) {
			System.out.println("Milk Please");
		}
		else {
			System.out.println("No Thanks");
		}
		/* The program prints "Milk Please" if costOfMilk is lower than 2.50 or thirstLevel is 6 or higher. If none of the two conditions 
		 * are met, "No Thanks is printed.*/
		
		//Create two variables called numberOfCookies and numberOfChildren
		//You will evenly distribute all of the cookies to the children as an adult
		//You get to keep the remaining cookies to yourself 
		//Use a conditional to print the following based on the following conditions:
		//If there are 0 cookies remaining, print "Sad Face"
		//If there are less than 2 cookies, print "Yes!"
		//If there are less than 5 cookies, print "Woohoooo!"
		//If there are 5 or more cookies, print "Jackpot!"
		int numberOfCookies=20;
		int numberOfChildren=3;
		
		if(numberOfCookies%numberOfChildren>=5) {
			System.out.println("Jackpot!");
		}
		else if(numberOfCookies%numberOfChildren>=2) {
			System.out.println("Woohoooo!");
		}
		else if(numberOfCookies%numberOfChildren>0) {
			System.out.println("Yes!");
		}
		else {
			System.out.println("Sad Face :C");
		}
		
		
		
		//Create a variable called loyaltyMemberStatus and assign the value "SILVER"
		//Create a variable called loyaltyMemberDiscount and assign the value 0.0
		//Using a switch, set the value of loyaltyMemberDiscount based on the following loyaltyMemberStatus scale:
		//"SILVER" is 0.10, "GOLD" is 0.15, and "PLATINUM" is 0.25
		String loyaltyMemberStatus = "SILVER";
		double loyaltyMemberDiscount = 0.0;
		
		switch(loyaltyMemberStatus){
		case "SILVER":
			loyaltyMemberDiscount = 0.10;
			break;
		case "GOLD":
			loyaltyMemberDiscount = 0.15;
			break;
		case "PLATINUM":
			loyaltyMemberDiscount = 0.25;
			break;

		}
		System.out.println(loyaltyMemberDiscount);
		
		//Create a variable called billTotal and assign a value
		//Create a variable called adjustedTotal and assign it the billTotal - loyaltyMemberDiscount percent of the billTotal
		//if the adjustedTotal is greater than $500 upgrade to the loyaltyMemberStatus from SILVER to GOLD or GOLD to PLATINUM
		double billTotal = 605.67;
		double adjustedTotal = billTotal - (billTotal*loyaltyMemberDiscount);
		
		System.out.println(adjustedTotal);
		
		if(adjustedTotal>500 && loyaltyMemberStatus == "SILVER") {
			loyaltyMemberStatus = "GOLD";
		}
		else if(adjustedTotal>500 && loyaltyMemberStatus == "GOLD") {
			loyaltyMemberStatus = "PLATINUM";
		}
		System.out.println(loyaltyMemberStatus);
		
		//Create two variables, username and password 
		//Create a conditional that prints "login successful" if the username is "Tommy123" and the password is "12345"
		//Otherwise, print "access denied"
		String username = "Tommy123";
		String password = "12345";
		
		if(username == "Tommy123" && password =="12345") {
			System.out.println("login successful");
		}
		else {
			System.out.println("access denied");
		}
		
		//Write a for loop that prints each number from 0 to 9
		for(int i=0;i<10;i++) {
			System.out.println(i);
		}
		//Write a for loop that prints each number from 10 to 0 backwards
		for(int j =10;j>=0;j--) {
			System.out.println(j);
		}
		//Write a for loop that prints every other number from 0 to 100
		for(int k=0;k<=100;k++) {
			if(k%2==0) {
				System.out.println(k);
			}
		}
		//Write a for loop that iterates from 0 to 100 and prints "EVEN" if the number is even and "ODD" if it's odd
		for(int l=0;l<=100;l++) {
			if(l%2!=0) {
				System.out.println(l+" is ODD");
			}
			else {
				System.out.println(l+" is EVEN");
			}
		}
		//Write a while loop that starts at 100 and iterates backwards by 1 until it reaches 0
		//Divide each number by 3 and print the remainder to the console
		
		int m = 100;
		while(m>0) {
			m--;
			System.out.println(m+" "+m%3);
		}
		
	}

}
