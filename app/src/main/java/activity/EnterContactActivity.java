package activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RelativeLayout;

import com.dryogi.R;

public class EnterContactActivity extends AppCompatActivity {

    RelativeLayout callbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter_contact);


        callbtn = (RelativeLayout) findViewById(R.id.callbtn);


        callbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent = new Intent(getApplicationContext(), AppointmentDetailsActivity.class);
                startActivity(intent);

            }
        });
    }
}
