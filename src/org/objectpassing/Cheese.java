package org.objectpassing;

public class Cheese {
	private int levelofstickiness;
	public void setLevelofStickiness(int level)
	{
		this.levelofstickiness=level;
		
	}
	public int getLevelofStickiness()
	{
		return levelofstickiness;
	}
	private static void increaseLevelofStickiness(Cheese cse1)
	{
		cse1.setLevelofStickiness(cse1.getLevelofStickiness()+10);
	}
	public static void main(String[] args) {
		Cheese c1=new Cheese();
		c1.setLevelofStickiness(10);
		System.out.println(c1.getLevelofStickiness());
		increaseLevelofStickiness(c1);
		System.out.println(c1.levelofstickiness);
	}

}

