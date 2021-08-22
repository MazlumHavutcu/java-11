package com.havutcu.java11;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.regex.Matcher;
import java.util.stream.Collectors;


public class Lambda {

    @Test
    public void should_use_var()
    {
        String value= "Lorem Ipsum is simply dummy text of the printing and typesetting industry. \n" +
                "Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, \n" +
                "when an unknown printer took a \n" +
                "galley of type and scrambled it to make a type specimen \n" +
                "book.";

        final List<String> lines = value.lines().collect(Collectors.toList());

        List<String> list = lines.stream().filter((var p) ->p.equals("book.")).collect(Collectors.toList());

        Assert.assertEquals(list.size(),1);

    }
}
