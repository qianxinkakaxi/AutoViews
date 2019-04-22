## Autoviews接入说明



### 1.引入maven库

```
implementation 'com.xports.autoviews:autoviewslib:1.0.1'
```

### 2.在Application的onCreate()方法中声明高保真的宽和高

```
AutoUtil.with(this)
        .setDesignHeight(667)
        .setDesignWidth(375)
        .init();
```

### 3.两个额外的属性

```
isReveal boolean true 界面横屏的时候需在每个autoviews里面设置，用于指导当前view是按照横屏的比例去拉伸的 竖屏的时候不需要设置，默认为false

autoSize boolean false 在autoviews里面设置，表示当前的viewgroup和其直接child不需要拉伸，默认是true，需要拉伸

这两个属性最好自己手动用一下看看效果，这两个属性是不向下传递的
```

### 4.xml中引入

以下面界面为例子：

![image](https://note.youdao.com/yws/public/resource/afd28bc9070ee53ab13635e38c301306/xmlnote/9B6281D1D1F847079C17343EFCE0C72E/902)



在xml文件中，（暂不考虑布局优化），使用autoviews这样编码（注意：控件只有被autoviews包裹才能去做等比拉伸）：

```
<?xml version="1.0" encoding="utf-8"?>
<cn.xports.autoviews.AutoRelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="#F5F7FA"
    tools:context="com.cnsunning.myapplication.SecondActivity">

    <cn.xports.autoviews.AutoLinearLayoutCompat
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:background="#FFFFFF"
        android:orientation="vertical"
        app:divider="@drawable/line"
        app:showDividers="middle">

        <cn.xports.autoviews.AutoRelativeLayout
            android:layout_width="match_parent"
            android:layout_height="43px">

            <ImageView
                android:layout_width="10px"
                android:layout_height="18px"
                android:layout_alignParentLeft="true"
                android:layout_centerVertical="true"
                android:layout_marginLeft="14px"
                android:scaleType="centerCrop"
                android:src="@mipmap/icon_back" />

            <TextView
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:layout_centerInParent="true"
                android:text="填写银行卡信息"
                android:textColor="#333333"
                android:textSize="18px" />

        </cn.xports.autoviews.AutoRelativeLayout>

        <cn.xports.autoviews.AutoRelativeLayout
            android:layout_width="match_parent"
            android:layout_height="64px">

            <ImageView
                android:layout_width="25px"
                android:layout_height="25px"
                android:layout_alignParentLeft="true"
                android:layout_centerVertical="true"
                android:layout_marginLeft="14px"
                android:scaleType="centerInside"
                android:src="@mipmap/merchant" />

            <TextView
                android:layout_width="wrap_content"
                android:layout_height="16px"
                android:layout_marginLeft="53px"
                android:layout_marginTop="14px"
                android:includeFontPadding="false"
                android:text="工商银行"
                android:textColor="#333333"
                android:textSize="16px" />

            <TextView
                android:layout_width="wrap_content"
                android:layout_height="13px"
                android:layout_alignParentBottom="true"
                android:layout_marginLeft="53px"
                android:layout_marginBottom="14px"
                android:includeFontPadding="false"
                android:text="存储卡 尾号8899"
                android:textColor="#999999"
                android:textSize="13px" />

        </cn.xports.autoviews.AutoRelativeLayout>

        <cn.xports.autoviews.AutoRelativeLayout
            android:layout_width="match_parent"
            android:layout_height="30px">


            <TextView
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:layout_centerVertical="true"
                android:layout_marginLeft="53px"
                android:text="优惠"
                android:textColor="#333333"
                android:textSize="13px" />

            <TextView
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:layout_centerVertical="true"
                android:layout_marginLeft="83px"
                android:text="2.00 元"
                android:textColor="#ffba95"
                android:textSize="13px" />

            <TextView
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:layout_alignParentRight="true"
                android:layout_centerVertical="true"
                android:layout_marginRight="16px"
                android:text="详情"
                android:textColor="#247CF0"
                android:textSize="13px" />


        </cn.xports.autoviews.AutoRelativeLayout>

    </cn.xports.autoviews.AutoLinearLayoutCompat>

    <cn.xports.autoviews.AutoLinearLayoutCompat
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_marginTop="152px"
        android:background="#FFFFFF"
        android:orientation="vertical"
        android:paddingLeft="16px"
        app:divider="@drawable/line"
        app:showDividers="middle">

        <cn.xports.autoviews.AutoRelativeLayout
            android:layout_width="match_parent"
            android:layout_height="48px">

            <TextView
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:layout_centerVertical="true"
                android:text="卡有效期"
                android:textColor="#333333"
                android:textSize="15px" />

            <TextView
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:layout_centerVertical="true"
                android:layout_marginLeft="70px"
                android:text="月份/年份"
                android:textColor="#cacaca"
                android:textSize="15px" />

            <ImageView
                android:layout_width="15px"
                android:layout_height="15px"
                android:layout_alignParentRight="true"
                android:layout_centerVertical="true"
                android:layout_marginRight="16px"
                android:scaleType="centerInside"
                android:src="@mipmap/attention" />

        </cn.xports.autoviews.AutoRelativeLayout>

        <cn.xports.autoviews.AutoRelativeLayout
            android:layout_width="match_parent"
            android:layout_height="48px">

            <TextView
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:layout_centerVertical="true"

                android:text="卡有效期"
                android:textColor="#333333"
                android:textSize="15px" />

            <TextView
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:layout_centerVertical="true"
                android:layout_marginLeft="70px"
                android:text="月份/年份"
                android:textColor="#cacaca"
                android:textSize="15px" />

            <ImageView
                android:layout_width="15px"
                android:layout_height="15px"
                android:layout_alignParentRight="true"
                android:layout_centerVertical="true"
                android:layout_marginRight="16px"
                android:scaleType="centerInside"
                android:src="@mipmap/attention" />

        </cn.xports.autoviews.AutoRelativeLayout>

        <cn.xports.autoviews.AutoRelativeLayout
            android:layout_width="match_parent"
            android:layout_height="48px">

            <TextView
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:layout_centerVertical="true"
                android:text="卡有效期"
                android:textColor="#333333"
                android:textSize="15px" />

            <TextView
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:layout_centerVertical="true"
                android:layout_marginLeft="70px"
                android:text="月份/年份"
                android:textColor="#cacaca"
                android:textSize="15px" />

            <ImageView
                android:layout_width="15px"
                android:layout_height="15px"
                android:layout_alignParentRight="true"
                android:layout_centerVertical="true"
                android:layout_marginRight="16px"
                android:scaleType="centerInside"
                android:src="@mipmap/attention" />

        </cn.xports.autoviews.AutoRelativeLayout>

        <cn.xports.autoviews.AutoRelativeLayout
            android:layout_width="match_parent"
            android:layout_height="48px">

            <TextView
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:layout_centerVertical="true"
                android:text="卡有效期"
                android:textColor="#333333"
                android:textSize="15px" />

            <TextView
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:layout_centerVertical="true"
                android:layout_marginLeft="70px"
                android:text="月份/年份"
                android:textColor="#cacaca"
                android:textSize="15px" />

            <ImageView
                android:layout_width="15px"
                android:layout_height="15px"
                android:layout_alignParentRight="true"
                android:layout_centerVertical="true"
                android:layout_marginRight="16px"
                android:scaleType="centerInside"
                android:src="@mipmap/attention" />

        </cn.xports.autoviews.AutoRelativeLayout>
    </cn.xports.autoviews.AutoLinearLayoutCompat>

    <cn.xports.autoviews.AutoRelativeLayout
        android:layout_width="match_parent"
        android:layout_height="48px"
        android:layout_marginTop="360px"
        android:background="#FFFFFF">

        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_centerVertical="true"
            android:layout_marginLeft="16px"
            android:text="卡有效期"
            android:textColor="#333333"
            android:textSize="15px" />

        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_centerVertical="true"
            android:layout_marginLeft="86px"
            android:text="月份/年份"
            android:textColor="#cacaca"
            android:textSize="15px" />

        <ImageView
            android:layout_width="15px"
            android:layout_height="15px"
            android:layout_alignParentRight="true"
            android:layout_centerVertical="true"
            android:layout_marginRight="16px"
            android:scaleType="centerInside"
            android:src="@mipmap/attention" />

    </cn.xports.autoviews.AutoRelativeLayout>


    <cn.xports.autoviews.AutoRelativeLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_marginTop="424px">

        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_centerVertical="true"
            android:layout_marginLeft="16px"
            android:includeFontPadding="false"
            android:text="同意"
            android:textColor="#666666"
            android:textSize="14px" />

        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_centerVertical="true"
            android:layout_marginLeft="40px"
            android:includeFontPadding="false"
            android:text="《用户协议》"
            android:textColor="#247cf0"
            android:textSize="14px" />
    </cn.xports.autoviews.AutoRelativeLayout>

    <Button
        android:layout_width="343px"
        android:layout_height="44px"
        android:layout_centerHorizontal="true"
        android:layout_gravity="center_horizontal"
        android:layout_marginTop="458px"
        android:background="#0080ff"
        android:text="确认开通并支付"
        android:textColor="#ffffff"
        android:textSize="17px" />


    <TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginLeft="16px"
        android:layout_marginTop="514px"
        android:includeFontPadding="false"
        android:text="同意并开通账户（可选）"
        android:textColor="#999999"
        android:textSize="13px" />

    <TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_alignParentBottom="true"
        android:layout_marginBottom="20px"
        android:layout_centerHorizontal="true"
        android:includeFontPadding="false"
        android:text="信息加密处理，仅用于验证"
        android:textColor="#999999"
        android:textSize="13px" />

</cn.xports.autoviews.AutoRelativeLayout>
```

上面的代码中,可以看到我们的宽度和高度直接用高保真测量的px实现，不需要换算成dp，下面在看界面在真机上面最终的结果：

320*480

![image](https://note.youdao.com/yws/public/resource/bd24ff9b39c238c024a1dd1a87a9f03d/xmlnote/E4CD3A86C91D434C9027973BF196AE75/928)


480*854

![image](https://note.youdao.com/yws/public/resource/bd24ff9b39c238c024a1dd1a87a9f03d/xmlnote/3E681EFC7C01408CB8502D6C2C88638F/925)


768*1280

![image](https://note.youdao.com/yws/public/resource/bd24ff9b39c238c024a1dd1a87a9f03d/xmlnote/F329C7E867124C5AABA1C36541835916/924)

1080*1920

![image](https://note.youdao.com/yws/public/resource/bd24ff9b39c238c024a1dd1a87a9f03d/xmlnote/69F508DBA51341EC88CDB18C42D66397/926)

1440*2560

![image](https://note.youdao.com/yws/public/resource/bd24ff9b39c238c024a1dd1a87a9f03d/xmlnote/EA2B39F185F0406EA72B28A34F8E4BCE/927)

### 5.注意点

a.由于文字绘制的时候有baseline之类的，可能导致textview有点位置不一致，在需要的时候可以android:includeFontPadding="false"属性，来限制。

b.只有avtoviews里面的控价，才会对其做等比拉伸，所以在使用的时候，如果想做等比拉伸，外面需要包一层avtoviews控件

c.关于图片：建议用矢量图代替位图，保证拉伸的时候不失真

c.未完成：暂时没有对shape之类的做处理，效果影响不大(后期有时间的话可能会优化)

### 6.原理分析

#### a.Android Xml布局文件的解析流程

 
1.setContentView(R.layout.activity_second);
 
2.AppCompatDelegateImplV9的onCreate方法，首先会生成decorView，从 contentParent.removeAllViews()可以看出来contentParent不为空，再调用LayoutInflater.from(mContext).inflate(resId, contentParent);进行解析

```
@Override
public void setContentView(int resId) {
    ensureSubDecor();
    ViewGroup contentParent = (ViewGroup) mSubDecor.findViewById(android.R.id.content);
    contentParent.removeAllViews();
    LayoutInflater.from(mContext).inflate(resId, contentParent);
    mOriginalWindowCallback.onContentChanged();
}
```

3.执行LayoutInflate的inflate方法，此时root!=null为true

```
public View inflate(@LayoutRes int resource, @Nullable ViewGroup root) {
    return inflate(resource, root, root != null);
}
```

4.获取Xml解析工具，然后调用inflate(parser, root, attachToRoot)进行解析

```
public View inflate(@LayoutRes int resource, @Nullable ViewGroup root, boolean attachToRoot) {
    final Resources res = getContext().getResources();
    if (DEBUG) {
        Log.d(TAG, "INFLATING from resource: \"" + res.getResourceName(resource) + "\" ("
                + Integer.toHexString(resource) + ")");
    }

    final XmlResourceParser parser = res.getLayout(resource);
    try {
        return inflate(parser, root, attachToRoot);
    } finally {
        parser.close();
    }
}
```

5.暂时不考虑merge的情况，会执行到下面的代码块

```
{
    // Temp is the root view that was found in the xml
    // 这串代码会生成我们自己xml对应的的rootview
    final View temp = createViewFromTag(root, name, inflaterContext, attrs);

    ViewGroup.LayoutParams params = null;

    if (root != null) {
        if (DEBUG) {
            System.out.println("Creating params from root: " +
                    root);
        }
        // Create layout params that match root, if supplied
        // 这个是调用viewgroup的generateLayoutParams方法，给child设置layoutParams
        // 此时，attachToRoot为true，所以不会执行 temp.setLayoutParams(params);
        params = root.generateLayoutParams(attrs);
        if (!attachToRoot) {
            // Set the layout params for temp if we are not
            // attaching. (If we are, we use addView, below)
            temp.setLayoutParams(params);
        }
    }

    if (DEBUG) {
        System.out.println("-----> start inflating children");
    }

    // Inflate all children under temp against its context.
    // 接着去遍历叶子节点
    rInflateChildren(parser, temp, attrs, true);

    if (DEBUG) {
        System.out.println("-----> done inflating children");
    }

    // We are supposed to attach all the views we found (int temp)
    // to root. Do that now.
    if (root != null && attachToRoot) {
        root.addView(temp, params);
    }

    // Decide whether to return the root that was passed in or the
    // top view found in xml.
    if (root == null || !attachToRoot) {
        result = temp;
    }
}
final void rInflateChildren(XmlPullParser parser, View parent, AttributeSet attrs,
        boolean finishInflate) throws XmlPullParserException, IOException {
    rInflate(parser, parent, parent.getContext(), attrs, finishInflate);
}
void rInflate(XmlPullParser parser, View parent, Context context,
        AttributeSet attrs, boolean finishInflate) throws XmlPullParserException, IOException {

    final int depth = parser.getDepth();
    int type;
    boolean pendingRequestFocus = false;

    while (((type = parser.next()) != XmlPullParser.END_TAG ||
            parser.getDepth() > depth) && type != XmlPullParser.END_DOCUMENT) {

        if (type != XmlPullParser.START_TAG) {
            continue;
        }

        final String name = parser.getName();

        if (TAG_REQUEST_FOCUS.equals(name)) {
            pendingRequestFocus = true;
            consumeChildElements(parser);
        } else if (TAG_TAG.equals(name)) {
            parseViewTag(parser, parent, attrs);
        } else if (TAG_INCLUDE.equals(name)) {
            if (parser.getDepth() == 0) {
                throw new InflateException("<include /> cannot be the root element");
            }
            parseInclude(parser, context, parent, attrs);
        } else if (TAG_MERGE.equals(name)) {
            throw new InflateException("<merge /> must be the root element");
        } else {
            // 遍历的时候会执行到这个分支里面来，在这个分支，会再次遍历子viewTree，
            // 这个代码可以看出，最先加到viewGroup里面的是最底下的叶子节点，
            // 有点类似于树的后序遍历,
            // 先将叶子节点和对应的layoutParams组合在一起，add到对应的viewGroup中
            // 叶子节点的layoutParams是有父节点的generateLayoutParams去生成的
            final View view = createViewFromTag(parent, name, context, attrs);
            final ViewGroup viewGroup = (ViewGroup) parent;
            final ViewGroup.LayoutParams params = viewGroup.generateLayoutParams(attrs);
            rInflateChildren(parser, view, attrs, true);
            viewGroup.addView(view, params);
        }
    }

    if (pendingRequestFocus) {
        parent.restoreDefaultFocus();
    }

    if (finishInflate) {
        parent.onFinishInflate();
    }
}
```

#### b.view的测量流程

view的绘制是从rootViewImpl里面调用performTraversals()函数开始的

    private void performTraversals() {
            // cache mView since it is used so much below...
            ......
            int childWidthMeasureSpec = getRootMeasureSpec(mWidth, lp.width);
            int childHeightMeasureSpec = getRootMeasureSpec(mHeight, lp.height);
           ......
            // Ask host how big it wants to be
            performMeasure(childWidthMeasureSpec, childHeightMeasureSpec);
            ......
            performLayout(lp, mWidth, mHeight);
            ......
            performDraw();
        }

Measure部分

MeasureSpec是一个32位的int值，前2位代表specMode，后30位代表specSize

specMode有3种：

            /**
             * Measure specification mode: The parent has not imposed any constraint
             * on the child. It can be whatever size it wants.
             */
            public static final int UNSPECIFIED = 0 << MODE_SHIFT;
    
            /**
             * Measure specification mode: The parent has determined an exact size
             * for the child. The child is going to be given those bounds regardless
             * of how big it wants to be.
             */
            public static final int EXACTLY     = 1 << MODE_SHIFT;
    
            /**
             * Measure specification mode: The child can be as large as it wants up
             * to the specified size.
             */
            public static final int AT_MOST     = 2 << MODE_SHIFT;

UPSPECIFIED : 父容器对于子容器没有任何限制,子容器想要多大就多大

EXACTLY: 父容器已经为子容器设置了尺寸,子容器应当服从这些边界,不论子容器想要多大的空间。

AT_MOST：子容器可以是声明大小内的任意大小

对于decorView来说：

    private void performTraversals() {
            // cache mView since it is used so much below...
            ......
            //这部分是测量devorView的
            int childWidthMeasureSpec = getRootMeasureSpec(mWidth, lp.width);
            int childHeightMeasureSpec = getRootMeasureSpec(mHeight, lp.height);
            ......
           
        }

    private static int getRootMeasureSpec(int windowSize, int rootDimension) {
            int measureSpec;
            switch (rootDimension) {
    
            case ViewGroup.LayoutParams.MATCH_PARENT:
                // Window can't resize. Force root view to be windowSize.
                measureSpec = MeasureSpec.makeMeasureSpec(windowSize, MeasureSpec.EXACTLY);
                break;
            case ViewGroup.LayoutParams.WRAP_CONTENT:
                // Window can resize. Set max size for root view.
                measureSpec = MeasureSpec.makeMeasureSpec(windowSize, MeasureSpec.AT_MOST);
                break;
            default:
                // Window wants to be an exact size. Force root view to be that size.
                measureSpec = MeasureSpec.makeMeasureSpec(rootDimension, MeasureSpec.EXACTLY);
                break;
            }
            return measureSpec;
        }

最后执行performMeasure，里面decorView调用自身的measure方法

    private void performMeasure(int childWidthMeasureSpec, int childHeightMeasureSpec) {
            if (mView == null) {
                return;
            }
            Trace.traceBegin(Trace.TRACE_TAG_VIEW, "measure");
            try {
                mView.measure(childWidthMeasureSpec, childHeightMeasureSpec);
            } finally {
                Trace.traceEnd(Trace.TRACE_TAG_VIEW);
            }
        }

decorview是一个linearlayout，会执行到view里面的measure方法

    public final void measure(int widthMeasureSpec, int heightMeasureSpec) {
            boolean optical = isLayoutModeOptical(this);
            if (optical != isLayoutModeOptical(mParent)) {
                Insets insets = getOpticalInsets();
                int oWidth  = insets.left + insets.right;
                int oHeight = insets.top  + insets.bottom;
                widthMeasureSpec  = MeasureSpec.adjust(widthMeasureSpec,  optical ? -oWidth  : oWidth);
                heightMeasureSpec = MeasureSpec.adjust(heightMeasureSpec, optical ? -oHeight : oHeight);
            }
    
            // Suppress sign extension for the low bytes
            long key = (long) widthMeasureSpec << 32 | (long) heightMeasureSpec & 0xffffffffL;
            if (mMeasureCache == null) mMeasureCache = new LongSparseLongArray(2);
    
            final boolean forceLayout = (mPrivateFlags & PFLAG_FORCE_LAYOUT) == PFLAG_FORCE_LAYOUT;
    
            // Optimize layout by avoiding an extra EXACTLY pass when the view is
            // already measured as the correct size. In API 23 and below, this
            // extra pass is required to make LinearLayout re-distribute weight.
            final boolean specChanged = widthMeasureSpec != mOldWidthMeasureSpec
                    || heightMeasureSpec != mOldHeightMeasureSpec;
            final boolean isSpecExactly = MeasureSpec.getMode(widthMeasureSpec) == MeasureSpec.EXACTLY
                    && MeasureSpec.getMode(heightMeasureSpec) == MeasureSpec.EXACTLY;
            final boolean matchesSpecSize = getMeasuredWidth() == MeasureSpec.getSize(widthMeasureSpec)
                    && getMeasuredHeight() == MeasureSpec.getSize(heightMeasureSpec);
            final boolean needsLayout = specChanged
                    && (sAlwaysRemeasureExactly || !isSpecExactly || !matchesSpecSize);
    
            if (forceLayout || needsLayout) {
                // first clears the measured dimension flag
                mPrivateFlags &= ~PFLAG_MEASURED_DIMENSION_SET;
    
                resolveRtlPropertiesIfNeeded();
    
                int cacheIndex = forceLayout ? -1 : mMeasureCache.indexOfKey(key);
                if (cacheIndex < 0 || sIgnoreMeasureCache) {
                    // measure ourselves, this should set the measured dimension flag back
                    onMeasure(widthMeasureSpec, heightMeasureSpec);
                    mPrivateFlags3 &= ~PFLAG3_MEASURE_NEEDED_BEFORE_LAYOUT;
                } else {
                    long value = mMeasureCache.valueAt(cacheIndex);
                    // Casting a long to int drops the high 32 bits, no mask needed
                    setMeasuredDimensionRaw((int) (value >> 32), (int) value);
                    mPrivateFlags3 |= PFLAG3_MEASURE_NEEDED_BEFORE_LAYOUT;
                }
    
                // flag not set, setMeasuredDimension() was not invoked, we raise
                // an exception to warn the developer
                if ((mPrivateFlags & PFLAG_MEASURED_DIMENSION_SET) != PFLAG_MEASURED_DIMENSION_SET) {
                    throw new IllegalStateException("View with id " + getId() + ": "
                            + getClass().getName() + "#onMeasure() did not set the"
                            + " measured dimension by calling"
                            + " setMeasuredDimension()");
                }
    
                mPrivateFlags |= PFLAG_LAYOUT_REQUIRED;
            }
    
            mOldWidthMeasureSpec = widthMeasureSpec;
            mOldHeightMeasureSpec = heightMeasureSpec;
    
            mMeasureCache.put(key, ((long) mMeasuredWidth) << 32 |
                    (long) mMeasuredHeight & 0xffffffffL); // suppress sign extension
        }

mearure是一个final方法，不可以重写,真正的 测量实在onMeasure里面实现的，所以这样传递下来之后，就走到了linearLayout(viewgruop)的onMeasure里 在viewgrop里的onMeasure方法里面又会走到measureChildWithMargin

    protected void measureChildWithMargins(View child,
                int parentWidthMeasureSpec, int widthUsed,
                int parentHeightMeasureSpec, int heightUsed) {
            final MarginLayoutParams lp = (MarginLayoutParams) child.getLayoutParams();
    
            final int childWidthMeasureSpec = getChildMeasureSpec(parentWidthMeasureSpec,
                    mPaddingLeft + mPaddingRight + lp.leftMargin + lp.rightMargin
                            + widthUsed, lp.width);
            final int childHeightMeasureSpec = getChildMeasureSpec(parentHeightMeasureSpec,
                    mPaddingTop + mPaddingBottom + lp.topMargin + lp.bottomMargin
                            + heightUsed, lp.height);
    
            child.measure(childWidthMeasureSpec, childHeightMeasureSpec);
        }

这个会生成child的widthMeasureSpec和heightMeasureSpec

    public static int getChildMeasureSpec(int spec, int padding, int childDimension) {
            int specMode = MeasureSpec.getMode(spec);
            int specSize = MeasureSpec.getSize(spec);
    
            int size = Math.max(0, specSize - padding);
    
            int resultSize = 0;
            int resultMode = 0;
    
            switch (specMode) {
            // Parent has imposed an exact size on us
            case MeasureSpec.EXACTLY:
                if (childDimension >= 0) {
                    resultSize = childDimension;
                    resultMode = MeasureSpec.EXACTLY;
                } else if (childDimension == LayoutParams.MATCH_PARENT) {
                    // Child wants to be our size. So be it.
                    resultSize = size;
                    resultMode = MeasureSpec.EXACTLY;
                } else if (childDimension == LayoutParams.WRAP_CONTENT) {
                    // Child wants to determine its own size. It can't be
                    // bigger than us.
                    resultSize = size;
                    resultMode = MeasureSpec.AT_MOST;
                }
                break;
    
            // Parent has imposed a maximum size on us
            case MeasureSpec.AT_MOST:
                if (childDimension >= 0) {
                    // Child wants a specific size... so be it
                    resultSize = childDimension;
                    resultMode = MeasureSpec.EXACTLY;
                } else if (childDimension == LayoutParams.MATCH_PARENT) {
                    // Child wants to be our size, but our size is not fixed.
                    // Constrain child to not be bigger than us.
                    resultSize = size;
                    resultMode = MeasureSpec.AT_MOST;
                } else if (childDimension == LayoutParams.WRAP_CONTENT) {
                    // Child wants to determine its own size. It can't be
                    // bigger than us.
                    resultSize = size;
                    resultMode = MeasureSpec.AT_MOST;
                }
                break;
    
            // Parent asked to see how big we want to be
            case MeasureSpec.UNSPECIFIED:
                if (childDimension >= 0) {
                    // Child wants a specific size... let him have it
                    resultSize = childDimension;
                    resultMode = MeasureSpec.EXACTLY;
                } else if (childDimension == LayoutParams.MATCH_PARENT) {
                    // Child wants to be our size... find out how big it should
                    // be
                    resultSize = View.sUseZeroUnspecifiedMeasureSpec ? 0 : size;
                    resultMode = MeasureSpec.UNSPECIFIED;
                } else if (childDimension == LayoutParams.WRAP_CONTENT) {
                    // Child wants to determine its own size.... find out how
                    // big it should be
                    resultSize = View.sUseZeroUnspecifiedMeasureSpec ? 0 : size;
                    resultMode = MeasureSpec.UNSPECIFIED;
                }
                break;
            }
            //noinspection ResourceType
            return MeasureSpec.makeMeasureSpec(resultSize, resultMode);
        }

这个可以看出，子view的高度由两个方面决定，一个是父view的规格，另外一个是它自身的layoutParams



另外在viewgroup的提供了marginChildren方法，其实这个和上面的measureChildWithMargins方法是一样的效果，withMargins只是去除了margin的数值

    protected void measureChildren(int widthMeasureSpec, int heightMeasureSpec) {
            final int size = mChildrenCount;
            final View[] children = mChildren;
            for (int i = 0; i < size; ++i) {
                final View child = children[i];
                if ((child.mViewFlags & VISIBILITY_MASK) != GONE) {
                    measureChild(child, widthMeasureSpec, heightMeasureSpec);
                }
            }
        }

里面调用

    protected void measureChild(View child, int parentWidthMeasureSpec,
                int parentHeightMeasureSpec) {
            final LayoutParams lp = child.getLayoutParams();
    
            final int childWidthMeasureSpec = getChildMeasureSpec(parentWidthMeasureSpec,
                    mPaddingLeft + mPaddingRight, lp.width);
            final int childHeightMeasureSpec = getChildMeasureSpec(parentHeightMeasureSpec,
                    mPaddingTop + mPaddingBottom, lp.height);
    
            child.measure(childWidthMeasureSpec, childHeightMeasureSpec);
        }

如果childView也是一个viewgroup，又会重新循环viewgroup的measure过程，如果child只是普通的view的话就是执行到view的measure过程，最后就是执行到view的onMeasure代码里面

    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
            setMeasuredDimension(getDefaultSize(getSuggestedMinimumWidth(), widthMeasureSpec),
                                 getDefaultSize(getSuggestedMinimumHeight(), heightMeasureSpec));
        }

getSuggestedMinimumWidth方法，这个方法手下判断view有没有设置backgroundf，如果没有的话就返回xml Android：minWidth的值，如果有的话就去background的宽度和minWidth的大值，getSuggestedMinimumHeight依次类推

    protected int getSuggestedMinimumWidth() {
            return (mBackground == null) ? mMinWidth : max(mMinWidth, mBackground.getMinimumWidth());
        }

getDefaultSize是决定view的真正的宽度高度，UNSPECIFIED一般可以混略不计，（有一个特殊的地方在scrollview里面，它传给子view的specMode就是UNSPECIFIED，这是导致listview在scrollview里面只显示一行的关键）,MeasureSpec.AT_MOST对应xml里面的是wrap_content，MeasureSpec.EXACTLY对应的是xml里面我们写的固定的值和match_parent，例如：20dp,20px之类的， 代码里可以看出自定义view的时候如果不重写onMeasure并设置wrap_content的大小，那实际上就和match_parent一样的性质，解决方法就是onMeasure方法里面对spacMode为MeasureSpec.AT_MOST做特殊的处理

    public static int getDefaultSize(int size, int measureSpec) {
            int result = size;
            int specMode = MeasureSpec.getMode(measureSpec);
            int specSize = MeasureSpec.getSize(measureSpec);
    
            switch (specMode) {
            case MeasureSpec.UNSPECIFIED:
                result = size;
                break;
            case MeasureSpec.AT_MOST:
            case MeasureSpec.EXACTLY:
                result = specSize;
                break;
            }
            return result;
        }

最后调用setMeasuredDimension设置view的测量的尺寸

![image](https://note.youdao.com/yws/public/resource/bd24ff9b39c238c024a1dd1a87a9f03d/xmlnote/85B68CE241FA4165ABA1903DAFFB5717/932)

通过上面的分析我们可以看出一个view的宽度和高度是由父类的给其的spec和自身的layoutParams决定的（不考虑UNSPECIFIED情况，因为一般不会用到）有一个特殊的地方在于，如果一个view的width或者height的specMode是exactly并且我们xml写的固定值，那么这个view的最终测量的值，如果我们人为不甘于的话，就是我们写在xml里的值（linearLayout的权重另外一说）



