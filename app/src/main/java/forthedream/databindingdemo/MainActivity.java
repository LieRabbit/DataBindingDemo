package forthedream.databindingdemo;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (Test.flag)
        {
            DataBindingUtil.setDefaultComponent(new ProductionComponent());
        } else
        {
            DataBindingUtil.setDefaultComponent(new TestComponent());
        }
    }

    public void onClick(View v)
    {
        Intent intent;
        switch (v.getId())
        {
            case R.id.btn_simple:
                intent = new Intent(MainActivity.this,SimpleActivity.class);
                startActivity(intent);
                break;
            case R.id.btn_list:
                intent = new Intent(MainActivity.this,ListActivity.class);
                startActivity(intent);
                break;
            case R.id.btn_two_way_binding:
                intent = new Intent(MainActivity.this,TwoWayActivity.class);
                startActivity(intent);
                break;
            case R.id.btn_lambda:
                intent = new Intent(MainActivity.this,LambdaActivity.class);
                startActivity(intent);
                break;
            case R.id.btn_expression:
                intent = new Intent(MainActivity.this, ExpressionActivity.class);
                startActivity(intent);
                break;
            case R.id.btn_animation:
                intent = new Intent(MainActivity.this, AnimationActivity.class);
                startActivity(intent);
                break;
            case R.id.btn_component:
                intent = new Intent(MainActivity.this, ComponentActivity.class);
                startActivity(intent);
                break;
        }
    }
}
