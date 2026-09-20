package com.google.android.gms.internal.ads;

import defpackage.GM;
import defpackage.Md5A;
import defpackage.dt6;
import defpackage.ex0;
import defpackage.ht6;
import defpackage.ko6;
import defpackage.tu6;
import defpackage.vu6;
import defpackage.zs6;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzgnf implements Iterable, Serializable {
    public static final zzgnf zzb = new ht6(zzgox.zzd);
    public int w = 0;

    static {
        int i = zs6.a;
    }

    public static void a(int i, int i2) {
        if (((i2 - (i + 1)) | i) < 0) {
            if (i >= 0) {
                throw new ArrayIndexOutOfBoundsException(Md5A.e("Index > length: ", i, ", ", i2));
            }
            throw new ArrayIndexOutOfBoundsException(GM.a("Index < 0: ", i));
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:32:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:35:0x00e2 A[LOOP:0: B:33:0x00dc->B:35:0x00e2, LOOP_END] */
    public static zzgnf c(Iterator it, int i) {
        ArrayDeque arrayDeque;
        zzgnf vu6Var;
        if (i <= 0) {
            throw new IllegalArgumentException(String.format("length (%s) must be >= 1", Integer.valueOf(i)));
        }
        if (i == 1) {
            return (zzgnf) it.next();
        }
        int i2 = i >>> 1;
        zzgnf zzgnfVarC = c(it, i2);
        zzgnf zzgnfVarC2 = c(it, i - i2);
        if (Integer.MAX_VALUE - zzgnfVarC.zzd() < zzgnfVarC2.zzd()) {
            throw new IllegalArgumentException(Md5A.e("ByteString would be too long: ", zzgnfVarC.zzd(), "+", zzgnfVarC2.zzd()));
        }
        if (zzgnfVarC2.zzd() == 0) {
            return zzgnfVarC;
        }
        if (zzgnfVarC.zzd() == 0) {
            return zzgnfVarC2;
        }
        int iZzd = zzgnfVarC2.zzd() + zzgnfVarC.zzd();
        if (iZzd < 128) {
            int iZzd2 = zzgnfVarC.zzd();
            int iZzd3 = zzgnfVarC2.zzd();
            byte[] bArr = new byte[iZzd2 + iZzd3];
            zzgnfVarC.zzC(bArr, 0, 0, iZzd2);
            zzgnfVarC2.zzC(bArr, 0, iZzd2, iZzd3);
            return new ht6(bArr);
        }
        if (zzgnfVarC instanceof vu6) {
            vu6 vu6Var2 = (vu6) zzgnfVarC;
            zzgnf zzgnfVar = vu6Var2.z;
            int iZzd4 = zzgnfVarC2.zzd() + zzgnfVar.zzd();
            zzgnf zzgnfVar2 = vu6Var2.y;
            if (iZzd4 < 128) {
                int iZzd5 = zzgnfVar.zzd();
                int iZzd6 = zzgnfVarC2.zzd();
                byte[] bArr2 = new byte[iZzd5 + iZzd6];
                zzgnfVar.zzC(bArr2, 0, 0, iZzd5);
                zzgnfVarC2.zzC(bArr2, 0, iZzd5, iZzd6);
                vu6Var = new vu6(zzgnfVar2, new ht6(bArr2));
            } else {
                if (zzgnfVar2.e() > zzgnfVar.e() && vu6Var2.B > zzgnfVarC2.e()) {
                    return new vu6(zzgnfVar2, new vu6(zzgnfVar, zzgnfVarC2));
                }
                if (iZzd >= vu6.s(Math.max(zzgnfVarC.e(), zzgnfVarC2.e()) + 1)) {
                    vu6Var = new vu6(zzgnfVarC, zzgnfVarC2);
                } else {
                    tu6 tu6Var = new tu6();
                    tu6Var.a(zzgnfVarC);
                    tu6Var.a(zzgnfVarC2);
                    arrayDeque = tu6Var.a;
                    vu6Var = (zzgnf) arrayDeque.pop();
                    while (!arrayDeque.isEmpty()) {
                        vu6Var = new vu6((zzgnf) arrayDeque.pop(), vu6Var);
                    }
                }
            }
        } else if (iZzd >= vu6.s(Math.max(zzgnfVarC.e(), zzgnfVarC2.e()) + 1)) {
            vu6Var = new vu6(zzgnfVarC, zzgnfVarC2);
        } else {
            tu6 tu6Var2 = new tu6();
            tu6Var2.a(zzgnfVarC);
            tu6Var2.a(zzgnfVarC2);
            arrayDeque = tu6Var2.a;
            vu6Var = (zzgnf) arrayDeque.pop();
            while (!arrayDeque.isEmpty()) {
                vu6Var = new vu6((zzgnf) arrayDeque.pop(), vu6Var);
            }
        }
        return vu6Var;
    }

    public static int r(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            throw new IndexOutOfBoundsException(ex0.b("Beginning index: ", i, " < 0"));
        }
        if (i2 < i) {
            throw new IndexOutOfBoundsException(Md5A.e("Beginning index larger than ending index: ", i, ", ", i2));
        }
        throw new IndexOutOfBoundsException(Md5A.e("End index: ", i2, " >= ", i3));
    }

    public static zzgnc zzt() {
        return new zzgnc();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static zzgnf zzu(Iterable iterable) {
        int size;
        if (iterable instanceof Collection) {
            size = iterable.size();
        } else {
            Iterator it = iterable.iterator();
            size = 0;
            while (it.hasNext()) {
                it.next();
                size++;
            }
        }
        return size == 0 ? zzb : c(iterable.iterator(), size);
    }

    public static zzgnf zzv(byte[] bArr) {
        return zzw(bArr, 0, bArr.length);
    }

    public static zzgnf zzw(byte[] bArr, int i, int i2) {
        r(i, i + i2, bArr.length);
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new ht6(bArr2);
    }

    public static zzgnf zzx(String str) {
        return new ht6(str.getBytes(zzgox.a));
    }

    public static zzgnf zzy(InputStream inputStream) throws IOException {
        ArrayList arrayList = new ArrayList();
        int iMin = 256;
        while (true) {
            byte[] bArr = new byte[iMin];
            int i = 0;
            while (i < iMin) {
                int i2 = inputStream.read(bArr, i, iMin - i);
                if (i2 == -1) {
                    break;
                }
                i += i2;
            }
            zzgnf zzgnfVarZzw = i == 0 ? null : zzw(bArr, 0, i);
            if (zzgnfVarZzw == null) {
                return zzu(arrayList);
            }
            arrayList.add(zzgnfVarZzw);
            iMin = Math.min(iMin + iMin, 8192);
        }
    }

    public abstract byte b(int i);

    public abstract void d(int i, int i2, int i3, byte[] bArr);

    public abstract int e();

    public abstract boolean equals(Object obj);

    public abstract boolean f();

    public abstract int g(int i, int i2, int i3);

    public abstract int h(int i, int i2, int i3);

    public final int hashCode() {
        int iG = this.w;
        if (iG == 0) {
            int iZzd = zzd();
            iG = g(iZzd, 0, iZzd);
            if (iG == 0) {
                iG = 1;
            }
            this.w = iG;
        }
        return iG;
    }

    public abstract String m(Charset charset);

    public abstract void p(zzgmu zzgmuVar);

    public final String toString() {
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(zzd());
        objArr[2] = zzd() <= 50 ? ko6.e(this) : ko6.e(zzk(0, 47)).concat("...");
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }

    public final String zzA(Charset charset) {
        return zzd() == 0 ? "" : m(charset);
    }

    @Deprecated
    public final void zzC(byte[] bArr, int i, int i2, int i3) {
        r(0, i3, zzd());
        r(i2, i2 + i3, bArr.length);
        if (i3 > 0) {
            d(0, i2, i3, bArr);
        }
    }

    public final boolean zzD() {
        return zzd() == 0;
    }

    public final byte[] zzE() {
        int iZzd = zzd();
        if (iZzd == 0) {
            return zzgox.zzd;
        }
        byte[] bArr = new byte[iZzd];
        d(0, 0, iZzd, bArr);
        return bArr;
    }

    public abstract byte zza(int i);

    public abstract int zzd();

    public abstract zzgnf zzk(int i, int i2);

    public abstract zzgnn zzl();

    public abstract ByteBuffer zzn();

    public abstract boolean zzp();

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: zzs, reason: merged with bridge method [inline-methods] */
    public zzgmz iterator() {
        return new dt6(this);
    }
}
