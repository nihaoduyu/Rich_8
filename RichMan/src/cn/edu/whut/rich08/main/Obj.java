package cn.edu.whut.rich08.main;

import java.awt.Color;

// ����Ϸ����Ԫ�صĹ�ͬ����
public abstract class Obj {
	protected int    pos;	  //����λ�ã���������Ͻǵ�S����0��ʼ 
	protected String name;	  //��������
	protected char   letter;  //��ʾ����Ļ�ϵ���ĸ
	// letter��⣺
	// ��������A 
	// Ǯ���ˣ�Q
	// �𱴱���J
	// ����ǧ��D
	// ���ӣ� �յأ�0  һ�����ӣ�1  �������ӣ�2  �������ӣ�3
	// ��ʼ�㣺  S
	// ҽԺ��       H
	// �����ݣ�  T
	// ��Ʒ�ݣ�  G
	// ������       P
	// ħ����: M
	protected Color color ;	// ��ʾ����ɫ
	
	public Color getColor(){
		return color;
	}
	
	public void setColor( Color c ){
		this.color = c;
	}
	
	public int getPos() {
		return pos;
	}

	public void setPos(int pos) {
		this.pos = pos;
	}

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
}
