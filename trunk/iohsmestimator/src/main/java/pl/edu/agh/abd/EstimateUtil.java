package pl.edu.agh.abd;

import java.util.TimerTask;

public class EstimateUtil extends TimerTask{

	private static EstimateUtil INSTANCE;
	private int value;
	
	private EstimateUtil(){
		
	}
	
	public void run() {
		System.out.println("ala123 " + value);
	}

	public void setValue(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public static synchronized EstimateUtil getInstance() {
		if(null == INSTANCE) INSTANCE = new EstimateUtil();
		return INSTANCE;
	}

}
