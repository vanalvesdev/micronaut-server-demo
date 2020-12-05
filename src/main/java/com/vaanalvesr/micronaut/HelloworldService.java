package com.vaanalvesr.micronaut;

import javax.inject.Singleton;
import io.grpc.stub.StreamObserver;

@Singleton
public class HelloworldService extends HelloworldServiceGrpc.HelloworldServiceImplBase {

    @Override
    public void send(HelloworldRequest request, StreamObserver<HelloworldReply> responseObserver) {
        final String message = "Saying Hello to " + request.getName() + " in GRPC!!";
        HelloworldReply reply = HelloworldReply.newBuilder().setMessage(message).build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }
}