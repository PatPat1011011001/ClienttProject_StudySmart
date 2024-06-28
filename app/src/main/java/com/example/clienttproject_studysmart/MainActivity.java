package com.example.clienttproject_studysmart;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Button QandA_btn, FC_btn, TF_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        QandA_btn  = (Button) findViewById(R.id.QandA_btn);
        QandA_btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                    Toast.makeText(MainActivity.this, "Question and Answer", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MainActivity.this, QuestionAndAnswerActivity.class);
                    startActivity(intent);
            }
        });

        FC_btn  = (Button) findViewById(R.id.FlashCard_btn);
        FC_btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Toast.makeText(MainActivity.this, "Flash Card", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, FlashCard_Activity.class);
                startActivity(intent);
            }
        });

        TF_btn  = (Button) findViewById(R.id.TF_btn);
        TF_btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Toast.makeText(MainActivity.this, "True of False", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, TF_Activity.class);
                startActivity(intent);
            }
        });



    }
}