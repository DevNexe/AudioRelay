package com.google.android.gms.internal.ads;

import defpackage.t06;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class zzauh implements zzath {
    public t06 c;
    public ByteBuffer f;
    public ShortBuffer g;
    public ByteBuffer h;
    public long i;
    public long j;
    public boolean k;
    public float d = 1.0f;
    public float e = 1.0f;
    public int a = -1;
    public int b = -1;

    public zzauh() {
        ByteBuffer byteBuffer = zzath.zza;
        this.f = byteBuffer;
        this.g = byteBuffer.asShortBuffer();
        this.h = byteBuffer;
    }

    @Override // com.google.android.gms.internal.ads.zzath
    public final int zza() {
        return this.a;
    }

    @Override // com.google.android.gms.internal.ads.zzath
    public final int zzb() {
        return 2;
    }

    @Override // com.google.android.gms.internal.ads.zzath
    public final ByteBuffer zzc() {
        ByteBuffer byteBuffer = this.h;
        this.h = zzath.zza;
        return byteBuffer;
    }

    @Override // com.google.android.gms.internal.ads.zzath
    public final void zzd() {
        t06 t06Var = new t06(this.b, this.a);
        this.c = t06Var;
        t06Var.o = this.d;
        t06Var.p = this.e;
        this.h = zzath.zza;
        this.i = 0L;
        this.j = 0L;
        this.k = false;
    }

    @Override // com.google.android.gms.internal.ads.zzath
    public final void zze() {
        t06 t06Var = this.c;
        int i = t06Var.q;
        float f = t06Var.o;
        float f2 = t06Var.p;
        int i2 = t06Var.r + ((int) ((((i / (f / f2)) + t06Var.s) / f2) + 0.5f));
        int i3 = t06Var.e;
        int i4 = i3 + i3;
        int i5 = i4 + i;
        int i6 = t06Var.g;
        int i7 = i + i5;
        int i8 = t06Var.b;
        if (i7 > i6) {
            int i9 = (i6 / 2) + i5 + i6;
            t06Var.g = i9;
            t06Var.h = Arrays.copyOf(t06Var.h, i9 * i8);
        }
        for (int i10 = 0; i10 < i4 * i8; i10++) {
            t06Var.h[(i8 * i) + i10] = 0;
        }
        t06Var.q += i4;
        t06Var.e();
        if (t06Var.r > i2) {
            t06Var.r = i2;
        }
        t06Var.q = 0;
        t06Var.t = 0;
        t06Var.s = 0;
        this.k = true;
    }

    @Override // com.google.android.gms.internal.ads.zzath
    public final void zzf(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            ShortBuffer shortBufferAsShortBuffer = byteBuffer.asShortBuffer();
            int iRemaining = byteBuffer.remaining();
            this.i += (long) iRemaining;
            t06 t06Var = this.c;
            t06Var.getClass();
            int iRemaining2 = shortBufferAsShortBuffer.remaining();
            int i = t06Var.b;
            int i2 = iRemaining2 / i;
            int i3 = i2 * i;
            int i4 = t06Var.q;
            int i5 = t06Var.g;
            if (i4 + i2 > i5) {
                int i6 = (i5 / 2) + i2 + i5;
                t06Var.g = i6;
                t06Var.h = Arrays.copyOf(t06Var.h, i6 * i);
            }
            shortBufferAsShortBuffer.get(t06Var.h, t06Var.q * i, (i3 + i3) / 2);
            t06Var.q += i2;
            t06Var.e();
            byteBuffer.position(byteBuffer.position() + iRemaining);
        }
        int i7 = this.c.r * this.a;
        int i8 = i7 + i7;
        if (i8 > 0) {
            if (this.f.capacity() < i8) {
                ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(i8).order(ByteOrder.nativeOrder());
                this.f = byteBufferOrder;
                this.g = byteBufferOrder.asShortBuffer();
            } else {
                this.f.clear();
                this.g.clear();
            }
            t06 t06Var2 = this.c;
            ShortBuffer shortBuffer = this.g;
            t06Var2.getClass();
            int iRemaining3 = shortBuffer.remaining();
            int i9 = t06Var2.b;
            int iMin = Math.min(iRemaining3 / i9, t06Var2.r);
            int i10 = iMin * i9;
            shortBuffer.put(t06Var2.j, 0, i10);
            int i11 = t06Var2.r - iMin;
            t06Var2.r = i11;
            short[] sArr = t06Var2.j;
            System.arraycopy(sArr, i10, sArr, 0, i11 * i9);
            this.j += (long) i8;
            this.f.limit(i8);
            this.h = this.f;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzath
    public final void zzg() {
        this.c = null;
        ByteBuffer byteBuffer = zzath.zza;
        this.f = byteBuffer;
        this.g = byteBuffer.asShortBuffer();
        this.h = byteBuffer;
        this.a = -1;
        this.b = -1;
        this.i = 0L;
        this.j = 0L;
        this.k = false;
    }

    @Override // com.google.android.gms.internal.ads.zzath
    public final boolean zzh(int i, int i2, int i3) throws zzatg {
        if (i3 != 2) {
            throw new zzatg(i, i2, i3);
        }
        if (this.b == i && this.a == i2) {
            return false;
        }
        this.b = i;
        this.a = i2;
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzath
    public final boolean zzi() {
        return Math.abs(this.d + (-1.0f)) >= 0.01f || Math.abs(this.e + (-1.0f)) >= 0.01f;
    }

    @Override // com.google.android.gms.internal.ads.zzath
    public final boolean zzj() {
        if (!this.k) {
            return false;
        }
        t06 t06Var = this.c;
        return t06Var == null || t06Var.r == 0;
    }

    public final float zzk(float f) {
        this.e = zzban.zza(1.0f, 0.1f, 8.0f);
        return 1.0f;
    }

    public final float zzl(float f) {
        float fZza = zzban.zza(f, 0.1f, 8.0f);
        this.d = fZza;
        return fZza;
    }

    public final long zzm() {
        return this.i;
    }

    public final long zzn() {
        return this.j;
    }
}
