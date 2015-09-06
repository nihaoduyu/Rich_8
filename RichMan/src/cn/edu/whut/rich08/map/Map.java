package cn.edu.whut.rich08.map;
import cn.edu.whut.rich08.building.*;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

import cn.edu.whut.rich08.main.Obj;

//��Ϸ��ͼ����̬����
//�������ģʽ֮����ģʽ
public class Map extends JPanel {
	private static Map map = null;
	private static Square [] list;
	public static final int NUM_ELEMENTS = 66;		   //��ͼ��Ԫ������,������������
	public static final int NUM_ELEMENTS_ROW = 25;     //��ͼÿһ�е�Ԫ�ظ���
	public static final int NUM_ELEMENTS_COL = 10;     //��ͼÿһ�е�Ԫ�ظ���
	private final int VALUE_LOCATION_ONE = 200;		   // ��Ƥ1�ļ۸�
	private final int VALUE_LOCATION_TWO = 500;		   // ��Ƥ2�ļ۸�
	private final int VALUE_LOCATION_THREE = 300;	   // ��Ƥ3�ļ۸�
	
	//��ͼ���캯������ɵ�ͼ��ʼ������
	private   Map()
	{
		// ����Square��������
		list = new Square[ NUM_ELEMENTS ];
		for(int i=0;i<NUM_ELEMENTS;i++)
			list[i] = new Square();
		
		list[0].add( new StartPoint() );
		
		for(int i=1;i<12;i++)
		{
			list[i].add( new House(VALUE_LOCATION_ONE) );	// ��Ƥ1�ļ۸�
		}
		
		// ҽԺ
		list[12].add( new Hospital() );
		
		for(int i=13;i<24;i++)
		{
			list[i].add( new House(VALUE_LOCATION_ONE) );	// ��Ƥ1�ļ۸�
		}
		
		// ������
		list[24].add( new PropHouse() );
		
		// ��Ƥ2
		for(int i=25;i<33;i++)
		{
			list[i].add( new House(VALUE_LOCATION_TWO) );	// ��Ƥ1�ļ۸�
		}
		
		// ��Ʒ��
		list[33].add( new GiftHouse() );
		
		// ��Ƥ3
		for(int i=34;i<45;i++)
		{
			list[i].add( new House(VALUE_LOCATION_THREE) );	// ��Ƥ3�ļ۸�
		}
		
		// ����
		list[45].add( new Prison() );
		
		// ��Ƥ3
		for(int i=46;i<57;i++)
		{
			list[i].add( new House(VALUE_LOCATION_THREE) );	// ��Ƥ3�ļ۸�
		}
		
		// ħ����
		list[57].add( new MagicHouse() );
		
		// ���
		for(int i=58;i<66;i++)
		{
			list[i].add( new Mineral((i-57)*100) );
		}
		
		// ���沼��
		setLayout( new GridLayout(10,25));
		// ��1��
		for(int i=0;i<25;i++)
			add( list[i] );
		// ��2-9 ��
		for(int i=0;i<8;i++)
		{
			add( list[NUM_ELEMENTS-1-i] );
			for(int j=0;j<23;j++)
			{
				add( new JLabel() );
			}
			add( list[ 25 + i ] );
		}
		// ��10��
		for(int i=0;i<25;i++)
		{
			add( list[57-i]);
		}
	}
	
	//��ȡʵ��
	public static Map getInstance(){
		if( null == map )
			map = new Map();
		return map;
	}
	
	//�ڵ�ͼָ��λ�ò���һ��Obj����
	public static void insert(int pos , Obj o)
	{
		//����������
		if( pos < 0 || pos >= NUM_ELEMENTS || null == o ){
			System.out.println("Insert ��������! Position:"+pos);
			System.exit(0);
		}
		//�ж϶���o�Ƿ��Ѿ�����
		if( true == list[pos].contains(o) )
			return;
		else
			list[pos].add(o);
	}
	
	//�ڵ�ͼָ��λ��ɾ��һ��Obj����
	public static void remove(int pos , Obj o )
	{
		//����������
		if( pos < 0 || pos >= NUM_ELEMENTS || null == o ){
			System.out.println("Insert ��������! Position:"+pos);
			System.exit(0);
		}
		//�ж϶����Ƿ�Ϊ�� 
		if( list[pos].isEmpty() ){
			System.out.println("Position "+pos+" of map is empty!");
			return;
		}
		//�ж϶����Ƿ������Ԫ��
		if( false == list[pos].contains(o) ){
			System.out.println("Position "+pos+" does not contain the obj!");
		}
		if( list[pos].remove(o) == false )	// ɾ��ʧ��
		{
			System.out.println("ɾ��ʧ��! pos:" + pos );
		}
	}
}