package top.siyile.spring5recipeapp.repositories;

import org.springframework.data.repository.CrudRepository;
import top.siyile.spring5recipeapp.domain.Recipe;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {

}
