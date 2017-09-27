package com.kutsyk.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class Mediator {

    private List<Light> lights = new ArrayList<>();

    public void registerLight(Light light) {
        lights.add(light);
    }

    public void turnOnAllLights() {
        lights.forEach( light -> {
            if (!light.isOn())
                light.toogle();
        });
    }

    public void turnOffAllLights() {
        lights.forEach( light -> {
            if (light.isOn())
                light.toogle();
        });
    }

}
