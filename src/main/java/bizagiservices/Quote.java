package bizagiservices;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class Quote {
	
	@WebMethod
    public String updateCustomer(String customerName) {
        return "Updated";
    }

}
