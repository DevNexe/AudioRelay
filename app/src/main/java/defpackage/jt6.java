package defpackage;

import com.google.android.gms.internal.ads.zzgnf;
import com.google.android.gms.internal.ads.zzgnn;
import com.google.android.gms.internal.ads.zzgox;
import com.google.android.gms.internal.ads.zzgoz;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class jt6 extends zzgnn {
    public final Iterable c;
    public final Iterator d;
    public ByteBuffer e;
    public int f;
    public int g;
    public int i;
    public long k;
    public long l;
    public long m;
    public int h = Integer.MAX_VALUE;
    public int j = 0;

    public /* synthetic */ jt6(ArrayList arrayList, int i) {
        this.f = i;
        this.c = arrayList;
        this.d = arrayList.iterator();
        if (i != 0) {
            e();
            return;
        }
        this.e = zzgox.zze;
        this.k = 0L;
        this.l = 0L;
        this.m = 0L;
    }

    public final void a(int i) throws zzgoz {
        if (i < 0 || i > (((long) (this.f - this.j)) - this.k) + this.l) {
            if (i >= 0) {
                throw zzgoz.f();
            }
            throw zzgoz.d();
        }
        while (i > 0) {
            if (this.m - this.k == 0) {
                c();
            }
            int iMin = Math.min(i, (int) (this.m - this.k));
            i -= iMin;
            this.k += (long) iMin;
        }
    }

    public final int b() {
        return (int) ((((long) (this.f - this.j)) - this.k) + this.l);
    }

    public final void c() throws zzgoz {
        if (!this.d.hasNext()) {
            throw zzgoz.f();
        }
        e();
    }

    public final void d(byte[] bArr, int i) throws zzgoz {
        if (i > b()) {
            if (i > 0) {
                throw zzgoz.f();
            }
            return;
        }
        int i2 = i;
        while (i2 > 0) {
            if (this.m - this.k == 0) {
                c();
            }
            int iMin = Math.min(i2, (int) (this.m - this.k));
            long j = iMin;
            nv6.c.g(this.k, bArr, i - i2, j);
            i2 -= iMin;
            this.k += j;
        }
    }

    public final void e() {
        ByteBuffer byteBuffer = (ByteBuffer) this.d.next();
        this.e = byteBuffer;
        this.j += (int) (this.k - this.l);
        long jPosition = byteBuffer.position();
        this.k = jPosition;
        this.l = jPosition;
        this.m = this.e.limit();
        long jY = nv6.c.y(nv6.g, this.e);
        this.k += jY;
        this.l += jY;
        this.m += jY;
    }

    public final byte f() throws zzgoz {
        if (this.m - this.k == 0) {
            c();
        }
        long j = this.k;
        this.k = 1 + j;
        return nv6.f(j);
    }

    public final int g() throws zzgoz {
        int iF;
        byte bF;
        long j = this.m;
        long j2 = this.k;
        if (j - j2 >= 4) {
            this.k = 4 + j2;
            iF = (nv6.f(j2) & 255) | ((nv6.f(1 + j2) & 255) << 8) | ((nv6.f(2 + j2) & 255) << 16);
            bF = nv6.f(j2 + 3);
        } else {
            iF = (f() & 255) | ((f() & 255) << 8) | ((f() & 255) << 16);
            bF = f();
        }
        return iF | ((bF & 255) << 24);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0087, code lost:
    
        if (defpackage.nv6.f(r4) >= 0) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int h() {
        /*
            r10 = this;
            long r0 = r10.k
            long r2 = r10.m
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 != 0) goto La
            goto L8c
        La:
            r2 = 1
            long r4 = r0 + r2
            byte r0 = defpackage.nv6.f(r0)
            if (r0 < 0) goto L1a
            long r4 = r10.k
            long r4 = r4 + r2
            r10.k = r4
            return r0
        L1a:
            long r6 = r10.m
            long r8 = r10.k
            long r6 = r6 - r8
            r8 = 10
            int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r1 < 0) goto L8c
            long r6 = r4 + r2
            byte r1 = defpackage.nv6.f(r4)
            int r1 = r1 << 7
            r0 = r0 ^ r1
            if (r0 >= 0) goto L33
            r0 = r0 ^ (-128(0xffffffffffffff80, float:NaN))
            goto L89
        L33:
            long r4 = r6 + r2
            byte r1 = defpackage.nv6.f(r6)
            int r1 = r1 << 14
            r0 = r0 ^ r1
            if (r0 < 0) goto L42
            r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
        L40:
            r6 = r4
            goto L89
        L42:
            long r6 = r4 + r2
            byte r1 = defpackage.nv6.f(r4)
            int r1 = r1 << 21
            r0 = r0 ^ r1
            if (r0 >= 0) goto L52
            r1 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r1
            goto L89
        L52:
            long r4 = r6 + r2
            byte r1 = defpackage.nv6.f(r6)
            int r6 = r1 << 28
            r0 = r0 ^ r6
            r6 = 266354560(0xfe03f80, float:2.2112565E-29)
            r0 = r0 ^ r6
            if (r1 >= 0) goto L40
            long r6 = r4 + r2
            byte r1 = defpackage.nv6.f(r4)
            if (r1 >= 0) goto L89
            long r4 = r6 + r2
            byte r1 = defpackage.nv6.f(r6)
            if (r1 >= 0) goto L40
            long r6 = r4 + r2
            byte r1 = defpackage.nv6.f(r4)
            if (r1 >= 0) goto L89
            long r4 = r6 + r2
            byte r1 = defpackage.nv6.f(r6)
            if (r1 >= 0) goto L40
            long r6 = r4 + r2
            byte r1 = defpackage.nv6.f(r4)
            if (r1 < 0) goto L8c
        L89:
            r10.k = r6
            return r0
        L8c:
            long r0 = r10.k()
            int r1 = (int) r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jt6.h():int");
    }

    public final long i() throws zzgoz {
        long jF;
        byte bF;
        long j = this.m;
        long j2 = this.k;
        if (j - j2 >= 8) {
            this.k = 8 + j2;
            jF = (((long) nv6.f(j2)) & 255) | ((((long) nv6.f(1 + j2)) & 255) << 8) | ((((long) nv6.f(2 + j2)) & 255) << 16) | ((((long) nv6.f(3 + j2)) & 255) << 24) | ((((long) nv6.f(4 + j2)) & 255) << 32) | ((((long) nv6.f(5 + j2)) & 255) << 40) | ((((long) nv6.f(6 + j2)) & 255) << 48);
            bF = nv6.f(j2 + 7);
        } else {
            jF = (((long) f()) & 255) | ((((long) f()) & 255) << 8) | ((((long) f()) & 255) << 16) | ((((long) f()) & 255) << 24) | ((((long) f()) & 255) << 32) | ((((long) f()) & 255) << 40) | ((((long) f()) & 255) << 48);
            bF = f();
        }
        return jF | ((((long) bF) & 255) << 56);
    }

    public final long j() {
        long jF;
        long j;
        long j2;
        int i;
        long j3 = this.k;
        if (this.m != j3) {
            long j4 = j3 + 1;
            byte bF = nv6.f(j3);
            if (bF >= 0) {
                this.k++;
                return bF;
            }
            if (this.m - this.k >= 10) {
                long j5 = j4 + 1;
                int iF = bF ^ (nv6.f(j4) << 7);
                if (iF >= 0) {
                    long j6 = j5 + 1;
                    int iF2 = iF ^ (nv6.f(j5) << 14);
                    if (iF2 < 0) {
                        j5 = j6 + 1;
                        int iF3 = iF2 ^ (nv6.f(j6) << 21);
                        if (iF3 < 0) {
                            i = iF3 ^ (-2080896);
                        } else {
                            j6 = j5 + 1;
                            long jF2 = ((long) iF3) ^ (((long) nv6.f(j5)) << 28);
                            if (jF2 >= 0) {
                                j2 = 266354560;
                            } else {
                                long j7 = j6 + 1;
                                long jF3 = jF2 ^ (((long) nv6.f(j6)) << 35);
                                if (jF3 < 0) {
                                    j = -34093383808L;
                                } else {
                                    j6 = j7 + 1;
                                    jF2 = jF3 ^ (((long) nv6.f(j7)) << 42);
                                    if (jF2 >= 0) {
                                        j2 = 4363953127296L;
                                    } else {
                                        j7 = j6 + 1;
                                        jF3 = jF2 ^ (((long) nv6.f(j6)) << 49);
                                        if (jF3 < 0) {
                                            j = -558586000294016L;
                                        } else {
                                            j6 = j7 + 1;
                                            jF = (jF3 ^ (((long) nv6.f(j7)) << 56)) ^ 71499008037633920L;
                                            if (jF < 0) {
                                                long j8 = 1 + j6;
                                                if (nv6.f(j6) >= 0) {
                                                    j5 = j8;
                                                }
                                            }
                                        }
                                    }
                                }
                                jF = jF3 ^ j;
                                j5 = j7;
                            }
                            jF = jF2 ^ j2;
                        }
                        this.k = j5;
                        return jF;
                    }
                    jF = iF2 ^ 16256;
                    j5 = j6;
                    this.k = j5;
                    return jF;
                }
                i = iF ^ (-128);
                jF = i;
                this.k = j5;
                return jF;
            }
        }
        return k();
    }

    public final long k() throws zzgoz {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte bF = f();
            j |= ((long) (bF & 127)) << i;
            if ((bF & 128) == 0) {
                return j;
            }
        }
        throw zzgoz.c();
    }

    @Override // com.google.android.gms.internal.ads.zzgnn
    public final void zzA(int i) {
        this.h = i;
        int i2 = this.f + this.g;
        this.f = i2;
        if (i2 <= i) {
            this.g = 0;
            return;
        }
        int i3 = i2 - i;
        this.g = i3;
        this.f = i2 - i3;
    }

    @Override // com.google.android.gms.internal.ads.zzgnn
    public final boolean zzC() {
        return (((long) this.j) + this.k) - this.l == ((long) this.f);
    }

    @Override // com.google.android.gms.internal.ads.zzgnn
    public final boolean zzD() {
        return j() != 0;
    }

    @Override // com.google.android.gms.internal.ads.zzgnn
    public final boolean zzE(int i) throws zzgoz {
        int iZzm;
        int i2 = i & 7;
        if (i2 == 0) {
            for (int i3 = 0; i3 < 10; i3++) {
                if (f() >= 0) {
                    return true;
                }
            }
            throw zzgoz.c();
        }
        if (i2 == 1) {
            a(8);
            return true;
        }
        if (i2 == 2) {
            a(h());
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
        return Double.longBitsToDouble(i());
    }

    @Override // com.google.android.gms.internal.ads.zzgnn
    public final float zzc() {
        return Float.intBitsToFloat(g());
    }

    @Override // com.google.android.gms.internal.ads.zzgnn
    public final int zzd() {
        return (int) ((((long) this.j) + this.k) - this.l);
    }

    @Override // com.google.android.gms.internal.ads.zzgnn
    public final int zze(int i) throws zzgoz {
        if (i < 0) {
            throw zzgoz.d();
        }
        int iZzd = zzd() + i;
        int i2 = this.h;
        if (iZzd > i2) {
            throw zzgoz.f();
        }
        this.h = iZzd;
        int i3 = this.f + this.g;
        this.f = i3;
        if (i3 > iZzd) {
            int i4 = i3 - iZzd;
            this.g = i4;
            this.f = i3 - i4;
        } else {
            this.g = 0;
        }
        return i2;
    }

    @Override // com.google.android.gms.internal.ads.zzgnn
    public final int zzf() {
        return h();
    }

    @Override // com.google.android.gms.internal.ads.zzgnn
    public final int zzg() {
        return g();
    }

    @Override // com.google.android.gms.internal.ads.zzgnn
    public final int zzh() {
        return h();
    }

    @Override // com.google.android.gms.internal.ads.zzgnn
    public final int zzk() {
        return g();
    }

    @Override // com.google.android.gms.internal.ads.zzgnn
    public final int zzl() {
        return zzgnn.zzF(h());
    }

    @Override // com.google.android.gms.internal.ads.zzgnn
    public final int zzm() throws zzgoz {
        if (zzC()) {
            this.i = 0;
            return 0;
        }
        int iH = h();
        this.i = iH;
        if ((iH >>> 3) != 0) {
            return iH;
        }
        throw new zzgoz("Protocol message contained an invalid tag (zero).");
    }

    @Override // com.google.android.gms.internal.ads.zzgnn
    public final int zzn() {
        return h();
    }

    @Override // com.google.android.gms.internal.ads.zzgnn
    public final long zzo() {
        return i();
    }

    @Override // com.google.android.gms.internal.ads.zzgnn
    public final long zzp() {
        return j();
    }

    @Override // com.google.android.gms.internal.ads.zzgnn
    public final long zzt() {
        return i();
    }

    @Override // com.google.android.gms.internal.ads.zzgnn
    public final long zzu() {
        return zzgnn.zzG(j());
    }

    @Override // com.google.android.gms.internal.ads.zzgnn
    public final long zzv() {
        return j();
    }

    @Override // com.google.android.gms.internal.ads.zzgnn
    public final zzgnf zzw() throws zzgoz {
        int iH = h();
        if (iH > 0) {
            long j = iH;
            long j2 = this.m;
            long j3 = this.k;
            if (j <= j2 - j3) {
                byte[] bArr = new byte[iH];
                nv6.c.g(j3, bArr, 0L, j);
                this.k += j;
                zzgnf zzgnfVar = zzgnf.zzb;
                return new ht6(bArr);
            }
        }
        if (iH > 0 && iH <= b()) {
            byte[] bArr2 = new byte[iH];
            d(bArr2, iH);
            zzgnf zzgnfVar2 = zzgnf.zzb;
            return new ht6(bArr2);
        }
        if (iH == 0) {
            return zzgnf.zzb;
        }
        if (iH < 0) {
            throw zzgoz.d();
        }
        throw zzgoz.f();
    }

    @Override // com.google.android.gms.internal.ads.zzgnn
    public final String zzx() throws zzgoz {
        int iH = h();
        if (iH > 0) {
            long j = iH;
            long j2 = this.m;
            long j3 = this.k;
            if (j <= j2 - j3) {
                byte[] bArr = new byte[iH];
                nv6.c.g(j3, bArr, 0L, j);
                String str = new String(bArr, zzgox.a);
                this.k += j;
                return str;
            }
        }
        if (iH > 0 && iH <= b()) {
            byte[] bArr2 = new byte[iH];
            d(bArr2, iH);
            return new String(bArr2, zzgox.a);
        }
        if (iH == 0) {
            return "";
        }
        if (iH < 0) {
            throw zzgoz.d();
        }
        throw zzgoz.f();
    }

    @Override // com.google.android.gms.internal.ads.zzgnn
    public final String zzy() throws zzgoz {
        String strA;
        int iH = h();
        if (iH > 0) {
            long j = iH;
            long j2 = this.m;
            long j3 = this.k;
            if (j <= j2 - j3) {
                long j4 = this.l;
                ByteBuffer byteBuffer = this.e;
                int i = (int) (j3 - j4);
                pv6 pv6Var = rv6.a;
                if (byteBuffer.hasArray()) {
                    strA = pv6Var.c(byteBuffer.array(), byteBuffer.arrayOffset() + i, iH);
                } else {
                    strA = byteBuffer.isDirect() ? ov6.a(byteBuffer, i, iH) : ov6.a(byteBuffer, i, iH);
                }
                this.k += j;
                return strA;
            }
        }
        if (iH >= 0 && iH <= b()) {
            byte[] bArr = new byte[iH];
            d(bArr, iH);
            return rv6.a.c(bArr, 0, iH);
        }
        if (iH == 0) {
            return "";
        }
        if (iH <= 0) {
            throw zzgoz.d();
        }
        throw zzgoz.f();
    }

    @Override // com.google.android.gms.internal.ads.zzgnn
    public final void zzz(int i) throws zzgoz {
        if (this.i != i) {
            throw new zzgoz("Protocol message end-group tag did not match expected tag.");
        }
    }
}
