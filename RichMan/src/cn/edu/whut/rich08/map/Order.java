package cn.edu.whut.rich08.map;

import cn.edu.whut.rich08.role.Role;

public class Order {
	
	//��ɫ��
	public void Roll(Role r){
		r.move();
	}
	
	//ʹ���ϰ���
	public void Block(Role r,int n){
		if(n<-10||n>10){
			System.out.println("���������Ч��");  //�ı����������
		}
		else{
			
		}
	}
	
	//ʹ��ը��
	public void Bomb(int n){
		
	}
	
	//ʹ�û�������
	public void Robot(){
		
	}

	//��ѯ�ʲ�
	public void Query(){

	}

	//�˳�
	public void Quit(){

	}

	//��ѯ����
	public void Help(){

	}


}
