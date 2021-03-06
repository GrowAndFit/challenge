package com.baluwo.challenge.domain.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import com.baluwo.challenge.domain.model.Message;
import com.baluwo.challenge.domain.service.impl.ProcessMessageServiceImpl;

@RunWith(MockitoJUnitRunner.class)
public class ProcessMessageServiceTest {

    @InjectMocks
    private ProcessMessageServiceImpl messageService;

    @Test
    public void processMessage() {
        String messageTest = "TEST";
        Message message = messageService.processMessage(messageTest);
        assertNotNull(message);
        assertEquals(message.getMessage(), messageTest);
    }
}