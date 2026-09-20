package defpackage;

import com.google.android.gms.internal.measurement.zzkn;
import com.google.android.gms.internal.measurement.zzko;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class n47 {
    public static final n47 f = new n47(0, new int[0], new Object[0], false);
    public int a;
    public int[] b;
    public Object[] c;
    public int d;
    public boolean e;

    public n47() {
        this(0, new int[8], new Object[8], true);
    }

    public n47(int i, int[] iArr, Object[] objArr, boolean z) {
        this.d = -1;
        this.a = i;
        this.b = iArr;
        this.c = objArr;
        this.e = z;
    }

    public static n47 b() {
        return new n47(0, new int[8], new Object[8], true);
    }

    public final int a() {
        int iE;
        int iF;
        int iE2;
        int i = this.d;
        if (i != -1) {
            return i;
        }
        int iE3 = 0;
        for (int i2 = 0; i2 < this.a; i2++) {
            int i3 = this.b[i2];
            int i4 = i3 >>> 3;
            int i5 = i3 & 7;
            if (i5 != 0) {
                if (i5 != 1) {
                    if (i5 == 2) {
                        a07 a07Var = (a07) this.c[i2];
                        int iE4 = j07.e(i4 << 3);
                        int iC = a07Var.c();
                        iE3 = j07.e(iC) + iC + iE4 + iE3;
                    } else if (i5 == 3) {
                        int iY = j07.y(i4);
                        iE = iY + iY;
                        iF = ((n47) this.c[i2]).a();
                    } else {
                        if (i5 != 5) {
                            int i6 = zzko.w;
                            throw new IllegalStateException(new zzkn());
                        }
                        ((Integer) this.c[i2]).intValue();
                        iE2 = j07.e(i4 << 3) + 4;
                    }
                } else {
                    ((Long) this.c[i2]).longValue();
                    iE2 = j07.e(i4 << 3) + 8;
                }
                iE3 = iE2 + iE3;
            } else {
                long jLongValue = ((Long) this.c[i2]).longValue();
                iE = j07.e(i4 << 3);
                iF = j07.f(jLongValue);
            }
            iE3 = iF + iE + iE3;
        }
        this.d = iE3;
        return iE3;
    }

    public final void c(int i, Object obj) {
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

    public final void d(l07 l07Var) {
        if (this.a != 0) {
            for (int i = 0; i < this.a; i++) {
                int i2 = this.b[i];
                Object obj = this.c[i];
                int i3 = i2 >>> 3;
                int i4 = i2 & 7;
                if (i4 == 0) {
                    l07Var.n(i3, ((Long) obj).longValue());
                } else if (i4 == 1) {
                    l07Var.j(i3, ((Long) obj).longValue());
                } else if (i4 == 2) {
                    l07Var.f(i3, (a07) obj);
                } else if (i4 == 3) {
                    l07Var.a.q(i3, 3);
                    ((n47) obj).d(l07Var);
                    l07Var.a.q(i3, 4);
                } else {
                    if (i4 != 5) {
                        int i5 = zzko.w;
                        throw new RuntimeException(new zzkn());
                    }
                    l07Var.i(i3, ((Integer) obj).intValue());
                }
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof n47)) {
            return false;
        }
        n47 n47Var = (n47) obj;
        int i = this.a;
        if (i == n47Var.a) {
            int[] iArr = this.b;
            int[] iArr2 = n47Var.b;
            for (int i2 = 0; i2 < i; i2++) {
                if (iArr[i2] == iArr2[i2]) {
                }
            }
            Object[] objArr = this.c;
            Object[] objArr2 = n47Var.c;
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
}
