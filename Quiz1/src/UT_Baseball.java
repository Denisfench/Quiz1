import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UT_Baseball {

	@Test
	void BaseballTest() {
		
		int Hits = 192;
		int AB = 540;
		int BB = 137;
		int R = 158;
		int doubles = 29;
		int triples = 8;
		int HR = 60;
		int HBP = 0;
		int SF = 0;
		
		
		Baseball B = new Baseball(null, Hits, AB, BB, R, doubles, triples, HR, HBP, SF);
		
		assertEquals(0.772, B.SLG(), 0.01);
		
		System.out.println(B.SLG());
		
		System.out.println(B.AVG());
		
		assertEquals(0.356, B.AVG(), 0.01);
		
		System.out.println(B.BBP());
		
		assertEquals(0.486, B.BBP(), 0.01);
		
		System.out.println(B.OBS());
		
		assertEquals(1.258, B.OBS(), 0.01);
		
		System.out.println(B.TB());
		
		assertEquals(417, B.TB(), 0.01);
	
		
		
	}

}
