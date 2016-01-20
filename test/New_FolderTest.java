import static org.junit.Assert.*;

import org.junit.Test;

import GUI.New_Folder;

public class New_FolderTest {

	@Test
	public void test() {
		New_Folder nf = new New_Folder();
		assertEquals("Panelcount",28,nf.getContentPane().getComponents().length);
		
	}

}
