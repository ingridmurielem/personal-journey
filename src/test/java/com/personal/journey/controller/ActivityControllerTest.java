package com.personal.journey.controller;

import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class ActivityControllerTest {

    @Test
    public void shouldReturnAllActivities() {
        ActivityController controller = new ActivityController();

        List<String> actualActivities = controller.getAllActivities();

        assertThat(actualActivities).containsExactlyInAnyOrder("AfroPython", "TWU");
    }
}