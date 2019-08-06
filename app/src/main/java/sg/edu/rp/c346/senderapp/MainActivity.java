package sg.edu.rp.c346.senderapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnSend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSend = findViewById(R.id.button);

        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //call the method sendBroadcast() to send this broadcast to all receivers in an undefined order
                Intent intent = new Intent("com.example.broadcast.MY_BROADCAST");
                sendBroadcast(intent);
            }
        });

    }
}
