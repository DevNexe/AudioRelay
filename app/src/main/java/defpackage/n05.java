package defpackage;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import android.view.MotionEvent;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.ads.nonagon.signalgeneration.zzf;
import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.internal.ads.zzapb;
import com.google.android.gms.internal.ads.zzbiy;
import com.google.android.gms.internal.ads.zzcgn;
import com.google.android.gms.internal.ads.zzcha;
import com.google.android.gms.internal.ads.zzdxt;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class n05 {
    public final Context a;
    public final WebView b;
    public final zzapb c;
    public final int d;
    public final zzdxt e;
    public final boolean f;

    public n05(WebView webView, zzapb zzapbVar, zzdxt zzdxtVar) {
        this.b = webView;
        Context context = webView.getContext();
        this.a = context;
        this.c = zzapbVar;
        this.e = zzdxtVar;
        zzbiy.zzc(context);
        this.d = ((Integer) zzay.zzc().zzb(zzbiy.zzhX)).intValue();
        this.f = ((Boolean) zzay.zzc().zzb(zzbiy.zzhY)).booleanValue();
    }

    @JavascriptInterface
    @TargetApi(21)
    public String getClickSignals(String str) {
        try {
            long jB = zzt.zzB().b();
            String strZze = this.c.zzc().zze(this.a, str, this.b);
            if (this.f) {
                zzf.zzc(this.e, null, "csg", new Pair("clat", String.valueOf(zzt.zzB().b() - jB)));
            }
            return strZze;
        } catch (RuntimeException e) {
            zzcgn.zzh("Exception getting click signals. ", e);
            zzt.zzp().zzt(e, "TaggingLibraryJsInterface.getClickSignals");
            return "";
        }
    }

    @JavascriptInterface
    @TargetApi(21)
    public String getClickSignalsWithTimeout(final String str, int i) {
        if (i <= 0) {
            zzcgn.zzg("Invalid timeout for getting click signals. Timeout=" + i);
            return "";
        }
        try {
            return (String) zzcha.zza.zzb(new Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzao
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.zza.getClickSignals(str);
                }
            }).get(Math.min(i, this.d), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            zzcgn.zzh("Exception getting click signals with timeout. ", e);
            zzt.zzp().zzt(e, "TaggingLibraryJsInterface.getClickSignalsWithTimeout");
            return e instanceof TimeoutException ? "17" : "";
        }
    }

    @JavascriptInterface
    @TargetApi(21)
    public String getQueryInfo() {
        zzt.zzq();
        String string = UUID.randomUUID().toString();
        Bundle bundle = new Bundle();
        bundle.putString("query_info_type", "requester_type_6");
        AdFormat adFormat = AdFormat.BANNER;
        AdRequest.Builder builder = new AdRequest.Builder();
        builder.addNetworkExtrasBundle(AdMobAdapter.class, bundle);
        QueryInfo.generate(this.a, adFormat, builder.build(), new gz5(this, string));
        return string;
    }

    @JavascriptInterface
    @TargetApi(21)
    public String getViewSignals() {
        try {
            long jB = zzt.zzB().b();
            String strZzh = this.c.zzc().zzh(this.a, this.b, null);
            if (this.f) {
                zzf.zzc(this.e, null, "vsg", new Pair("vlat", String.valueOf(zzt.zzB().b() - jB)));
            }
            return strZzh;
        } catch (RuntimeException e) {
            zzcgn.zzh("Exception getting view signals. ", e);
            zzt.zzp().zzt(e, "TaggingLibraryJsInterface.getViewSignals");
            return "";
        }
    }

    @JavascriptInterface
    @TargetApi(21)
    public String getViewSignalsWithTimeout(int i) {
        if (i <= 0) {
            zzcgn.zzg("Invalid timeout for getting view signals. Timeout=" + i);
            return "";
        }
        try {
            return (String) zzcha.zza.zzb(new Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzan
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.zza.getViewSignals();
                }
            }).get(Math.min(i, this.d), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            zzcgn.zzh("Exception getting view signals with timeout. ", e);
            zzt.zzp().zzt(e, "TaggingLibraryJsInterface.getViewSignalsWithTimeout");
            return e instanceof TimeoutException ? "17" : "";
        }
    }

    @JavascriptInterface
    @TargetApi(21)
    public void reportTouchEvent(String str) {
        int i;
        try {
            JSONObject jSONObject = new JSONObject(str);
            int i2 = jSONObject.getInt("x");
            int i3 = jSONObject.getInt("y");
            int i4 = jSONObject.getInt("duration_ms");
            float f = (float) jSONObject.getDouble("force");
            int i5 = jSONObject.getInt("type");
            if (i5 == 0) {
                i = 0;
            } else if (i5 == 1) {
                i = 1;
            } else if (i5 != 2) {
                i = i5 != 3 ? -1 : 3;
            } else {
                i = 2;
            }
            try {
                this.c.zzd(MotionEvent.obtain(0L, i4, i, i2, i3, f, 1.0f, 0, 1.0f, 1.0f, 0, 0));
            } catch (RuntimeException e) {
                e = e;
                zzcgn.zzh("Failed to parse the touch string. ", e);
                zzt.zzp().zzt(e, "TaggingLibraryJsInterface.reportTouchEvent");
            } catch (JSONException e2) {
                e = e2;
                zzcgn.zzh("Failed to parse the touch string. ", e);
                zzt.zzp().zzt(e, "TaggingLibraryJsInterface.reportTouchEvent");
            }
        } catch (RuntimeException | JSONException e3) {
            e = e3;
        }
    }
}
