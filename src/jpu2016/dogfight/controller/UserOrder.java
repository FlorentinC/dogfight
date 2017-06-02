package jpu2016.dogfight.controller;

public class UserOrder  implements IUserOrder
{
	private int player;
	private Order order;
	
	public int getPlayer() 
	{
		return player;
	}
	
	public Order getOrder()
	{
		return order;
	}
	public void Order (Order order)
	{
		this.order = order;
	}
	public UserOrder (int player, Order order)
	{
		
	}
	
	
}
