package conversor;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ConversorTest {

	Conversor cnv;
	
	@Before
	public void incio(){
		cnv = new Conversor();
	}


	@Test
	public void valoresEsquerdaMenores() {
		String txt= "XXD";
		int m= cnv.traduzirNumeralRomano(txt);
		
		
		assertEquals("",500,m);
	}
	
		
	@Test
	public void valoresEsquerdaMaior() {
		String txt= "CLX";
		int m= cnv.traduzirNumeralRomano(txt);
		
		
		assertEquals("",160,m);
	}
	
	@Test
	public void valoresDireitaEquerdaIguais() {
		String txt= "XLX";
		int d= cnv.traduzirNumeralRomano(txt);
		
		
		assertEquals("",50,d);
	}
	
	
	@After
	public void matar(){
		
	}

}
