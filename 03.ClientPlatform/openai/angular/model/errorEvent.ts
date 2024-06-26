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

/**
 * Occurs when an [error](/docs/guides/error-codes/api-errors) occurs. This can happen due to an internal server error or a timeout.
 */
export interface ErrorEvent { 
    event: ErrorEvent.EventEnum;
    data: Error;
}
export namespace ErrorEvent {
    export type EventEnum = 'error';
    export const EventEnum = {
        Error: 'error' as EventEnum
    };
}