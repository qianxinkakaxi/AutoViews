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

![image](https://note.youdao.com/yws/public/resource/afd28bc9070ee53ab13635e38c301306/xmlnote/2BF7626E58624CDBBC2793C0099EB4D8/886)



480*854

![image](https://note.youdao.com/yws/public/resource/afd28bc9070ee53ab13635e38c301306/xmlnote/81091AB771EE4F4BB6267C34C483E95C/887)

768*1280

![image](https://note.youdao.com/yws/public/resource/afd28bc9070ee53ab13635e38c301306/xmlnote/07E805861469409EB298183178B1C6A7/884)

1080*1920

![image](https://note.youdao.com/yws/public/resource/afd28bc9070ee53ab13635e38c301306/xmlnote/AEBBC80E2EEF4B7684D9F88F777B1DD8/888)



1440*2560

![image](https://note.youdao.com/yws/public/resource/afd28bc9070ee53ab13635e38c301306/xmlnote/E3CC6D13411742A3BFFFE5EDDB8315F2/885)

### 5.注意点

a.由于文字绘制的时候有baseline之类的，可能导致textview有点位置不一致，在需要的时候可以android:includeFontPadding="false"属性，来限制。

b.只有avtoviews里面的控价，才会对其做等比拉伸，所以在使用的时候，如果想做等比拉伸，外面需要包一层avtoviews控件

c.关于图片：建议用矢量图代替位图，保证拉伸的时候不失真

c.未完成：暂时没有对shape之类的做处理，效果影响不大(后期有时间的话可能会优化)



