package org.example.composition;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class User {
    private final static Logger logger = LoggerFactory.getLogger(org.example.inheritance.User.class);


    void sendMessageTo() {
        logger.info("sending message to %s".formatted(this));
    }

    public Logger getLogger(){
        return logger;
    }
}
