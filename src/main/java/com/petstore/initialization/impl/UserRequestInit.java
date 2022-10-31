package com.petstore.initialization.impl;

import com.petstore.implementation.RequestType;
import com.petstore.implementation.impl.UserRequestImpl;
import com.petstore.initialization.RequestInitialization;

public class UserRequestInit implements RequestInitialization {

    @Override
    public RequestType requestType() {
        return new UserRequestImpl();
    }
}
