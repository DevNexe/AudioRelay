package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.util.Log;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfog {
    public final byte[] a;
    public int b;
    public int c;
    public final /* synthetic */ zzfoh d;

    public /* synthetic */ zzfog(zzfoh zzfohVar, byte[] bArr) {
        this.d = zzfohVar;
        this.a = bArr;
    }

    public final zzfog zza(int i) {
        this.c = i;
        return this;
    }

    public final zzfog zzb(int i) {
        this.b = i;
        return this;
    }

    public final synchronized void zzc() {
        try {
            zzfoh zzfohVar = this.d;
            if (zzfohVar.b) {
                zzfohVar.a.zzj(this.a);
                this.d.a.zzi(this.b);
                this.d.a.zzg(this.c);
                this.d.a.zzh(null);
                this.d.a.zzf();
            }
        } catch (RemoteException e) {
            Log.d("GASS", "Clearcut log failed", e);
        }
    }
}
