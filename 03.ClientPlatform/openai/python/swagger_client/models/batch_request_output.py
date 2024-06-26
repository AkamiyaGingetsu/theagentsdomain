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

class BatchRequestOutput(object):
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
        'id': 'str',
        'custom_id': 'str',
        'response': 'BatchRequestOutputResponse',
        'error': 'BatchRequestOutputError'
    }

    attribute_map = {
        'id': 'id',
        'custom_id': 'custom_id',
        'response': 'response',
        'error': 'error'
    }

    def __init__(self, id=None, custom_id=None, response=None, error=None):  # noqa: E501
        """BatchRequestOutput - a model defined in Swagger"""  # noqa: E501
        self._id = None
        self._custom_id = None
        self._response = None
        self._error = None
        self.discriminator = None
        if id is not None:
            self.id = id
        if custom_id is not None:
            self.custom_id = custom_id
        if response is not None:
            self.response = response
        if error is not None:
            self.error = error

    @property
    def id(self):
        """Gets the id of this BatchRequestOutput.  # noqa: E501


        :return: The id of this BatchRequestOutput.  # noqa: E501
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id):
        """Sets the id of this BatchRequestOutput.


        :param id: The id of this BatchRequestOutput.  # noqa: E501
        :type: str
        """

        self._id = id

    @property
    def custom_id(self):
        """Gets the custom_id of this BatchRequestOutput.  # noqa: E501

        A developer-provided per-request id that will be used to match outputs to inputs.  # noqa: E501

        :return: The custom_id of this BatchRequestOutput.  # noqa: E501
        :rtype: str
        """
        return self._custom_id

    @custom_id.setter
    def custom_id(self, custom_id):
        """Sets the custom_id of this BatchRequestOutput.

        A developer-provided per-request id that will be used to match outputs to inputs.  # noqa: E501

        :param custom_id: The custom_id of this BatchRequestOutput.  # noqa: E501
        :type: str
        """

        self._custom_id = custom_id

    @property
    def response(self):
        """Gets the response of this BatchRequestOutput.  # noqa: E501


        :return: The response of this BatchRequestOutput.  # noqa: E501
        :rtype: BatchRequestOutputResponse
        """
        return self._response

    @response.setter
    def response(self, response):
        """Sets the response of this BatchRequestOutput.


        :param response: The response of this BatchRequestOutput.  # noqa: E501
        :type: BatchRequestOutputResponse
        """

        self._response = response

    @property
    def error(self):
        """Gets the error of this BatchRequestOutput.  # noqa: E501


        :return: The error of this BatchRequestOutput.  # noqa: E501
        :rtype: BatchRequestOutputError
        """
        return self._error

    @error.setter
    def error(self, error):
        """Sets the error of this BatchRequestOutput.


        :param error: The error of this BatchRequestOutput.  # noqa: E501
        :type: BatchRequestOutputError
        """

        self._error = error

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
        if issubclass(BatchRequestOutput, dict):
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
        if not isinstance(other, BatchRequestOutput):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
