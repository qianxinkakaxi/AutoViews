package cn.xports.autoviews;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import cn.xports.autoviews.util.AutoUtil;
import cn.xports.autoviews.util.WindowSizeUtil;


/**
 * Created by qianxin on 2017/8/10.
 */

public class AutoFrameLayout extends FrameLayout {

    private double widthRadius;

    private double heightRadius;


    public AutoFrameLayout(Context context) {
        super(context);
        initWidthAndHeightRadius(context, null);
    }

    private void initWidthAndHeightRadius(Context context, AttributeSet attrs) {

        float width = WindowSizeUtil.getScreenWidth(context);

        float height = WindowSizeUtil.getScreenHeight(context);

        boolean isReveal = false;
        if (attrs != null) {
            TypedArray a =
                    context.obtainStyledAttributes(attrs, R.styleable.AutoViews);
            isReveal = a.getBoolean(R.styleable.AutoViews_isReveal, false);
            a.recycle();
        }
        if (isReveal) {
            widthRadius = width / AutoUtil.getDesignHeight();
            heightRadius = height / AutoUtil.getDesignWidth();
        } else {
            widthRadius = width / AutoUtil.getDesignWidth();
            heightRadius = height / AutoUtil.getDesignHeight();
        }
    }


    public AutoFrameLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
        initWidthAndHeightRadius(context, attrs);
    }

    public AutoFrameLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initWidthAndHeightRadius(context, attrs);

    }


    @Override
    public void addView(View child, int index, ViewGroup.LayoutParams params) {


        LayoutParams lp = (LayoutParams) params;
        if (!lp.autoSize) {
            super.addView(child, index, params);
            return;
        }
        lp.leftMargin = (int) Math.ceil(lp.leftMargin * widthRadius);
        lp.rightMargin = (int) Math.ceil(lp.rightMargin * widthRadius);
        lp.topMargin = (int) Math.ceil(lp.topMargin * heightRadius);
        lp.bottomMargin = (int) Math.ceil(lp.bottomMargin * heightRadius);

        //去除特殊情况处理match_parent,wrap_content
        if (lp.height > 0) {
            lp.height = (int) Math.ceil(lp.height * heightRadius);
        }
        if (lp.width > 0) {
            lp.width = (int) Math.ceil(lp.width * widthRadius);
        }
        child.setPadding((int) Math.ceil(child.getPaddingLeft() * widthRadius),
                (int) Math.ceil(child.getPaddingTop() * heightRadius),
                (int) Math.ceil(child.getPaddingRight() * widthRadius),
                (int) Math.ceil(child.getPaddingBottom() * heightRadius));

        if (child instanceof TextView) {
            //TODO  字的大小有点搞了，真心不知道按宽的比例还是高的比例 rn也遇到同样的问题
            TextView textView = (TextView) child;
            textView.setTextSize(TypedValue.COMPLEX_UNIT_PX,
                    (float) (textView.getTextSize() * (widthRadius > heightRadius ? heightRadius : widthRadius)));
            textView.setCompoundDrawablePadding((int)
                    Math.ceil(textView.getCompoundDrawablePadding() * widthRadius));
        }
        super.addView(child, index, params);
    }

    @Override
    protected FrameLayout.LayoutParams generateLayoutParams(ViewGroup.LayoutParams p) {
        return new LayoutParams(p);
    }

    @Override
    protected FrameLayout.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
    }

    @Override
    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attrs) {
        return new LayoutParams(getContext(), attrs);
    }

    public static class LayoutParams extends FrameLayout.LayoutParams {

        public boolean autoSize = true;

        /**
         * {@inheritDoc}
         */
        public LayoutParams(Context c, AttributeSet attrs) {
            super(c, attrs);
            TypedArray a =
                    c.obtainStyledAttributes(attrs, R.styleable.AutoViews);
            autoSize = a.getBoolean(R.styleable.AutoViews_autoSize, true);
            a.recycle();
        }

        public LayoutParams(int w, int h) {
            super(w, h);
        }

        /**
         * {@inheritDoc}
         */
        public LayoutParams(ViewGroup.LayoutParams source) {
            super(source);
        }

        /**
         * {@inheritDoc}
         */
        public LayoutParams(MarginLayoutParams source) {
            super(source);
        }
    }
}
