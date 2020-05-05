package LearnHooks;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks1 extends ProjectSpecificMethods{

	@Before
	public void openApplication()
	{
		openApp();
	}
	
	@After
	public void closeBrowser()
	{
		closeApp();
	}
}
