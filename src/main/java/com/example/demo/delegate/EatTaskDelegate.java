package com.example.demo.delegate;

import org.camunda.bpm.engine.delegate.DelegateTask;
import org.camunda.bpm.engine.delegate.TaskListener;
import org.springframework.stereotype.Component;

@Component("eatTaskDelegate")
public class EatTaskDelegate implements TaskListener {

    @Override
    public void notify(DelegateTask delegateTask) {
        System.out.println(delegateTask.getAssignee() + " начал что-то делать");
    }
}
