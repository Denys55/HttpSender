package com.petstore;

import com.petstore.initialization.RequestInitialization;
import com.petstore.initialization.impl.OrderRequestInit;
import com.petstore.initialization.impl.PetRequestInit;
import com.petstore.initialization.impl.UserRequestInit;
import com.petstore.service.EntityType;
import com.petstore.service.RequestService;
import com.petstore.util.RequestCommand;

public class Main {
    private boolean exit = false;
    private RequestInitialization requestInit;
    private RequestCommand command;

    void getRequestMethod() {
        EntityType entityType;
        do {
            entityType = RequestService.selectEntity();
            RequestService.getPause();
            switch (entityType) {
                case PET: {
                    requestInit = new PetRequestInit();
                    break;
                }
                case ORDER:
                    requestInit = new OrderRequestInit();

                    break;
                case USER: {
                    requestInit = new UserRequestInit();

                    break;
                }
                default:
                    System.out.println("Incorrect input, try again");
                    getRequestMethod();
                    break;
            }
            command = RequestService.selectCommand();
            switch (command) {
                case GET:
                    requestInit.requestType().getType();
                    break;
                case PUT:
                    requestInit.requestType().putType();
                    break;
                case POST:
                    requestInit.requestType().postType();
                    break;
                case DELETE:
                    requestInit.requestType().deleteType();
                    break;

                default:
                    System.out.println("Incorrect input, try again");
                    getRequestMethod();
                    break;
            }
            RequestService.getPause();
            exit = RequestService.exitOption();

        } while (!exit);
        System.out.println("App disconected!");
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.getRequestMethod();
    }
}
