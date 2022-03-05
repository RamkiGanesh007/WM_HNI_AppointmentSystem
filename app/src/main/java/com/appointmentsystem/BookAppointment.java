package com.appointmentsystem;

import android.content.Intent;
import android.os.Bundle;

import com.example.wm_hni_appointmentsystem.AppointmentSystem;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.appointmentsystem.databinding.ActivityBookAppointmentBinding;

import java.util.Calendar;
import java.util.Date;

public class BookAppointment extends AppCompatActivity {

    private AppBarConfiguration appBarConfiguration;
    private ActivityBookAppointmentBinding binding;

    Button backbutton;
    Button book;

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

        backbutton=findViewById(R.id.button);
        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        book=findViewById(R.id.book);

        book.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String appointment_id1=Integer.toString((int) Math.random());
                String appointment_id2=Integer.toString((int)Math.random());
                Date currentTime = Calendar.getInstance().getTime();

                AppointmentSystem asystem=new AppointmentSystem(appointment_id1,currentTime.toString(),"Requested",appointment_id1,appointment_id2);

                //Make Use of this object to store it in Appointment Table
                Toast.makeText(BookAppointment.this, "Appointment Booked !!!", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_book_appointment);
        return NavigationUI.navigateUp(navController, appBarConfiguration)
                || super.onSupportNavigateUp();
    }
}