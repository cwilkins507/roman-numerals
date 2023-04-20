package com.ford.csoe.roman.numerals.integration;

import com.ford.csoe.roman.numerals.Converter;
import com.ford.csoe.roman.numerals.RomanNumeralConverter;
import com.google.common.io.Files;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.util.stream.Collectors;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RomanNumeralConverterIntegrationTest {
	private RomanNumeralConverter converter;
	
		@BeforeEach
		public void setup() {
			converter = new Converter();
		}
	
	@Test
    public void integration_test() throws Exception {
        Files.readLines(new File("src/test/resources/roman_numbers.csv"), StandardCharsets.UTF_8)
                .stream()
                .map(line -> line.split(","))
                .collect(Collectors.toMap(entry -> Integer.valueOf(entry[0]), entry -> entry[1]))
                .forEach((arabic, roman) -> assertThat(converter.convert(arabic)).as("asserting arabic %s is roman numeral %s", arabic,roman).isEqualTo(roman));

    }
}
