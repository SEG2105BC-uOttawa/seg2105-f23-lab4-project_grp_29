package com.example.sportscentric;

import static com.example.sportscentric.R.id.logoImage05;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void OnOpenInGoogleMaps (View view) {
        EditText teamAddres = (EditText) findViewById(R.id.teamAddressField);
    // Create a Uri from an intent string. Use the result to create an Intent.
        Uri gmmIntentUri = Uri.parse("http://maps.google.co.in/maps?q="+teamAddres.getText());
    // Create an Intent from gmmIntentUri. Set the action to ACTION_VIEW
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
    // Make the Intent explicit by setting the Google Maps package
        mapIntent.setPackage("com.google.android.apps.maps");
    // Attempt to start an activity that can handle the Intent
        startActivity(mapIntent);
    }

    public void OnSetAvatarButton(View view) {
//Application Context and Activity
        Intent intent = new Intent(getApplicationContext(), ProfileActivity.class);
        startActivityForResult(intent,0);
    }

    @SuppressLint("NonConstantResourceId")
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == RESULT_CANCELED) return;

<<<<<<< HEAD:Lab4App/app/src/main/java/com/example/sportscentric/MainActivity.java
        ImageView avatarImage = findViewById(R.id.logoImage);

        // Obtenez l'ID de l'image sélectionnée à partir des données de l'intent
        int selectedImageId = data.getIntExtra("imageID", R.id.logoImage00);

        // Utilisez une instruction switch avec les constantes de l'énumération
        String drawableName;
        switch (LogoImageId.values()[selectedImageId]) {
            case LOGO_IMAGE_00:
                drawableName = "ic_logo_00";
                break;
            case LOGO_IMAGE_01:
                drawableName = "ic_logo_01";
                break;
            case LOGO_IMAGE_02:
                drawableName = "ic_logo_02";
                break;
            case LOGO_IMAGE_03:
                drawableName = "ic_logo_03";
                break;
            case LOGO_IMAGE_04:
                drawableName = "ic_logo_04";
                break;
            case LOGO_IMAGE_05:
                drawableName = "ic_logo_05";
                break;
            default:
                drawableName = "ic_logo_00";
                break;
=======
        // Getting the Avatar Image we show to our users
        ImageView avatarImage = findViewById(R.id.logoImage);

        // Figuring out the correct image
        String drawableName = "ic_logo_00";
        int imageID = data.getIntExtra("imageID", R.id.logoImage);

        if (imageID == R.id.logoImage00) {
            drawableName = "ic_logo_00";
        } else if (imageID == R.id.logoImage01) {
            drawableName = "ic_logo_01";
        } else if (imageID == R.id.logoImage02) {
            drawableName = "ic_logo_02";
        } else if (imageID == R.id.logoImage03) {
            drawableName = "ic_logo_03";
        } else if (imageID == R.id.logoImage04) {
            drawableName = "ic_logo_04";
        } else if (imageID == R.id.logoImage05) {
            drawableName = "ic_logo_05";
>>>>>>> 335324e6a94321858d30b3d30c8aae2376132c70:SportsCentric3/app/src/main/java/com/example/sportscentric/MainActivity.java
        }

        int resID = getResources().getIdentifier(drawableName, "drawable", getPackageName());
        avatarImage.setImageResource(resID);
    }
}