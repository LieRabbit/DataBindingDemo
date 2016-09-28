package forthedream.databindingdemo;

import android.databinding.BindingAdapter;
import android.widget.TextView;

/**
 * Created by lierabbit on 2016/9/28.
 */

public abstract class MyBindingAdapter
{
    @BindingAdapter("android:text")
    public abstract void setText(TextView view, String value);

    @BindingAdapter("android:textColor")
    public abstract void setTextColor(TextView view, int value);
}
