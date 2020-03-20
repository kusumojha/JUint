package pkg1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class annotations 
{
	@Test
	public void testcase1()
	{
		System.out.println("test case1");
	}
	
	@Test
	public void testcase2()
	{
		System.out.println("test case2");
	}
	
	@Before
	public void b()
	{
		System.out.println("before annotation");
	}
	@After
	public void a()
	{
		System.out.println("After annotation");
	}
	@AfterClass
	public static void abc()
	{
		System.out.println("After class annotation");
	}
	@BeforeClass
	public static void abc1()
	{
		System.out.println("before class annotation");
	}
	@Ignore
	@Test
	public void testcase3()
	{
		System.out.println("test case3");
	}

}
