package com.project.paymentservice.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum Status {

    @JsonProperty("SUCCESS")
    SUCCESS,
    @JsonProperty("FAILED")
    FAILED,
    @JsonProperty("PENDING")
    PENDING
}
