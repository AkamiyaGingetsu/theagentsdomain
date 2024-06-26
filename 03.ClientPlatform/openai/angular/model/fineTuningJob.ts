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
import { FineTuningIntegration } from './fineTuningIntegration';
import { FineTuningJobError } from './fineTuningJobError';
import { FineTuningJobHyperparameters } from './fineTuningJobHyperparameters';

/**
 * The `fine_tuning.job` object represents a fine-tuning job that has been created through the API. 
 */
export interface FineTuningJob { 
    /**
     * The object identifier, which can be referenced in the API endpoints.
     */
    id: string;
    /**
     * The Unix timestamp (in seconds) for when the fine-tuning job was created.
     */
    createdAt: number;
    error: FineTuningJobError;
    /**
     * The name of the fine-tuned model that is being created. The value will be null if the fine-tuning job is still running.
     */
    fineTunedModel: string;
    /**
     * The Unix timestamp (in seconds) for when the fine-tuning job was finished. The value will be null if the fine-tuning job is still running.
     */
    finishedAt: number;
    hyperparameters: FineTuningJobHyperparameters;
    /**
     * The base model that is being fine-tuned.
     */
    model: string;
    /**
     * The object type, which is always \"fine_tuning.job\".
     */
    object: FineTuningJob.ObjectEnum;
    /**
     * The organization that owns the fine-tuning job.
     */
    organizationId: string;
    /**
     * The compiled results file ID(s) for the fine-tuning job. You can retrieve the results with the [Files API](/docs/api-reference/files/retrieve-contents).
     */
    resultFiles: Array<string>;
    /**
     * The current status of the fine-tuning job, which can be either `validating_files`, `queued`, `running`, `succeeded`, `failed`, or `cancelled`.
     */
    status: FineTuningJob.StatusEnum;
    /**
     * The total number of billable tokens processed by this fine-tuning job. The value will be null if the fine-tuning job is still running.
     */
    trainedTokens: number;
    /**
     * The file ID used for training. You can retrieve the training data with the [Files API](/docs/api-reference/files/retrieve-contents).
     */
    trainingFile: string;
    /**
     * The file ID used for validation. You can retrieve the validation results with the [Files API](/docs/api-reference/files/retrieve-contents).
     */
    validationFile: string;
    /**
     * A list of integrations to enable for this fine-tuning job.
     */
    integrations?: Array<FineTuningIntegration>;
    /**
     * The seed used for the fine-tuning job.
     */
    seed: number;
    /**
     * The Unix timestamp (in seconds) for when the fine-tuning job is estimated to finish. The value will be null if the fine-tuning job is not running.
     */
    estimatedFinish?: number;
}
export namespace FineTuningJob {
    export type ObjectEnum = 'fine_tuning.job';
    export const ObjectEnum = {
        FineTuningJob: 'fine_tuning.job' as ObjectEnum
    };
    export type StatusEnum = 'validating_files' | 'queued' | 'running' | 'succeeded' | 'failed' | 'cancelled';
    export const StatusEnum = {
        ValidatingFiles: 'validating_files' as StatusEnum,
        Queued: 'queued' as StatusEnum,
        Running: 'running' as StatusEnum,
        Succeeded: 'succeeded' as StatusEnum,
        Failed: 'failed' as StatusEnum,
        Cancelled: 'cancelled' as StatusEnum
    };
}