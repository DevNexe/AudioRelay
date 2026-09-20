package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgej {
    public final zzfzs a;
    public final zzfzy b;

    public zzgej(zzfzs zzfzsVar) {
        this.a = zzfzsVar;
        this.b = null;
    }

    public zzgej(zzfzy zzfzyVar) {
        this.a = null;
        this.b = zzfzyVar;
    }

    public final byte[] zza(byte[] bArr, byte[] bArr2) {
        zzfzs zzfzsVar = this.a;
        return zzfzsVar != null ? zzfzsVar.zzb(bArr, bArr2) : this.b.zza(bArr, bArr2);
    }
}
