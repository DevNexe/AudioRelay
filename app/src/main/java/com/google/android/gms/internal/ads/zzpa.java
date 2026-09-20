package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public final class zzpa extends zzob {
    public int h;
    public boolean i;
    public byte[] j;
    public byte[] k;
    public int l;
    public int m;
    public int n;
    public boolean o;
    public long p;

    public zzpa() {
        byte[] bArr = zzel.zzf;
        this.j = bArr;
        this.k = bArr;
    }

    @Override // com.google.android.gms.internal.ads.zzob
    public final void b() {
        if (this.i) {
            zznc zzncVar = this.a;
            int i = zzncVar.zze;
            this.h = i;
            int i2 = zzncVar.zzb;
            int i3 = ((int) ((150000 * ((long) i2)) / 1000000)) * i;
            if (this.j.length != i3) {
                this.j = new byte[i3];
            }
            int i4 = ((int) ((20000 * ((long) i2)) / 1000000)) * i;
            this.n = i4;
            if (this.k.length != i4) {
                this.k = new byte[i4];
            }
        }
        this.l = 0;
        this.p = 0L;
        this.m = 0;
        this.o = false;
    }

    @Override // com.google.android.gms.internal.ads.zzob
    public final void c() {
        int i = this.m;
        if (i > 0) {
            f(i, this.j);
        }
        if (this.o) {
            return;
        }
        this.p += (long) (this.n / this.h);
    }

    @Override // com.google.android.gms.internal.ads.zzob
    public final void d() {
        this.i = false;
        this.n = 0;
        byte[] bArr = zzel.zzf;
        this.j = bArr;
        this.k = bArr;
    }

    public final int e(ByteBuffer byteBuffer) {
        for (int iPosition = byteBuffer.position(); iPosition < byteBuffer.limit(); iPosition += 2) {
            if (Math.abs((int) byteBuffer.getShort(iPosition)) > 1024) {
                int i = this.h;
                return (iPosition / i) * i;
            }
        }
        return byteBuffer.limit();
    }

    public final void f(int i, byte[] bArr) {
        a(i).put(bArr, 0, i).flip();
        if (i > 0) {
            this.o = true;
        }
    }

    public final void g(ByteBuffer byteBuffer, byte[] bArr, int i) {
        int iMin = Math.min(byteBuffer.remaining(), this.n);
        int i2 = this.n - iMin;
        System.arraycopy(bArr, i - i2, this.k, 0, i2);
        byteBuffer.position(byteBuffer.limit() - iMin);
        byteBuffer.get(this.k, i2, iMin);
    }

    @Override // com.google.android.gms.internal.ads.zzne
    public final void zze(ByteBuffer byteBuffer) {
        int iPosition;
        while (byteBuffer.hasRemaining() && !this.f.hasRemaining()) {
            int i = this.l;
            if (i == 0) {
                int iLimit = byteBuffer.limit();
                byteBuffer.limit(Math.min(iLimit, byteBuffer.position() + this.j.length));
                int iLimit2 = byteBuffer.limit();
                while (true) {
                    iLimit2 -= 2;
                    if (iLimit2 < byteBuffer.position()) {
                        iPosition = byteBuffer.position();
                        break;
                    } else if (Math.abs((int) byteBuffer.getShort(iLimit2)) > 1024) {
                        int i2 = this.h;
                        iPosition = ((iLimit2 / i2) * i2) + i2;
                        break;
                    }
                }
                if (iPosition == byteBuffer.position()) {
                    this.l = 1;
                } else {
                    byteBuffer.limit(iPosition);
                    int iRemaining = byteBuffer.remaining();
                    a(iRemaining).put(byteBuffer).flip();
                    if (iRemaining > 0) {
                        this.o = true;
                    }
                }
                byteBuffer.limit(iLimit);
            } else if (i != 1) {
                int iLimit3 = byteBuffer.limit();
                int iE = e(byteBuffer);
                byteBuffer.limit(iE);
                this.p += (long) (byteBuffer.remaining() / this.h);
                g(byteBuffer, this.k, this.n);
                if (iE < iLimit3) {
                    f(this.n, this.k);
                    this.l = 0;
                    byteBuffer.limit(iLimit3);
                }
            } else {
                int iLimit4 = byteBuffer.limit();
                int iE2 = e(byteBuffer);
                int iPosition2 = iE2 - byteBuffer.position();
                byte[] bArr = this.j;
                int length = bArr.length;
                int i3 = this.m;
                int i4 = length - i3;
                if (iE2 >= iLimit4 || iPosition2 >= i4) {
                    int iMin = Math.min(iPosition2, i4);
                    byteBuffer.limit(byteBuffer.position() + iMin);
                    byteBuffer.get(this.j, this.m, iMin);
                    int i5 = this.m + iMin;
                    this.m = i5;
                    byte[] bArr2 = this.j;
                    if (i5 == bArr2.length) {
                        if (this.o) {
                            f(this.n, bArr2);
                            long j = this.p;
                            int i6 = this.m;
                            int i7 = this.n;
                            this.p = j + ((long) ((i6 - (i7 + i7)) / this.h));
                            i5 = i6;
                        } else {
                            this.p += (long) ((i5 - this.n) / this.h);
                        }
                        g(byteBuffer, this.j, i5);
                        this.m = 0;
                        this.l = 2;
                    }
                    byteBuffer.limit(iLimit4);
                } else {
                    f(i3, bArr);
                    this.m = 0;
                    this.l = 0;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzob, com.google.android.gms.internal.ads.zzne
    public final boolean zzg() {
        return this.i;
    }

    @Override // com.google.android.gms.internal.ads.zzob
    public final zznc zzi(zznc zzncVar) throws zznd {
        if (zzncVar.zzd == 2) {
            return this.i ? zzncVar : zznc.zza;
        }
        throw new zznd(zzncVar);
    }

    public final long zzo() {
        return this.p;
    }

    public final void zzp(boolean z) {
        this.i = z;
    }
}
