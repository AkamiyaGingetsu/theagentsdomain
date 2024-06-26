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

class AssistantObjectToolResources(object):
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
        'code_interpreter': 'AssistantObjectToolResourcesCodeInterpreter',
        'file_search': 'AssistantObjectToolResourcesFileSearch'
    }

    attribute_map = {
        'code_interpreter': 'code_interpreter',
        'file_search': 'file_search'
    }

    def __init__(self, code_interpreter=None, file_search=None):  # noqa: E501
        """AssistantObjectToolResources - a model defined in Swagger"""  # noqa: E501
        self._code_interpreter = None
        self._file_search = None
        self.discriminator = None
        if code_interpreter is not None:
            self.code_interpreter = code_interpreter
        if file_search is not None:
            self.file_search = file_search

    @property
    def code_interpreter(self):
        """Gets the code_interpreter of this AssistantObjectToolResources.  # noqa: E501


        :return: The code_interpreter of this AssistantObjectToolResources.  # noqa: E501
        :rtype: AssistantObjectToolResourcesCodeInterpreter
        """
        return self._code_interpreter

    @code_interpreter.setter
    def code_interpreter(self, code_interpreter):
        """Sets the code_interpreter of this AssistantObjectToolResources.


        :param code_interpreter: The code_interpreter of this AssistantObjectToolResources.  # noqa: E501
        :type: AssistantObjectToolResourcesCodeInterpreter
        """

        self._code_interpreter = code_interpreter

    @property
    def file_search(self):
        """Gets the file_search of this AssistantObjectToolResources.  # noqa: E501


        :return: The file_search of this AssistantObjectToolResources.  # noqa: E501
        :rtype: AssistantObjectToolResourcesFileSearch
        """
        return self._file_search

    @file_search.setter
    def file_search(self, file_search):
        """Sets the file_search of this AssistantObjectToolResources.


        :param file_search: The file_search of this AssistantObjectToolResources.  # noqa: E501
        :type: AssistantObjectToolResourcesFileSearch
        """

        self._file_search = file_search

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
        if issubclass(AssistantObjectToolResources, dict):
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
        if not isinstance(other, AssistantObjectToolResources):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
