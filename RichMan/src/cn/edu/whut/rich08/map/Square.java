package cn.edu.whut.rich08.map;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import cn.edu.whut.rich08.main.Game;
import cn.edu.whut.rich08.main.Obj;

//��ͼ�е�С���񣬼̳�JLabel
class Square extends JLabel
{
	private final int length =20;	// ����
	private final int width  =20;	// ���
	private ArrayList<Obj> objs ;	// ��С���������������ж���
	private final int position_x = 8; // �����ַ���λ��
	private final int position_y =15; // �����ַ���λ��
	
	public Square()
	{
		objs = new ArrayList<Obj>();
	}
	
	// �ж��Ƿ����o����
	public boolean contains( Obj o)
	{
		if( null == o 				// ����Ϊ��
			|| objs.size() == 0 )	// ����Ϊ��
			return false;
		if( objs.contains(o) == true )
			return true;
		else
			return false;
	}
	
	// �ж��Ƿ�Ϊ�ն���
	public boolean isEmpty()
	{
		return objs.isEmpty();
	}
	
	public boolean add( Obj o )	// ���һ������,true:�ɹ���false:ʧ��
	{
		if( null == o 						//����Ϊ��
			||  true == objs.contains(o) )	//�Ѿ������˶���
			return false;
		else
		{
			objs.add(o);
			return true;
		}
	}
	
	public boolean remove( Obj o )	// ɾ��һ������true:�ɹ���false:ʧ��
	{
		if( null == o						//����Ϊ��
			||  objs.isEmpty() == true 		//����Ϊ��
			||  objs.contains(o) == false )	//������ɾ������
			return false;
		else
		{
			objs.remove(o);
			return true;
		}
	}
	
	//��������
	protected void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		//���Ʊ߽�
		g.drawRect(0, 0, length , width );
		// ѡ����ƶ���
		// ���Ȼ��������ɫ���������Ȼ��Ƶ�ǰ��ɫ
		// ����Ǹ��ֵ���
		// ����ǽ�����
		Obj toPaint ;	//�����ƵĶ���
		Color color;	//��ɫ
		if( objs.size() == 1 ){
			toPaint = objs.get(0);	//������
			color = toPaint.getColor();
			g.setColor(color);
			g.drawString(toPaint.getLetter(), position_x, position_y );	//���ƽ��������ĸ
			return;		
		}
		else {
			// ��������,����Ƿ������ǰ��ɫ
			for(int i=0;i<objs.size();i++)
			{
				if( objs.get(i).getLetter() == Game.getCurrentRole().getLetter() )
				{
					toPaint = Game.getCurrentRole();
					color = toPaint.getColor();
					g.setColor(color);
					g.drawString(toPaint.getLetter(), position_x, position_y );
					return;
				}
			}
			// ��������,����Ƿ���������ɫ
			for(int i=0;i<objs.size();i++)
			{
				if( objs.get(i).getLetter() == "A"    // ������
				||  objs.get(i).getLetter() == "J"    // �𱴱�
				||  objs.get(i).getLetter() == "Q"    // Ǯ����
				||  objs.get(i).getLetter() == "D"    // �𱴱�
				  )
				{
					toPaint = objs.get(i);
					color = toPaint.getColor();
					g.setColor(color);
					g.drawString(toPaint.getLetter(), position_x, position_y );
					return;
				}
			}
			// �������У�����Ƿ��������
			for(int i=0;i<objs.size();i++)
			{
				if( objs.get(i).getLetter() == "#"    // ·�ϵ���
				||  objs.get(i).getLetter() == "@"    // ը������
				  )
				{
					toPaint = objs.get(i);
					g.drawString(toPaint.getLetter(), position_x, position_y );
					return;
				}
			}
			// �����쳣���
			Object[] options = { "OK", "CANCEL" }; 
			JOptionPane.showOptionDialog(null, "Click OK to continue", "Square Paint Error!", 
			JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, 
			null, options, options[0]); 
		}
	}
}
