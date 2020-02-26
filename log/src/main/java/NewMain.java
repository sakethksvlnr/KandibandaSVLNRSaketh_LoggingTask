/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Lenovo
 */
import org.apache.logging.log4j.*;
import java.util.*;
import com.mycompany.log.*;
public class NewMain {

    /**
     * @param args the command line arguments
     */
    private static final Logger LOGGER=LogManager.getLogger(NewMain.class);
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s=new Scanner(System.in);
        LOGGER.info("enter values");
        String mat=s.nextLine();
        int total=s.nextInt();
        boolean auto=s.nextBoolean();
        LOGGER.info(Pricing.calPrice(mat, total, auto));
    }
    
}
