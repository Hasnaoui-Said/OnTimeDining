package tc.men_you.ontimedining.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import tc.men_you.ontimedining.models.entity.MenuItem;
import tc.men_you.ontimedining.repository.MenuItemRepository;

import java.util.List;

@Service
public class MenuItemServiceImpl implements MenuItemService {

    @Autowired
    MenuItemRepository repository;
    @Override
    public MenuItem save(MenuItem item) {
        return repository.insert(item);
    }
    @Override
    public MenuItem update(MenuItem item) {
        return repository.save(item);
    }

    @Override
    public Page<MenuItem> getAll(PageRequest pageRequest) {
        return repository.findAll(pageRequest);
    }
}
