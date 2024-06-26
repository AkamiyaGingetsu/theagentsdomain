package com.highwayns.domain;

import static org.assertj.core.api.Assertions.assertThat;

public class InviteusersAsserts {

    /**
     * Asserts that the entity has all properties (fields/relationships) set.
     *
     * @param expected the expected entity
     * @param actual the actual entity
     */
    public static void assertInviteusersAllPropertiesEquals(Inviteusers expected, Inviteusers actual) {
        assertInviteusersAutoGeneratedPropertiesEquals(expected, actual);
        assertInviteusersAllUpdatablePropertiesEquals(expected, actual);
    }

    /**
     * Asserts that the entity has all updatable properties (fields/relationships) set.
     *
     * @param expected the expected entity
     * @param actual the actual entity
     */
    public static void assertInviteusersAllUpdatablePropertiesEquals(Inviteusers expected, Inviteusers actual) {
        assertInviteusersUpdatableFieldsEquals(expected, actual);
        assertInviteusersUpdatableRelationshipsEquals(expected, actual);
    }

    /**
     * Asserts that the entity has all the auto generated properties (fields/relationships) set.
     *
     * @param expected the expected entity
     * @param actual the actual entity
     */
    public static void assertInviteusersAutoGeneratedPropertiesEquals(Inviteusers expected, Inviteusers actual) {
        assertThat(expected)
            .as("Verify Inviteusers auto generated properties")
            .satisfies(e -> assertThat(e.getId()).as("check id").isEqualTo(actual.getId()));
    }

    /**
     * Asserts that the entity has all the updatable fields set.
     *
     * @param expected the expected entity
     * @param actual the actual entity
     */
    public static void assertInviteusersUpdatableFieldsEquals(Inviteusers expected, Inviteusers actual) {
        assertThat(expected)
            .as("Verify Inviteusers relevant properties")
            .satisfies(e -> assertThat(e.getInvitername()).as("check invitername").isEqualTo(actual.getInvitername()))
            .satisfies(e -> assertThat(e.getWorkspaces()).as("check workspaces").isEqualTo(actual.getWorkspaces()))
            .satisfies(e -> assertThat(e.getInvitertime()).as("check invitertime").isEqualTo(actual.getInvitertime()))
            .satisfies(e -> assertThat(e.getEmail()).as("check email").isEqualTo(actual.getEmail()))
            .satisfies(e -> assertThat(e.getInviterid()).as("check inviterid").isEqualTo(actual.getInviterid()))
            .satisfies(e -> assertThat(e.getStatus()).as("check status").isEqualTo(actual.getStatus()));
    }

    /**
     * Asserts that the entity has all the updatable relationships set.
     *
     * @param expected the expected entity
     * @param actual the actual entity
     */
    public static void assertInviteusersUpdatableRelationshipsEquals(Inviteusers expected, Inviteusers actual) {}
}
