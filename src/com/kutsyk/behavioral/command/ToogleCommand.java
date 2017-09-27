package com.kutsyk.behavioral.command;

public class ToogleCommand implements Command {

    private Light light;

    public ToogleCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.toogle();
    }

}
