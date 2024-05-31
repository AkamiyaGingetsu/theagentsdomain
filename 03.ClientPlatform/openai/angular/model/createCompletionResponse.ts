/**
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
import { CompletionUsage } from './completionUsage';
import { CreateCompletionResponseChoices } from './createCompletionResponseChoices';

/**
 * Represents a completion response from the API. Note: both the streamed and non-streamed response objects share the same shape (unlike the chat endpoint). 
 */
export interface CreateCompletionResponse { 
    /**
     * A unique identifier for the completion.
     */
    id: string;
    /**
     * The list of completion choices the model generated for the input prompt.
     */
    choices: Array<CreateCompletionResponseChoices>;
    /**
     * The Unix timestamp (in seconds) of when the completion was created.
     */
    created: number;
    /**
     * The model used for completion.
     */
    model: string;
    /**
     * This fingerprint represents the backend configuration that the model runs with.  Can be used in conjunction with the `seed` request parameter to understand when backend changes have been made that might impact determinism. 
     */
    systemFingerprint?: string;
    /**
     * The object type, which is always \"text_completion\"
     */
    object: CreateCompletionResponse.ObjectEnum;
    usage?: CompletionUsage;
}
export namespace CreateCompletionResponse {
    export type ObjectEnum = 'text_completion';
    export const ObjectEnum = {
        TextCompletion: 'text_completion' as ObjectEnum
    };
}