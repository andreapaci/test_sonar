package logic;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Hello {
	private final static Logger logger = Logger.getLogger(Hello.class.getName());
	
	public static void main(String[] args) {
		//System.out.println("Ciaone\n");
		//Faccio il print
		//Sostituisco "System.out..." con un logger ed evito una Violation
		logger.log(Level.INFO, "Log stampato\n");
		logger.log(Level.WARNING, "Log di warning\n");
	}

}
