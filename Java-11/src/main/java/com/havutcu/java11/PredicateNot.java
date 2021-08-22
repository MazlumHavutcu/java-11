package com.havutcu.java11;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.function.Predicate.not;

public class PredicateNot {

    @Test
    public void should_predicate_not()
    {
        List<Integer> values = Arrays.asList(1, 2, 3, 4, 5, 6, 7);

        List<Integer> filteredValues =  values.stream().filter(not(p->p.equals(2))).collect(Collectors.toList());

        Assert.assertEquals(filteredValues.size(),6);

    }
}
