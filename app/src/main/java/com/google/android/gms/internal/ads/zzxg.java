package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.os.Handler;
import android.view.Surface;
import defpackage.xc7;

/* JADX INFO: loaded from: classes3.dex */
public final class zzxg extends Surface {
    public static int y;
    public static boolean z;
    public final xc7 w;
    public boolean x;
    public final boolean zza;

    public /* synthetic */ zzxg(xc7 xc7Var, SurfaceTexture surfaceTexture, boolean z2) {
        super(surfaceTexture);
        this.w = xc7Var;
        this.zza = z2;
    }

    public static zzxg zza(Context context, boolean z2) {
        boolean z3 = false;
        zzdd.zzf(!z2 || zzb(context));
        xc7 xc7Var = new xc7();
        int i = z2 ? y : 0;
        xc7Var.start();
        Handler handler = new Handler(xc7Var.getLooper(), xc7Var);
        xc7Var.x = handler;
        xc7Var.w = new zzdj(handler, null);
        synchronized (xc7Var) {
            xc7Var.x.obtainMessage(1, i, 0).sendToTarget();
            while (xc7Var.A == null && xc7Var.z == null && xc7Var.y == null) {
                try {
                    xc7Var.wait();
                } catch (InterruptedException unused) {
                    z3 = true;
                }
            }
        }
        if (z3) {
            Thread.currentThread().interrupt();
        }
        RuntimeException runtimeException = xc7Var.z;
        if (runtimeException != null) {
            throw runtimeException;
        }
        Error error = xc7Var.y;
        if (error != null) {
            throw error;
        }
        zzxg zzxgVar = xc7Var.A;
        zzxgVar.getClass();
        return zzxgVar;
    }

    public static synchronized boolean zzb(Context context) {
        String strEglQueryString;
        int i;
        if (!z) {
            int i2 = zzel.zza;
            if (i2 >= 24 && ((i2 >= 26 || !("samsung".equals(zzel.zzc) || "XT1650".equals(zzel.zzd))) && ((i2 >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) && (strEglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && strEglQueryString.contains("EGL_EXT_protected_content")))) {
                String strEglQueryString2 = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373);
                i = 2;
                if (strEglQueryString2 != null && strEglQueryString2.contains("EGL_KHR_surfaceless_context")) {
                    i = 1;
                }
            } else {
                i = 0;
            }
            y = i;
            z = true;
        }
        return y != 0;
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        synchronized (this.w) {
            try {
                if (!this.x) {
                    Handler handler = this.w.x;
                    handler.getClass();
                    handler.sendEmptyMessage(2);
                    this.x = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
