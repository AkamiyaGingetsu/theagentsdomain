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

class MessageDeltaContentTextAnnotationsFilePathObject(object):
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
        'index': 'int',
        'type': 'str',
        'text': 'str',
        'file_path': 'MessageDeltaContentTextAnnotationsFilePathObjectFilePath',
        'start_index': 'int',
        'end_index': 'int'
    }

    attribute_map = {
        'index': 'index',
        'type': 'type',
        'text': 'text',
        'file_path': 'file_path',
        'start_index': 'start_index',
        'end_index': 'end_index'
    }

    def __init__(self, index=None, type=None, text=None, file_path=None, start_index=None, end_index=None):  # noqa: E501
        """MessageDeltaContentTextAnnotationsFilePathObject - a model defined in Swagger"""  # noqa: E501
        self._index = None
        self._type = None
        self._text = None
        self._file_path = None
        self._start_index = None
        self._end_index = None
        self.discriminator = None
        self.index = index
        self.type = type
        if text is not None:
            self.text = text
        if file_path is not None:
            self.file_path = file_path
        if start_index is not None:
            self.start_index = start_index
        if end_index is not None:
            self.end_index = end_index

    @property
    def index(self):
        """Gets the index of this MessageDeltaContentTextAnnotationsFilePathObject.  # noqa: E501

        The index of the annotation in the text content part.  # noqa: E501

        :return: The index of this MessageDeltaContentTextAnnotationsFilePathObject.  # noqa: E501
        :rtype: int
        """
        return self._index

    @index.setter
    def index(self, index):
        """Sets the index of this MessageDeltaContentTextAnnotationsFilePathObject.

        The index of the annotation in the text content part.  # noqa: E501

        :param index: The index of this MessageDeltaContentTextAnnotationsFilePathObject.  # noqa: E501
        :type: int
        """
        if index is None:
            raise ValueError("Invalid value for `index`, must not be `None`")  # noqa: E501

        self._index = index

    @property
    def type(self):
        """Gets the type of this MessageDeltaContentTextAnnotationsFilePathObject.  # noqa: E501

        Always `file_path`.  # noqa: E501

        :return: The type of this MessageDeltaContentTextAnnotationsFilePathObject.  # noqa: E501
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type):
        """Sets the type of this MessageDeltaContentTextAnnotationsFilePathObject.

        Always `file_path`.  # noqa: E501

        :param type: The type of this MessageDeltaContentTextAnnotationsFilePathObject.  # noqa: E501
        :type: str
        """
        if type is None:
            raise ValueError("Invalid value for `type`, must not be `None`")  # noqa: E501
        allowed_values = ["file_path"]  # noqa: E501
        if type not in allowed_values:
            raise ValueError(
                "Invalid value for `type` ({0}), must be one of {1}"  # noqa: E501
                .format(type, allowed_values)
            )

        self._type = type

    @property
    def text(self):
        """Gets the text of this MessageDeltaContentTextAnnotationsFilePathObject.  # noqa: E501

        The text in the message content that needs to be replaced.  # noqa: E501

        :return: The text of this MessageDeltaContentTextAnnotationsFilePathObject.  # noqa: E501
        :rtype: str
        """
        return self._text

    @text.setter
    def text(self, text):
        """Sets the text of this MessageDeltaContentTextAnnotationsFilePathObject.

        The text in the message content that needs to be replaced.  # noqa: E501

        :param text: The text of this MessageDeltaContentTextAnnotationsFilePathObject.  # noqa: E501
        :type: str
        """

        self._text = text

    @property
    def file_path(self):
        """Gets the file_path of this MessageDeltaContentTextAnnotationsFilePathObject.  # noqa: E501


        :return: The file_path of this MessageDeltaContentTextAnnotationsFilePathObject.  # noqa: E501
        :rtype: MessageDeltaContentTextAnnotationsFilePathObjectFilePath
        """
        return self._file_path

    @file_path.setter
    def file_path(self, file_path):
        """Sets the file_path of this MessageDeltaContentTextAnnotationsFilePathObject.


        :param file_path: The file_path of this MessageDeltaContentTextAnnotationsFilePathObject.  # noqa: E501
        :type: MessageDeltaContentTextAnnotationsFilePathObjectFilePath
        """

        self._file_path = file_path

    @property
    def start_index(self):
        """Gets the start_index of this MessageDeltaContentTextAnnotationsFilePathObject.  # noqa: E501


        :return: The start_index of this MessageDeltaContentTextAnnotationsFilePathObject.  # noqa: E501
        :rtype: int
        """
        return self._start_index

    @start_index.setter
    def start_index(self, start_index):
        """Sets the start_index of this MessageDeltaContentTextAnnotationsFilePathObject.


        :param start_index: The start_index of this MessageDeltaContentTextAnnotationsFilePathObject.  # noqa: E501
        :type: int
        """

        self._start_index = start_index

    @property
    def end_index(self):
        """Gets the end_index of this MessageDeltaContentTextAnnotationsFilePathObject.  # noqa: E501


        :return: The end_index of this MessageDeltaContentTextAnnotationsFilePathObject.  # noqa: E501
        :rtype: int
        """
        return self._end_index

    @end_index.setter
    def end_index(self, end_index):
        """Sets the end_index of this MessageDeltaContentTextAnnotationsFilePathObject.


        :param end_index: The end_index of this MessageDeltaContentTextAnnotationsFilePathObject.  # noqa: E501
        :type: int
        """

        self._end_index = end_index

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
        if issubclass(MessageDeltaContentTextAnnotationsFilePathObject, dict):
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
        if not isinstance(other, MessageDeltaContentTextAnnotationsFilePathObject):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other