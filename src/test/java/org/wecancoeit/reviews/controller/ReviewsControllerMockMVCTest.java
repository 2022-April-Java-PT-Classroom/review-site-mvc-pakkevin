package org.wecancoeit.reviews.controller;

import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.wecancoeit.reviews.model.Review;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
public class ReviewsControllerMockMVCTest {

    @Resource
    private MockMvc mockMvc;

    @Mock
    private Review reviewOne;



}
