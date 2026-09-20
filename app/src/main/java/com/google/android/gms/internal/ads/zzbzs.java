package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.query.UpdateImpressionUrlsCallback;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class zzbzs extends zzbzo {
    public final /* synthetic */ UpdateImpressionUrlsCallback w;

    public zzbzs(UpdateImpressionUrlsCallback updateImpressionUrlsCallback) {
        this.w = updateImpressionUrlsCallback;
    }

    @Override // com.google.android.gms.internal.ads.zzbzp
    public final void zze(String str) {
        this.w.onFailure(str);
    }

    @Override // com.google.android.gms.internal.ads.zzbzp
    public final void zzf(List list) {
        this.w.onSuccess(list);
    }
}
