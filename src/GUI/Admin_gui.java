package GUI;

import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class Admin_gui extends JTabbedPane {

	/**
	 * Create the panel.
	 */
	public Admin_gui(Start s) {
		
		JPanel panel = new JPanel();
		addTab("���� �������", null, new New_User(), null);
		
		JPanel panel_1 = new JPanel();
		addTab("�����������/�������� ������", null, new Reset_User(), null);

	}

}
