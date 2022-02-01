package Practice;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleAsseert {
@Test
public void test1() {
	System.out.println("STEP-1");
	System.out.println("STEEP-2");
	AssertJUnit.assertEquals("A", "b");
	System.out.println("STEP-3");//this will not excute
	
	System.out.println("STEP-4");//this will not excute 
}
@Test
public void test2() {
	System.out.println("STEP-1");
	System.out.println("STEP-2");
	AssertJUnit.assertEquals("A", "A");
System.out.println("STEP-4");//it will excute
System.out.println("step-5");//it will excute
}

















}
