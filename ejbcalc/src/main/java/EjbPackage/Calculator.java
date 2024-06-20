package EjbPackage;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class Calculator
 */
@Stateless
@LocalBean
public class Calculator implements CalculatorRemote {
    
  
    public Calculator() {
    	
    }
    public int add(int a, int b) {
    	return(a+b);
    }
    public int sub(int a, int b) {
    	return (a-b);
    }

}
