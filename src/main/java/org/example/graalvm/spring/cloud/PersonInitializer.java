package org.example.graalvm.spring.cloud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.binding.BindingsLifecycleController;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.context.SmartLifecycle;
import org.springframework.stereotype.Service;

import static org.springframework.cloud.stream.binding.BindingsLifecycleController.State.STARTED;
import static org.springframework.cloud.stream.binding.BindingsLifecycleController.State.STOPPED;

@Service("personInitializer")
public class PersonInitializer implements SmartLifecycle {

    @Autowired
    private BindingsLifecycleController lifecycleController;

    @Autowired
    private StreamBridge streamBridge;

    @Override
    public void start() {

//        Some Database Operation
//        lifecycleController.changeState("listenPersonData-in-0", STARTED);
    }

    @Override
    public void stop() {

    }

    @Override
    public boolean isRunning() {
        return false;
    }

    @Override
    public int getPhase() {
        return SmartLifecycle.super.getPhase();
    }
}
