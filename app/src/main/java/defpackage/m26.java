package defpackage;

import com.facebook.ads.AdError;
import com.google.android.gms.internal.ads.zzass;
import com.google.android.gms.internal.ads.zzavd;
import com.google.android.gms.internal.ads.zzazy;

/* JADX INFO: loaded from: classes3.dex */
public final class m26 {
    public int i;
    public int j;
    public int k;
    public int l;
    public zzass q;
    public int a = AdError.NETWORK_ERROR_CODE;
    public int[] b = new int[AdError.NETWORK_ERROR_CODE];
    public long[] c = new long[AdError.NETWORK_ERROR_CODE];
    public long[] f = new long[AdError.NETWORK_ERROR_CODE];
    public int[] e = new int[AdError.NETWORK_ERROR_CODE];
    public int[] d = new int[AdError.NETWORK_ERROR_CODE];
    public zzavd[] g = new zzavd[AdError.NETWORK_ERROR_CODE];
    public zzass[] h = new zzass[AdError.NETWORK_ERROR_CODE];
    public long m = Long.MIN_VALUE;
    public long n = Long.MIN_VALUE;
    public boolean p = true;
    public boolean o = true;

    public final synchronized void a(long j, int i, long j2, int i2, zzavd zzavdVar) {
        if (this.o) {
            if ((i & 1) == 0) {
                return;
            } else {
                this.o = false;
            }
        }
        zzazy.zze(!this.p);
        synchronized (this) {
            this.n = Math.max(this.n, j);
            long[] jArr = this.f;
            int i3 = this.l;
            jArr[i3] = j;
            long[] jArr2 = this.c;
            jArr2[i3] = j2;
            this.d[i3] = i2;
            this.e[i3] = i;
            this.g[i3] = zzavdVar;
            this.h[i3] = this.q;
            this.b[i3] = 0;
            int i4 = this.i + 1;
            this.i = i4;
            int i5 = this.a;
            if (i4 != i5) {
                int i6 = i3 + 1;
                this.l = i6;
                if (i6 == i5) {
                    this.l = 0;
                    return;
                }
                return;
            }
            int i7 = i5 + AdError.NETWORK_ERROR_CODE;
            int[] iArr = new int[i7];
            long[] jArr3 = new long[i7];
            long[] jArr4 = new long[i7];
            int[] iArr2 = new int[i7];
            int[] iArr3 = new int[i7];
            zzavd[] zzavdVarArr = new zzavd[i7];
            zzass[] zzassVarArr = new zzass[i7];
            int i8 = this.k;
            int i9 = i5 - i8;
            System.arraycopy(jArr2, i8, jArr3, 0, i9);
            System.arraycopy(this.f, this.k, jArr4, 0, i9);
            System.arraycopy(this.e, this.k, iArr2, 0, i9);
            System.arraycopy(this.d, this.k, iArr3, 0, i9);
            System.arraycopy(this.g, this.k, zzavdVarArr, 0, i9);
            System.arraycopy(this.h, this.k, zzassVarArr, 0, i9);
            System.arraycopy(this.b, this.k, iArr, 0, i9);
            int i10 = this.k;
            System.arraycopy(this.c, 0, jArr3, i9, i10);
            System.arraycopy(this.f, 0, jArr4, i9, i10);
            System.arraycopy(this.e, 0, iArr2, i9, i10);
            System.arraycopy(this.d, 0, iArr3, i9, i10);
            System.arraycopy(this.g, 0, zzavdVarArr, i9, i10);
            System.arraycopy(this.h, 0, zzassVarArr, i9, i10);
            System.arraycopy(this.b, 0, iArr, i9, i10);
            this.c = jArr3;
            this.f = jArr4;
            this.e = iArr2;
            this.d = iArr3;
            this.g = zzavdVarArr;
            this.h = zzassVarArr;
            this.b = iArr;
            this.k = 0;
            int i11 = this.a;
            this.l = i11;
            this.i = i11;
            this.a = i7;
        }
    }

    public final synchronized boolean b() {
        return this.i != 0;
    }
}
