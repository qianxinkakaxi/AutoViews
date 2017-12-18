package cn.xports.autoviews.util;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by qianxin on 2017/12/14.
 */

public class AutoUtil {

    private static Context context;
    private Builder builder;
    private static int designWidth;
    private static int designHeight;

    public AutoUtil(Builder builder) {
        this.builder = builder;
    }

    public static Builder with(Context context) {
        return new Builder(context);
    }

    private void init() {
        if (builder.context == null)
            throw new IllegalArgumentException("context对象不能为空");
        if (builder.designWidth <= 0)
            throw new IllegalArgumentException("高保真宽度必须大于0");
        if (builder.designHeight <= 0)
            throw new IllegalArgumentException("高保真高度必须大于0");

        this.context = context;
        this.designHeight = designHeight;
        this.designWidth = designWidth;
        SharedPreferences sp = context.getSharedPreferences("auto_view_specification", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();
        editor.putInt("designHeight", designHeight);
        editor.putInt("designWidth", designWidth);
        editor.commit();
    }

    public static int getDesignWidth() {
        if (designWidth == 0) {
            SharedPreferences sp = context.getSharedPreferences("auto_view_specification", Context.MODE_PRIVATE);
            designWidth = sp.getInt("designWidth", 0);
        }
        return designWidth;
    }

    public static int getDesignHeight() {
        if (designHeight == 0) {
            SharedPreferences sp = context.getSharedPreferences("auto_view_specification", Context.MODE_PRIVATE);
            designHeight = sp.getInt("designHeight", 0);
        }
        return designHeight;
    }

    public static class Builder {
        private Context context;
        private int designWidth;
        private int designHeight;

        private Builder(Context context) {
            this.context = context;
        }

        private AutoUtil build() {
            return new AutoUtil(this);
        }


        public Builder setDesignWidth(int designWidth) {
            this.designWidth = designWidth;
            return this;
        }


        public Builder setDesignHeight(int designHeight) {
            this.designHeight = designHeight;
            return this;
        }

        public void init() {
            build().init();
        }
    }

}
