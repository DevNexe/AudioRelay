package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class zzazl {
    public int b;
    public int c;
    public int d = 0;
    public zzazf[] e = new zzazf[100];
    public final zzazf[] a = new zzazf[1];

    public zzazl(boolean z, int i) {
    }

    public final synchronized int zza() {
        return this.c * 65536;
    }

    public final synchronized zzazf zzb() {
        zzazf zzazfVar;
        this.c++;
        int i = this.d;
        if (i > 0) {
            zzazf[] zzazfVarArr = this.e;
            int i2 = i - 1;
            this.d = i2;
            zzazfVar = zzazfVarArr[i2];
            zzazfVarArr[i2] = null;
        } else {
            zzazfVar = new zzazf(new byte[65536], 0);
        }
        return zzazfVar;
    }

    public final synchronized void zzc(zzazf zzazfVar) {
        zzazf[] zzazfVarArr = this.a;
        zzazfVarArr[0] = zzazfVar;
        zzd(zzazfVarArr);
    }

    public final synchronized void zzd(zzazf[] zzazfVarArr) {
        int length = this.d + zzazfVarArr.length;
        zzazf[] zzazfVarArr2 = this.e;
        int length2 = zzazfVarArr2.length;
        if (length >= length2) {
            this.e = (zzazf[]) Arrays.copyOf(zzazfVarArr2, Math.max(length2 + length2, length));
        }
        for (zzazf zzazfVar : zzazfVarArr) {
            byte[] bArr = zzazfVar.zza;
            zzazf[] zzazfVarArr3 = this.e;
            int i = this.d;
            this.d = i + 1;
            zzazfVarArr3[i] = zzazfVar;
        }
        this.c -= zzazfVarArr.length;
        notifyAll();
    }

    public final synchronized void zze() {
        zzf(0);
    }

    public final synchronized void zzf(int i) {
        int i2 = this.b;
        this.b = i;
        if (i < i2) {
            zzg();
        }
    }

    public final synchronized void zzg() {
        int iMax = Math.max(0, zzban.zzd(this.b, 65536) - this.c);
        int i = this.d;
        if (iMax >= i) {
            return;
        }
        Arrays.fill(this.e, iMax, i, (Object) null);
        this.d = iMax;
    }
}
