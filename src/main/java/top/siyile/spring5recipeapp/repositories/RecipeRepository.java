package top.siyile.spring5recipeapp.repositories;

import org.springframework.data.repository.CrudRepository;
import top.siyile.spring5recipeapp.domain.Recipe;

/**
 * Created by jt on 6/13/17.
 */
public interface RecipeRepository extends CrudRepository<Recipe, String> {
}
