package com.google.android.gms.internal.ads;

import defpackage.Bt7j;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdqk implements zzdds {
    public final zzdoo w;
    public final zzdot x;

    public zzdqk(zzdoo zzdooVar, zzdot zzdotVar) {
        this.w = zzdooVar;
        this.x = zzdotVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdds
    public final void zzl() {
        zzdoo zzdooVar = this.w;
        if (zzdooVar.zzu() == null) {
            return;
        }
        zzcmn zzcmnVarZzq = zzdooVar.zzq();
        zzcmn zzcmnVarZzr = zzdooVar.zzr();
        if (zzcmnVarZzq == null) {
            zzcmnVarZzq = zzcmnVarZzr == null ? null : zzcmnVarZzr;
        }
        if (!this.x.zzd() || zzcmnVarZzq == null) {
            return;
        }
        zzcmnVarZzq.zzd("onSdkImpression", new Bt7j());
    }
}
