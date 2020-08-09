package com.example.testmvvm.ui;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.testmvvm.R;
import com.example.testmvvm.pojo.Movie;
import com.example.testmvvm.ui.main.MovieViewModel;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity{

    @BindView(R.id.tvName)
    TextView tvName;
    @BindView(R.id.button)
    Button button;



    MovieViewModel movieViewModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        movieViewModel = ViewModelProviders.of(this).get(MovieViewModel.class);
        movieViewModel.movieMutableLiveData.observe(this, new Observer<Movie>() {
            @Override
            public void onChanged(Movie movie) {
                tvName.setText(movie.getName());
            }
        });

    }

    @OnClick(R.id.button)void click(){
        movieViewModel.getMovieData();
    }


}