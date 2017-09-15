package com.xiaoxing.glideutil;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;


/**
 * 描述：
 * 作者：xiaoxing on 17/5/5 09:26
 * 邮箱：2235445233@qq.com
 */
public class GlideUtil {

    /**
     * 用Glide加载图片
     *
     * @param context
     * @param imgPath
     * @param view
     */
    public static void displayImg(Context context, String imgPath, View view, int defaultImg) {
        Glide.with(context).load(imgPath).placeholder(defaultImg).error(defaultImg).into((ImageView) view);

    }

    public static void displayImg(Context context, int imgPath, View view, int defaultImg) {
        Glide.with(context).load(imgPath).placeholder(defaultImg).error(defaultImg).into((ImageView) view);
    }

}
