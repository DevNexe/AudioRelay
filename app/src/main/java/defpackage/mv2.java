package defpackage;

import com.unity3d.services.core.request.metrics.MetricCommonTags;

/* JADX INFO: loaded from: classes.dex */
public enum mv2 {
    UNKNOWN("unknown"),
    WINDOWS("windows"),
    LINUX("linux"),
    MAC_OS("mac_os"),
    IOS("ios"),
    ANDROID(MetricCommonTags.METRIC_COMMON_TAG_PLATFORM_ANDROID),
    ANDROID_TV("android_tv");

    public final String w;

    mv2(String str) {
        this.w = str;
    }
}
