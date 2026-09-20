package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import defpackage.Bt7j;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcnj extends com.google.android.gms.ads.internal.client.zzdj {

    @GuardedBy("lock")
    public int A;

    @GuardedBy("lock")
    public com.google.android.gms.ads.internal.client.zzdn B;

    @GuardedBy("lock")
    public boolean C;

    @GuardedBy("lock")
    public float E;

    @GuardedBy("lock")
    public float F;

    @GuardedBy("lock")
    public float G;

    @GuardedBy("lock")
    public boolean H;

    @GuardedBy("lock")
    public boolean I;

    @GuardedBy("lock")
    public zzbni J;
    public final zzciw w;
    public final boolean y;
    public final boolean z;
    public final Object x = new Object();

    @GuardedBy("lock")
    public boolean D = true;

    public zzcnj(zzciw zzciwVar, float f, boolean z, boolean z2) {
        this.w = zzciwVar;
        this.E = f;
        this.y = z;
        this.z = z2;
    }

    public final void L0(String str, Map map) {
        final HashMap map2 = map == null ? new HashMap() : new HashMap(map);
        map2.put("action", str);
        zzcha.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcnh
            @Override // java.lang.Runnable
            public final void run() {
                zzcnj zzcnjVar = this.zza;
                zzcnjVar.w.zzd("pubVideoCmd", map2);
            }
        });
    }

    public final void zzc(float f, float f2, int i, boolean z, float f3) {
        boolean z2;
        boolean z3;
        int i2;
        synchronized (this.x) {
            z2 = (f2 == this.E && f3 == this.G) ? false : true;
            this.E = f2;
            this.F = f;
            z3 = this.D;
            this.D = z;
            i2 = this.A;
            this.A = i;
            float f4 = this.G;
            this.G = f3;
            if (Math.abs(f3 - f4) > 1.0E-4f) {
                this.w.zzH().invalidate();
            }
        }
        if (z2) {
            try {
                zzbni zzbniVar = this.J;
                if (zzbniVar != null) {
                    zzbniVar.zze();
                }
            } catch (RemoteException e) {
                zzcgn.zzl("#007 Could not call remote method.", e);
            }
        }
        zzcha.zze.execute(new zzcni(this, i2, i, z3, z));
    }

    @Override // com.google.android.gms.ads.internal.client.zzdk
    public final float zze() {
        float f;
        synchronized (this.x) {
            f = this.G;
        }
        return f;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdk
    public final float zzf() {
        float f;
        synchronized (this.x) {
            f = this.F;
        }
        return f;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdk
    public final float zzg() {
        float f;
        synchronized (this.x) {
            f = this.E;
        }
        return f;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdk
    public final int zzh() {
        int i;
        synchronized (this.x) {
            i = this.A;
        }
        return i;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdk
    public final com.google.android.gms.ads.internal.client.zzdn zzi() {
        com.google.android.gms.ads.internal.client.zzdn zzdnVar;
        synchronized (this.x) {
            zzdnVar = this.B;
        }
        return zzdnVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdk
    public final void zzj(boolean z) {
        L0(true != z ? "unmute" : "mute", null);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdk
    public final void zzk() {
        L0("pause", null);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdk
    public final void zzl() {
        L0("play", null);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdk
    public final void zzm(com.google.android.gms.ads.internal.client.zzdn zzdnVar) {
        synchronized (this.x) {
            this.B = zzdnVar;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzdk
    public final void zzn() {
        L0("stop", null);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdk
    public final boolean zzo() {
        boolean z;
        boolean zZzp = zzp();
        synchronized (this.x) {
            z = false;
            if (!zZzp) {
                try {
                    if (this.I && this.z) {
                        z = true;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return z;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdk
    public final boolean zzp() {
        boolean z;
        synchronized (this.x) {
            z = false;
            if (this.y && this.H) {
                z = true;
            }
        }
        return z;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdk
    public final boolean zzq() {
        boolean z;
        synchronized (this.x) {
            z = this.D;
        }
        return z;
    }

    public final void zzs(com.google.android.gms.ads.internal.client.zzff zzffVar) {
        boolean z = zzffVar.zza;
        boolean z2 = zzffVar.zzb;
        boolean z3 = zzffVar.zzc;
        synchronized (this.x) {
            this.H = z2;
            this.I = z3;
        }
        String str = true != z ? "0" : "1";
        String str2 = true != z2 ? "0" : "1";
        String str3 = true != z3 ? "0" : "1";
        Bt7j bt7j = new Bt7j(3);
        bt7j.put("muteStart", str);
        bt7j.put("customControlsRequested", str2);
        bt7j.put("clickToExpandRequested", str3);
        L0("initialState", Collections.unmodifiableMap(bt7j));
    }

    public final void zzt(float f) {
        synchronized (this.x) {
            this.F = f;
        }
    }

    public final void zzu() {
        boolean z;
        int i;
        synchronized (this.x) {
            z = this.D;
            i = this.A;
            this.A = 3;
        }
        zzcha.zze.execute(new zzcni(this, i, 3, z, z));
    }

    public final void zzv(zzbni zzbniVar) {
        synchronized (this.x) {
            this.J = zzbniVar;
        }
    }
}
