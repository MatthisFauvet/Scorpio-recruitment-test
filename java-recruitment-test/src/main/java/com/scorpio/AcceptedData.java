package com.scorpio;

import lombok.Data;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import lombok.Data;
import lombok.Getter;

import static java.util.Arrays.stream;

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

    @JsonCreator
    public static DataType from(String dataTypeValue) {
        return stream(DataType.values())
            .filter(dataType -> dataType.getValue().equalsIgnoreCase(dataTypeValue))
            .findFirst().orElse(null);
    }
}
