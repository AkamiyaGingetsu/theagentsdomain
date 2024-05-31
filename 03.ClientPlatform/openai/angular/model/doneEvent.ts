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
 * Occurs when a stream ends.
 */
export interface DoneEvent { 
    event: DoneEvent.EventEnum;
    data: DoneEvent.DataEnum;
}
export namespace DoneEvent {
    export type EventEnum = 'done';
    export const EventEnum = {
        Done: 'done' as EventEnum
    };
    export type DataEnum = '[DONE]';
    export const DataEnum = {
        DONE: '[DONE]' as DataEnum
    };
}