package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.os.Handler;
import android.view.Surface;
import defpackage.g36;

/* JADX INFO: loaded from: classes3.dex */
@TargetApi(17)
public final class zzbat extends Surface {
    public static boolean y;
    public static boolean z;
    public final g36 w;
    public boolean x;

    public /* synthetic */ zzbat(g36 g36Var, SurfaceTexture surfaceTexture) {
        super(surfaceTexture);
        this.w = g36Var;
    }

    public static zzbat zza(Context context, boolean z2) {
        if (zzban.zza < 17) {
            throw new UnsupportedOperationException("Unsupported prior to API level 17");
        }
        boolean z3 = false;
        zzazy.zze(!z2 || zzb(context));
        g36 g36Var = new g36();
        g36Var.start();
        g36Var.x = new Handler(g36Var.getLooper(), g36Var);
        synchronized (g36Var) {
            g36Var.x.obtainMessage(1, z2 ? 1 : 0, 0).sendToTarget();
            while (g36Var.B == null && g36Var.A == null && g36Var.z == null) {
                try {
                    g36Var.wait();
                } catch (InterruptedException unused) {
                    z3 = true;
                }
            }
        }
        if (z3) {
            Thread.currentThread().interrupt();
        }
        RuntimeException runtimeException = g36Var.A;
        if (runtimeException != null) {
            throw runtimeException;
        }
        Error error = g36Var.z;
        if (error == null) {
            return g36Var.B;
        }
        throw error;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0046  */
    public static synchronized boolean zzb(Context context) {
        if (!z) {
            int i = zzban.zza;
            if (i >= 17) {
                boolean z2 = false;
                String strEglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373);
                if (strEglQueryString != null && strEglQueryString.contains("EGL_EXT_protected_content")) {
                    if (i == 24) {
                        String str = zzban.zzd;
                        if ((!str.startsWith("SM-G950") && !str.startsWith("SM-G955")) || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) {
                            z2 = true;
                        }
                    } else {
                        z2 = true;
                    }
                }
                y = z2;
            }
            z = true;
        }
        return y;
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        synchronized (this.w) {
            try {
                if (!this.x) {
                    this.w.x.sendEmptyMessage(3);
                    this.x = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
