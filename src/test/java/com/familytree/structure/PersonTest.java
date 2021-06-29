package com.familytree.structure;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    private Person person;

    @BeforeEach
    void setUp() {
        person = new Person("Demo User", 12);
    }

    @Test
    void test_WHEN_older_person_is_compared_with_younger_THEN_compareTo_RETURNS_negative_integer() {
        Person personOlder = new Person("Demo User 2", 53);
        int compareResult = person.compareTo(personOlder);
        assertEquals(-1, compareResult);
    }

    @Test
    void test_WHEN_older_person_is_compared_with_younger_THEN_compareTo_RETURNS_positive_integer() {
        Person personOlder = new Person("Demo User 2", 53);
        int compareResult = personOlder.compareTo(person);
        assertEquals(1, compareResult);
    }

    @Test
    void test_WHEN_same_age_person_is_compared_with_same_age_person_THEN_compareTo_RETURNS_zero() {
        Person personOlder = new Person("Demo User 2", 12);
        int compareResult = personOlder.compareTo(person);
        assertEquals(0, compareResult);
    }
}