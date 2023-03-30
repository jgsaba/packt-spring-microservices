package se.magnus.api.core.recommendation;

import java.util.List;

import org.springframework.web.bind.annotation.*;

public interface RecommendationService {

  /**
   * Sample usage: "curl $HOST:$PORT/recommendation?productId=1".
   *
   * @param productId Id of the product
   * @return the recommendations of the product
   */
  @GetMapping(
    value = "/recommendation",
    produces = "application/json")
  List<Recommendation> getRecommendations(
    @RequestParam(value = "productId", required = true) int productId);

  @PostMapping(
          value    = "/recommendation",
          consumes = "application/json",
          produces = "application/json")
  Recommendation createRecommendation(@RequestBody Recommendation body);

  @DeleteMapping(value = "/recommendation")
  void deleteRecommendations(@RequestParam(value = "productId", required = true)  int productId);
}

