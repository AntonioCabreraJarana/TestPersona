package es.iessoterhernandez.daw.endes.PersonaTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.Arguments;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;



public class PersonaTest {
	private  Persona persona;
	
	@BeforeEach
	public  void init() {
		persona = new Persona("Antonio", 26, 'H', 95.00, 1.85);
	}

	@AfterEach
	public  void finish() {
		persona = null;
	}
	
	@Test
	public void comprobarPersonaCreada() {
		assertThat(persona,notNullValue());
		
	}
	
    
    @Test
    public void testMayorEdad() {
    	assertTrue(persona.esMayorDeEdad());
    }
    @Test
    public void testMenorEdad() {
    	persona.setEdad(15);
    	assertFalse(persona.esMayorDeEdad());
    }
    
    @Test
    public void testPesoIdeal() {
    	persona.setPeso(80.00);
    	assertEquals(Persona.PESO_IDEAL,persona.calcularIMC()); 	
    	    }    
    
    @Test
    public void testSobrePeso() {
    	assertEquals(Persona.SOBREPESO,persona.calcularIMC()); 	
    	
    }    
    @Test
    public void testInfraPeso() {
    	persona.setPeso(50.00);
    	assertEquals(Persona.INFRAPESO,persona.calcularIMC()); 	
    	
    }
    
    
  
   
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    }
