package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzall extends zzguc {
    static {
        zzguj.zzb(zzall.class);
    }

    public zzall(zzgud zzgudVar, zzalk zzalkVar) {
        zzf(zzgudVar, zzgudVar.zzc(), zzalkVar);
    }

    @Override // com.google.android.gms.internal.ads.zzguc, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // com.google.android.gms.internal.ads.zzguc
    public final String toString() {
        String string = this.x.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 7);
        sb.append("model(");
        sb.append(string);
        sb.append(")");
        return sb.toString();
    }
}
