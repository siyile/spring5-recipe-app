package top.siyile.spring5recipeapp.domain;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class Notes {

    private String id;
    private Recipe recipe;
    private String recipeNotes;

}
