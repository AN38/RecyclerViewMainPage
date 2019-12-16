package com.example.recyclerviewmainpage;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerViewPosts;
    private PostAdapter postAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerViewPosts = findViewById(R.id.recycler_view);

        ArrayList<PostModel> postModels = generatePostModels();

        postAdapter = new PostAdapter(postModels);
        recyclerViewPosts.setAdapter(postAdapter);
        recyclerViewPosts.setLayoutManager(new LinearLayoutManager(this));
    }

    private ArrayList<PostModel> generatePostModels() {

        ArrayList<PostModel> posts = new ArrayList<>();

        PostModel postModel = new PostModel();
        postModel.setFilialName("Алатау кус");
        postModel.setCategoryName("Продукты");
        postModel.setCashbackAmount(7);
        postModel.setPeriod(10);
        postModel.setTransactionsAmount(800);
        postModel.setImageUrl("http://www.spletnik.ru/img/__post/60/60cf0ac41d8c3404a26fb544a0887c1d_994.jpg");
        postModel.setLogoUrl("https://pbs.twimg.com/profile_images/940390322198196224/mhjWgoNP_400x400.jpg");
        posts.add(postModel);

        PostModel postModel2 = new PostModel();
        postModel2.setFilialName("Urbo coffee");
        postModel2.setCategoryName("Кофейня");
        postModel2.setCashbackAmount(10);
        postModel2.setPeriod(10);
        postModel2.setTransactionsAmount(990);
        postModel2.setImageUrl("http://www.sport-villa.kz/assets/images/slider/5_2.png");
        postModel2.setLogoUrl("https://static.tildacdn.com/tild6263-3135-4634-b263-636235663636/Logo_URBO___2.png");
        posts.add(postModel2);

        return posts;
    }

}
