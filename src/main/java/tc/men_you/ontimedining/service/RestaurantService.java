package tc.men_you.ontimedining.service;

import tc.men_you.ontimedining.models.entity.Restaurant;

import java.util.List;

public interface RestaurantService {
    Restaurant save(Restaurant restaurant);

    Restaurant update(Restaurant restaurant);

    List<Restaurant> getAll();
}
