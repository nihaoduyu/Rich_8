package cn.edu.whut.rich08.building;

import java.awt.Color;

//���
public class Mineral extends generalBuilding
{
	private int score ;	// �ṩ����ҵĵ���
	
	public Mineral(int score)
	{
		name = "���";
		letter ='$';
		color = Color.black;
		this.score=score;
	}

	public int getScore() {
		return score;
	}
	
}
