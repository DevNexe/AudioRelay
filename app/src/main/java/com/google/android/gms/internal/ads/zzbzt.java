package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.android.gms.ads.query.UpdateClickUrlCallback;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class zzbzt extends zzbzo {
    public final /* synthetic */ UpdateClickUrlCallback w;

    public zzbzt(UpdateClickUrlCallback updateClickUrlCallback) {
        this.w = updateClickUrlCallback;
    }

    @Override // com.google.android.gms.internal.ads.zzbzp
    public final void zze(String str) {
        this.w.onFailure(str);
    }

    @Override // com.google.android.gms.internal.ads.zzbzp
    public final void zzf(List list) {
        this.w.onSuccess((Uri) list.get(0));
    }
}
