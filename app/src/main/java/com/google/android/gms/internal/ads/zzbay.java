package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.view.WindowManager;
import defpackage.h36;

/* JADX INFO: loaded from: classes3.dex */
@TargetApi(16)
public final class zzbay {
    public final h36 a;
    public final boolean b;
    public final long c;
    public final long d;
    public long e;
    public long f;
    public long g;
    public boolean h;
    public long i;
    public long j;
    public long k;

    public zzbay() {
        this(-1.0d);
    }

    public final long zza(long j, long j2) {
        long j3;
        long j4;
        long j5;
        long j6 = 1000 * j;
        if (this.h) {
            if (j != this.e) {
                this.k++;
                this.f = this.g;
            }
            long j7 = this.k;
            if (j7 >= 6) {
                long j8 = this.j;
                j4 = this.f + ((j6 - j8) / j7);
                if (Math.abs((j2 - this.i) - (j4 - j8)) > 20000000) {
                    this.h = false;
                } else {
                    j3 = (this.i + j4) - this.j;
                }
            } else {
                if (Math.abs((j2 - this.i) - (j6 - this.j)) > 20000000) {
                    this.h = false;
                }
            }
            j3 = j2;
            j4 = j6;
        } else {
            j3 = j2;
            j4 = j6;
        }
        if (!this.h) {
            this.j = j6;
            this.i = j2;
            this.k = 0L;
            this.h = true;
        }
        this.e = j;
        this.g = j4;
        h36 h36Var = this.a;
        if (h36Var == null || h36Var.w == 0) {
            return j3;
        }
        long j9 = this.a.w;
        long j10 = this.c;
        long j11 = (((j3 - j9) / j10) * j10) + j9;
        if (j3 <= j11) {
            j5 = j11 - j10;
        } else {
            j5 = j11;
            j11 = j10 + j11;
        }
        if (j11 - j3 >= j3 - j5) {
            j11 = j5;
        }
        return j11 - this.d;
    }

    public final void zzb() {
        if (this.b) {
            this.a.x.sendEmptyMessage(2);
        }
    }

    public final void zzc() {
        this.h = false;
        if (this.b) {
            this.a.x.sendEmptyMessage(1);
        }
    }

    public zzbay(double d) {
        long j;
        boolean z = d != -1.0d;
        this.b = z;
        if (z) {
            this.a = h36.A;
            long j2 = (long) (1.0E9d / d);
            this.c = j2;
            j = (j2 * 80) / 100;
        } else {
            this.a = null;
            j = -1;
            this.c = -1L;
        }
        this.d = j;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public zzbay(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        this(windowManager.getDefaultDisplay() != null ? windowManager.getDefaultDisplay().getRefreshRate() : -1.0d);
    }
}
