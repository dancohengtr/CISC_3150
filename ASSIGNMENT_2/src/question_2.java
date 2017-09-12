import java.util.*;

public class question_2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int year, day_num = 0;
		boolean firstMonth = false;
		
		int[] days_in_month = new int[12];
		days_in_month[0] = 31;
		days_in_month[1] = 28;
		days_in_month[2] = 31;
		days_in_month[3] = 30;
		days_in_month[4] = 31;
		days_in_month[5] = 30;
		days_in_month[6] = 31;
		days_in_month[7] = 31;
		days_in_month[8] = 30;
		days_in_month[9] = 31;
		days_in_month[10] = 30;
		days_in_month[11] = 31;
		
		String[] months = new String[12];
		months[0] = "January";
		months[1] = "February";
		months[2] = "March";
		months[3] = "April";
		months[4] = "May";
		months[5] = "June";
		months[6] = "July";
		months[7] = "August";
		months[8] = "September";
		months[9] = "October";
		months[10] = "November";
		months[11] = "December";
		
		String[] days = new String[7];
		days[0] = "Su";
		days[1] = "Mo";
		days[2] = "Tu";
		days[3] = "We";
		days[4] = "Th";
		days[5] = "Fr";
		days[6] = "Sa";
		
		String day;
		
		
		try{
			do{
				
				System.out.println("What's the year?");
				year = sc.nextInt();
				
				//check if year that hasn't happened
				if(year > 2017){
					System.out.println("That year hasn't happened yet!");
					continue;
				}else if(year < 0){
					System.out.println("Did we even have calendars at that point? try again!");
					continue;
				}
				
				//check if leap year
				if  ((year % 4 == 0) && (year % 100 != 0)){
					days_in_month[1] = 29;
				}else if  (year % 400 == 0){
		        	days_in_month[1] = 29;
		        }else{
		        	days_in_month[1] = 28;
		        }
				
				System.out.println("What day did the first of January fall on?");
				day = sc.next();
				
				//check if day is real
				if(day.matches("monday") == true  || day.matches("tuesday") == true || day.matches("wednesday") == true || day.matches("thursday") == true || day.matches("friday") == true || day.matches("saturday") == true || day.matches("sunday") == true){
					
					//print for all months
					for (int i = 0; i < months.length; i++){
						
						System.out.printf("\t%s\n",months[i] + "  " + String.valueOf(year));
						
						//print days
						for(int j = 0; j < days.length; j++){
							
							System.out.printf("%4s",days[j]);
							
						}
						
						System.out.printf("\n");
						
						
						//print spaces according to starting day
						if(day.matches("sunday") == true){
							firstMonth = true;
							day_num = 1;
							System.out.printf("%2s", " ");
						}else if(day.matches("monday") == true){
							firstMonth = true;
							day_num = 2;
							System.out.printf("%4s", " ");
						}else if(day.matches("tuesday") == true){
							firstMonth = true;
							day_num = 3;
							System.out.printf("%8s", " ");
						}else if(day.matches("wednesday") == true){
							firstMonth = true;
							day_num = 4;
							System.out.printf("%12s", " ");
						}else if(day.matches("thursday") == true){
							firstMonth = true;
							day_num = 5;
							System.out.printf("%16s", " ");
						}else if(day.matches("friday") == true){
							firstMonth = true;
							day_num = 6;
							System.out.printf("%20s", " ");
						}else if(day.matches("saturday") == true){
							firstMonth = true;
							day_num = 7;
							System.out.printf("%24s", " ");
						}
						
						//print dates
						for(int x = 0; x < days_in_month[i] ; x++){
							
							System.out.printf("%4d", x + 1);
							
							if (((x + day_num) % 7 == 0) || (x == days_in_month[i])){
								
								System.out.printf("\n");
							
							}
							
							
						}
	
						//this is about as close as i could get to making it so the 
						//dates in the months that come after the first month fall on the correct
						//consecutive days. It works for the first 2-3 months but then 
						//something goes wrong.
						if((days_in_month[i] % 7) + day_num == 1){
							day = "sunday";
						}else if((days_in_month[i] % 7) + day_num == 2){
							day = "monday";
						}else if((days_in_month[i] % 7) + day_num == 3){
							day = "tuesday";
						}else if((days_in_month[i] % 7) + day_num == 4){
							day = "wednesday";
						}else if((days_in_month[i] % 7) + day_num == 5){
							day = "thursday";
						}else if((days_in_month[i] % 7) + day_num == 6){
							day = "friday";
						}else if((days_in_month[i] % 7) + day_num == 7){
							day = "saturday";
						} 
						
						System.out.printf("\n\n");
					
					}
					
					
					
					
					
					
					
					
					
				}else{
					System.out.println("That's not a day!");
					continue;
				}
				
				
				
				
				
			
			}while(true);
			
		}catch(Exception e){
			System.out.println("You have exited the program.");
			sc.close();
		}
		

	}

}
