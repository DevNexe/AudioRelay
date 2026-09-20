package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzffk implements zzffi {
    public final String a;

    public zzffk(String str) {
        this.a = str;
    }

    @Override // com.google.android.gms.internal.ads.zzffi
    public final boolean equals(Object obj) {
        if (obj instanceof zzffk) {
            return this.a.equals(((zzffk) obj).a);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzffi
    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a;
    }
}
