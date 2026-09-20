package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzeg;
import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;

/* JADX INFO: loaded from: classes3.dex */
final class zzbzq extends zzcfa {
    public final /* synthetic */ QueryInfoGenerationCallback w;

    public zzbzq(QueryInfoGenerationCallback queryInfoGenerationCallback) {
        this.w = queryInfoGenerationCallback;
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final void zzb(String str) {
        this.w.onFailure(str);
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final void zzc(String str, String str2, Bundle bundle) {
        this.w.onSuccess(new QueryInfo(new zzeg(str, bundle, str2)));
    }
}
