package org.wecancoeit.reviews.repository;

import org.springframework.stereotype.Repository;

import org.wecancoeit.reviews.model.Review;

import java.util.HashMap;
import java.util.Map;

@Repository
public class ReviewRepository {

    private Map<Long, Review> reviewList = new HashMap<>();
    public Review linkOne(long l) {
        return reviewList.get(id);
    }
}
