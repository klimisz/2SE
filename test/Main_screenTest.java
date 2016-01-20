

import static org.junit.Assert.*;

import javax.swing.JPanel;

import org.junit.Test;

import GUI.Main_screen;

public class Main_screenTest {

	@Test
	public void testMain_screen() {
		Main_screen ms=new Main_screen(null);
		
		JPanel jp= new JPanel();
		assertNotEquals("panel",jp.getComponents(),ms.getComponents());
		assertEquals("panelcount",38,ms.getComponents().length);
	}

}
