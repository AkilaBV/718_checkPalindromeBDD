package _checkPalindromeBDD._checkPalindromeBDD;

import org.junit.Assert;

import cucumber.api.java.en.*;

public class CheckPalindrome {
	
	String word,revword;
	@Given("^one word is \"([^\"]*)\"$")
	public void one_word_is(String arg1) throws Throwable {
	   word=arg1;
	}

	@When("^reversed given word$")
	public void reversed_given_word() throws Throwable {
		StringBuffer s=new StringBuffer(word);
		revword=s.reverse().toString();
	  
	}

	@Then("^reverse word is \"([^\"]*)\"$")
	public void reverse_word_is(String arg1) throws Throwable {
	   Assert.assertTrue(arg1.equalsIgnoreCase(revword));
	}

	@Then("^print the reverse word$")
	public void print_the_reverse_word() throws Throwable {
	  System.out.println(revword);
	}
	
	
	//to check the reverse of a number
int num,revnum;
@Given("^one number (\\d+)$")
public void one_number(int arg1) throws Throwable {
    num=arg1;
}

@When("^reversed given number$")
public void reversed_given_number() throws Throwable {
	int sum=0,r=0;
   while(num>0) {
	   r=num%10;
	   sum=sum*10+r;
	   num=num/10;
   }
   revnum=sum;
   
}

@Then("^revrse number is (\\d+)$")
public void revrse_number_is(int arg1) throws Throwable {
   Assert.assertTrue(arg1==revnum);
}

@Then("^print the reverse number$")
public void print_the_reverse_number() throws Throwable {
	System.out.println("reverse num is : " +revnum);
}


}
