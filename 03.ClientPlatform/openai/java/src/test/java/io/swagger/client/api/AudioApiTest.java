/*
 * OpenAI API
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 * OpenAPI spec version: 2.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.api;

import java.math.BigDecimal;
import io.swagger.client.model.CreateSpeechRequest;
import java.io.File;
import io.swagger.client.model.InlineResponse200;
import io.swagger.client.model.InlineResponse2001;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for AudioApi
 */
@Ignore
public class AudioApiTest {

    private final AudioApi api = new AudioApi();

    /**
     * Generates audio from the input text.
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void createSpeechTest() throws Exception {
        CreateSpeechRequest body = null;
        File response = api.createSpeech(body);

        // TODO: test validations
    }
    /**
     * Transcribes audio into the input language.
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void createTranscriptionTest() throws Exception {
        File file = null;
        Object model = null;
        String language = null;
        String prompt = null;
        String responseFormat = null;
        BigDecimal temperature = null;
        List<String> timestampGranularities = null;
        InlineResponse200 response = api.createTranscription(file, model, language, prompt, responseFormat, temperature, timestampGranularities);

        // TODO: test validations
    }
    /**
     * Translates audio into English.
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void createTranslationTest() throws Exception {
        File file = null;
        Object model = null;
        String prompt = null;
        String responseFormat = null;
        BigDecimal temperature = null;
        InlineResponse2001 response = api.createTranslation(file, model, prompt, responseFormat, temperature);

        // TODO: test validations
    }
}