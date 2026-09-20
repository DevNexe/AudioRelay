package defpackage;

import com.google.android.gms.internal.ads.zzgnf;
import com.google.android.gms.internal.ads.zzgnn;
import com.google.android.gms.internal.ads.zzgox;
import com.google.android.gms.internal.ads.zzgoz;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class it6 extends zzgnn {
    public final byte[] c;
    public int d;
    public int e;
    public int f;
    public final int g;
    public int h;
    public int i = Integer.MAX_VALUE;

    public /* synthetic */ it6(byte[] bArr, int i, int i2) {
        this.c = bArr;
        this.d = i2 + i;
        this.f = i;
        this.g = i;
    }

    public final void a(int i) throws zzgoz {
        if (i >= 0) {
            int i2 = this.d;
            int i3 = this.f;
            if (i <= i2 - i3) {
                this.f = i3 + i;
                return;
            }
        }
        if (i >= 0) {
            throw zzgoz.f();
        }
        throw zzgoz.d();
    }

    public final int b() throws zzgoz {
        int i = this.f;
        if (this.d - i < 4) {
            throw zzgoz.f();
        }
        this.f = i + 4;
        byte[] bArr = this.c;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0067, code lost:
    
        if (r3[r2] >= 0) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int c() {
        /*
            r5 = this;
            int r0 = r5.f
            int r1 = r5.d
            if (r1 != r0) goto L7
            goto L6c
        L7:
            int r2 = r0 + 1
            byte[] r3 = r5.c
            r0 = r3[r0]
            if (r0 < 0) goto L12
            r5.f = r2
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
            r5.f = r1
            return r0
        L6c:
            long r0 = r5.f()
            int r1 = (int) r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.it6.c():int");
    }

    public final long d() throws zzgoz {
        int i = this.f;
        if (this.d - i < 8) {
            throw zzgoz.f();
        }
        this.f = i + 8;
        byte[] bArr = this.c;
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    public final long e() {
        long j;
        long j2;
        long j3;
        long j4;
        int i;
        int i2 = this.f;
        int i3 = this.d;
        if (i3 != i2) {
            int i4 = i2 + 1;
            byte[] bArr = this.c;
            byte b = bArr[i2];
            if (b >= 0) {
                this.f = i4;
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
                        this.f = i5;
                        return j2;
                    }
                    j = i8 ^ 16256;
                    i5 = i7;
                    j2 = j;
                    this.f = i5;
                    return j2;
                }
                i = i6 ^ (-128);
                j2 = i;
                this.f = i5;
                return j2;
            }
        }
        return f();
    }

    public final long f() throws zzgoz {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            int i2 = this.f;
            if (i2 == this.d) {
                throw zzgoz.f();
            }
            this.f = i2 + 1;
            byte b = this.c[i2];
            j |= ((long) (b & 127)) << i;
            if ((b & 128) == 0) {
                return j;
            }
        }
        throw zzgoz.c();
    }

    @Override // com.google.android.gms.internal.ads.zzgnn
    public final void zzA(int i) {
        this.i = i;
        int i2 = this.d + this.e;
        this.d = i2;
        int i3 = i2 - this.g;
        if (i3 <= i) {
            this.e = 0;
            return;
        }
        int i4 = i3 - i;
        this.e = i4;
        this.d = i2 - i4;
    }

    @Override // com.google.android.gms.internal.ads.zzgnn
    public final boolean zzC() {
        return this.f == this.d;
    }

    @Override // com.google.android.gms.internal.ads.zzgnn
    public final boolean zzD() {
        return e() != 0;
    }

    @Override // com.google.android.gms.internal.ads.zzgnn
    public final boolean zzE(int i) throws zzgoz {
        int iZzm;
        int i2 = i & 7;
        int i3 = 0;
        if (i2 == 0) {
            int i4 = this.d - this.f;
            byte[] bArr = this.c;
            if (i4 >= 10) {
                while (i3 < 10) {
                    int i5 = this.f;
                    this.f = i5 + 1;
                    if (bArr[i5] < 0) {
                        i3++;
                    }
                }
                throw zzgoz.c();
            }
            while (i3 < 10) {
                int i6 = this.f;
                if (i6 == this.d) {
                    throw zzgoz.f();
                }
                this.f = i6 + 1;
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
            a(c());
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
        return Double.longBitsToDouble(d());
    }

    @Override // com.google.android.gms.internal.ads.zzgnn
    public final float zzc() {
        return Float.intBitsToFloat(b());
    }

    @Override // com.google.android.gms.internal.ads.zzgnn
    public final int zzd() {
        return this.f - this.g;
    }

    @Override // com.google.android.gms.internal.ads.zzgnn
    public final int zze(int i) {
        if (i < 0) {
            throw zzgoz.d();
        }
        int i2 = this.f;
        int i3 = this.g;
        int i4 = (i2 - i3) + i;
        if (i4 < 0) {
            throw zzgoz.e();
        }
        int i5 = this.i;
        if (i4 > i5) {
            throw zzgoz.f();
        }
        this.i = i4;
        int i6 = this.d + this.e;
        this.d = i6;
        int i7 = i6 - i3;
        if (i7 > i4) {
            int i8 = i7 - i4;
            this.e = i8;
            this.d = i6 - i8;
        } else {
            this.e = 0;
        }
        return i5;
    }

    @Override // com.google.android.gms.internal.ads.zzgnn
    public final int zzf() {
        return c();
    }

    @Override // com.google.android.gms.internal.ads.zzgnn
    public final int zzg() {
        return b();
    }

    @Override // com.google.android.gms.internal.ads.zzgnn
    public final int zzh() {
        return c();
    }

    @Override // com.google.android.gms.internal.ads.zzgnn
    public final int zzk() {
        return b();
    }

    @Override // com.google.android.gms.internal.ads.zzgnn
    public final int zzl() {
        return zzgnn.zzF(c());
    }

    @Override // com.google.android.gms.internal.ads.zzgnn
    public final int zzm() throws zzgoz {
        if (zzC()) {
            this.h = 0;
            return 0;
        }
        int iC = c();
        this.h = iC;
        if ((iC >>> 3) != 0) {
            return iC;
        }
        throw new zzgoz("Protocol message contained an invalid tag (zero).");
    }

    @Override // com.google.android.gms.internal.ads.zzgnn
    public final int zzn() {
        return c();
    }

    @Override // com.google.android.gms.internal.ads.zzgnn
    public final long zzo() {
        return d();
    }

    @Override // com.google.android.gms.internal.ads.zzgnn
    public final long zzp() {
        return e();
    }

    @Override // com.google.android.gms.internal.ads.zzgnn
    public final long zzt() {
        return d();
    }

    @Override // com.google.android.gms.internal.ads.zzgnn
    public final long zzu() {
        return zzgnn.zzG(e());
    }

    @Override // com.google.android.gms.internal.ads.zzgnn
    public final long zzv() {
        return e();
    }

    @Override // com.google.android.gms.internal.ads.zzgnn
    public final zzgnf zzw() throws zzgoz {
        int iC = c();
        byte[] bArr = this.c;
        if (iC > 0) {
            int i = this.d;
            int i2 = this.f;
            if (iC <= i - i2) {
                zzgnf zzgnfVarZzw = zzgnf.zzw(bArr, i2, iC);
                this.f += iC;
                return zzgnfVarZzw;
            }
        }
        if (iC == 0) {
            return zzgnf.zzb;
        }
        if (iC > 0) {
            int i3 = this.d;
            int i4 = this.f;
            if (iC <= i3 - i4) {
                int i5 = iC + i4;
                this.f = i5;
                byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i4, i5);
                zzgnf zzgnfVar = zzgnf.zzb;
                return new ht6(bArrCopyOfRange);
            }
        }
        if (iC <= 0) {
            throw zzgoz.d();
        }
        throw zzgoz.f();
    }

    @Override // com.google.android.gms.internal.ads.zzgnn
    public final String zzx() throws zzgoz {
        int iC = c();
        if (iC > 0) {
            int i = this.d;
            int i2 = this.f;
            if (iC <= i - i2) {
                String str = new String(this.c, i2, iC, zzgox.a);
                this.f += iC;
                return str;
            }
        }
        if (iC == 0) {
            return "";
        }
        if (iC < 0) {
            throw zzgoz.d();
        }
        throw zzgoz.f();
    }

    @Override // com.google.android.gms.internal.ads.zzgnn
    public final String zzy() throws zzgoz {
        int iC = c();
        if (iC > 0) {
            int i = this.d;
            int i2 = this.f;
            if (iC <= i - i2) {
                String strC = rv6.a.c(this.c, i2, iC);
                this.f += iC;
                return strC;
            }
        }
        if (iC == 0) {
            return "";
        }
        if (iC <= 0) {
            throw zzgoz.d();
        }
        throw zzgoz.f();
    }

    @Override // com.google.android.gms.internal.ads.zzgnn
    public final void zzz(int i) throws zzgoz {
        if (this.h != i) {
            throw new zzgoz("Protocol message end-group tag did not match expected tag.");
        }
    }
}
