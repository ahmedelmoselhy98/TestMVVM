package com.example.testmvvm.ui.main;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.testmvvm.pojo.Movie;

public class MovieViewModel extends ViewModel {


    public MutableLiveData<Movie> movieMutableLiveData = new MutableLiveData<>();

    private Movie getMovieFromDB(){
        return new Movie(1,"ahmed","ahmed overview");
    }


    public void getMovieData(){
        movieMutableLiveData.setValue(getMovieFromDB());
    }


}
