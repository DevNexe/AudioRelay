package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzetf implements zzeun {
    public final String a;
    public final String b;

    public zzetf(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // com.google.android.gms.internal.ads.zzeun
    public final int zza() {
        return 31;
    }

    @Override // com.google.android.gms.internal.ads.zzeun
    public final zzfyx zzb() {
        return zzfyo.zzi(new zzetg(this.a, this.b));
    }
}
