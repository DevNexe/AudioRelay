package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbeq {
    public final byte[] a;
    public int b;
    public final /* synthetic */ zzber c;

    public /* synthetic */ zzbeq(zzber zzberVar, byte[] bArr) {
        this.c = zzberVar;
        this.a = bArr;
    }

    public final synchronized void a() {
        try {
            zzber zzberVar = this.c;
            if (zzberVar.b) {
                zzberVar.a.zzj(this.a);
                this.c.a.zzi(0);
                this.c.a.zzg(this.b);
                this.c.a.zzh(null);
                this.c.a.zzf();
            }
        } catch (RemoteException e) {
            zzcgn.zzf("Clearcut log failed", e);
        }
    }

    public final zzbeq zza(int i) {
        this.b = i;
        return this;
    }

    public final synchronized void zzc() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zziA)).booleanValue()) {
            this.c.c.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbeo
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.a();
                }
            });
        } else {
            a();
        }
    }
}
