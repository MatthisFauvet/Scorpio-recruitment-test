package com.scorpio;

import com.fasterxml.jackson.annotation.JsonValue;

import lombok.Getter;

@Getter
public enum AcceptedData {

    NAME("Name", String.class),

    ID("Id", Long.class),

    DATATYPE("DataType", DataType.class);

    @JsonValue
    private final String value;

    private final Class<?> clazz;

    AcceptedData(String value, Class<?> clazz) {
        this.value = value;
        this.clazz = clazz;
    }
}
