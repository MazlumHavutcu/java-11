package com.havutcu.java11;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.stream.Collectors;

public class StringFeature {

    @Test
    public void should_string_is_blank()
    {
        String value= "   ";

        Assert.assertEquals(value.isBlank(),true);
        Assert.assertEquals(value.isEmpty(),false);

    }

    @Test
    public void should_string_is_not_blank()
    {
        String value= " mazlum  ";

        Assert.assertEquals(value.isBlank(),false);
        Assert.assertEquals(value.isEmpty(),false);

    }

    @Test
    public void strip_and_trim()
    {
        String value= "    Mazlum    \n  ";
        String value2= "    Mazlum    \n   \u2000";

        Assert.assertEquals(value.strip(),"Mazlum");
        Assert.assertEquals(value.trim(),"Mazlum");

        System.out.println("["+value.strip()+"]");
        System.out.println("["+value.trim()+"]");

        Assert.assertEquals(value2.strip(),"Mazlum");
        Assert.assertNotEquals(value2.trim(),"Mazlum");

        System.out.println("["+value2.strip()+"]");
        System.out.println("["+value2.trim()+"]");

    }

    @Test
    public void strip_leading()
    {
        String value= "    Mazlum      ";

        Assert.assertEquals(value.stripLeading(),"Mazlum      ");

        System.out.println("["+value.stripLeading()+"]");

    }

    @Test
    public void strip_trailing()
    {
        String value= "    Mazlum      ";

        Assert.assertEquals(value.stripTrailing(),"    Mazlum");

        System.out.println("["+value.stripTrailing()+"]");

    }

    @Test
    public void test_should_repeat()
    {
        String value= "    Mazlum      ";

        Assert.assertEquals(value.trim().repeat(2),"MazlumMazlum");

        System.out.println("["+value.repeat(2)+"]");

    }

    @Test
    public void test_lines()
    {
        String value= "Lorem Ipsum is simply dummy text of the printing and typesetting industry. \n" +
                "Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, \n" +
                "when an unknown printer took a \n" +
                "galley of type and scrambled it to make a type specimen book.";

        final List<String> lines = value.lines().collect(Collectors.toList());

        Assert.assertEquals(lines.size(),4);

        System.out.println("["+lines+"]");

    }
}
