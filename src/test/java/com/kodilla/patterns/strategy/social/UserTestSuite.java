package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {

    @Test
    public void testDefaultSharingStrategies() {

        //given
        User millennials = new Millennials("Nancy");
        User yGeneration = new YGeneration("George");
        User zGeneration = new ZGeneration("Zack");

        //when
        String snapchat = millennials.sharePost();
        String twitter = yGeneration.sharePost();
        String facebook = zGeneration.sharePost();

        //then
        Assert.assertEquals("Snapchat", snapchat);
        Assert.assertEquals("Twitter", twitter);
        Assert.assertEquals("Facebook", facebook);
    }

    @Test
    public void testIndividualSharingStrategy() {

        //given
        User millennials = new Millennials("Nancy");
        millennials.setSocialPublisher(new FacebookPublisher());

        //when
        String facebook = millennials.sharePost();

        //then
        Assert.assertEquals("Facebook", facebook);
    }
}
