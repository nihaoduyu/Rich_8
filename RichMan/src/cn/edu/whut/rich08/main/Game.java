package cn.edu.whut.rich08.main;
import cn.edu.whut.rich08.role.Role;

public class Game {
	public static int NUM_ROLE;		//��Ϸ��ɫ��Ŀ
	private Role [] roles ;			//��Ϸ����б�
	private static Role currentRole;		//��ǰ�Ľ�ɫ
	
	static public Role getCurrentRole() {
		return currentRole;
	}

	public void setCurrentRole(Role currentRole) {
		this.currentRole = currentRole;
	}

}
