package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.util.Log;
import android.view.Display;
import android.view.Surface;
import android.view.WindowManager;
import defpackage.ad7;
import defpackage.bd7;
import defpackage.od6;
import defpackage.pc7;
import defpackage.wc7;
import defpackage.yc7;
import defpackage.zc7;

/* JADX INFO: loaded from: classes3.dex */
public final class zzxo {
    public final wc7 a = new wc7();
    public final zc7 b;
    public final bd7 c;
    public boolean d;
    public Surface e;
    public float f;
    public float g;
    public float h;
    public float i;
    public int j;
    public long k;
    public long l;
    public long m;
    public long n;
    public long o;
    public long p;
    public long q;

    /* JADX WARN: Code duplicated, block: B:12:0x0039  */
    public zzxo(Context context) {
        zc7 ad7Var;
        if (context != null) {
            Context applicationContext = context.getApplicationContext();
            int i = zzel.zza;
            DisplayManager displayManager = (DisplayManager) applicationContext.getSystemService("display");
            ad7Var = displayManager != null ? new ad7(displayManager) : null;
            if (ad7Var == null) {
                WindowManager windowManager = (WindowManager) applicationContext.getSystemService("window");
                if (windowManager != null) {
                    ad7Var = new od6(windowManager, 8);
                } else {
                    ad7Var = null;
                }
            }
        } else {
            ad7Var = null;
        }
        this.b = ad7Var;
        this.c = ad7Var != null ? bd7.A : null;
        this.k = -9223372036854775807L;
        this.l = -9223372036854775807L;
        this.f = -1.0f;
        this.i = 1.0f;
        this.j = 0;
    }

    public static /* synthetic */ void zzb(zzxo zzxoVar, Display display) {
        if (display != null) {
            long refreshRate = (long) (1.0E9d / ((double) display.getRefreshRate()));
            zzxoVar.k = refreshRate;
            zzxoVar.l = (refreshRate * 80) / 100;
        } else {
            Log.w("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            zzxoVar.k = -9223372036854775807L;
            zzxoVar.l = -9223372036854775807L;
        }
    }

    public final void a() {
        Surface surface;
        if (zzel.zza < 30 || (surface = this.e) == null || this.j == Integer.MIN_VALUE || this.h == 0.0f) {
            return;
        }
        this.h = 0.0f;
        yc7.a(surface, 0.0f);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0073  */
    /* JADX WARN: Code duplicated, block: B:41:0x0088  */
    /* JADX WARN: Code duplicated, block: B:42:0x008a  */
    /* JADX WARN: Code duplicated, block: B:45:0x008e A[RETURN] */
    public final void b() {
        float f;
        boolean z;
        float f2;
        if (zzel.zza < 30 || this.e == null) {
            return;
        }
        wc7 wc7Var = this.a;
        if (!wc7Var.a.c()) {
            f = this.f;
        } else if (wc7Var.a.c()) {
            pc7 pc7Var = wc7Var.a;
            long j = pc7Var.e;
            f = (float) (1.0E9d / (j != 0 ? pc7Var.f / j : 0L));
        } else {
            f = -1.0f;
        }
        float f3 = this.g;
        if (f == f3) {
            return;
        }
        if (f != -1.0f && f3 != -1.0f) {
            if (wc7Var.a.c()) {
                if ((wc7Var.a.c() ? wc7Var.a.f : -9223372036854775807L) >= 5000000000L) {
                    f2 = 0.02f;
                } else {
                    f2 = 1.0f;
                }
            } else {
                f2 = 1.0f;
            }
            if (Math.abs(f - this.g) >= f2) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                return;
            }
        } else if (f == -1.0f) {
            if (wc7Var.e >= 30) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                return;
            }
        }
        this.g = f;
        c(false);
    }

    public final void c(boolean z) {
        Surface surface;
        if (zzel.zza < 30 || (surface = this.e) == null || this.j == Integer.MIN_VALUE) {
            return;
        }
        float f = 0.0f;
        if (this.d) {
            float f2 = this.g;
            if (f2 != -1.0f) {
                f = this.i * f2;
            }
        }
        if (z || this.h != f) {
            this.h = f;
            yc7.a(surface, f);
        }
    }

