package com.kutsyk.behavioral.chain.handlers;

import com.kutsyk.behavioral.chain.Request;
import com.kutsyk.behavioral.chain.RequestType;

public class Director extends Handler {
    @Override
    public void handleRequest(Request request) {
        if (request.getRequestType() == RequestType.CONFERENCE)
            System.out.println("Directors can approve conferences");
        else
            successor.handleRequest(request);
    }
}
