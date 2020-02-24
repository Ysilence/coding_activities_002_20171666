package mg.studio.android.survey;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome);
    }
    public void accept(View view)
    {
        setContentView(R.layout.question_one);
    }
    public void next1(View view)
    {
        setContentView(R.layout.question_two);
    }
    public void next2(View view)
    {
        setContentView(R.layout.question_three);
    }
    public void next3(View view)
    {
        setContentView(R.layout.question_four);
    }
    public void next4(View view)
    {
        setContentView(R.layout.question_five);
    }
    public void next5(View view)
    {
        setContentView(R.layout.question_six);
    }
    public void next6(View view)
    {
        setContentView(R.layout.question_seven);
    }
    public void next7(View view)
    {
        setContentView(R.layout.question_eight);
    }
    public void next8(View view)
    {
        setContentView(R.layout.question_nine);
    }
    public void next9(View view)
    {
        setContentView(R.layout.question_ten);
    }
    public void next10(View view)
    {
        setContentView(R.layout.question_eleven);
    }
    public void next11(View view)
    {
        setContentView(R.layout.question_twelve);
    }
    public void next12(View view)
    {
        setContentView(R.layout.finish_survey);
    }
}
