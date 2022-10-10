package apachelogger;

import java.io.FileReader;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Test {
    public static void main(String[] args) {
        Logger LOGGER = LogManager.getLogger();

        LOGGER.info("Information!");
        LOGGER.warn("Warning!");
        LOGGER.error("Error!");
        LOGGER.fatal("Fatal error!");
        
        try {
            int z = 10/1;
            System.out.println(z);
            FileReader fr = new FileReader("will.txt");
            System.out.println(fr.toString());
            fr.close();
        } catch (Exception e) {
            LOGGER.error(e.getMessage());
            LOGGER.catching(e);
            LOGGER.debug(e.getMessage());
        }

    }
}
