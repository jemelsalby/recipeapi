package com.nestdigital.Recipe;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="recipe")
public class RecipeApplication {


	@Id
	@GeneratedValue
	private int id;
	private String recipeName;
	private String recipeItem;
	private String recipeMake;
	private String recipeQuality;

	public RecipeApplication(int id, String recipeName, String recipeItem, String recipeMake, String recipeQuality) {
		this.id = id;
		this.recipeName = recipeName;
		this.recipeItem = recipeItem;
		this.recipeMake = recipeMake;
		this.recipeQuality = recipeQuality;
	}

	public RecipeApplication() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRecipeName() {
		return recipeName;
	}

	public void setRecipeName(String recipeName) {
		this.recipeName = recipeName;
	}

	public String getRecipeItem() {
		return recipeItem;
	}

	public void setRecipeItem(String recipeItem) {
		this.recipeItem = recipeItem;
	}

	public String getRecipeMake() {
		return recipeMake;
	}

	public void setRecipeMake(String recipeMake) {
		this.recipeMake = recipeMake;
	}

	public String getRecipeQuality() {
		return recipeQuality;
	}

	public void setRecipeQuality(String recipeQuality) {
		this.recipeQuality = recipeQuality;
	}
}
