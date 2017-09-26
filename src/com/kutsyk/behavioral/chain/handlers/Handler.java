package com.kutsyk.behavioral.chain.handlers;

import com.kutsyk.behavioral.chain.Request;

public abstract class Handler {

    protected Handler successor;

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    public abstract void handleRequest(Request request);

}
