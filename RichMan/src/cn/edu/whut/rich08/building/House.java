package cn.edu.whut.rich08.building;
import java.awt.Color;
import cn.edu.whut.rich08.role.Role;

//����
public class House extends specialBuilding
{
	private int level ;		// �ȼ��� 0���յ�  1��é��  2����  3��Ħ��¥
	private String owner;	// ���������� ������ �� �𱴱� �� Ǯ���� �� ����ǧ
	private int value ;		// �����Ƥ����Ҫ�ļ۸�
	private Color color;	// ��ɫ�������˵���ɫ
	private boolean state;	// �Ƿ��շѣ� true:�շ�  false:���շ�
	private int price;		// �����ۼƵļ�ֵ������ ���Ƥ���� + ��������
	private int toll;		// ��·�ѣ��� price ��һ��
	private int sellPrice;	// �ۼ� ��  �� price ������
	
	public House( int value )	// ��ʼ��
	{
		level = 0;
		owner ="";
		this.value = value;
		color = Color.BLACK;
		state = false;
		price = value;
		toll = price / 2;
		sellPrice = price + price;
	}
	
	// Role r �����˸ÿ��Ƥ
	public void buy( Role r )	
	{
		owner = r.getName(); 
		level = 0 ;	// �յ�
		color = r.getColor();
		price = value;
		toll  = price / 2;
		sellPrice = price + price ;
		state = true;
	}
	
	// ��������
	public void upgrade()	
	{
		level ++;
		price += value;
		toll = price / 2;
		sellPrice = price + price ;
	}
	
	// ���۷���
	public void sell() 		
	{
		owner ="";			// ������
		level = 0;			// ��Ϊ�յ�
		color = Color.black;// ��ɫ
		state = false;      // ���շ�
	}
	
	@Override
	public void showList() {
		// TODO Auto-generated method stub
		
	}
	
	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public boolean isState() {
		return state;
	}

	public void setState(boolean state) {
		this.state = state;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getToll() {
		return toll;
	}

	public void setToll(int toll) {
		this.toll = toll;
	}

	public int getSellPrice() {
		return sellPrice;
	}

	public void setSellPrice(int sellPrice) {
		this.sellPrice = sellPrice;
	}
	
}