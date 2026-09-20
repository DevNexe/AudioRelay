package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcea implements zzbbm {
    public final Context w;
    public final Object x;
    public final String y;
    public boolean z;

    public zzcea(Context context, String str) {
        this.w = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.y = str;
        this.z = false;
        this.x = new Object();
    }

    public final String zza() {
        return this.y;
    }

    public final void zzb(boolean z) {
        if (com.google.android.gms.ads.internal.zzt.zzo().zzu(this.w)) {
            synchronized (this.x) {
                if (this.z == z) {
                    return;
                }
                this.z = z;
                if (TextUtils.isEmpty(this.y)) {
                    return;
                }
                if (this.z) {
                    com.google.android.gms.ads.internal.zzt.zzo().zzh(this.w, this.y);
                } else {
                    com.google.android.gms.ads.internal.zzt.zzo().zzi(this.w, this.y);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbbm
    public final void zzc(zzbbl zzbblVar) {
        zzb(zzbblVar.zzj);
    }
}
