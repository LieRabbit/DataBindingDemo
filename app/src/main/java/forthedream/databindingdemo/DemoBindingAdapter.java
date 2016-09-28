package forthedream.databindingdemo;

import android.databinding.BindingAdapter;
import android.net.Uri;

import com.facebook.drawee.view.SimpleDraweeView;

/**
 * Created by lierabbit on 2016/9/27.
 */

public class DemoBindingAdapter
{
    @BindingAdapter({"app:imageUri"})
    public static void frescoLoadImage(SimpleDraweeView simpleDraweeView, String url)
    {
        simpleDraweeView.setImageURI(Uri.parse(url));
    }
}
