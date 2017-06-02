package jpu2016.dogfight.model;

public class Mobile implements IMobile {
	
	private int speed;
	
	public Mobile(Direction direction, Position position, Dimension dimension, int speed, String image) {
		
	}
	
	public void move() {
		
	}
	
	public void placeInArea(IArea area) {
		
	}
	
	public boolean isPlayer(int player) {
		
	}
	
	private void moveUp() {
        //this.direction = Direction.UP;
    }

    private void moveRight() {
        //this.direction = Direction.RIGHT;
    }

    private void moveDown() {
        //this.direction = Direction.DOWN;
    }

    private void moveLeft() {
        //this.direction = Direction.LEFT;
    }

    public boolean hit() {
    	
    }
    
    public boolean isWeapon() {
    	
    }
    
    
    
    /* GETTERS & SETTERS */
	
    public Direction getDirection() {
        return this.direction;
    }
    
    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public Position getPosition() {
        return this.position;
    }

    public Dimension getDimension() {
        return this.dimension;
    }   
    
    public int getSpeed() {
        return this.speed;
    }
    
    public int getWidth() {
        return this.dimension.getWidth();
    }

    public int getHeight() {
        return this.dimension.getHeight();
    }

    public Color getColor() {
		return null;
    }

    public IDogfightModel getDogfightModel(){
 		return null;
    }
    
    public void setDogfightMode(DogfightModel dogfightModel) {

    }

    public Image getImage() {
    	Image output=null;
        try {
			output= ImageIO.read(new File(this.images));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        return output;
    }
 
}
