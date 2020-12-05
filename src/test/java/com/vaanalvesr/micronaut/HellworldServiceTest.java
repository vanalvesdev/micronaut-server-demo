package com.vaanalvesr.micronaut;

import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;

import static org.junit.jupiter.api.Assertions.assertEquals;

@MicronautTest
public class HellworldServiceTest {

    @Inject
    HelloworldServiceGrpc.HelloworldServiceBlockingStub blockingStub;

    @Test
    void HelloWord() {
        final HelloworldRequest request = HelloworldRequest.newBuilder().setName("Vaan").build();

        assertEquals("Saying Hello to Vaan in GRPC!!", blockingStub.send(request).getMessage());
    }
}
