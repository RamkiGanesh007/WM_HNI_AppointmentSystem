package com.appointmentsystem;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.appointmentsystem.databinding.ActivityBookAppointmentBinding;

public class BookAppointment extends AppCompatActivity {

    private AppBarConfiguration appBarConfiguration;
    private ActivityBookAppointmentBinding binding;

    Button backbutton;

    TextView role;
    TextView description;

    EditText Edate;
    EditText time;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.appointmentbook);

        String role;
        String description;

        Edate=(EditText) findViewById(R.id.Edate);

        Edate=(EditText) findViewById(R.id.Etime);

        String date=Edate.getText().toString();

        String time=Edate.getText().toString();




    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_book_appointment);
        return NavigationUI.navigateUp(navController, appBarConfiguration)
                || super.onSupportNavigateUp();
    }
}