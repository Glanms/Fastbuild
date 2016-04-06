package com.gjsk.fastbuild.data.net.rest.utils;

import android.Manifest;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;

import com.gjsk.fastbuild.utils.common.LogHelper;
import com.gjsk.fastbuild.utils.common.PreferencesUtils;

import java.util.Locale;

/**
 * Created by Glanms on 16/4/5.
 * 请求通用参数
 */
public class CommonParam {
    private String device_id;
    private String language;
    private int version_code = 0;// 版本
    private String device_platform = "android";// 设备平台
    private String os_version = null;// 操作系统版本
    private String device_type = null;// 设备名称
    private String app_name = null;// 应用
    private String distribution_channel = null;// 分发渠道

    public String getAndroid_id() {
        return android_id;
    }

    public void setAndroid_id(String android_id) {
        this.android_id = android_id;
    }

    public String getDevice_type() {
        return device_type;
    }

    public void setDevice_type(String device_type) {
        this.device_type = device_type;
    }

    public String getApp_name() {
        return app_name;
    }

    public void setApp_name(String app_name) {
        this.app_name = app_name;
    }

    public String getDistribution_channel() {
        return distribution_channel;
    }

    public void setDistribution_channel(String distribution_channel) {
        this.distribution_channel = distribution_channel;
    }

    private String android_id = null;
    private String mac = null;
    private String imei = null;
    private int auth_type = 0;
    private long user_id = 0;

    public long getUser_id() {
        return user_id;
    }

    public void setUser_id(long user_id) {
        this.user_id = user_id;
    }

    public int getAuth_type() {
        return auth_type;
    }

    public void setAuth_type(int auth_type) {
        this.auth_type = auth_type;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getDevice_id() {
        return device_id;
    }

    public void setDevice_id(String device_id) {
        this.device_id = device_id;
    }

    public String getOs_version() {
        return os_version;
    }

    public void setOs_version(String os_version) {
        this.os_version = os_version;
    }

    public int getVersion_code() {
        return version_code;
    }

    public void setVersion_code(int version_code) {
        this.version_code = version_code;
    }

    public String getDevice_platform() {
        return device_platform;
    }

    public void setDevice_platform(String device_platform) {
        this.device_platform = device_platform;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public CommonParam(Context context) {
//        String deviceId = PreferencesUtils.getString(context, context.getString(R.string.preference_deviceId));
        String deviceId = PreferencesUtils.getString(context,"device_id");

        if (!TextUtils.isEmpty(deviceId)) {
            setDevice_id(deviceId);
        }
        android_id = Settings.Secure.getString(context.getContentResolver(), Settings.Secure.ANDROID_ID);
        distribution_channel = getDistribution_channel(context);
        LogHelper.d("user", distribution_channel);
        device_type = getDeviceType();
        app_name = "Gundem";
        Locale locale = context.getResources().getConfiguration().locale;
        this.language = locale.getLanguage();

        this.version_code = getVersionCode(context);
        this.device_platform = "android";
        this.os_version = getOsVersion();
        WifiManager wm = (WifiManager) context.getSystemService(Context.WIFI_SERVICE);
        this.mac = wm.getConnectionInfo().getMacAddress();

        boolean canGetIemi = false;
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            int result = context.checkSelfPermission(Manifest.permission.READ_PHONE_STATE);
            if (result == PackageManager.PERMISSION_GRANTED) {
                canGetIemi = true;
            }
        } else {
            canGetIemi = true;
        }

        if (canGetIemi) {
            TelephonyManager tm = (TelephonyManager) context
                    .getSystemService(Context.TELEPHONY_SERVICE);
            this.imei = tm.getDeviceId();// String
        }
    }

    private String getDistribution_channel(Context context) {
        ApplicationInfo appInfo = null;
        try {
            appInfo = context.getPackageManager()
                    .getApplicationInfo(context.getPackageName(),
                            PackageManager.GET_META_DATA);
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
        return appInfo.metaData.getString("UMENG_CHANNEL");
    }

    /**
     * 获取os版本
     *
     * @return String
     */
    private String getOsVersion() {
        return Build.VERSION.RELEASE;

    }

    /**
     * 获取设备名称
     *
     * @return String
     */
    private String getDeviceType() {
        return Build.MODEL;
    }

    /**
     * 获取版本�
     *
     * @return int
     */
    private int getVersionCode(Context context) {
        int verionCode = 0;
        PackageInfo pi;
        try {
            pi = context.getPackageManager().getPackageInfo(
                    context.getPackageName(), 0);
            verionCode = pi.versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
        return verionCode;
    }
}
