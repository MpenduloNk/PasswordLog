package com.wms.passwordLog;

//import org.apache.log4j.BasicConfigurator;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.message.LoggerNameAwareMessage;



import javax.security.auth.login.Configuration;
import java.util.Scanner;

public class PasswordLogs {

    static Logger logger = LogManager.getLogger(PasswordLogs.class);

    public static void main(String[] args) {


        //********************************************************************
//        BasicConfigurator.configure();
        logger.trace("Sample for trace level message");
        logger.debug("Sample for debug message");
        logger.info("Sample for info message");
        logger.warn("Sample for warn message");
        logger.fatal("Sample for fatal message");
        logger.error("Sample for error message");
    }
}
