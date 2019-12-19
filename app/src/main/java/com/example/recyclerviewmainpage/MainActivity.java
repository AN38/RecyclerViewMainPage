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
        postModel.setImageUrl("https://cdn.searchenginejournal.com/wp-content/uploads/2019/08/c573bf41-6a7c-4927-845c-4ca0260aad6b-760x400.jpeg");
        postModel.setLogoUrl("https://www.corriereagrigentino.it/wp-content/uploads/2018/11/McDonalds.jpg");
        posts.add(postModel);

        PostModel postModel2 = new PostModel();
        postModel2.setFilialName("Urbo coffee");
        postModel2.setCategoryName("Кофейня");
        postModel2.setCashbackAmount(10);
        postModel2.setPeriod(10);
        postModel2.setTransactionsAmount(990);
        postModel2.setImageUrl("https://cdn.editorchoice.com/wp-content/uploads/2019/09/fast-food.jpg");
        postModel2.setLogoUrl("https://icon2.cleanpng.com/20180202/pre/kisspng-hamburger-street-food-seafood-fast-food-delicious-food-5a75083c57a5f5.317349121517619260359.jpg");
        posts.add(postModel2);

        PostModel postModel3 = new PostModel();
        postModel3.setFilialName("Chick inn");
        postModel3.setCategoryName("Еда");
        postModel3.setCashbackAmount(3);
        postModel3.setPeriod(10);
        postModel3.setTransactionsAmount(775);
        postModel3.setImageUrl("https://f0.pngfuel.com/png/853/879/iced-coffee-latte-tea-cafe-cup-of-coffee-beans-black-ceramic-cup-filled-with-brown-coffee-png-clip-art-thumbnail.png");
        postModel3.setLogoUrl("https://static.tildacdn.com/tild6263-3135-4634-b263-636235663636/Logo_URBO___2.png");
        posts.add(postModel3);

        PostModel postModel4 = new PostModel();
        postModel4.setFilialName("Бабушкин буфет");
        postModel4.setCategoryName("Еда");
        postModel4.setCashbackAmount(8);
        postModel4.setPeriod(10);
        postModel4.setTransactionsAmount(325);
        postModel4.setImageUrl("https://www.freepnglogos.com/uploads/food-png/download-food-png-file-png-image-pngimg-1.png");
        postModel4.setLogoUrl("https://www.vippng.com/png/detail/26-261497_indian-cuisine-pakora-samosa-rajma-indian-food-cartoon.png");
        posts.add(postModel4);

        return posts;
    }

}
