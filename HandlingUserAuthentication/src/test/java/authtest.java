import static org.junit.Assert.*;

import org.junit.Test;

import com.example.user;
import com.example.userAuthentication;

public class authtest {

	@Test
	public void authentication(){
		   userAuthentication ua=new userAuthentication();
		   String result = userAuthentication.auth("praveen01","15pk");
		   System.out.println(result);
		   assertEquals("Authentication succesful", result);
		   
	   }

}
