package tc.men_you.ontimedining.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import tc.men_you.ontimedining.models.entity.MenuItem;

import java.util.List;

public interface MenuItemService {
    MenuItem save(MenuItem item);

    Page<MenuItem> getAll(PageRequest of);

    MenuItem update(MenuItem item);
}
