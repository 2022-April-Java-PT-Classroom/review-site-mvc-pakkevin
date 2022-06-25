package org.wecancoeit.reviews;

import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class ReviewRepository {

    Map<Long, Review> reviewsList = new HashMap<>();

    public ReviewRepository() {
        Review movieOne = new Review(5L, "Everything Everywhere All at Once",
                "Daniel Kwan and Daniel Scheinert", "2022", "swirl of genre anarchy -The New York Times",
                "/images/EEAAO.gif", "/images/5star.png");
        Review movieTwo = new Review(4L, "Better Days",
                "Derek Tsang", "2019", "Crime/Drama",
                "/images/BD.gif", "/images/4star.png");
        Review movieThree = new Review(3L, "The Dark Knight",
                "Christopher Nolan", "2008", "Action/Adventure",
                "/images/TDK.gif", "/images/3star.png");
        Review movieFour = new Review(2L, "Midsommar",
                "Ari Aster", "2019", "Horror",
                "/images/MS.gif", "/images/2star.png");
        Review movieFive = new Review(1L, "Inglorious Bastards",
                "Quentin Tarantino", "2009", "War",
                "/images/IB.gif", "/images/1star.png");

        reviewsList.put(movieOne.getId(), movieOne);
        reviewsList.put(movieTwo.getId(), movieTwo);
        reviewsList.put(movieThree.getId(), movieThree);
        reviewsList.put(movieFour.getId(), movieFour);
        reviewsList.put(movieFive.getId(), movieFive);

    }

    public ReviewRepository(Review... reviewsToAdd) {
        for (Review review : reviewsToAdd) {
            reviewsList.put(review.getId(), review);
        }
    }

    public Collection<Review> findAll() {
        return reviewsList.values();
    }

    public Review findOne(long id) {
        return reviewsList.get(id);
    }


}
