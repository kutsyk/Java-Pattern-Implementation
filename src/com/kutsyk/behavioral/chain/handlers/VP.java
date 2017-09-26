package com.kutsyk.behavioral.chain.handlers;

import com.kutsyk.behavioral.chain.Request;
import com.kutsyk.behavioral.chain.RequestType;

public class VP extends Handler {
    @Override
    public void handleRequest(Request request) {
        if (request.getRequestType() == RequestType.PURCHASE)
            if (request.getAmount() < 1500)
                System.out.println("VPs can approve purchases below 1500");
            else
                successor.handleRequest(request);
    }
}
