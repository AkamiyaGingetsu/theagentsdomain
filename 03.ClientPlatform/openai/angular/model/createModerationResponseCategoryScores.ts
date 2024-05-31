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
 * A list of the categories along with their scores as predicted by model.
 */
export interface CreateModerationResponseCategoryScores { 
    /**
     * The score for the category 'hate'.
     */
    hate: number;
    /**
     * The score for the category 'hate/threatening'.
     */
    hatethreatening: number;
    /**
     * The score for the category 'harassment'.
     */
    harassment: number;
    /**
     * The score for the category 'harassment/threatening'.
     */
    harassmentthreatening: number;
    /**
     * The score for the category 'self-harm'.
     */
    selfHarm: number;
    /**
     * The score for the category 'self-harm/intent'.
     */
    selfHarmintent: number;
    /**
     * The score for the category 'self-harm/instructions'.
     */
    selfHarminstructions: number;
    /**
     * The score for the category 'sexual'.
     */
    sexual: number;
    /**
     * The score for the category 'sexual/minors'.
     */
    sexualminors: number;
    /**
     * The score for the category 'violence'.
     */
    violence: number;
    /**
     * The score for the category 'violence/graphic'.
     */
    violencegraphic: number;
}