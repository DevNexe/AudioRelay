package com.google.android.gms.ads.query;

import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.internal.ads.zzbzw;
import com.google.android.gms.internal.ads.zzbzx;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class ReportingInfo {
    public final zzbzx a;

    public static final class Builder {
        public final zzbzw a;

        public Builder(View view) {
            zzbzw zzbzwVar = new zzbzw();
            this.a = zzbzwVar;
            zzbzwVar.zzb(view);
        }

        public ReportingInfo build() {
            return new ReportingInfo(this);
        }

        public Builder setAssetViews(Map<String, View> map) {
            this.a.zzc(map);
            return this;
        }
    }

    public /* synthetic */ ReportingInfo(Builder builder) {
        this.a = new zzbzx(builder.a);
    }

    public void recordClick(List<Uri> list) {
        this.a.zza(list);
    }

    public void recordImpression(List<Uri> list) {
        this.a.zzb(list);
    }

    public void reportTouchEvent(MotionEvent motionEvent) {
        this.a.zzc(motionEvent);
    }

    public void updateClickUrl(Uri uri, UpdateClickUrlCallback updateClickUrlCallback) {
        this.a.zzd(uri, updateClickUrlCallback);
    }

    public void updateImpressionUrls(List<Uri> list, UpdateImpressionUrlsCallback updateImpressionUrlsCallback) {
        this.a.zze(list, updateImpressionUrlsCallback);
    }
}
