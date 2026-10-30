import java.util.Scanner;

public class IT26100314Lab5Q2 { 
  
    public static void main(String[] args){
		 
	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter startdate:");
	int startD = input.nextInt();
	
	System.out.println("Enter enddate:");
	int endD = input.nextInt();
	
	if (startD < 1|| startD >31 && endD<1 || endD >31) {
		System.out.println("Days should be between 1 and 31:");
		return;
	}
	if(startD >= endD) {
		System.out.println("start date msut be less than end date:");
		return;
	}
	
	int NumOfDays = endD - startD;
	
	double ROOM_CHARGE_PER_DAY = 48000.00;
	double DISCOUNT_3_TO_4_DAYS = 0.1;
	double DISCOUNT_5_OR_MORE = 0.2;
	
	double TotalAmount;
	
	if(NumOfDays>=3 && NumOfDays<=4){
    TotalAmount = ROOM_CHARGE_PER_DAY*NumOfDays - ROOM_CHARGE_PER_DAY*NumOfDays*DISCOUNT_3_TO_4_DAYS;
	}
    else if (NumOfDays>=5) {
    TotalAmount = ROOM_CHARGE_PER_DAY*NumOfDays - ROOM_CHARGE_PER_DAY*NumOfDays*DISCOUNT_5_OR_MORE;
	}		
	
	else {
    TotalAmount = ROOM_CHARGE_PER_DAY*NumOfDays;
	}
	
	System.out.println("Room Charge: " + ROOM_CHARGE_PER_DAY);
	System.out.println("Num of Day:" + NumOfDays);
	System.out.println("Total:" + TotalAmount);
	
	}
	
	
}