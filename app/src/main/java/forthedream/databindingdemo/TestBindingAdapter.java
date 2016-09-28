package forthedream.databindingdemo;

import android.widget.TextView;

/**
 * Created by lierabbit on 2016/9/28.
 */

public class TestBindingAdapter extends MyBindingAdapter
{
    @Override
    public void setText(TextView view, String value)
    {
        view.setText(value + " test");
    }

    @Override
    public void setTextColor(TextView view, int value)
    {
        if (value == view.getContext()
                .getResources()
                .getColor(R.color.textColorDay)) {
            view.setTextColor(view.getContext()
                    .getResources()
                    .getColor(R.color.textColorNight));
        }
    }
}
