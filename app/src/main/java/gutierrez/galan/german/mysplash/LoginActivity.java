package gutierrez.galan.german.mysplash;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import static android.widget.Toast.LENGTH_SHORT;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        File file = null;
        FileWriter fileWriter = null;
        try {
            file = new File( getFilesDir() , "a.txt" );
            fileWriter = new FileWriter( file );
            fileWriter.append( "Hola" );
            fileWriter.flush();
            fileWriter.close();
            Toast.makeText( getApplicationContext() , "Ok" , LENGTH_SHORT ).show();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

    }
}