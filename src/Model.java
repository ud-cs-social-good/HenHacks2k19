
public class Model {
	
	public Model() {
		int score = 0;
		int money = 50;
		int environmentStatus = 3;
		
		int fish = 3;
		int erosion = 5;
		int trash = 0;
		
		int moneyDelta = 10;
		int trashDelta =  1;
		int fishDelta = 0;
		int erosionDelta = 0;
		
	}
	
	public void update ()
	{
		money = money + moneyDelta;
		trash = trash + trashDelta;
		fish = fish + fishDelta;
		erosion = erosion + erosionDelta;
		
	}
	
	public void removeTrash
	{
		trash--;
		money = money - 2;
	}
	
	public void hireGroundsKeeper 
	{
		trashDelta = trashDelta - 1;
		money = money - 20;
	}
	
}
