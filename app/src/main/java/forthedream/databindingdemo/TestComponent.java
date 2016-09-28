package forthedream.databindingdemo;

import android.databinding.DataBindingComponent;

/**
 * Created by lierabbit on 2016/9/28.
 */

public class TestComponent implements android.databinding.DataBindingComponent
{

    private MyBindingAdapter mAdapter = new TestBindingAdapter();

    @Override
    public MyBindingAdapter getMyBindingAdapter()
    {
        return mAdapter;
    }
}