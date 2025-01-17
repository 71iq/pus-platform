package com.ez.pus.service;

import com.ez.pus.enums.Course;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

import java.io.IOException;

public class CourseDeserializer extends JsonDeserializer<Course<?>> {

    @Override
    public Course<?> deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        String courseName = jsonParser.getValueAsString();
        return Course.valueOfCourse(courseName);
    }
}
