package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zztl implements zzss {
    public final zzeu w;
    public int x;
    public final zztk y;
    public final zzwj z;

    public zztl(zzeu zzeuVar, zztk zztkVar, byte[] bArr) {
        new zzpf();
        zzwj zzwjVar = new zzwj(-1);
        this.w = zzeuVar;
        this.y = zztkVar;
        this.z = zzwjVar;
        this.x = 1048576;
    }

    public final zztl zza(int i) {
        this.x = i;
        return this;
    }

    public final zztn zzb(zzbg zzbgVar) {
        zzbgVar.zzd.getClass();
        return new zztn(zzbgVar, this.w, this.y, zzpo.zza, this.z, this.x);
    }
}
