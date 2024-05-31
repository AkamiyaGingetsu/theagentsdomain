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
import { RunToolCallObject } from './runToolCallObject';

/**
 * Details on the tool outputs needed for this run to continue.
 */
export interface RunObjectRequiredActionSubmitToolOutputs { 
    /**
     * A list of the relevant tool calls.
     */
    toolCalls: Array<RunToolCallObject>;
}