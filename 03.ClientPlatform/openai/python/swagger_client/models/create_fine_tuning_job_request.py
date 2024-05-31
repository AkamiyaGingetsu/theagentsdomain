# coding: utf-8

"""
    OpenAI API

    The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.  # noqa: E501

    OpenAPI spec version: 2.0.0
    
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""

import pprint
import re  # noqa: F401

import six

class CreateFineTuningJobRequest(object):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """
    """
    Attributes:
      swagger_types (dict): The key is attribute name
                            and the value is attribute type.
      attribute_map (dict): The key is attribute name
                            and the value is json key in definition.
    """
    swagger_types = {
        'model': 'AnyOfCreateFineTuningJobRequestModel',
        'training_file': 'str',
        'hyperparameters': 'CreateFineTuningJobRequestHyperparameters',
        'suffix': 'str',
        'validation_file': 'str',
        'integrations': 'list[CreateFineTuningJobRequestIntegrations]',
        'seed': 'int'
    }

    attribute_map = {
        'model': 'model',
        'training_file': 'training_file',
        'hyperparameters': 'hyperparameters',
        'suffix': 'suffix',
        'validation_file': 'validation_file',
        'integrations': 'integrations',
        'seed': 'seed'
    }

    def __init__(self, model=None, training_file=None, hyperparameters=None, suffix=None, validation_file=None, integrations=None, seed=None):  # noqa: E501
        """CreateFineTuningJobRequest - a model defined in Swagger"""  # noqa: E501
        self._model = None
        self._training_file = None
        self._hyperparameters = None
        self._suffix = None
        self._validation_file = None
        self._integrations = None
        self._seed = None
        self.discriminator = None
        self.model = model
        self.training_file = training_file
        if hyperparameters is not None:
            self.hyperparameters = hyperparameters
        if suffix is not None:
            self.suffix = suffix
        if validation_file is not None:
            self.validation_file = validation_file
        if integrations is not None:
            self.integrations = integrations
        if seed is not None:
            self.seed = seed

    @property
    def model(self):
        """Gets the model of this CreateFineTuningJobRequest.  # noqa: E501

        The name of the model to fine-tune. You can select one of the [supported models](/docs/guides/fine-tuning/what-models-can-be-fine-tuned).   # noqa: E501

        :return: The model of this CreateFineTuningJobRequest.  # noqa: E501
        :rtype: AnyOfCreateFineTuningJobRequestModel
        """
        return self._model

    @model.setter
    def model(self, model):
        """Sets the model of this CreateFineTuningJobRequest.

        The name of the model to fine-tune. You can select one of the [supported models](/docs/guides/fine-tuning/what-models-can-be-fine-tuned).   # noqa: E501

        :param model: The model of this CreateFineTuningJobRequest.  # noqa: E501
        :type: AnyOfCreateFineTuningJobRequestModel
        """
        if model is None:
            raise ValueError("Invalid value for `model`, must not be `None`")  # noqa: E501

        self._model = model

    @property
    def training_file(self):
        """Gets the training_file of this CreateFineTuningJobRequest.  # noqa: E501

        The ID of an uploaded file that contains training data.  See [upload file](/docs/api-reference/files/create) for how to upload a file.  Your dataset must be formatted as a JSONL file. Additionally, you must upload your file with the purpose `fine-tune`.  See the [fine-tuning guide](/docs/guides/fine-tuning) for more details.   # noqa: E501

        :return: The training_file of this CreateFineTuningJobRequest.  # noqa: E501
        :rtype: str
        """
        return self._training_file

    @training_file.setter
    def training_file(self, training_file):
        """Sets the training_file of this CreateFineTuningJobRequest.

        The ID of an uploaded file that contains training data.  See [upload file](/docs/api-reference/files/create) for how to upload a file.  Your dataset must be formatted as a JSONL file. Additionally, you must upload your file with the purpose `fine-tune`.  See the [fine-tuning guide](/docs/guides/fine-tuning) for more details.   # noqa: E501

        :param training_file: The training_file of this CreateFineTuningJobRequest.  # noqa: E501
        :type: str
        """
        if training_file is None:
            raise ValueError("Invalid value for `training_file`, must not be `None`")  # noqa: E501

        self._training_file = training_file

    @property
    def hyperparameters(self):
        """Gets the hyperparameters of this CreateFineTuningJobRequest.  # noqa: E501


        :return: The hyperparameters of this CreateFineTuningJobRequest.  # noqa: E501
        :rtype: CreateFineTuningJobRequestHyperparameters
        """
        return self._hyperparameters

    @hyperparameters.setter
    def hyperparameters(self, hyperparameters):
        """Sets the hyperparameters of this CreateFineTuningJobRequest.


        :param hyperparameters: The hyperparameters of this CreateFineTuningJobRequest.  # noqa: E501
        :type: CreateFineTuningJobRequestHyperparameters
        """

        self._hyperparameters = hyperparameters

    @property
    def suffix(self):
        """Gets the suffix of this CreateFineTuningJobRequest.  # noqa: E501

        A string of up to 18 characters that will be added to your fine-tuned model name.  For example, a `suffix` of \"custom-model-name\" would produce a model name like `ft:gpt-3.5-turbo:openai:custom-model-name:7p4lURel`.   # noqa: E501

        :return: The suffix of this CreateFineTuningJobRequest.  # noqa: E501
        :rtype: str
        """
        return self._suffix

    @suffix.setter
    def suffix(self, suffix):
        """Sets the suffix of this CreateFineTuningJobRequest.

        A string of up to 18 characters that will be added to your fine-tuned model name.  For example, a `suffix` of \"custom-model-name\" would produce a model name like `ft:gpt-3.5-turbo:openai:custom-model-name:7p4lURel`.   # noqa: E501

        :param suffix: The suffix of this CreateFineTuningJobRequest.  # noqa: E501
        :type: str
        """

        self._suffix = suffix

    @property
    def validation_file(self):
        """Gets the validation_file of this CreateFineTuningJobRequest.  # noqa: E501

        The ID of an uploaded file that contains validation data.  If you provide this file, the data is used to generate validation metrics periodically during fine-tuning. These metrics can be viewed in the fine-tuning results file. The same data should not be present in both train and validation files.  Your dataset must be formatted as a JSONL file. You must upload your file with the purpose `fine-tune`.  See the [fine-tuning guide](/docs/guides/fine-tuning) for more details.   # noqa: E501

        :return: The validation_file of this CreateFineTuningJobRequest.  # noqa: E501
        :rtype: str
        """
        return self._validation_file

    @validation_file.setter
    def validation_file(self, validation_file):
        """Sets the validation_file of this CreateFineTuningJobRequest.

        The ID of an uploaded file that contains validation data.  If you provide this file, the data is used to generate validation metrics periodically during fine-tuning. These metrics can be viewed in the fine-tuning results file. The same data should not be present in both train and validation files.  Your dataset must be formatted as a JSONL file. You must upload your file with the purpose `fine-tune`.  See the [fine-tuning guide](/docs/guides/fine-tuning) for more details.   # noqa: E501

        :param validation_file: The validation_file of this CreateFineTuningJobRequest.  # noqa: E501
        :type: str
        """

        self._validation_file = validation_file

    @property
    def integrations(self):
        """Gets the integrations of this CreateFineTuningJobRequest.  # noqa: E501

        A list of integrations to enable for your fine-tuning job.  # noqa: E501

        :return: The integrations of this CreateFineTuningJobRequest.  # noqa: E501
        :rtype: list[CreateFineTuningJobRequestIntegrations]
        """
        return self._integrations

    @integrations.setter
    def integrations(self, integrations):
        """Sets the integrations of this CreateFineTuningJobRequest.

        A list of integrations to enable for your fine-tuning job.  # noqa: E501

        :param integrations: The integrations of this CreateFineTuningJobRequest.  # noqa: E501
        :type: list[CreateFineTuningJobRequestIntegrations]
        """

        self._integrations = integrations

    @property
    def seed(self):
        """Gets the seed of this CreateFineTuningJobRequest.  # noqa: E501

        The seed controls the reproducibility of the job. Passing in the same seed and job parameters should produce the same results, but may differ in rare cases. If a seed is not specified, one will be generated for you.   # noqa: E501

        :return: The seed of this CreateFineTuningJobRequest.  # noqa: E501
        :rtype: int
        """
        return self._seed

    @seed.setter
    def seed(self, seed):
        """Sets the seed of this CreateFineTuningJobRequest.

        The seed controls the reproducibility of the job. Passing in the same seed and job parameters should produce the same results, but may differ in rare cases. If a seed is not specified, one will be generated for you.   # noqa: E501

        :param seed: The seed of this CreateFineTuningJobRequest.  # noqa: E501
        :type: int
        """

        self._seed = seed

    def to_dict(self):
        """Returns the model properties as a dict"""
        result = {}

        for attr, _ in six.iteritems(self.swagger_types):
            value = getattr(self, attr)
            if isinstance(value, list):
                result[attr] = list(map(
                    lambda x: x.to_dict() if hasattr(x, "to_dict") else x,
                    value
                ))
            elif hasattr(value, "to_dict"):
                result[attr] = value.to_dict()
            elif isinstance(value, dict):
                result[attr] = dict(map(
                    lambda item: (item[0], item[1].to_dict())
                    if hasattr(item[1], "to_dict") else item,
                    value.items()
                ))
            else:
                result[attr] = value
        if issubclass(CreateFineTuningJobRequest, dict):
            for key, value in self.items():
                result[key] = value

        return result

    def to_str(self):
        """Returns the string representation of the model"""
        return pprint.pformat(self.to_dict())

    def __repr__(self):
        """For `print` and `pprint`"""
        return self.to_str()

    def __eq__(self, other):
        """Returns true if both objects are equal"""
        if not isinstance(other, CreateFineTuningJobRequest):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other