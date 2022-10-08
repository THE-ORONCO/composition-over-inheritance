package org.example.inheritance;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class User {
    private final static Logger logger = LoggerFactory.getLogger(User.class);


    void sendMessageTo() {
        logger.info("sending message to %s".formatted(this));
    }

    public Logger getLogger(){
        return logger;
    }
}
