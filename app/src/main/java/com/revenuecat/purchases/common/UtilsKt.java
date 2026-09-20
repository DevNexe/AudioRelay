package com.revenuecat.purchases.common;

import android.content.Context;
import android.os.Build;
import android.util.Base64;
import defpackage.up;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final class UtilsKt {
    public static final int MICROS_MULTIPLIER = 1000000;

    public static final Locale getLocale(Context context) {
        return Build.VERSION.SDK_INT >= 24 ? context.getResources().getConfiguration().getLocales().get(0) : context.getResources().getConfiguration().locale;
    }

    public static final String getVersionName(Context context) {
        return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
    }

    public static final String sha1(String str) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
        Charset charset = up.a;
        return new String(Base64.encode(messageDigest.digest(str.getBytes(charset)), 2), charset);
    }

    public static final String sha256(String str) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        Charset charset = up.a;
        return new String(Base64.encode(messageDigest.digest(str.getBytes(charset)), 2), charset);
    }

    public static final String toBCP47(Locale locale) {
        return locale.toLanguageTag();
    }
}
