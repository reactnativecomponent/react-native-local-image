package com.local.image;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.Log;
import android.widget.ImageView;

import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.local.image.media.BitmapDecoder;
import com.local.image.media.ScreenUtil;

import java.io.File;

/**
 * Created by dowin on 2017/7/7.
 */

public class RCTLocalImageViewManager extends SimpleViewManager<ImageView> {

    final static String RCT_CLASS = "RNLocalImage";
    private BitmapFactory.Options opt = new BitmapFactory.Options();

    @Override
    public String getName() {
        return RCT_CLASS;
    }

    @Override
    protected ImageView createViewInstance(ThemedReactContext reactContext) {
        ImageView imageView = new ImageView(reactContext);
//        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        ScreenUtil.init(reactContext);
        return imageView;
    }

    @ReactProp(name = "path")
    public void setPath(ImageView view, String path) {
        Log.i(RCT_CLASS, "" + path);

        if (TextUtils.isEmpty(path) || !new File(path).exists()) {
            return;
        }
        Bitmap bm = BitmapDecoder.decodeSampledForDisplay(path);
        view.setImageBitmap(bm);
    }
}
