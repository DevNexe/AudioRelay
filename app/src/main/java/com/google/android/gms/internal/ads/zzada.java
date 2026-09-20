package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzada implements zzbp {
    public final String zzf;

    public zzada(String str) {
        this.zzf = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzbp
    public /* synthetic */ void zza(zzbk zzbkVar) {
    }
}
