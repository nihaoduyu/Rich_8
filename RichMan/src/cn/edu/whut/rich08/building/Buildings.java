package cn.edu.whut.rich08.building;

import cn.edu.whut.rich08.main.Obj;

// ���������
public abstract class Buildings extends Obj{
	
}

//��ͨ���������
abstract class  generalBuilding extends Buildings{	
	
}

//���⽨�������
abstract class  specialBuilding extends Buildings{	
	public abstract void showList();	// ��ʾ ħ��/����/��Ʒ �б�
}

