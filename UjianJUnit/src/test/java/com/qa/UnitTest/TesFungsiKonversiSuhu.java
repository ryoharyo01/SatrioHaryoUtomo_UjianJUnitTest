package com.qa.UnitTest;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import com.qa.UjianTestJUnit.*;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;

@RunWith(JUnitParamsRunner.class)

public class TesFungsiKonversiSuhu {

FungsiKonversiSuhuSoal2 konversi;

	@Before
	public void setUp() throws Exception {
		konversi = new FungsiKonversiSuhuSoal2();
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	@FileParameters("src/test/resources/Skenario_FungsiKonversiSuhu.csv")
	public void testKonversiSuhu(double suhu, double hasil) {
		assertEquals(hasil, konversi.derajatSuhu(suhu), 0.0 );
	}

}
