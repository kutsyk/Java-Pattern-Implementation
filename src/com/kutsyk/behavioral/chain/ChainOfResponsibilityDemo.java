package com.kutsyk.behavioral.chain;

import com.kutsyk.behavioral.chain.handlers.CEO;
import com.kutsyk.behavioral.chain.handlers.Director;
import com.kutsyk.behavioral.chain.handlers.VP;

public class ChainOfResponsibilityDemo {

    public static void main(String[] args) {
        Director bryan = new Director();
        VP crystal = new VP();
        CEO jeff = new CEO();

        bryan.setSuccessor(crystal);
        crystal.setSuccessor(jeff);

        Request request = new Request(RequestType.CONFERENCE, 500);
        bryan.handleRequest(request);

        request = new Request(RequestType.PURCHASE, 1000);
        bryan.handleRequest(request);

        request = new Request(RequestType.PURCHASE, 2000);
        bryan.handleRequest(request);
    }

}
