package com.google.android.gms.internal.ads;

import defpackage.m26;
import defpackage.n26;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class zzayj implements zzave {
    public n26 e;
    public n26 f;
    public zzass g;
    public long h;
    public zzayi j;
    public final zzazl k;
    public final m26 a = new m26();
    public final zzayf b = new zzayf();
    public final zzbag c = new zzbag(32);
    public final AtomicInteger d = new AtomicInteger();
    public int i = 65536;

    public zzayj(zzazl zzazlVar, byte[] bArr) {
        this.k = zzazlVar;
        n26 n26Var = new n26(0L);
        this.e = n26Var;
        this.f = n26Var;
    }

    public final int a(int i) {
        if (this.i == 65536) {
            this.i = 0;
            n26 n26Var = this.f;
            if (n26Var.c) {
                this.f = n26Var.e;
            }
            n26 n26Var2 = this.f;
            zzazf zzazfVarZzb = this.k.zzb();
            n26 n26Var3 = new n26(this.f.b);
            n26Var2.d = zzazfVarZzb;
            n26Var2.e = n26Var3;
            n26Var2.c = true;
        }
        return Math.min(i, 65536 - this.i);
    }

    public final void b() {
        m26 m26Var = this.a;
        m26Var.j = 0;
        m26Var.k = 0;
        m26Var.l = 0;
        m26Var.i = 0;
        m26Var.o = true;
        n26 n26Var = this.e;
        boolean z = n26Var.c;
        zzazl zzazlVar = this.k;
        if (z) {
            n26 n26Var2 = this.f;
            int i = (((int) (n26Var2.a - n26Var.a)) / 65536) + (n26Var2.c ? 1 : 0);
            zzazf[] zzazfVarArr = new zzazf[i];
            for (int i2 = 0; i2 < i; i2++) {
                zzazfVarArr[i2] = n26Var.d;
                n26Var.d = null;
                n26Var = n26Var.e;
            }
            zzazlVar.zzd(zzazfVarArr);
        }
        n26 n26Var3 = new n26(0L);
        this.e = n26Var3;
        this.f = n26Var3;
        this.h = 0L;
        this.i = 65536;
        zzazlVar.zzg();
    }

    public final void c(long j) {
        while (true) {
            n26 n26Var = this.e;
            if (j < n26Var.b) {
                return;
            }
            this.k.zzc(n26Var.d);
            n26 n26Var2 = this.e;
            n26Var2.d = null;
            this.e = n26Var2.e;
        }
    }

    public final void d() {
        if (this.d.compareAndSet(1, 0)) {
            return;
        }
        b();
    }

    public final void e(int i, long j, byte[] bArr) {
        c(j);
        int i2 = 0;
        while (i2 < i) {
            int i3 = (int) (j - this.e.a);
            int iMin = Math.min(i - i2, 65536 - i3);
            zzazf zzazfVar = this.e.d;
            System.arraycopy(zzazfVar.zza, i3, bArr, i2, iMin);
            j += (long) iMin;
            i2 += iMin;
            if (j == this.e.b) {
                this.k.zzc(zzazfVar);
                n26 n26Var = this.e;
                n26Var.d = null;
                this.e = n26Var.e;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzave
    public final void zza(zzass zzassVar) {
        boolean z;
        if (zzassVar == null) {
            zzassVar = null;
        }
        m26 m26Var = this.a;
        synchronized (m26Var) {
            z = true;
            try {
                if (zzassVar == null) {
                    m26Var.p = true;
                } else {
                    m26Var.p = false;
                    if (!zzban.zzo(zzassVar, m26Var.q)) {
                        m26Var.q = zzassVar;
                    }
                }
                z = false;
            } catch (Throwable th) {
                throw th;
            }
        }
        zzayi zzayiVar = this.j;
        if (zzayiVar == null || !z) {
            return;
        }
        zzayiVar.zzv(zzassVar);
    }

    @Override // com.google.android.gms.internal.ads.zzave
    public final void zzb(zzbag zzbagVar, int i) {
        if (!this.d.compareAndSet(0, 1)) {
            zzbagVar.zzw(i);
            return;
        }
        while (i > 0) {
            int iA = a(i);
            zzbagVar.zzq(this.f.d.zza, this.i, iA);
            this.i += iA;
            this.h += (long) iA;
            i -= iA;
        }
        d();
    }

    @Override // com.google.android.gms.internal.ads.zzave
    public final void zzc(long j, int i, int i2, int i3, zzavd zzavdVar) {
        if (!this.d.compareAndSet(0, 1)) {
            m26 m26Var = this.a;
            synchronized (m26Var) {
                m26Var.n = Math.max(m26Var.n, j);
            }
        } else {
            try {
                this.a.a(j, i, this.h - ((long) i2), i2, zzavdVar);
            } finally {
                d();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzave
    public final int zzd(zzauu zzauuVar, int i, boolean z) throws InterruptedException, EOFException {
        if (!this.d.compareAndSet(0, 1)) {
            int iZzb = zzauuVar.zzb(i);
            if (iZzb != -1) {
                return iZzb;
            }
            throw new EOFException();
        }
        try {
            int iZza = zzauuVar.zza(this.f.d.zza, this.i, a(i));
            if (iZza == -1) {
                throw new EOFException();
            }
            this.i += iZza;
            this.h += (long) iZza;
            d();
            return iZza;
        } catch (Throwable th) {
            d();
            throw th;
        }
    }

    public final int zze() {
        m26 m26Var = this.a;
        return m26Var.j + m26Var.i;
    }

    public final int zzf(zzast zzastVar, zzaun zzaunVar, boolean z, boolean z2, long j) {
        int i;
        byte b;
        int iZzj;
        m26 m26Var = this.a;
        zzass zzassVar = this.g;
        zzayf zzayfVar = this.b;
        synchronized (m26Var) {
            if (m26Var.b()) {
                if (!z) {
                    zzass[] zzassVarArr = m26Var.h;
                    int i2 = m26Var.k;
                    if (zzassVarArr[i2] == zzassVar) {
                        if (zzaunVar.zzb != null) {
                            zzaunVar.zzc = m26Var.f[i2];
                            zzaunVar.zzc(m26Var.e[i2]);
                            int[] iArr = m26Var.d;
                            int i3 = m26Var.k;
                            zzayfVar.zza = iArr[i3];
                            zzayfVar.zzb = m26Var.c[i3];
                            zzayfVar.zzd = m26Var.g[i3];
                            m26Var.m = Math.max(m26Var.m, zzaunVar.zzc);
                            int i4 = m26Var.i - 1;
                            m26Var.i = i4;
                            int i5 = m26Var.k + 1;
                            m26Var.k = i5;
                            m26Var.j++;
                            if (i5 == m26Var.a) {
                                m26Var.k = 0;
                                i5 = 0;
                            }
                            zzayfVar.zzc = i4 > 0 ? m26Var.c[i5] : zzayfVar.zzb + ((long) zzayfVar.zza);
                            b = -4;
                        } else {
                            b = -3;
                        }
                    }
                }
                zzastVar.zza = m26Var.h[m26Var.k];
                b = -5;
            } else if (z2) {
                zzaunVar.zzc(4);
                b = -4;
            } else {
                zzass zzassVar2 = m26Var.q;
                if (zzassVar2 == null || (!z && zzassVar2 == zzassVar)) {
                    b = -3;
                } else {
                    zzastVar.zza = zzassVar2;
                    b = -5;
                }
            }
        }
        if (b == -5) {
            this.g = zzastVar.zza;
            return -5;
        }
        if (b != -4) {
            return -3;
        }
        if (!zzaunVar.zzf()) {
            if (zzaunVar.zzc < j) {
                zzaunVar.zza(Integer.MIN_VALUE);
            }
            if (zzaunVar.zzi()) {
                zzayf zzayfVar2 = this.b;
                long j2 = zzayfVar2.zzb;
                this.c.zzs(1);
                e(1, j2, this.c.zza);
                long j3 = j2 + 1;
                byte b2 = this.c.zza[0];
                int i6 = b2 & 128;
                int i7 = b2 & 127;
                zzaul zzaulVar = zzaunVar.zza;
                if (zzaulVar.zza == null) {
                    zzaulVar.zza = new byte[16];
                }
                e(i7, j3, zzaulVar.zza);
                long j4 = j3 + ((long) i7);
                if (i6 != 0) {
                    this.c.zzs(2);
                    e(2, j4, this.c.zza);
                    j4 += 2;
                    iZzj = this.c.zzj();
                } else {
                    iZzj = 1;
                }
                zzaul zzaulVar2 = zzaunVar.zza;
                int[] iArr2 = zzaulVar2.zzd;
                if (iArr2 == null || iArr2.length < iZzj) {
                    iArr2 = new int[iZzj];
                }
                int[] iArr3 = iArr2;
                int[] iArr4 = zzaulVar2.zze;
                if (iArr4 == null || iArr4.length < iZzj) {
                    iArr4 = new int[iZzj];
                }
                int[] iArr5 = iArr4;
                if (i6 != 0) {
                    int i8 = iZzj * 6;
                    this.c.zzs(i8);
                    e(i8, j4, this.c.zza);
                    j4 += (long) i8;
                    this.c.zzv(0);
                    for (i = 0; i < iZzj; i++) {
                        iArr3[i] = this.c.zzj();
                        iArr5[i] = this.c.zzi();
                    }
                } else {
                    iArr3[0] = 0;
                    iArr5[0] = zzayfVar2.zza - ((int) (j4 - zzayfVar2.zzb));
                }
                zzavd zzavdVar = zzayfVar2.zzd;
                zzaul zzaulVar3 = zzaunVar.zza;
                zzaulVar3.zzb(iZzj, iArr3, iArr5, zzavdVar.zzb, zzaulVar3.zza, 1);
                long j5 = zzayfVar2.zzb;
                int i9 = (int) (j4 - j5);
                zzayfVar2.zzb = j5 + ((long) i9);
                zzayfVar2.zza -= i9;
            }
            zzaunVar.zzh(this.b.zza);
            zzayf zzayfVar3 = this.b;
            long j6 = zzayfVar3.zzb;
            ByteBuffer byteBuffer = zzaunVar.zzb;
            int i10 = zzayfVar3.zza;
            c(j6);
            while (i10 > 0) {
                int i11 = (int) (j6 - this.e.a);
                int iMin = Math.min(i10, 65536 - i11);
                zzazf zzazfVar = this.e.d;
                byteBuffer.put(zzazfVar.zza, i11, iMin);
                j6 += (long) iMin;
                i10 -= iMin;
                if (j6 == this.e.b) {
                    this.k.zzc(zzazfVar);
                    n26 n26Var = this.e;
                    n26Var.d = null;
                    this.e = n26Var.e;
                }
            }
            c(this.b.zzc);
        }
        return -4;
    }

    public final long zzg() {
        long jMax;
        m26 m26Var = this.a;
        synchronized (m26Var) {
            jMax = Math.max(m26Var.m, m26Var.n);
        }
        return jMax;
    }

    public final zzass zzh() {
        m26 m26Var = this.a;
        synchronized (m26Var) {
            if (m26Var.p) {
                return null;
            }
            return m26Var.q;
        }
    }

    public final void zzi() {
        if (this.d.getAndSet(2) == 0) {
            b();
        }
    }

    public final void zzj(boolean z) {
        int andSet = this.d.getAndSet(true != z ? 2 : 0);
        b();
        m26 m26Var = this.a;
        m26Var.m = Long.MIN_VALUE;
        m26Var.n = Long.MIN_VALUE;
        if (andSet == 2) {
            this.g = null;
        }
    }

    public final void zzk(zzayi zzayiVar) {
        this.j = zzayiVar;
    }

    public final void zzl() {
        long j;
        m26 m26Var = this.a;
        synchronized (m26Var) {
            if (m26Var.b()) {
                int i = m26Var.k;
                int i2 = m26Var.i;
                int i3 = i + i2;
                int i4 = m26Var.a;
                int i5 = (i3 - 1) % i4;
                m26Var.k = i3 % i4;
                m26Var.j += i2;
                m26Var.i = 0;
                j = m26Var.c[i5] + ((long) m26Var.d[i5]);
            } else {
                j = -1;
            }
        }
        if (j != -1) {
            c(j);
        }
    }

    public final boolean zzm() {
        return this.a.b();
    }

    public final boolean zzn(long j, boolean z) {
        long j2;
        m26 m26Var = this.a;
        synchronized (m26Var) {
            if (m26Var.b()) {
                long[] jArr = m26Var.f;
                int i = m26Var.k;
                if (j < jArr[i]) {
                    j2 = -1;
                } else {
                    if (j <= m26Var.n || z) {
                        int i2 = -1;
                        int i3 = 0;
                        while (i != m26Var.l && m26Var.f[i] <= j) {
                            if (1 == (m26Var.e[i] & 1)) {
                                i2 = i3;
                            }
                            i = (i + 1) % m26Var.a;
                            i3++;
                        }
                        if (i2 != -1) {
                            int i4 = (m26Var.k + i2) % m26Var.a;
                            m26Var.k = i4;
                            m26Var.j += i2;
                            m26Var.i -= i2;
                            j2 = m26Var.c[i4];
                        }
                    }
                    j2 = -1;
                }
            } else {
                j2 = -1;
            }
        }
        if (j2 == -1) {
            return false;
        }
        c(j2);
        return true;
    }
}
