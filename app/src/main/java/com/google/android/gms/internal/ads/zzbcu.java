package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbcu {
    public final long a;
    public final String b;
    public final int c;

    public zzbcu(int i, long j, String str) {
        this.a = j;
        this.b = str;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof zzbcu)) {
            zzbcu zzbcuVar = (zzbcu) obj;
            if (zzbcuVar.a == this.a && zzbcuVar.c == this.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (int) this.a;
    }
}
