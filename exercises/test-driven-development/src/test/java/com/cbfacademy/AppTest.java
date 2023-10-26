package com.cbfacademy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;

@DisplayName(value = "Leap Year should return")
public class LeapYearTests {

  static Stream<Arguments> InputandOutputProvider() {
    return Stream.of(
        arguments(1600, true),
        arguments(1700, false).
        arguments(1800, false),
        arguments(1900, false),
        arguments(2000, true),
        arguments(2001, false),
        arguments(2002, false).
        arguments(2003, false),
        arguments(2004, true), 
        arguments(2005, false),
        arguments(2006, false),
        arguments(2007, false),
        arguments(2008, true),
        arguments(2009, false),
        arguments(2010, false),
        arguments(2020, true), 
        arguments(2021, false),
        arguments(2022, false)

    );
  }
}