    public final long zza(long j) {
        long j2;
        long j3;
        long j4;
        if (this.p == -1 || !this.a.a.c()) {
            j2 = j;
        } else {
            wc7 wc7Var = this.a;
            if (wc7Var.a.c()) {
                pc7 pc7Var = wc7Var.a;
                long j5 = pc7Var.e;
                j4 = j5 == 0 ? 0L : pc7Var.f / j5;
            } else {
                j4 = -9223372036854775807L;
            }
            j2 = this.q + ((long) (((this.m - this.p) * j4) / this.i));
            if (Math.abs(j - j2) > 20000000) {
                this.m = 0L;
                this.p = -1L;
                this.n = -1L;
                j2 = j;
            }
        }
        this.n = this.m;
        this.o = j2;
        bd7 bd7Var = this.c;
        if (bd7Var == null || this.k == -9223372036854775807L) {
            return j2;
        }
        long j6 = bd7Var.w;
        if (j6 == -9223372036854775807L) {
            return j2;
        }
        long j7 = this.k;
        long j8 = (((j2 - j6) / j7) * j7) + j6;
        if (j2 <= j8) {
            j3 = j8 - j7;
        } else {
            j3 = j8;
            j8 = j7 + j8;
        }
        if (j8 - j2 >= j2 - j3) {
            j8 = j3;
        }
        return j8 - this.l;
    }

    public final void zzc(float f) {
        this.f = f;
        wc7 wc7Var = this.a;
        wc7Var.a.b();
        wc7Var.b.b();
        wc7Var.c = false;
        wc7Var.d = -9223372036854775807L;
        wc7Var.e = 0;
        b();
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0053  */
    public final void zzd(long j) {
        boolean z;
        long j2 = this.n;
        if (j2 != -1) {
            this.p = j2;
            this.q = this.o;
        }
        this.m++;
        long j3 = j * 1000;
        wc7 wc7Var = this.a;
        wc7Var.a.a(j3);
        if (wc7Var.a.c()) {
            wc7Var.c = false;
        } else if (wc7Var.d != -9223372036854775807L) {
            if (wc7Var.c) {
                pc7 pc7Var = wc7Var.b;
                long j4 = pc7Var.d;
                if (j4 == 0) {
                    z = false;
                } else {
                    z = pc7Var.g[(int) ((j4 - 1) % 15)];
                }
                if (z) {
                    wc7Var.b.b();
                    wc7Var.b.a(wc7Var.d);
                }
            } else {
                wc7Var.b.b();
                wc7Var.b.a(wc7Var.d);
            }
            wc7Var.c = true;
            wc7Var.b.a(j3);
        }
        if (wc7Var.c && wc7Var.b.c()) {
            pc7 pc7Var2 = wc7Var.a;
            wc7Var.a = wc7Var.b;
            wc7Var.b = pc7Var2;
            wc7Var.c = false;
        }
        wc7Var.d = j3;
        wc7Var.e = wc7Var.a.c() ? 0 : wc7Var.e + 1;
        b();
    }

    public final void zze(float f) {
        this.i = f;
        this.m = 0L;
        this.p = -1L;
        this.n = -1L;
        c(false);
    }

    public final void zzf() {
        this.m = 0L;
        this.p = -1L;
        this.n = -1L;
    }

    public final void zzg() {
        this.d = true;
        this.m = 0L;
        this.p = -1L;
        this.n = -1L;
        zc7 zc7Var = this.b;
        if (zc7Var != null) {
            bd7 bd7Var = this.c;
            bd7Var.getClass();
            bd7Var.x.sendEmptyMessage(1);
            zc7Var.b(new zzxi(this));
        }
        c(false);
    }

    public final void zzh() {
        this.d = false;
        zc7 zc7Var = this.b;
        if (zc7Var != null) {
            zc7Var.mo45zza();
            bd7 bd7Var = this.c;
            bd7Var.getClass();
            bd7Var.x.sendEmptyMessage(2);
        }
        a();
    }

    public final void zzi(Surface surface) {
        if (true == (surface instanceof zzxg)) {
            surface = null;
        }
        if (this.e == surface) {
            return;
        }
        a();
        this.e = surface;
        c(true);
    }

    public final void zzj(int i) {
        if (this.j == i) {
            return;
        }
        this.j = i;
        c(true);
    }
}
