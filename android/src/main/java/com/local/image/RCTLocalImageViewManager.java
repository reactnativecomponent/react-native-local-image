package com.local.image;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import android.widget.ImageView;

import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.annotations.ReactProp;

/**
 * Created by dowin on 2017/7/7.
 */

public class RCTLocalImageViewManager extends SimpleViewManager<ImageView> {

    final static String RCT_CLASS = "RNLocalImage";

    @Override
    public String getName() {
        return RCT_CLASS;
    }

    @Override
    protected ImageView createViewInstance(ThemedReactContext reactContext) {
        ImageView imageView = new ImageView(reactContext);
//        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        return imageView;
    }

    @ReactProp(name = "path")
    public void setPath(ImageView view, String path) {
        Log.i(RCT_CLASS, "" + path);
        Bitmap bm = BitmapFactory.decodeFile(path);
        view.setImageBitmap(bm);
    }
}
