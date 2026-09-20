package com.google.android.gms.internal.ads;

import defpackage.s87;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* JADX INFO: loaded from: classes3.dex */
public final class zzpc implements zzne {
    public int a;
    public float b = 1.0f;
    public float c = 1.0f;
    public zznc d;
    public zznc e;
    public zznc f;
    public zznc g;
    public boolean h;
    public s87 i;
    public ByteBuffer j;
    public ShortBuffer k;
    public ByteBuffer l;
    public long m;
    public long n;
    public boolean o;

    public zzpc() {
        zznc zzncVar = zznc.zza;
        this.d = zzncVar;
        this.e = zzncVar;
        this.f = zzncVar;
        this.g = zzncVar;
        ByteBuffer byteBuffer = zzne.zza;
        this.j = byteBuffer;
        this.k = byteBuffer.asShortBuffer();
        this.l = byteBuffer;
        this.a = -1;
    }

    @Override // com.google.android.gms.internal.ads.zzne
    public final zznc zza(zznc zzncVar) throws zznd {
        if (zzncVar.zzd != 2) {
            throw new zznd(zzncVar);
        }
        int i = this.a;
        if (i == -1) {
            i = zzncVar.zzb;
        }
        this.d = zzncVar;
        zznc zzncVar2 = new zznc(i, zzncVar.zzc, 2);
        this.e = zzncVar2;
        this.h = true;
        return zzncVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzne
    public final ByteBuffer zzb() {
        s87 s87Var = this.i;
        if (s87Var != null) {
            int i = s87Var.m;
            int i2 = s87Var.b;
            int i3 = i * i2;
            int i4 = i3 + i3;
            if (i4 > 0) {
                if (this.j.capacity() < i4) {
                    ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(i4).order(ByteOrder.nativeOrder());
                    this.j = byteBufferOrder;
                    this.k = byteBufferOrder.asShortBuffer();
                } else {
                    this.j.clear();
                    this.k.clear();
                }
                ShortBuffer shortBuffer = this.k;
                int iMin = Math.min(shortBuffer.remaining() / i2, s87Var.m);
                int i5 = iMin * i2;
                shortBuffer.put(s87Var.l, 0, i5);
                int i6 = s87Var.m - iMin;
                s87Var.m = i6;
                short[] sArr = s87Var.l;
                System.arraycopy(sArr, i5, sArr, 0, i6 * i2);
                this.n += (long) i4;
                this.j.limit(i4);
                this.l = this.j;
            }
        }
        ByteBuffer byteBuffer = this.l;
        this.l = zzne.zza;
        return byteBuffer;
    }

    @Override // com.google.android.gms.internal.ads.zzne
    public final void zzc() {
        if (zzg()) {
            zznc zzncVar = this.d;
            this.f = zzncVar;
            zznc zzncVar2 = this.e;
            this.g = zzncVar2;
            if (this.h) {
                this.i = new s87(zzncVar.zzb, zzncVar.zzc, this.b, this.c, zzncVar2.zzb);
            } else {
                s87 s87Var = this.i;
                if (s87Var != null) {
                    s87Var.k = 0;
                    s87Var.m = 0;
                    s87Var.o = 0;
                    s87Var.p = 0;
                    s87Var.q = 0;
                    s87Var.r = 0;
                    s87Var.s = 0;
                    s87Var.t = 0;
                    s87Var.u = 0;
                    s87Var.v = 0;
                }
            }
        }
        this.l = zzne.zza;
        this.m = 0L;
        this.n = 0L;
        this.o = false;
    }

    @Override // com.google.android.gms.internal.ads.zzne
    public final void zzd() {
        s87 s87Var = this.i;
        if (s87Var != null) {
            int i = s87Var.k;
            int i2 = s87Var.m;
            float f = s87Var.c;
            float f2 = s87Var.d;
            int i3 = i2 + ((int) ((((i / (f / f2)) + s87Var.o) / (s87Var.e * f2)) + 0.5f));
            short[] sArr = s87Var.j;
            int i4 = s87Var.h;
            int i5 = i4 + i4;
            s87Var.j = s87Var.f(sArr, i, i5 + i);
            int i6 = 0;
            while (true) {
                int i7 = s87Var.b;
                if (i6 >= i5 * i7) {
                    break;
                }
                s87Var.j[(i7 * i) + i6] = 0;
                i6++;
            }
            s87Var.k += i5;
            s87Var.e();
            if (s87Var.m > i3) {
                s87Var.m = i3;
            }
            s87Var.k = 0;
            s87Var.r = 0;
            s87Var.o = 0;
        }
        this.o = true;
    }

    @Override // com.google.android.gms.internal.ads.zzne
    public final void zze(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            s87 s87Var = this.i;
            s87Var.getClass();
            ShortBuffer shortBufferAsShortBuffer = byteBuffer.asShortBuffer();
            int iRemaining = byteBuffer.remaining();
            this.m += (long) iRemaining;
            int iRemaining2 = shortBufferAsShortBuffer.remaining();
            int i = s87Var.b;
            int i2 = iRemaining2 / i;
            int i3 = i2 * i;
            short[] sArrF = s87Var.f(s87Var.j, s87Var.k, i2);
            s87Var.j = sArrF;
            shortBufferAsShortBuffer.get(sArrF, s87Var.k * i, (i3 + i3) / 2);
            s87Var.k += i2;
            s87Var.e();
            byteBuffer.position(byteBuffer.position() + iRemaining);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzne
    public final void zzf() {
        this.b = 1.0f;
        this.c = 1.0f;
        zznc zzncVar = zznc.zza;
        this.d = zzncVar;
        this.e = zzncVar;
        this.f = zzncVar;
        this.g = zzncVar;
        ByteBuffer byteBuffer = zzne.zza;
        this.j = byteBuffer;
        this.k = byteBuffer.asShortBuffer();
        this.l = byteBuffer;
        this.a = -1;
        this.h = false;
        this.i = null;
        this.m = 0L;
        this.n = 0L;
        this.o = false;
    }

    @Override // com.google.android.gms.internal.ads.zzne
    public final boolean zzg() {
        if (this.e.zzb != -1) {
            return Math.abs(this.b + (-1.0f)) >= 1.0E-4f || Math.abs(this.c + (-1.0f)) >= 1.0E-4f || this.e.zzb != this.d.zzb;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzne
    public final boolean zzh() {
        if (this.o) {
            s87 s87Var = this.i;
            if (s87Var == null) {
                return true;
            }
            int i = s87Var.m * s87Var.b;
            if (i + i == 0) {
                return true;
            }
        }
        return false;
    }

    public final long zzi(long j) {
        long j2 = this.n;
        if (j2 < 1024) {
            return (long) (((double) this.b) * j);
        }
        long j3 = this.m;
        s87 s87Var = this.i;
        s87Var.getClass();
        int i = s87Var.k * s87Var.b;
        long j4 = j3 - ((long) (i + i));
        int i2 = this.g.zzb;
        int i3 = this.f.zzb;
        return i2 == i3 ? zzel.zzw(j, j4, j2) : zzel.zzw(j, j4 * ((long) i2), j2 * ((long) i3));
    }

    public final void zzj(float f) {
        if (this.c != f) {
            this.c = f;
            this.h = true;
        }
    }

    public final void zzk(float f) {
        if (this.b != f) {
            this.b = f;
            this.h = true;
        }
    }
}
