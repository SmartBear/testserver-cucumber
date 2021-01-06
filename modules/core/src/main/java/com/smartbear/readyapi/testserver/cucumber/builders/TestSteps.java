package com.smartbear.readyapi.testserver.cucumber.builders;

import com.smartbear.readyapi.client.model.RestTestRequestStep;
import com.smartbear.readyapi.client.model.SoapRequestTestStep;
import com.smartbear.readyapi4j.teststeps.TestStepTypes;

/**
 * Utility class with static method for building various types of TestSteps
 */

public class TestSteps {

    public static RestTestRequestStep restRequest(String method, String endpoint) {
        RestTestRequestStep testStep = new RestTestRequestStep();
        testStep.setURI(endpoint);
        testStep.setMethod(method);
        testStep.setType(TestStepTypes.REST_REQUEST.getName());
        return testStep;
    }

    public static SoapRequestTestStep soapRequest(String wsdl, String operation, String binding) {
        SoapRequestTestStep testStep = new SoapRequestTestStep();
        testStep.setWsdl(wsdl);
        testStep.setBinding(binding);
        testStep.setOperation(operation);
        testStep.setType(TestStepTypes.SOAP_REQUEST.getName());
        return testStep;
    }
}
