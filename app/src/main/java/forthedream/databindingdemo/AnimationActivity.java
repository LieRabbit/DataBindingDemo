package forthedream.databindingdemo;

import android.databinding.DataBindingUtil;
import android.databinding.OnRebindCallback;
import android.databinding.ViewDataBinding;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.transition.TransitionManager;
import android.view.View;
import android.view.ViewGroup;

import forthedream.databindingdemo.databinding.ActivityAnimationBinding;

public class AnimationActivity extends AppCompatActivity
{
    ActivityAnimationBinding mBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this,R.layout.activity_animation);
        mBinding.setPresenter(new Presenter());
        mBinding.addOnRebindCallback(new OnRebindCallback()
        {
            @RequiresApi(api = Build.VERSION_CODES.KITKAT)
            @Override
            public boolean onPreBind(ViewDataBinding binding)
            {
                ViewGroup viewGroup = (ViewGroup) binding.getRoot();
                TransitionManager.beginDelayedTransition(viewGroup);
                return true;
            }
        });
    }

    public class Presenter
    {
        public void onCheckedChanged(View btnView,boolean isChecked)
        {
            mBinding.setShowImage(isChecked);
        }
    }
}
