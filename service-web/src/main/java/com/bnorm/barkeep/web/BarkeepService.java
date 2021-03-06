// Copyright 2017 (C) BNORM Software. All rights reserved.
package com.bnorm.barkeep.web;

import java.util.List;

import com.bnorm.barkeep.model.Bar;
import com.bnorm.barkeep.model.BarSpec;
import com.bnorm.barkeep.model.Book;
import com.bnorm.barkeep.model.BookSpec;
import com.bnorm.barkeep.model.Ingredient;
import com.bnorm.barkeep.model.IngredientSpec;
import com.bnorm.barkeep.model.Recipe;
import com.bnorm.barkeep.model.RecipeSpec;
import com.bnorm.barkeep.model.User;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface BarkeepService {

  @GET("users/{id}")
  Call<User> getUser(@Path("id") long id);

  @GET("users/current")
  Call<User> getCurrentUser();

  // ================= //
  // ***** Books ***** //
  // ================= //

  @GET("books")
  Call<List<Book>> getBooks();

  @POST("books")
  Call<Book> createBook(@Body BookSpec book);

  @GET("books/{id}")
  Call<Book> getBook(@Path("id") long id);

  @GET("books/{id}/recipes")
  Call<List<Recipe>> getBookRecipes(@Path("id") long id);

  @PUT("books/{id}")
  Call<Book> updateBook(@Path("id") long id, @Body BookSpec book);

  @DELETE("books/{id}")
  Call<Void> deleteBook(@Path("id") long id);


  // ================= //
  // ***** Bars ***** //
  // ================= //

  @GET("bars")
  Call<List<Bar>> getBars();

  @POST("bars")
  Call<Bar> createBar(@Body BarSpec bar);

  @GET("bars/{id}")
  Call<Bar> getBar(@Path("id") long id);

  @PUT("bars/{id}")
  Call<Bar> updateBar(@Path("id") long id, @Body BarSpec bar);

  @DELETE("bars/{id}")
  Call<Void> deleteBar(@Path("id") long id);


  // =================== //
  // ***** Recipes ***** //
  // =================== //

  @GET("recipes")
  Call<List<Recipe>> getRecipes();

  @POST("recipes")
  Call<Recipe> createRecipe(@Body RecipeSpec recipe);

  @GET("recipes/{id}")
  Call<Recipe> getRecipe(@Path("id") long id);

  @PUT("recipes/{id}")
  Call<Recipe> updateRecipe(@Path("id") long id, @Body RecipeSpec recipe);

  @DELETE("recipes/{id}")
  Call<Void> deleteRecipe(@Path("id") long id);


  // ======================= //
  // ***** Ingredients ***** //
  // ======================= //

  @GET("ingredients")
  Call<List<Ingredient>> getIngredients(@Query("search") String search);

  @GET("ingredients")
  Call<List<Ingredient>> getIngredients();

  @POST("ingredients")
  Call<Ingredient> createIngredient(@Body IngredientSpec ingredient);

  @GET("ingredients/{id}")
  Call<Ingredient> getIngredient(@Path("id") long id);

  @PUT("ingredients/{id}")
  Call<Ingredient> updateIngredient(@Path("id") long id, @Body IngredientSpec ingredient);

  @DELETE("ingredients/{id}")
  Call<Void> deleteIngredient(@Path("id") long id);
}
