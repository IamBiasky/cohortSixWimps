public class Date{

private int month;
private int day;
private int year;

	public Date (int mnt, int dy, int yr){
	
	this.month = mnt;
	this.day = dy;
	this.year = yr;
	
	}

		public void setMonth (int mnth){
		this.month = mnth;
		}
	
		public int getMonth(){
		return month;
		}

		public void setDay (int dy){
		this.day = dy;
		}
		
		public int getDay(){
		return day;
		}

		public void setYear (int yr){
		this.year = yr;
		}

		public int getYear(){
		return year;
		}

		public void displayDate(){

		System.out.print(month);
		System.out.print("/");
		System.out.print(day);
		System.out.print("/");
		System.out.print(year);
		
		}

}
		