package sg.edu.np.mad.madpractical4;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.helper.widget.Carousel;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Random;

public class ListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_list);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // create 20 random users, descriptions, and value
        ArrayList<User> userArray = new ArrayList<>();
        Random random = new Random();
        for (int i = 1; i <= 20; i++)
        {
            Boolean randomFollow = random.nextBoolean();
            User user = new User("User" + String.valueOf(random.nextInt(100000)),"Description" + String.valueOf(random.nextInt(100000)),i,randomFollow);
            userArray.add(user);
        }

        // (Q3) Recycler View
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        UserAdapter userAdapter = new UserAdapter(userArray, this);
        LinearLayoutManager mLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(userAdapter);


        //ImageView profileImg = (ImageView) findViewById(R.id.imageView4);

        //profileImg.setOnClickListener(new View.OnClickListener(){
            /*public void onClick(View V){
                AlertDialog.Builder builder = new AlertDialog.Builder(ListActivity.this);

                builder.setTitle("Profile");
                builder.setMessage("MADness");
                builder.setCancelable(true);
                builder.setPositiveButton("View", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Random random = new Random();
                        int randomNumber = random.nextInt(900000) + 100000;

                        Intent activityName = new Intent(ListActivity.this, MainActivity.class);

                        activityName.putExtra("randomNumber", randomNumber);
                        startActivity(activityName);
                        dialog.dismiss();
                    }
                });
                builder.setNegativeButton("Close", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });

                AlertDialog dialog = builder.create();

                dialog.show();
            }
        });*/
    }
}