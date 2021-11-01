import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class LiquorServiceTest {
	
	List<String> brandHARYANA = null;
	List<String> brandODISHA = null;
	List<String> brandTAMILNADU = null;
	List<String> brandMAHARASHTRA = null;
	List<String> brandElse = null;

	LiquorService liquorService = null;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("[TEST] Inside setUpBeforeClass");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("[TEST] Inside tearDownAfterClass");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("[TEST] Inside SetUp");
		
		liquorService = new LiquorService();
		
		brandHARYANA = new ArrayList<String>(); 
		brandHARYANA.add("Faridabad");
		System.out.println("[TEST] In SetUp brandHARYANA" + brandHARYANA);

		brandODISHA = new ArrayList<String>(); 
		brandODISHA.add("Bhubaneswar");
		System.out.println("[TEST] In SetUp brandODISHA" + brandODISHA);
		
		brandTAMILNADU = new ArrayList<String>(); 
		brandTAMILNADU.add("Chennai");
		brandTAMILNADU.add("Mahabalipuram");
		System.out.println("[TEST] In SetUp brandTAMILNADU" + brandTAMILNADU);

		brandMAHARASHTRA = new ArrayList<String>(); 
		brandMAHARASHTRA.add("Mumbai");
		System.out.println("[TEST] In SetUp brandMAHARASHTRA" + brandMAHARASHTRA);
		
		brandElse = new ArrayList<String>(); 
		brandElse.add("No Information Available");
		System.out.println("[TEST] In SetUp brandElse" + brandElse);

	}

	@After
	public void tearDown() throws Exception {
		System.out.println("[TEST] In TearDown");
		liquorService = null;
		brandHARYANA = null;
		brandODISHA = null;
		brandTAMILNADU = null;
		brandMAHARASHTRA = null;
		brandElse = null;
		
		System.out.println("[TEST] After test HARYANA brand value " + brandHARYANA);
		System.out.println("[TEST] After test ODISHA brand value " + brandODISHA);
		System.out.println("[TEST] After test TAMILNADU brand value " + brandTAMILNADU);
		System.out.println("[TEST] After test MAHARASTRA brand value " + brandMAHARASHTRA);
		System.out.println("[TEST] After test All OTHERs brand value " + brandElse);

	}

	@Test
	public void test() {
		System.out.println("[TEST] In test HARYANA expected value " + brandHARYANA);
		System.out.println("[TEST] In test ODISHA expected value " + brandODISHA);
		System.out.println("[TEST] In test TAMILNADU expected value " + brandTAMILNADU);
		System.out.println("[TEST] In test MAHARASTRA expected value " + brandMAHARASHTRA);
		System.out.println("[TEST] In test All OTHERs brand value " + brandElse);


//	    fail("Not yet implemented");
		System.out.println("[TEST] test started");

        assertEquals(brandHARYANA , liquorService.getAvailableBrands(LiquorType.HARYANA)); 
        assertEquals(brandODISHA , liquorService.getAvailableBrands(LiquorType.ODISHA)); 
        assertEquals(brandTAMILNADU , liquorService.getAvailableBrands(LiquorType.TAMILNADU)); 
        assertEquals(brandMAHARASHTRA , liquorService.getAvailableBrands(LiquorType.MAHARASHTRA)); 
        assertEquals(brandElse , liquorService.getAvailableBrands(LiquorType.KARNATAKA)); 
   
        System.out.println("[TEST] test completed");
	}

}
