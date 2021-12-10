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

public class TesFungsiHitungKolam {

	FungsiHitungKolamSoal1 hitung;
	
	@Before
	public void setUp() throws Exception {
		hitung = new FungsiHitungKolamSoal1();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	@FileParameters("src/test/resources/Skenario_FungsiKeliling.csv")
	public void testKeliling(double panjang, double lebar, double tinggi, double hasil) {
		assertEquals(hasil, hitung.kelilingKolam(panjang,lebar,tinggi), 0.0 );
	}
	
	@Test
	@FileParameters("src/test/resources/Skenario_FungsiVolume.csv")
	public void testLuasVolume(double panjang, double lebar, double tinggi, double hasil) {
		assertEquals(hasil, hitung.volumeKolam(panjang,lebar,tinggi), 0.0 );
	

}
}

