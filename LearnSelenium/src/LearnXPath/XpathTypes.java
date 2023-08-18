package LearnXPath;

public class XpathTypes {
	
	//1. Locating Elements with Known Attributes
	//*[@name='username']
	
	//2. Locating Elements with Known Element and Attributes
	//input[@name='password']
	
	//3. Locating Elements with Known Visible text
	//a[text()='OrangeHRM, Inc']
	
	//4. Locating Elements with part of the visible text is known
	//a[contains(text(),'Orange')]
	
	//5. Locating Elements with multiple attributes
	//*[@name='username'] [@placeholder='Username']
	
	//6. Locating Elements when starting visible text is known
	//a[starts-with(text(), 'Orange')]
	
	//7. Locating Elements with Dynamic Attribute values
	//a[contains(@href,'http://www.orangehrm.com')]
	//a[starts-with(@href,'http://www.orangehrm')]
	
	
	//8. Locating a parent element
	//*[@name='username']//parent::div
	
	//9. Locating a child element
	//*[@class='oxd-input-group oxd-input-field-bottom-space']//child::i
	
	//10. Locating a ancestors of a known element
	//*[@name='username']//ancestor::form
	
	//11. Locating a following elements
	//*[@name='username']//following::*
	
	//12. Locating a preceding elements
	//*[@name='username']//preceding::*

	//13. Locating a following sibling elements
	//*[@class='oxd-input-group oxd-input-field-bottom-space']//following-sibling::*
	
	//14. Locating a preceding sibling elements
	//*[@class='orangehrm-login-footer-sm']//preceding-sibling::*
	
	
	
	
	
	
	
	
	
}
