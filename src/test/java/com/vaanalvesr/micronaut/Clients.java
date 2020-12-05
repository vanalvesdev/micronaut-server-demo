package com.vaanalvesr.micronaut;

import io.grpc.ManagedChannel;
import io.micronaut.context.annotation.Bean;
import io.micronaut.context.annotation.Factory;
import io.micronaut.grpc.annotation.GrpcChannel;
import io.micronaut.grpc.server.GrpcServerChannel;

@Factory
public class Clients {

    @Bean
    HelloworldServiceGrpc.HelloworldServiceBlockingStub blockingStub(
            @GrpcChannel(GrpcServerChannel.NAME) ManagedChannel channel) {
        return HelloworldServiceGrpc.newBlockingStub(channel);
    }
}
