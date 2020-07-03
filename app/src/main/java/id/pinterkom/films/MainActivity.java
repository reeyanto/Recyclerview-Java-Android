package id.pinterkom.films;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rv_recyclerview;
    private ArrayList<Films> films;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // init data
        initData();

        rv_recyclerview = findViewById(R.id.rv_recyclerview);
        rv_recyclerview.setLayoutManager(new GridLayoutManager(this, 2));
        rv_recyclerview.setAdapter(new FilmsAdapter(films));
    }

    private void initData() {
        films = new ArrayList<>();

        films.add(new Films("How to Train Your Dragon", "The Description of How to Train Your Dragon", R.drawable.dragon));
        films.add(new Films("The Boss Baby", "The Description of The Boss Baby", R.drawable.baby));
    }
}