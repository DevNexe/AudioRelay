package defpackage;

import com.google.android.gms.internal.ads.zzgnf;
import com.google.android.gms.internal.ads.zzgnn;
import com.google.android.gms.internal.ads.zzgox;
import com.google.android.gms.internal.ads.zzgoz;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class kt6 extends zzgnn {
    public final InputStream c;
    public final byte[] d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j = Integer.MAX_VALUE;

    public kt6(InputStream inputStream) {
        Charset charset = zzgox.a;
        if (inputStream == null) {
            throw new NullPointerException("input");
        }
        this.c = inputStream;
        this.d = new byte[4096];
        this.e = 0;
        this.g = 0;
        this.i = 0;
    }

    public final void a(int i) throws zzgoz {
        InputStream inputStream = this.c;
        int i2 = this.e;
        int i3 = this.g;
        int i4 = i2 - i3;
        if (i <= i4 && i >= 0) {
            this.g = i3 + i;
            return;
        }
        if (i < 0) {
            throw zzgoz.d();
        }
        int i5 = this.i;
        int i6 = i5 + i3;
        int i7 = this.j;
        if (i6 + i > i7) {
            a((i7 - i5) - i3);
            throw zzgoz.f();
        }
        this.i = i6;
        this.e = 0;
        this.g = 0;
        while (i4 < i) {
            long j = i - i4;
            try {
                try {
                    long jSkip = inputStream.skip(j);
                    if (jSkip < 0 || jSkip > j) {
                        throw new IllegalStateException(String.valueOf(inputStream.getClass()) + "#skip returned invalid result: " + jSkip + "\nThe InputStream implementation is buggy.");
                    }
                    if (jSkip == 0) {
                        break;
                    } else {
                        i4 += (int) jSkip;
                    }
                } catch (zzgoz e) {
                    e.x = true;
                    throw e;
                }
            } catch (Throwable th) {
                this.i += i4;
                c();
                throw th;
            }
        }
        this.i += i4;
        c();
        if (i4 >= i) {
            return;
        }
        int i8 = this.e;
        int i9 = i8 - this.g;
        this.g = i8;
        d(1);
        while (true) {
            int i10 = i - i9;
            int i11 = this.e;
            if (i10 <= i11) {
                this.g = i10;
                return;
            } else {
                i9 += i11;
                this.g = i11;
                d(1);
            }
        }
    }

    public final ArrayList b(int i) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (i > 0) {
            int iMin = Math.min(i, 4096);
            byte[] bArr = new byte[iMin];
            int i2 = 0;
            while (i2 < iMin) {
                int i3 = this.c.read(bArr, i2, iMin - i2);
                if (i3 == -1) {
                    throw zzgoz.f();
                }
                this.i += i3;
                i2 += i3;
            }
            i -= iMin;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    public final void c() {
        int i = this.e + this.f;
        this.e = i;
        int i2 = this.i + i;
        int i3 = this.j;
        if (i2 <= i3) {
            this.f = 0;
            return;
        }
        int i4 = i2 - i3;
        this.f = i4;
        this.e = i - i4;
    }

    public final void d(int i) throws zzgoz {
        if (e(i)) {
            return;
        }
        if (i <= (Integer.MAX_VALUE - this.i) - this.g) {
            throw zzgoz.f();
        }
        throw new zzgoz("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    public final boolean e(int i) throws IOException {
        InputStream inputStream = this.c;
        int i2 = this.g;
        int i3 = this.e;
        if (i2 + i <= i3) {
            throw new IllegalStateException(ex0.b("refillBuffer() called when ", i, " bytes were already available in buffer"));
        }
        int i4 = this.i;
        if (i > (Integer.MAX_VALUE - i4) - i2 || i4 + i2 + i > this.j) {
            return false;
        }
        byte[] bArr = this.d;
        if (i2 > 0) {
            if (i3 > i2) {
                System.arraycopy(bArr, i2, bArr, 0, i3 - i2);
            }
            i4 = this.i + i2;
            this.i = i4;
            i3 = this.e - i2;
            this.e = i3;
            this.g = 0;
        }
        try {
            int i5 = inputStream.read(bArr, i3, Math.min(4096 - i3, (Integer.MAX_VALUE - i4) - i3));
            if (i5 == 0 || i5 < -1 || i5 > 4096) {
                throw new IllegalStateException(String.valueOf(inputStream.getClass()) + "#read(byte[]) returned invalid result: " + i5 + "\nThe InputStream implementation is buggy.");
            }
            if (i5 <= 0) {
                return false;
            }
            this.e += i5;
            c();
            if (this.e >= i) {
                return true;
            }
            return e(i);
        } catch (zzgoz e) {
            e.x = true;
            throw e;
        }
    }

    public final byte[] f(int i) throws IOException {
        byte[] bArrG = g(i);
        if (bArrG != null) {
            return bArrG;
        }
        int i2 = this.g;
        int i3 = this.e;
        int i4 = i3 - i2;
        this.i += i3;
        this.g = 0;
        this.e = 0;
        ArrayList<byte[]> arrayListB = b(i - i4);
        byte[] bArr = new byte[i];
        System.arraycopy(this.d, i2, bArr, 0, i4);
        for (byte[] bArr2 : arrayListB) {
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i4, length);
            i4 += length;
        }
        return bArr;
    }

    public final byte[] g(int i) throws IOException {
        if (i == 0) {
            return zzgox.zzd;
        }
        if (i < 0) {
            throw zzgoz.d();
        }
        int i2 = this.i;
        int i3 = this.g;
        int i4 = i2 + i3 + i;
        if ((-2147483647) + i4 > 0) {
            throw new zzgoz("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }
        int i5 = this.j;
        if (i4 > i5) {
            a((i5 - i2) - i3);
            throw zzgoz.f();
        }
        int i6 = this.e - i3;
        int i7 = i - i6;
        InputStream inputStream = this.c;
        if (i7 >= 4096) {
            try {
                if (i7 > inputStream.available()) {
                    return null;
                }
            } catch (zzgoz e) {
                e.x = true;
                throw e;
            }
        }
        byte[] bArr = new byte[i];
        System.arraycopy(this.d, this.g, bArr, 0, i6);
        this.i += this.e;
        this.g = 0;
        this.e = 0;
        while (i6 < i) {
            try {
                int i8 = inputStream.read(bArr, i6, i - i6);
                if (i8 == -1) {
                    throw zzgoz.f();
                }
                this.i += i8;
                i6 += i8;
            } catch (zzgoz e2) {
                e2.x = true;
                throw e2;
            }
        }
        return bArr;
    }

    public final int h() throws zzgoz {
        int i = this.g;
        if (this.e - i < 4) {
            d(4);
            i = this.g;
        }
        this.g = i + 4;
        byte[] bArr = this.d;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0067, code lost:
    
        if (r3[r2] >= 0) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int i() {
        /*
            r5 = this;
            int r0 = r5.g
            int r1 = r5.e
            if (r1 != r0) goto L7
            goto L6c
        L7:
            int r2 = r0 + 1
            byte[] r3 = r5.d
            r0 = r3[r0]
            if (r0 < 0) goto L12
            r5.g = r2
            return r0
        L12:
            int r1 = r1 - r2
            r4 = 9
            if (r1 < r4) goto L6c
            int r1 = r2 + 1
            r2 = r3[r2]
            int r2 = r2 << 7
            r0 = r0 ^ r2
            if (r0 >= 0) goto L23
            r0 = r0 ^ (-128(0xffffffffffffff80, float:NaN))
            goto L69
        L23:
            int r2 = r1 + 1
            r1 = r3[r1]
            int r1 = r1 << 14
            r0 = r0 ^ r1
            if (r0 < 0) goto L30
            r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
        L2e:
            r1 = r2
            goto L69
        L30:
            int r1 = r2 + 1
            r2 = r3[r2]
            int r2 = r2 << 21
            r0 = r0 ^ r2
            if (r0 >= 0) goto L3e
            r2 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r2
            goto L69
        L3e:
            int r2 = r1 + 1
            r1 = r3[r1]
            int r4 = r1 << 28
            r0 = r0 ^ r4
            r4 = 266354560(0xfe03f80, float:2.2112565E-29)
            r0 = r0 ^ r4
            if (r1 >= 0) goto L2e
            int r1 = r2 + 1
            r2 = r3[r2]
            if (r2 >= 0) goto L69
            int r2 = r1 + 1
            r1 = r3[r1]
            if (r1 >= 0) goto L2e
            int r1 = r2 + 1
            r2 = r3[r2]
            if (r2 >= 0) goto L69
            int r2 = r1 + 1
            r1 = r3[r1]
            if (r1 >= 0) goto L2e
            int r1 = r2 + 1
            r2 = r3[r2]
            if (r2 < 0) goto L6c
        L69:
            r5.g = r1
            return r0
        L6c:
            long r0 = r5.l()
            int r1 = (int) r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kt6.i():int");
    }

    public final long j() throws zzgoz {
        int i = this.g;
        if (this.e - i < 8) {
            d(8);
            i = this.g;
        }
        this.g = i + 8;
        byte[] bArr = this.d;
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    public final long k() {
        long j;
        long j2;
        long j3;
        long j4;
        int i;
        int i2 = this.g;
        int i3 = this.e;
        if (i3 != i2) {
            int i4 = i2 + 1;
            byte[] bArr = this.d;
            byte b = bArr[i2];
            if (b >= 0) {
                this.g = i4;
                return b;
            }
            if (i3 - i4 >= 9) {
                int i5 = i4 + 1;
                int i6 = b ^ (bArr[i4] << 7);
                if (i6 >= 0) {
                    int i7 = i5 + 1;
                    int i8 = i6 ^ (bArr[i5] << 14);
                    if (i8 < 0) {
                        i5 = i7 + 1;
                        int i9 = i8 ^ (bArr[i7] << 21);
                        if (i9 < 0) {
                            i = i9 ^ (-2080896);
                        } else {
                            i7 = i5 + 1;
                            long j5 = (((long) bArr[i5]) << 28) ^ ((long) i9);
                            if (j5 >= 0) {
                                j4 = 266354560;
                            } else {
                                int i10 = i7 + 1;
                                long j6 = j5 ^ (((long) bArr[i7]) << 35);
                                if (j6 < 0) {
                                    j3 = -34093383808L;
                                } else {
                                    i7 = i10 + 1;
                                    j5 = j6 ^ (((long) bArr[i10]) << 42);
                                    if (j5 >= 0) {
                                        j4 = 4363953127296L;
                                    } else {
                                        i10 = i7 + 1;
                                        j6 = j5 ^ (((long) bArr[i7]) << 49);
                                        if (j6 < 0) {
                                            j3 = -558586000294016L;
                                        } else {
                                            i7 = i10 + 1;
                                            j = (j6 ^ (((long) bArr[i10]) << 56)) ^ 71499008037633920L;
                                            if (j < 0) {
                                                i10 = i7 + 1;
                                                if (bArr[i7] >= 0) {
                                                    j2 = j;
                                                }
                                            }
                                        }
                                        i5 = i10;
                                    }
                                }
                                j2 = j3 ^ j6;
                                i5 = i10;
                            }
                            j = j5 ^ j4;
                        }
                        this.g = i5;
                        return j2;
                    }
                    j = i8 ^ 16256;
                    i5 = i7;
                    j2 = j;
                    this.g = i5;
                    return j2;
                }
                i = i6 ^ (-128);
                j2 = i;
                this.g = i5;
                return j2;
            }
        }
        return l();
    }

    public final long l() throws zzgoz {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            if (this.g == this.e) {
                d(1);
            }
            int i2 = this.g;
            this.g = i2 + 1;
            byte b = this.d[i2];
            j |= ((long) (b & 127)) << i;
            if ((b & 128) == 0) {
                return j;
            }
        }
        throw zzgoz.c();
    }

    @Override // com.google.android.gms.internal.ads.zzgnn
    public final void zzA(int i) {
        this.j = i;
        c();
    }

    @Override // com.google.android.gms.internal.ads.zzgnn
    public final boolean zzC() {
        return this.g == this.e && !e(1);
    }

    @Override // com.google.android.gms.internal.ads.zzgnn
    public final boolean zzD() {
        return k() != 0;
    }

    @Override // com.google.android.gms.internal.ads.zzgnn
    public final boolean zzE(int i) throws zzgoz {
        int iZzm;
        int i2 = i & 7;
        int i3 = 0;
        if (i2 == 0) {
            int i4 = this.e - this.g;
            byte[] bArr = this.d;
            if (i4 >= 10) {
                while (i3 < 10) {
                    int i5 = this.g;
                    this.g = i5 + 1;
                    if (bArr[i5] < 0) {
                        i3++;
                    }
                }
                throw zzgoz.c();
            }
            while (i3 < 10) {
                if (this.g == this.e) {
                    d(1);
                }
                int i6 = this.g;
                this.g = i6 + 1;
                if (bArr[i6] < 0) {
                    i3++;
                }
            }
            throw zzgoz.c();
            return true;
        }
        if (i2 == 1) {
            a(8);
            return true;
        }
        if (i2 == 2) {
            a(i());
            return true;
        }
        if (i2 != 3) {
            if (i2 == 4) {
                return false;
            }
            if (i2 != 5) {
                throw zzgoz.a();
            }
            a(4);
            return true;
        }
        do {
            iZzm = zzm();
            if (iZzm == 0) {
                break;
            }
        } while (zzE(iZzm));
        zzz(((i >>> 3) << 3) | 4);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzgnn
    public final double zzb() {
        return Double.longBitsToDouble(j());
    }

    @Override // com.google.android.gms.internal.ads.zzgnn
    public final float zzc() {
        return Float.intBitsToFloat(h());
    }

    @Override // com.google.android.gms.internal.ads.zzgnn
    public final int zzd() {
        return this.i + this.g;
    }

    @Override // com.google.android.gms.internal.ads.zzgnn
    public final int zze(int i) throws zzgoz {
        if (i < 0) {
            throw zzgoz.d();
        }
        int i2 = this.i + this.g + i;
        int i3 = this.j;
        if (i2 > i3) {
            throw zzgoz.f();
        }
        this.j = i2;
        c();
        return i3;
    }

    @Override // com.google.android.gms.internal.ads.zzgnn
    public final int zzf() {
        return i();
    }

    @Override // com.google.android.gms.internal.ads.zzgnn
    public final int zzg() {
        return h();
    }

    @Override // com.google.android.gms.internal.ads.zzgnn
    public final int zzh() {
        return i();
    }

    @Override // com.google.android.gms.internal.ads.zzgnn
    public final int zzk() {
        return h();
    }

    @Override // com.google.android.gms.internal.ads.zzgnn
    public final int zzl() {
        return zzgnn.zzF(i());
    }

    @Override // com.google.android.gms.internal.ads.zzgnn
    public final int zzm() throws zzgoz {
        if (zzC()) {
            this.h = 0;
            return 0;
        }
        int i = i();
        this.h = i;
        if ((i >>> 3) != 0) {
            return i;
        }
        throw new zzgoz("Protocol message contained an invalid tag (zero).");
    }

    @Override // com.google.android.gms.internal.ads.zzgnn
    public final int zzn() {
        return i();
    }

    @Override // com.google.android.gms.internal.ads.zzgnn
    public final long zzo() {
        return j();
    }

    @Override // com.google.android.gms.internal.ads.zzgnn
    public final long zzp() {
        return k();
    }

    @Override // com.google.android.gms.internal.ads.zzgnn
    public final long zzt() {
        return j();
    }

    @Override // com.google.android.gms.internal.ads.zzgnn
    public final long zzu() {
        return zzgnn.zzG(k());
    }

    @Override // com.google.android.gms.internal.ads.zzgnn
    public final long zzv() {
        return k();
    }

    @Override // com.google.android.gms.internal.ads.zzgnn
    public final zzgnf zzw() throws IOException {
        int i = i();
        int i2 = this.e;
        int i3 = this.g;
        int i4 = i2 - i3;
        byte[] bArr = this.d;
        if (i <= i4 && i > 0) {
            zzgnf zzgnfVarZzw = zzgnf.zzw(bArr, i3, i);
            this.g += i;
            return zzgnfVarZzw;
        }
        if (i == 0) {
            return zzgnf.zzb;
        }
        byte[] bArrG = g(i);
        if (bArrG != null) {
            return zzgnf.zzv(bArrG);
        }
        int i5 = this.g;
        int i6 = this.e;
        int i7 = i6 - i5;
        this.i += i6;
        this.g = 0;
        this.e = 0;
        ArrayList<byte[]> arrayListB = b(i - i7);
        byte[] bArr2 = new byte[i];
        System.arraycopy(bArr, i5, bArr2, 0, i7);
        for (byte[] bArr3 : arrayListB) {
            int length = bArr3.length;
            System.arraycopy(bArr3, 0, bArr2, i7, length);
            i7 += length;
        }
        zzgnf zzgnfVar = zzgnf.zzb;
        return new ht6(bArr2);
    }

    @Override // com.google.android.gms.internal.ads.zzgnn
    public final String zzx() throws zzgoz {
        int i = i();
        byte[] bArr = this.d;
        if (i > 0) {
            int i2 = this.e;
            int i3 = this.g;
            if (i <= i2 - i3) {
                String str = new String(bArr, i3, i, zzgox.a);
                this.g += i;
                return str;
            }
        }
        if (i == 0) {
            return "";
        }
        if (i > this.e) {
            return new String(f(i), zzgox.a);
        }
        d(i);
        String str2 = new String(bArr, this.g, i, zzgox.a);
        this.g += i;
        return str2;
    }

    @Override // com.google.android.gms.internal.ads.zzgnn
    public final String zzy() throws IOException {
        int i = i();
        int i2 = this.g;
        int i3 = this.e;
        int i4 = i3 - i2;
        byte[] bArrF = this.d;
        if (i <= i4 && i > 0) {
            this.g = i2 + i;
        } else {
            if (i == 0) {
                return "";
            }
            i2 = 0;
            if (i <= i3) {
                d(i);
                this.g = i;
            } else {
                bArrF = f(i);
            }
        }
        return rv6.a.c(bArrF, i2, i);
    }

    @Override // com.google.android.gms.internal.ads.zzgnn
    public final void zzz(int i) throws zzgoz {
        if (this.h != i) {
            throw new zzgoz("Protocol message end-group tag did not match expected tag.");
        }
    }
}
