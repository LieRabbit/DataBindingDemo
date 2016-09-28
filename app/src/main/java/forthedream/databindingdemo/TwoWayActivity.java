package forthedream.databindingdemo;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import forthedream.databindingdemo.databinding.ActivityTwoWayBinding;

public class TwoWayActivity extends AppCompatActivity
{
    ActivityTwoWayBinding mBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this,R.layout.activity_two_way);
        mBinding.setModel(new FormModel("xyy1076","123456"));
    }
}
