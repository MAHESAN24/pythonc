package busResv;

public class Bus {
	private int busNo;
	private boolean ac;
	private int capacity; // all data to get and set 
	
	Bus(int no,boolean ac,int cap){
		busNo = no;
		this.ac = ac;
		capacity = cap;
	}
	
	public int getBusNo() {
		return busNo;
	}
	
	public boolean getAc() {
		return ac;
	}
	
	public int getCapacity() { //accessor method
		return capacity;
	}
	
	public void setAc(boolean val) {
		ac = val;
	}
	
	public void setCapacity(int cap) { // mutator
		capacity = cap; 
	}
	
	public void displayBusinfo() {
		System.out.println("Bus No :- " + busNo + " Ac :- " + ac + " Total Capacity :- " + capacity);
	}
	
	
}

