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
import { MessageDeltaObjectDelta } from './messageDeltaObjectDelta';

/**
 * Represents a message delta i.e. any changed fields on a message during streaming. 
 */
export interface MessageDeltaObject { 
    /**
     * The identifier of the message, which can be referenced in API endpoints.
     */
    id: string;
    /**
     * The object type, which is always `thread.message.delta`.
     */
    object: MessageDeltaObject.ObjectEnum;
    delta: MessageDeltaObjectDelta;
}
export namespace MessageDeltaObject {
    export type ObjectEnum = 'thread.message.delta';
    export const ObjectEnum = {
        ThreadMessageDelta: 'thread.message.delta' as ObjectEnum
    };
}