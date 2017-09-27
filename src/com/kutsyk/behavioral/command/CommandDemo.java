package com.kutsyk.behavioral.command;

import java.util.ArrayList;
import java.util.List;

public class CommandDemo {

    public static void main(String[] args) {
        Light bedroomLight = new Light();
        Light kitchenLight = new Light();
        Switch lightSwitch = new Switch();

        Command toogleCommand = new ToogleCommand(bedroomLight);

        lightSwitch.storeAndExecute(toogleCommand);
        //lightSwitch.storeAndExecute(toogleCommand);
        //lightSwitch.storeAndExecute(toogleCommand);

        List<Light> lights = new ArrayList<Light>();
        lights.add(bedroomLight);
        lights.add(kitchenLight);
        Command allLightCommand = new AllLightsCommand(lights);
        lightSwitch.storeAndExecute(allLightCommand);
    }

}
