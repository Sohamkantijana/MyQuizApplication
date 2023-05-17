package easy.tuto.myquizapplication;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class Quiz_mania extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_mania);
        Button move = findViewById(R.id.button);
        move.setOnClickListener(view -> {
            Intent intent =new Intent(Quiz_mania.this,MainActivity.class);
            startActivity(intent);
        });
    }
}
