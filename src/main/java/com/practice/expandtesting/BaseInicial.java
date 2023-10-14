package com.practice.expandtesting;

import com.practice.expandtesting.client.health_controller.HealthClient;
import io.restassured.specification.RequestSpecification;

import static com.practice.expandtesting.spec.ServerSpecification.getRequestSpecification;

public class BaseInicial {

    protected static final RequestSpecification spec = getRequestSpecification();
    protected static HealthClient contrato = new HealthClient(spec);
}
