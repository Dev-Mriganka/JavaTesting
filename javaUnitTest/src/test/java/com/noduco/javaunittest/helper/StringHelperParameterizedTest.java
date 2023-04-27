package com.noduco.javaunittest.helper;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringHelperTest {

    StringHelper helper = new StringHelper();


    @Test
    void truncateAInFirst2Positions_AinFirst2Positions() {
        assertEquals("CD", helper.truncateAInFirst2Positions("AACD"));
    }

    @Test
    void truncateAInFirst2Positions_AinFirstPosition() {
        assertEquals("CD", helper.truncateAInFirst2Positions("ACD"));
    }

    @Test
    void areFirstAndLastTwoCharactersTheSame() {
        assertFalse(helper.areFirstAndLastTwoCharactersTheSame("ABCD"));
    }
}