package com.example.demo.delegate;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

@Component("declineFoodExecDelegate")
public class DeclineFoodExecDelegate implements JavaDelegate {

    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        System.out.println("Я отказываюсь есть это вонючее"  + delegateExecution.getVariable("FOOD_TYPE"));
    }
}
