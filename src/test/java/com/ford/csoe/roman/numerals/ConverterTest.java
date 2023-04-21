package com.ford.csoe.roman.numerals;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;



public class ConverterTest {

	private final Converter c = new Converter();
	
	@Test
	public void given1_shouldReturnI() {
		String expected = "I";

		assertThat(c.convert(1)).isEqualTo(expected);
	}

	@Test
	public void given2_shouldReturnII(){
		String expected = "II";
		assertThat(c.convert(2)).isEqualTo(expected);
	}

	@Test
	public void given3_shouldReturnIII(){
		String expected = "III";
		assertThat(c.convert(3)).isEqualTo(expected);
	}

	@Test
	public void given4_shouldReturnIV(){
		String expected = "IV";
		assertThat(c.convert(4)).isEqualTo(expected);
	}

	@Test
	public void given5_shouldReturnV(){
		String expected = "V";
		assertThat(c.convert(5)).isEqualTo(expected);
	}

	@Test
	public void given6_shouldReturnVI(){
		String expected = "VI";
		assertThat(c.convert(6)).isEqualTo(expected);
	}

	@Test
	public void given7_shouldReturnVII(){
		String expected = "VII";
		assertThat(c.convert(7)).isEqualTo(expected);
	}

	@Test
	public void given8_shouldReturnVIII(){
		String expected = "VIII";
		assertThat(c.convert(8)).isEqualTo(expected);
	}

	@Test
	public void given9_shouldReturnIX(){
		String expected = "IX";
		assertThat(c.convert(9)).isEqualTo(expected);
	}

	@Test
	public void given10_shouldReturnX(){
		String expected = "X";
		assertThat(c.convert(10)).isEqualTo(expected);
	}

	@Test
	public void given11_shouldReturnXI(){
		String expected = "XI";
		assertThat(c.convert(11)).isEqualTo(expected);
	}

	@Test
	public void given14_shouldReturnXIV(){
		String expected = "XIV";
		assertThat(c.convert(14)).isEqualTo(expected);
	}

	@Test
	public void given15_shouldReturnVVV(){
		String expected = "XV";
		assertThat(c.convert(15)).isEqualTo(expected);
	}

	@Test
	public void given16_shouldReturnVVV(){
		String expected = "XVI";
		assertThat(c.convert(16)).isEqualTo(expected);
	}

	@Test
	public void given19_shouldReturnXIX(){
		String expected = "XIX";
		assertThat(c.convert(19)).isEqualTo(expected);
	}

	@Test
	public void given20_shouldReturnXX(){
		String expected = "XX";
		assertThat(c.convert(20)).isEqualTo(expected);
	}

}
