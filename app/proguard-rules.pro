# Add project specific ProGuard rules here.
# By default, the flags in this file are appended to flags specified
# in /Users/tz_android_gjq/Documents/CA/Developers/Android/Tools/SDK/tools/proguard/proguard-android.txt
# You can edit the include path and order by changing the proguardFiles
# directive in build.gradle.
#
# For more details, see
#   http://developer.android.com/guide/developing/tools/proguard.html

# Add any project specific keep options here:

# If your project uses WebView with JS, uncomment the following
# and specify the fully qualified class name to the JavaScript interface
# class:
#-keepclassmembers class fqcn.of.javascript.interface.for.webview {
#   public *;
#}
-dontskipnonpubliclibraryclasses
-dontnote
-dontusemixedcaseclassnames
-verbose

#model


#js


#umeng
#-keepclassmembers class * {
#   public <init>(org.json.JSONObject);
#}
#-keepclassmembers enum * {
#     public static **[] values();
#     public static ** valueOf(java.lang.String);
# }

# support design
-keep class android.support.design.widget.** { *; }
-keep interface android.support.design.widget.** { *; }
-dontwarn android.support.design.**

# butterknife
-keep class butterknife.** { *; }
-dontwarn butterknife.internal.**
-keep class **$$ViewBinder { *; }
-keep class **$$ViewInjector { *; }

-keepclasseswithmembernames class * {
    @butterknife.* <fields>;
}

-keepclasseswithmembernames class * {
    @butterknife.* <methods>;
}
# retrofit
-dontwarn retrofit.**
-keep class retrofit.** { *; }
-keepattributes *Annotation*,Signature,Exceptions

 -keepclassmembers class rx.internal.util.unsafe.*ArrayQueue*Field* {
     long producerIndex;
     long consumerIndex;
 }
 -keepclassmembers class rx.internal.util.unsafe.BaseLinkedQueueProducerNodeRef {
     long producerNode;
     long consumerNode;
}
# Gson specific classes
-keep class sun.misc.Unsafe { *; }

-dontwarn okio.**
#greendao
-keep class de.greenrobot.dao.** {*;}
-keepclassmembers class * extends de.greenrobot.dao.AbstractDao {
    public static java.lang.String TABLENAME;
}
-keep class **$Properties
# Gson annotations
#-keep class com.google.gson.** { *; }
#-keep class org.apache.http.**{ *;}