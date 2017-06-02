package jpu2016.dogfight.model;

public class Cloud extends Mobile {

	 private static int speed = 1;
	 private static int width = 300;
	 private static int height = 150;
	 private static String image = "cloud";
	 
	 public Cloud(Direction direction, Position position, Dimension dimension) {
		 super(direction, position, dimension, speed, image);
	 }
	 
}
