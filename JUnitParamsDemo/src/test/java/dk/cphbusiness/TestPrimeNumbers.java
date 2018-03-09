package dk.cphbusiness;

import org.junit.Test;
import static org.junit.Assert.*;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper; //Only needed if header in file
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class) 
public class TestPrimeNumbers {

    PrimeNumberChecker primeNumberChecker = new PrimeNumberChecker();

    //with header
    @Test
    @FileParameters(value = "src/test/resources/primes.csv", 
            mapper = CsvWithHeaderMapper.class)
    public void testWithCSV(int num, String exp) {
        Boolean expect = Boolean.valueOf(exp);
        assertEquals(expect, primeNumberChecker.validate(num));
    }
    
    //csv without header
     /*@Test
    @FileParameters("src/test/resources/primes.csv")
    public void testWithCSVWithoutHeader(int num, String exp) {
        Boolean expect = Boolean.valueOf(exp);
        assertEquals(expect, primeNumberChecker.validate(num));
    }*/

}
