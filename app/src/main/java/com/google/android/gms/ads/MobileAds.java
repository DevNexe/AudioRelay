package com.google.android.gms.ads;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import android.webkit.WebView;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.internal.client.zzed;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbzr;
import com.google.android.gms.internal.ads.zzcfe;
import com.google.android.gms.internal.ads.zzcgn;
import defpackage.oa3;

/* JADX INFO: loaded from: classes.dex */
public class MobileAds {
    public static final String ERROR_DOMAIN = "com.google.android.gms.ads";

    public static void disableMediationAdapterInitialization(Context context) {
        zzed.zzf().zzl(context);
    }

    public static InitializationStatus getInitializationStatus() {
        return zzed.zzf().zze();
    }

    public static RequestConfiguration getRequestConfiguration() {
        return zzed.zzf().zzc();
    }

    public static VersionInfo getVersion() {
        zzed.zzf();
        String[] strArrSplit = TextUtils.split("21.2.0", "\\.");
        if (strArrSplit.length != 3) {
            return new VersionInfo(0, 0, 0);
        }
        try {
            return new VersionInfo(Integer.parseInt(strArrSplit[0]), Integer.parseInt(strArrSplit[1]), Integer.parseInt(strArrSplit[2]));
        } catch (NumberFormatException unused) {
            return new VersionInfo(0, 0, 0);
        }
    }

    @Deprecated
    public static String getVersionString() {
        return zzed.zzf().zzh();
    }

    public static void initialize(Context context) {
        zzed.zzf().zzm(context, null, null);
    }

    public static void openAdInspector(Context context, OnAdInspectorClosedListener onAdInspectorClosedListener) {
        zzed.zzf().zzp(context, onAdInspectorClosedListener);
    }

    public static void openDebugMenu(Context context, String str) {
        zzed.zzf().zzq(context, str);
    }

    public static void registerRtbAdapter(Class<? extends RtbAdapter> cls) {
        zzed.zzf().zzr(cls);
    }

    public static void registerWebView(WebView webView) {
        zzed.zzf();
        oa3.d("#008 Must be called on the main UI thread.");
        if (webView == null) {
            zzcgn.zzg("The webview to be registered cannot be null.");
            return;
        }
        zzcfe zzcfeVarZza = zzbzr.zza(webView.getContext());
        if (zzcfeVarZza == null) {
            zzcgn.zzj("Internal error, query info generator is null.");
            return;
        }
        try {
            zzcfeVarZza.zzi(new ObjectWrapper(webView));
        } catch (RemoteException e) {
            zzcgn.zzh("", e);
        }
    }

    public static void setAppMuted(boolean z) {
        zzed.zzf().zzs(z);
    }

    public static void setAppVolume(float f) {
        zzed.zzf().zzt(f);
    }

    public static void setRequestConfiguration(RequestConfiguration requestConfiguration) {
        zzed.zzf().zzu(requestConfiguration);
    }

    public static void initialize(Context context, OnInitializationCompleteListener onInitializationCompleteListener) {
        zzed.zzf().zzm(context, null, onInitializationCompleteListener);
    }
}
