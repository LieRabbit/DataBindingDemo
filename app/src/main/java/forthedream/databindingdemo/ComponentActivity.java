package forthedream.databindingdemo;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import forthedream.databindingdemo.databinding.ActivityComponentBinding;

public class ComponentActivity extends AppCompatActivity
{
    ActivityComponentBinding mBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this,R.layout.activity_component);
        mBinding.setPresenter(new Presenter());
    }

    public class Presenter
    {
        public void onClickInjectDemo(View view)
        {
            if (Test.flag)
            {
                DataBindingUtil.setDefaultComponent(new ProductionComponent());
            } else
            {
                DataBindingUtil.setDefaultComponent(new TestComponent());
            }
            Test.flag = !Test.flag;
            recreate();
        }
    }
}
