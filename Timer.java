
public class Timer {
	
	private int hour;
	private int minute;
	private int second;
	
	
	public Timer() {
		hour=0;
		minute=0;
		second=0;
				
	}
	public Timer(int hour, int minute, int second) {
		
		this.hour=hour;
		this.minute=minute;
		this.second=second;
		
		
	}
	public void setHour(int hour) {
		if(hour<0) {
			this.hour=0;
		}else
			this.hour=hour;
		
	}
	public void setMinute(int minute) {
		if(minute<0) {
			this.minute=0;
		}else
			this.minute=minute;
		
	}
	public void setSecond(int second) {
		if(second<0) {
			this.second=0;
		}else
			this.second=second;
		
	}
	public int getHour() {
		return hour;
		
	}
	public int getMinute() {
		return minute;
		
	}
	public int getSecond() {
		return second;
		
	}
	
	}
