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

class TranscriptionWord(object):
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
        'word': 'str',
        'start': 'float',
        'end': 'float'
    }

    attribute_map = {
        'word': 'word',
        'start': 'start',
        'end': 'end'
    }

    def __init__(self, word=None, start=None, end=None):  # noqa: E501
        """TranscriptionWord - a model defined in Swagger"""  # noqa: E501
        self._word = None
        self._start = None
        self._end = None
        self.discriminator = None
        self.word = word
        self.start = start
        self.end = end

    @property
    def word(self):
        """Gets the word of this TranscriptionWord.  # noqa: E501

        The text content of the word.  # noqa: E501

        :return: The word of this TranscriptionWord.  # noqa: E501
        :rtype: str
        """
        return self._word

    @word.setter
    def word(self, word):
        """Sets the word of this TranscriptionWord.

        The text content of the word.  # noqa: E501

        :param word: The word of this TranscriptionWord.  # noqa: E501
        :type: str
        """
        if word is None:
            raise ValueError("Invalid value for `word`, must not be `None`")  # noqa: E501

        self._word = word

    @property
    def start(self):
        """Gets the start of this TranscriptionWord.  # noqa: E501

        Start time of the word in seconds.  # noqa: E501

        :return: The start of this TranscriptionWord.  # noqa: E501
        :rtype: float
        """
        return self._start

    @start.setter
    def start(self, start):
        """Sets the start of this TranscriptionWord.

        Start time of the word in seconds.  # noqa: E501

        :param start: The start of this TranscriptionWord.  # noqa: E501
        :type: float
        """
        if start is None:
            raise ValueError("Invalid value for `start`, must not be `None`")  # noqa: E501

        self._start = start

    @property
    def end(self):
        """Gets the end of this TranscriptionWord.  # noqa: E501

        End time of the word in seconds.  # noqa: E501

        :return: The end of this TranscriptionWord.  # noqa: E501
        :rtype: float
        """
        return self._end

    @end.setter
    def end(self, end):
        """Sets the end of this TranscriptionWord.

        End time of the word in seconds.  # noqa: E501

        :param end: The end of this TranscriptionWord.  # noqa: E501
        :type: float
        """
        if end is None:
            raise ValueError("Invalid value for `end`, must not be `None`")  # noqa: E501

        self._end = end

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
        if issubclass(TranscriptionWord, dict):
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
        if not isinstance(other, TranscriptionWord):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
