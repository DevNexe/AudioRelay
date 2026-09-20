package com.google.android.gms.internal.ads;

import defpackage.ot6;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgri {
    public static final zzgri f = new zzgri(0, new int[0], new Object[0], false);
    public int a;
    public int[] b;
    public Object[] c;
    public int d;
    public boolean e;

    public zzgri() {
        this(0, new int[8], new Object[8], true);
    }

    public zzgri(int i, int[] iArr, Object[] objArr, boolean z) {
        this.d = -1;
        this.a = i;
        this.b = iArr;
        this.c = objArr;
        this.e = z;
    }

    public static zzgri a() {
        return new zzgri(0, new int[8], new Object[8], true);
    }

    public static zzgri zzc() {
        return f;
    }

    public final void b(int i, Object obj) {
        if (!this.e) {
            throw new UnsupportedOperationException();
        }
        int i2 = this.a;
        int[] iArr = this.b;
        if (i2 == iArr.length) {
            int i3 = i2 + (i2 < 4 ? 8 : i2 >> 1);
            this.b = Arrays.copyOf(iArr, i3);
            this.c = Arrays.copyOf(this.c, i3);
        }
        int[] iArr2 = this.b;
        int i4 = this.a;
        iArr2[i4] = i;
        this.c[i4] = obj;
        this.a = i4 + 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzgri)) {
            return false;
        }
        zzgri zzgriVar = (zzgri) obj;
        int i = this.a;
        if (i == zzgriVar.a) {
            int[] iArr = this.b;
            int[] iArr2 = zzgriVar.b;
            for (int i2 = 0; i2 < i; i2++) {
                if (iArr[i2] == iArr2[i2]) {
                }
            }
            Object[] objArr = this.c;
            Object[] objArr2 = zzgriVar.c;
            int i3 = this.a;
            for (int i4 = 0; i4 < i3; i4++) {
                if (objArr[i4].equals(objArr2[i4])) {
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = this.a;
        int i2 = (i + 527) * 31;
        int[] iArr = this.b;
        int iHashCode = 17;
        int i3 = 17;
        for (int i4 = 0; i4 < i; i4++) {
            i3 = (i3 * 31) + iArr[i4];
        }
        int i5 = (i2 + i3) * 31;
        Object[] objArr = this.c;
        int i6 = this.a;
        for (int i7 = 0; i7 < i6; i7++) {
            iHashCode = (iHashCode * 31) + objArr[i7].hashCode();
        }
        return i5 + iHashCode;
    }

    public final int zza() {
        int iZzE;
        int iZzF;
        int iZzE2;
        int i = this.d;
        if (i != -1) {
            return i;
        }
        int iZzE3 = 0;
        for (int i2 = 0; i2 < this.a; i2++) {
            int i3 = this.b[i2];
            int i4 = i3 >>> 3;
            int i5 = i3 & 7;
            if (i5 != 0) {
                if (i5 != 1) {
                    if (i5 == 2) {
                        zzgnf zzgnfVar = (zzgnf) this.c[i2];
                        int iZzE4 = zzgnu.zzE(i4 << 3);
                        int iZzd = zzgnfVar.zzd();
                        iZzE3 = zzgnu.zzE(iZzd) + iZzd + iZzE4 + iZzE3;
                    } else if (i5 == 3) {
                        int iZzD = zzgnu.zzD(i4);
                        iZzE = iZzD + iZzD;
                        iZzF = ((zzgri) this.c[i2]).zza();
                    } else {
                        if (i5 != 5) {
                            throw new IllegalStateException(zzgoz.a());
                        }
                        ((Integer) this.c[i2]).intValue();
                        iZzE2 = zzgnu.zzE(i4 << 3) + 4;
                    }
                } else {
                    ((Long) this.c[i2]).longValue();
                    iZzE2 = zzgnu.zzE(i4 << 3) + 8;
                }
                iZzE3 = iZzE2 + iZzE3;
            } else {
                long jLongValue = ((Long) this.c[i2]).longValue();
                iZzE = zzgnu.zzE(i4 << 3);
                iZzF = zzgnu.zzF(jLongValue);
            }
            iZzE3 = iZzF + iZzE + iZzE3;
        }
        this.d = iZzE3;
        return iZzE3;
    }

    public final int zzb() {
        int i = this.d;
        if (i != -1) {
            return i;
        }
        int iZzE = 0;
        for (int i2 = 0; i2 < this.a; i2++) {
            int i3 = this.b[i2];
            zzgnf zzgnfVar = (zzgnf) this.c[i2];
            int iZzE2 = zzgnu.zzE(8);
            int iZzd = zzgnfVar.zzd();
            iZzE += zzgnu.zzE(iZzd) + iZzd + zzgnu.zzE(24) + zzgnu.zzE(i3 >>> 3) + zzgnu.zzE(16) + iZzE2 + iZzE2;
        }
        this.d = iZzE;
        return iZzE;
    }

    public final void zzf() {
        this.e = false;
    }

    public final void zzi(ot6 ot6Var) {
        if (this.a != 0) {
            for (int i = 0; i < this.a; i++) {
                int i2 = this.b[i];
                Object obj = this.c[i];
                int i3 = i2 >>> 3;
                int i4 = i2 & 7;
                if (i4 == 0) {
                    ot6Var.n(i3, ((Long) obj).longValue());
                } else if (i4 == 1) {
                    ot6Var.j(i3, ((Long) obj).longValue());
                } else if (i4 == 2) {
                    ot6Var.f(i3, (zzgnf) obj);
                } else if (i4 == 3) {
                    ot6Var.a.zzq(i3, 3);
                    ((zzgri) obj).zzi(ot6Var);
                    ot6Var.a.zzq(i3, 4);
                } else {
                    if (i4 != 5) {
                        throw new RuntimeException(zzgoz.a());
                    }
                    ot6Var.i(i3, ((Integer) obj).intValue());
                }
            }
        }
    }
}
