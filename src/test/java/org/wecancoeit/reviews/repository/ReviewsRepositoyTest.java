package org.wecancoeit.reviews.repository;

import org.junit.jupiter.api.Test;
import org.wecancoeit.reviews.model.Review;

import javax.annotation.Resource;

public class ReviewsRepositoyTest {

    @Resource
    private ReviewRepository underTest;

    private Review reviewOne = new Review(1L,"title","director","year","genre","urlMoviePoster", "urlStar");
    private Review reviewTwo = new Review(2L,"title","director","year","genre","urlMoviePoster", "urlStar");

    @Test
    public void shouldLinkReview(){
        ReviewRepository underTest = new ReviewRepository(reviewOne);
        Review linking = underTest.linkOne(1L);

    }
}
