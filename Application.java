
import java.util.*;

/**
 * 
 */
public class Application {

    /**
     * Default constructor
     */

    /**
     * @param String[] args
     */
    public static void main(String[] args) {
        
    	
    	CompteCourant myAccount = new CompteCourant();
    	myAccount.setNumeroCompte("0678459702");
    	myAccount.setOwner("Arnaud");
    	myAccount.setMoney(1200);
    	myAccount.setPlafondMin(100);
    	
    	CompteCourant myAccount2 = new CompteCourant();
    	myAccount2.setNumeroCompte("0678459703");
    	myAccount2.setOwner("Antoine");
    	myAccount2.setMoney(2000);
    	myAccount2.setPlafondMin(100);
    	
    	
    	myAccount.prelevement(myAccount2);
    	
    }

}