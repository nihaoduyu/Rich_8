package cn.edu.whut.rich08.role;
import cn.edu.whut.rich08.building.*;
import cn.edu.whut.rich08.effect.Prop;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Random;
import cn.edu.whut.rich08.map.Map;
import cn.edu.whut.rich08.main.Obj;

//��ɫ�࣬����������������С���Ⱦ���Ľ�ɫ
public class Role extends Obj{
	private String name;	 //��ɫ����
	private char   letter;	 //��ʾ���ַ�
	private int    money;	 //��ǰӵ�еĽ��
	private int    score;	 //��ǰӵ�еĵ���
	private Color  color;	 //��ɫ����ɫ
	private ArrayList<Prop> props;		//��ɫӵ�е����е���
	private int unluckyTimes;			//��˥�����ʣ�����
	private int luckyTimes;		    	//���������ʣ�����
	private ArrayList<House> houses;	//��ɫӵ�е����з���
	private int in_hospital_cnt;	    //סԺ��ʣ������
	private int in_prison_cnt;			//��������ʣ������
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLetter() {
		return String.valueOf(letter);
	}

	public void setLetter(char letter) {
		this.letter = letter;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public int getUnluckyTimes() {
		return unluckyTimes;
	}

	public void setUnluckyTimes(int unluckyTimes) {
		this.unluckyTimes = unluckyTimes;
	}

	public int getLuckyTimes() {
		return luckyTimes;
	}

	public void setLuckyTimes(int luckyTimes) {
		this.luckyTimes = luckyTimes;
	}

	public int getIn_hospital_cnt() {
		return in_hospital_cnt;
	}

	public void setIn_hospital_cnt(int in_hospital_cnt) {
		this.in_hospital_cnt = in_hospital_cnt;
	}

	public int getIn_prison_cnt() {
		return in_prison_cnt;
	}

	public void setIn_prison_cnt(int in_prison_cnt) {
		this.in_prison_cnt = in_prison_cnt;
	}

	//��ɫ�ڲ��ࣺ����
	static class Dice
	{
		private static int score;	//���ӵĵ�ǰ����
		
		public static int getScore(){
			return score;
		}
		
		public void setScore(int score){
			this.score =score;
		}
		
		public static void cast(){
			score = new Random().nextInt(6) + 1;
		}
	}
	
	//Ͷ����ǰ��
	public void move(){
		Dice.cast();	
		int steps = Dice.getScore();	//ǰ���Ĳ���
		//�Ӿ�λ�õ��б���ɾ��
		Map.getInstance().remove(pos, this);
		//������λ��
		pos = ( pos + steps ) % Map.NUM_ELEMENTS;
		//������λ�õ��б�
		Map.getInstance().insert(pos, this);
	}

	//��ɫ��������
	public void paint() {
		System.out.print(letter);
	}
	
}
