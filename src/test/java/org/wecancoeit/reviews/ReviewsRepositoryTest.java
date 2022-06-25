package org.wecancoeit.reviews;


import org.junit.jupiter.api.Test;

import java.util.Collection;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReviewsRepositoryTest {

    private ReviewRepository underTest;
    private Review reviewOne = new Review(1L, "title", "director", "year", "genre", "urlMoviePoster", "urlStar");
    private Review reviewTwo = new Review(2L, "title", "director", "year", "genre", "urlMoviePoster", "urlStar");
    @Test
    public void shouldFindReviewOne() {
        underTest = new ReviewRepository(reviewOne);
        Review foundReview = underTest.findOne(1L);
        assertEquals(reviewOne, foundReview);
    }

    @Test
    public void shouldLinkReviewOneAndReviewTwo() {
        underTest = new ReviewRepository(reviewOne, reviewTwo);
        Collection<Review> foundReviews = underTest.findAll();
        assertThat(foundReviews).contains(reviewOne, reviewTwo);
    }

}
