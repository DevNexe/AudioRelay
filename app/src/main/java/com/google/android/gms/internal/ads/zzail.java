package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzail {
    public final String a;
    public final int b;
    public final int c;
    public int d;
    public String e;

    public zzail(int i, int i2, int i3) {
        String str;
        if (i != Integer.MIN_VALUE) {
            str = i + "/";
        } else {
            str = "";
        }
        this.a = str;
        this.b = i2;
        this.c = i3;
        this.d = Integer.MIN_VALUE;
        this.e = "";
    }

    public final int zza() {
        int i = this.d;
        if (i != Integer.MIN_VALUE) {
            return i;
        }
        throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
    }

    public final String zzb() {
        if (this.d != Integer.MIN_VALUE) {
            return this.e;
        }
        throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
    }

    public final void zzc() {
        int i = this.d;
        int i2 = i == Integer.MIN_VALUE ? this.b : i + this.c;
        this.d = i2;
        this.e = this.a + i2;
    }
}
