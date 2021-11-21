package testNGexamples;

import org.testng.annotations.Test;

public class Tesecase2 extends Baseclass {
	
	@Test(groups= {"sanity"})
	public void Insurancetest( ) {
		System.out.println("inside insurance test");
	}

}
