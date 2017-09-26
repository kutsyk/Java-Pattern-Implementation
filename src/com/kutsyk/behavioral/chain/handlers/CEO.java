package com.kutsyk.behavioral.chain.handlers;

import com.kutsyk.behavioral.chain.Request;

public class CEO extends Handler {
    @Override
    public void handleRequest(Request request) {
        System.out.println("CEOs can approve anything they want");
    }
}
