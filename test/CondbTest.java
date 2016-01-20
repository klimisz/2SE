import static org.junit.Assert.*;

import org.junit.Test;

import GUI.Condb;
import junit.framework.Assert;

public class CondbTest {

	@Test
	public void test() {
		Condb db = new Condb();
		assertEquals("Result",14,db.searchByAmka("00000260285").length);
		assertEquals("Result2",4,db.validateUser("doctor1","doc").length);
		assertNotEquals("Condb", null, db.connect);	
//		assertEquals("import",null,db.importUser("nikos","papadopoulos","petros","11/12/2000","123456789","ika",new Long(123456789),new Long(987654321),"athens","patision 2",12345,1,1).e);
		assertNotEquals("search",null,db.searchByInfosAm(1));
		assertNotEquals("search2",0,db.searchExamsByVisitID(9).length);
		assertNotEquals("search3",0,db.searchMedsByVisitID(9).length);

	}
}