package com.example.soccernews.ui.news;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.soccernews.domain.News;

import java.util.ArrayList;
import java.util.List;

public class NewsViewModel extends ViewModel {

    private final MutableLiveData<List<News>> news;

    public NewsViewModel() {
        this.news = new MutableLiveData<>();

        //TODO remover mock de notícias
        List<News> news = new ArrayList<>();
        news.add(new News("Ferroviária tem desfalque imporntante.", "Integer at mollis metus. Cras vitae dui massa. Cras id sem consequat, feugiat massa a, blandit odio. Maecenas hendrerit id quam non egestas. Aliquam erat volutpat. Nulla facilisi. Donec tincidunt placerat lobortis. "));
        news.add(new News("Ferrinha joga no sábado.", "Integer at mollis metus. Cras vitae dui massa. Cras id sem consequat, feugiat massa a, blandit odio. Maecenas hendrerit id quam non egestas. Aliquam erat volutpat. Nulla facilisi. Donec tincidunt placerat lobortis. "));
        news.add(new News("Copa do mundo feminina está terminando.", "Integer at mollis metus. Cras vitae dui massa. Cras id sem consequat, feugiat massa a, blandit odio. Maecenas hendrerit id quam non egestas. Aliquam erat volutpat. Nulla facilisi. Donec tincidunt placerat lobortis. "));

        this.news.setValue(news);
    }

    public LiveData<List<News>> getNews() {
        return news;
    }
}