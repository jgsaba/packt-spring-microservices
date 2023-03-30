package se.magnus.api.core.review;

import java.util.List;
import org.springframework.web.bind.annotation.*;

public interface ReviewService {

  /**
   * Sample usage: "curl $HOST:$PORT/review?productId=1".
   *
   * @param productId Id of the product
   * @return the reviews of the product
   */
  @GetMapping(
    value = "/review",
    produces = "application/json")
  List<Review> getReviews(@RequestParam(value = "productId", required = true) int productId);

  @PostMapping(
          value    = "/review",
          consumes = "application/json",
          produces = "application/json")
  Review createReview(@RequestBody Review body);

  @DeleteMapping(value = "/review")
  void deleteReviews(@RequestParam(value = "productId", required = true)  int productId);
}
