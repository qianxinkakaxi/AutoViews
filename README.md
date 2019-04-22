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




480*854



768*1280


1080*1920




1440*2560


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
未完待续。。。。。。



