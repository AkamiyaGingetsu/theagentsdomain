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

class RunStepDeltaObject(object):
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
        'object': 'str',
        'delta': 'RunStepDeltaObjectDelta'
    }

    attribute_map = {
        'id': 'id',
        'object': 'object',
        'delta': 'delta'
    }

    def __init__(self, id=None, object=None, delta=None):  # noqa: E501
        """RunStepDeltaObject - a model defined in Swagger"""  # noqa: E501
        self._id = None
        self._object = None
        self._delta = None
        self.discriminator = None
        self.id = id
        self.object = object
        self.delta = delta

    @property
    def id(self):
        """Gets the id of this RunStepDeltaObject.  # noqa: E501

        The identifier of the run step, which can be referenced in API endpoints.  # noqa: E501

        :return: The id of this RunStepDeltaObject.  # noqa: E501
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id):
        """Sets the id of this RunStepDeltaObject.

        The identifier of the run step, which can be referenced in API endpoints.  # noqa: E501

        :param id: The id of this RunStepDeltaObject.  # noqa: E501
        :type: str
        """
        if id is None:
            raise ValueError("Invalid value for `id`, must not be `None`")  # noqa: E501

        self._id = id

    @property
    def object(self):
        """Gets the object of this RunStepDeltaObject.  # noqa: E501

        The object type, which is always `thread.run.step.delta`.  # noqa: E501

        :return: The object of this RunStepDeltaObject.  # noqa: E501
        :rtype: str
        """
        return self._object

    @object.setter
    def object(self, object):
        """Sets the object of this RunStepDeltaObject.

        The object type, which is always `thread.run.step.delta`.  # noqa: E501

        :param object: The object of this RunStepDeltaObject.  # noqa: E501
        :type: str
        """
        if object is None:
            raise ValueError("Invalid value for `object`, must not be `None`")  # noqa: E501
        allowed_values = ["thread.run.step.delta"]  # noqa: E501
        if object not in allowed_values:
            raise ValueError(
                "Invalid value for `object` ({0}), must be one of {1}"  # noqa: E501
                .format(object, allowed_values)
            )

        self._object = object

    @property
    def delta(self):
        """Gets the delta of this RunStepDeltaObject.  # noqa: E501


        :return: The delta of this RunStepDeltaObject.  # noqa: E501
        :rtype: RunStepDeltaObjectDelta
        """
        return self._delta

    @delta.setter
    def delta(self, delta):
        """Sets the delta of this RunStepDeltaObject.


        :param delta: The delta of this RunStepDeltaObject.  # noqa: E501
        :type: RunStepDeltaObjectDelta
        """
        if delta is None:
            raise ValueError("Invalid value for `delta`, must not be `None`")  # noqa: E501

        self._delta = delta

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
        if issubclass(RunStepDeltaObject, dict):
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
        if not isinstance(other, RunStepDeltaObject):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other