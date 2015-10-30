package team7.spontivity_gamma;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_login);
    }

    public void onLoginClick(View view) {
        Intent i = new Intent(this, TabManager.class);

        final EditText userEmail = (EditText) findViewById(R.id.userEmail);
        String email = userEmail.getText().toString();
        i.putExtra("email", email);

        final EditText userPassword = (EditText) findViewById(R.id.userPassword);
        String password = userPassword.getText().toString();
        i.putExtra("password", password);


        //User email and password are stored as strings in arraylist
        ArrayList<String> eAndP = new ArrayList<String>();
        eAndP.add(email);
        eAndP.add(password);

        //Send eAndP to server
        //Server verifies and returns boolean?

        //if verified
            this.startActivity(i);

        //else
            //TextView errorMessage = (TextView) findViewById(R.id.errorMessage);
            //errorMessage.setText("Incorrect Email/Password");
    }

}
