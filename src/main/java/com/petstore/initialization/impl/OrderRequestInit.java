package com.petstore.initialization.impl;

import com.petstore.implementation.RequestType;
import com.petstore.implementation.impl.OrderRequestImpl;
import com.petstore.initialization.RequestInitialization;

public class OrderRequestInit implements RequestInitialization {

    @Override
    public RequestType requestType() {
        return new OrderRequestImpl();
    }
}
