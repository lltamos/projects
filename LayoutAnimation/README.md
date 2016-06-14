# llsmp
布局动画的例子，给listview和recycleview 添加了布局动画

注代码添加：
#code

ScaleAnimation sa=new ScalaAnimation(0,1,0,1);
sa.setDuration(300);
LayoutAnimationController loc=new LayoutAnimationController(sa,0.5f);
listview.setLayoutAnimation（loc）

代码添加

	#xml
   <ListView
        android:layoutAnimation="@anim/layoutanim"
        android:id="@+id/parent"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        />
		
	-----------------   ------------
<?xml version="1.0" encoding="utf-8"?>
<layoutAnimation xmlns:android="http://schemas.android.com/apk/res/android"
    android:delay="30%"
    android:animationOrder="random"
    android:animation="@anim/slide_right"/>
	
	
	------slide_right------
<?xml version="1.0" encoding="utf-8"?>
<set xmlns:android="http://schemas.android.com/apk/res/android"
    android:interpolator="@android:anim/accelerate_interpolator">
    <translate
        android:duration="3000"
        android:fromXDelta="100%p"
        android:toXDelta="0%p" />
</set>

###
    //我们给需要加布局动画的viewgroup android:animateLayoutChanges=”true“
    //这样当布局变化的时候就可以显示动画了。  亲测leanerlayout才行