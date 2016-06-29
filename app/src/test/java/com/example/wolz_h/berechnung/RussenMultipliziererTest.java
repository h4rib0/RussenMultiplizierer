package com.example.wolz_h.berechnung;

import static org.hamcrest.CoreMatchers.not;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by wolz_h on 29.06.16.
 */
public class RussenMultipliziererTest {


    int ersteZahl;
    int zweiteZahl;

    @Before
    public void setup() {
        ersteZahl = 47;
        zweiteZahl = 42;
    }

    @Test
    public void testCanBeDividedByTwo() {
        Integer zaehler = ersteZahl;
        assertThat(RussenMultiplizierer.canBeDividedByTwo(zaehler), is(true));
    }

    @Test
    public void testShouldAddValue() {
        assertThat(RussenMultiplizierer.shouldAddValue(ersteZahl), is(true));
    }

    @Test
    public void testDivideByTwo() {
        assertThat(RussenMultiplizierer.divideByTwo(ersteZahl), is(23));
    }

    @Test public void testMulitplyByTwo(){
        assertThat(RussenMultiplizierer.multiyplyByTwo(zweiteZahl), is(84));
    }

    @Test public void testAddValues(){
        assertThat(RussenMultiplizierer.addValues(zweiteZahl, zweiteZahl *2), is(126) );
    }

    @Test
    public void testMult(){
        assertThat(RussenMultiplizierer.mult(ersteZahl,zweiteZahl), is(1974));
    }




}