package defpackage;

import com.google.android.gms.internal.ads.com5Fixed;
import com.google.android.gms.internal.ads.zzgnf;
import com.google.android.gms.internal.ads.zzgow;
import com.google.android.gms.internal.ads.zzgox;
import com.google.android.gms.internal.ads.zzgoz;
import com.google.android.gms.internal.ads.zzgri;

/* JADX INFO: loaded from: classes3.dex */
public final class bt6 {
    public static int a(byte[] bArr, int i, at6 at6Var) throws zzgoz {
        int iJ = j(bArr, i, at6Var);
        int i2 = at6Var.a;
        if (i2 < 0) {
            throw zzgoz.d();
        }
        if (i2 > bArr.length - iJ) {
            throw zzgoz.f();
        }
        if (i2 == 0) {
            at6Var.c = zzgnf.zzb;
            return iJ;
        }
        at6Var.c = zzgnf.zzw(bArr, iJ, i2);
        return iJ + i2;
    }

    public static int b(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public static int c(wu6 wu6Var, byte[] bArr, int i, int i2, int i3, at6 at6Var) {
        com5Fixed com5Var = (com5Fixed) wu6Var;
        Object objZze = com5Var.zze();
        int iY = com5Var.y(objZze, bArr, i, i2, i3, at6Var);
        com5Var.zzf(objZze);
        at6Var.c = objZze;
        return iY;
    }

    public static int d(wu6 wu6Var, byte[] bArr, int i, int i2, at6 at6Var) throws zzgoz {
        int iK = i + 1;
        int i3 = bArr[i];
        if (i3 < 0) {
            iK = k(i3, bArr, iK, at6Var);
            i3 = at6Var.a;
        }
        int i4 = iK;
        if (i3 < 0 || i3 > i2 - i4) {
            throw zzgoz.f();
        }
        Object objZze = wu6Var.zze();
        int i5 = i3 + i4;
        wu6Var.e(objZze, bArr, i4, i5, at6Var);
        wu6Var.zzf(objZze);
        at6Var.c = objZze;
        return i5;
    }

    public static int e(wu6 wu6Var, int i, byte[] bArr, int i2, int i3, zzgow zzgowVar, at6 at6Var) throws zzgoz {
        int iD = d(wu6Var, bArr, i2, i3, at6Var);
        zzgowVar.add(at6Var.c);
        while (iD < i3) {
            int iJ = j(bArr, iD, at6Var);
            if (i != at6Var.a) {
                break;
            }
            iD = d(wu6Var, bArr, iJ, i3, at6Var);
            zzgowVar.add(at6Var.c);
        }
        return iD;
    }

    public static int f(byte[] bArr, int i, zzgow zzgowVar, at6 at6Var) throws zzgoz {
        yt6 yt6Var = (yt6) zzgowVar;
        int iJ = j(bArr, i, at6Var);
        int i2 = at6Var.a + iJ;
        while (iJ < i2) {
            iJ = j(bArr, iJ, at6Var);
            yt6Var.zzh(at6Var.a);
        }
        if (iJ == i2) {
            return iJ;
        }
        throw zzgoz.f();
    }

    public static int g(byte[] bArr, int i, at6 at6Var) throws zzgoz {
        int iJ = j(bArr, i, at6Var);
        int i2 = at6Var.a;
        if (i2 < 0) {
            throw zzgoz.d();
        }
        if (i2 == 0) {
            at6Var.c = "";
            return iJ;
        }
        at6Var.c = new String(bArr, iJ, i2, zzgox.a);
        return iJ + i2;
    }

    public static int h(byte[] bArr, int i, at6 at6Var) throws zzgoz {
        int iJ = j(bArr, i, at6Var);
        int i2 = at6Var.a;
        if (i2 < 0) {
            throw zzgoz.d();
        }
        if (i2 == 0) {
            at6Var.c = "";
            return iJ;
        }
        at6Var.c = rv6.a.c(bArr, iJ, i2);
        return iJ + i2;
    }

    public static int i(int i, byte[] bArr, int i2, int i3, zzgri zzgriVar, at6 at6Var) throws zzgoz {
        if ((i >>> 3) == 0) {
            throw new zzgoz("Protocol message contained an invalid tag (zero).");
        }
        int i4 = i & 7;
        if (i4 == 0) {
            int iM = m(bArr, i2, at6Var);
            zzgriVar.b(i, Long.valueOf(at6Var.b));
            return iM;
        }
        if (i4 == 1) {
            zzgriVar.b(i, Long.valueOf(n(i2, bArr)));
            return i2 + 8;
        }
        if (i4 == 2) {
            int iJ = j(bArr, i2, at6Var);
            int i5 = at6Var.a;
            if (i5 < 0) {
                throw zzgoz.d();
            }
            if (i5 > bArr.length - iJ) {
                throw zzgoz.f();
            }
            if (i5 == 0) {
                zzgriVar.b(i, zzgnf.zzb);
            } else {
                zzgriVar.b(i, zzgnf.zzw(bArr, iJ, i5));
            }
            return iJ + i5;
        }
        if (i4 != 3) {
            if (i4 != 5) {
                throw new zzgoz("Protocol message contained an invalid tag (zero).");
            }
            zzgriVar.b(i, Integer.valueOf(b(bArr, i2)));
            return i2 + 4;
        }
        int i6 = (i & (-8)) | 4;
        zzgri zzgriVarA = zzgri.a();
        int i7 = 0;
        while (i2 < i3) {
            int iJ2 = j(bArr, i2, at6Var);
            int i8 = at6Var.a;
            if (i8 == i6) {
                i7 = i8;
                i2 = iJ2;
                break;
            }
            i7 = i8;
            i2 = i(i8, bArr, iJ2, i3, zzgriVarA, at6Var);
        }
        if (i2 > i3 || i7 != i6) {
            throw zzgoz.e();
        }
        zzgriVar.b(i, zzgriVarA);
        return i2;
    }

    public static int j(byte[] bArr, int i, at6 at6Var) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return k(b, bArr, i2, at6Var);
        }
        at6Var.a = b;
        return i2;
    }

    public static int k(int i, byte[] bArr, int i2, at6 at6Var) {
        int i3 = i & 127;
        int i4 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            at6Var.a = i3 | (b << 7);
            return i4;
        }
        int i5 = i3 | ((b & 127) << 7);
        int i6 = i4 + 1;
        byte b2 = bArr[i4];
        if (b2 >= 0) {
            at6Var.a = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & 127) << 14);
        int i8 = i6 + 1;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            at6Var.a = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & 127) << 21);
        int i10 = i8 + 1;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            at6Var.a = i9 | (b4 << 28);
            return i10;
        }
        int i11 = i9 | ((b4 & 127) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                at6Var.a = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    public static int l(int i, byte[] bArr, int i2, int i3, zzgow zzgowVar, at6 at6Var) {
        yt6 yt6Var = (yt6) zzgowVar;
        int iJ = j(bArr, i2, at6Var);
        yt6Var.zzh(at6Var.a);
        while (iJ < i3) {
            int iJ2 = j(bArr, iJ, at6Var);
            if (i != at6Var.a) {
                break;
            }
            iJ = j(bArr, iJ2, at6Var);
            yt6Var.zzh(at6Var.a);
        }
        return iJ;
    }

    public static int m(byte[] bArr, int i, at6 at6Var) {
        int i2 = i + 1;
        long j = bArr[i];
        if (j >= 0) {
            at6Var.b = j;
            return i2;
        }
        int i3 = i2 + 1;
        byte b = bArr[i2];
        long j2 = (j & 127) | (((long) (b & 127)) << 7);
        int i4 = 7;
        while (b < 0) {
            int i5 = i3 + 1;
            byte b2 = bArr[i3];
            i4 += 7;
            j2 |= ((long) (b2 & 127)) << i4;
            b = b2;
            i3 = i5;
        }
        at6Var.b = j2;
        return i3;
    }

    public static long n(int i, byte[] bArr) {
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }
}
