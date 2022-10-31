package com.petstore.initialization.impl;

import com.petstore.implementation.RequestType;
import com.petstore.implementation.impl.PetRequestImpl;
import com.petstore.initialization.RequestInitialization;

public class PetRequestInit implements RequestInitialization {
    @Override
    public RequestType requestType() {
        return new PetRequestImpl<>();
    }
}
