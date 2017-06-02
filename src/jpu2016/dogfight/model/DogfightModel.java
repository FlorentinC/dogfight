package jpu2016.dogfight.model;

import java.util.ArrayList;
import java.util.Observable;

public class DogfightModel extends Observable {
	
	public DogfightModel() {
		
	}

	public IArea getArea() {
		return new IArea;
		
	}
	
	public void buildArea(Dimension dimension) {
	        
	}
	
	public void addMobile(Mobile mobile) {
		
	}
	
	 public void removeMobile(Mobile mobile) {
		 
	 }
	 
	 public ArrayList<IMobile> getMobile() {
		 return new ArrayList<IMobile>;
	 }
	 
	 public IMobile getMobileByPlayer(int player) {
		return null;
		 
	 }
	 
	 public void setMobilesHavesMoved() {
		 
	 }
	 
}
