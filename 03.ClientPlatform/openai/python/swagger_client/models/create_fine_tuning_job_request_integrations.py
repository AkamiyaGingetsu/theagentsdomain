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

class CreateFineTuningJobRequestIntegrations(object):
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
        'type': 'OneOfCreateFineTuningJobRequestIntegrationsType',
        'wandb': 'CreateFineTuningJobRequestWandb'
    }

    attribute_map = {
        'type': 'type',
        'wandb': 'wandb'
    }

    def __init__(self, type=None, wandb=None):  # noqa: E501
        """CreateFineTuningJobRequestIntegrations - a model defined in Swagger"""  # noqa: E501
        self._type = None
        self._wandb = None
        self.discriminator = None
        self.type = type
        self.wandb = wandb

    @property
    def type(self):
        """Gets the type of this CreateFineTuningJobRequestIntegrations.  # noqa: E501

        The type of integration to enable. Currently, only \"wandb\" (Weights and Biases) is supported.   # noqa: E501

        :return: The type of this CreateFineTuningJobRequestIntegrations.  # noqa: E501
        :rtype: OneOfCreateFineTuningJobRequestIntegrationsType
        """
        return self._type

    @type.setter
    def type(self, type):
        """Sets the type of this CreateFineTuningJobRequestIntegrations.

        The type of integration to enable. Currently, only \"wandb\" (Weights and Biases) is supported.   # noqa: E501

        :param type: The type of this CreateFineTuningJobRequestIntegrations.  # noqa: E501
        :type: OneOfCreateFineTuningJobRequestIntegrationsType
        """
        if type is None:
            raise ValueError("Invalid value for `type`, must not be `None`")  # noqa: E501

        self._type = type

    @property
    def wandb(self):
        """Gets the wandb of this CreateFineTuningJobRequestIntegrations.  # noqa: E501


        :return: The wandb of this CreateFineTuningJobRequestIntegrations.  # noqa: E501
        :rtype: CreateFineTuningJobRequestWandb
        """
        return self._wandb

    @wandb.setter
    def wandb(self, wandb):
        """Sets the wandb of this CreateFineTuningJobRequestIntegrations.


        :param wandb: The wandb of this CreateFineTuningJobRequestIntegrations.  # noqa: E501
        :type: CreateFineTuningJobRequestWandb
        """
        if wandb is None:
            raise ValueError("Invalid value for `wandb`, must not be `None`")  # noqa: E501

        self._wandb = wandb

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
        if issubclass(CreateFineTuningJobRequestIntegrations, dict):
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
        if not isinstance(other, CreateFineTuningJobRequestIntegrations):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other