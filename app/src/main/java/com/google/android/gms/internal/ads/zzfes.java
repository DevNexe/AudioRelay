package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import java.util.HashSet;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfes implements zzddb {

    @GuardedBy("this")
    public final HashSet w = new HashSet();
    public final Context x;
    public final zzcga y;

    public zzfes(Context context, zzcga zzcgaVar) {
        this.x = context;
        this.y = zzcgaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzddb
    public final synchronized void zza(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (zzeVar.zza != 3) {
            this.y.zzi(this.w);
        }
    }

    public final Bundle zzb() {
        return this.y.zzk(this.x, this);
    }

    public final synchronized void zzc(HashSet hashSet) {
        this.w.clear();
        this.w.addAll(hashSet);
    }
}
