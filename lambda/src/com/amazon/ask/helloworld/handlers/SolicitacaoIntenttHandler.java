/*
     Copyright 2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
     Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file
     except in compliance with the License. A copy of the License is located at
         http://aws.amazon.com/apache2.0/
     or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS,
     WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for
     the specific language governing permissions and limitations under the License.
*/

package com.amazon.ask.helloworld.handlers;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.Optional;

import static com.amazon.ask.request.Predicates.intentName;

public class SolicitacaoIntentHandler implements RequestHandler {

    private static final Logger LOG = LoggerFactory.getLogger(MqttHandler.class);

    @Override
    public boolean canHandle(HandlerInput input) {
        LOG.info("aqui2");
        return input.matches(intentName("SolicitacaoIntent"));
    }

    @Override
    public Optional<Response> handle(HandlerInput input) {
       LOG.info("aqui1");
        String speechText = "executando";
       return input.getResponseBuilder()
                .withSpeech(speechText)
                .withSimpleCard("HelloWorld", speechText)
                .build();
    }

}
