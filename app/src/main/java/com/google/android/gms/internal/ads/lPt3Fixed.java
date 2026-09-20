package com.google.android.gms.internal.ads;

import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
public final class lPt3Fixed extends RBi {
    @Override // com.google.android.gms.internal.ads.RBi
    public final Xn1 a(zzfxf zzfxfVar, Xn1 xn1) {
        Xn1 xn2;
        synchronized (zzfxfVar) {
            xn2 = zzfxfVar.x;
            if (xn2 != xn1) {
                zzfxfVar.x = xn1;
            }
        }
        return xn2;
    }

    @Override // com.google.android.gms.internal.ads.RBi
    public final WE b(zzfxf zzfxfVar) {
        WE we;
        WE we2 = WE.c;
        synchronized (zzfxfVar) {
            we = zzfxfVar.y;
            if (we != we2) {
                zzfxfVar.y = we2;
            }
        }
        return we;
    }

    @Override // com.google.android.gms.internal.ads.RBi
    public final void c(WE we, @CheckForNull WE we2) {
        we.b = we2;
    }

    @Override // com.google.android.gms.internal.ads.RBi
    public final void d(WE we, Thread thread) {
        we.a = thread;
    }

    @Override // com.google.android.gms.internal.ads.RBi
    public final boolean e(zzfxf zzfxfVar, @CheckForNull Xn1 xn1, Xn1 xn2) {
        synchronized (zzfxfVar) {
            if (zzfxfVar.x != xn1) {
                return false;
            }
            zzfxfVar.x = xn2;
            return true;
        }
    }

    @Override // com.google.android.gms.internal.ads.RBi
    public final boolean f(zzfxf zzfxfVar, @CheckForNull Object obj, Object obj2) {
        synchronized (zzfxfVar) {
            if (zzfxfVar.w != obj) {
                return false;
            }
            zzfxfVar.w = obj2;
            return true;
        }
    }

    @Override // com.google.android.gms.internal.ads.RBi
    public final boolean g(zzfxf zzfxfVar, @CheckForNull WE we, @CheckForNull WE we2) {
        synchronized (zzfxfVar) {
            if (zzfxfVar.y != we) {
                return false;
            }
            zzfxfVar.y = we2;
            return true;
        }
    }
}
