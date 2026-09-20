package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.facebook.ads.AdError;
import dalvik.system.DexClassLoader;
import defpackage.ma5;
import java.io.File;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfod {
    public static final HashMap g = new HashMap();
    public final Context a;
    public final zzfoe b;
    public final zzfmf c;
    public final zzfma d;
    public ma5 e;
    public final Object f = new Object();

    public zzfod(Context context, zzfoe zzfoeVar, zzfmf zzfmfVar, zzfma zzfmaVar) {
        this.a = context;
        this.b = zzfoeVar;
        this.c = zzfmfVar;
        this.d = zzfmaVar;
    }

    public final synchronized Class a(zzfnt zzfntVar) {
        String strZzk = zzfntVar.zza().zzk();
        HashMap map = g;
        Class cls = (Class) map.get(strZzk);
        if (cls != null) {
            return cls;
        }
        try {
            if (!this.d.zza(zzfntVar.zzc())) {
                throw new zzfoc(2026, "VM did not pass signature verification");
            }
            try {
                File fileZzb = zzfntVar.zzb();
                if (!fileZzb.exists()) {
                    fileZzb.mkdirs();
                }
                Class<?> clsLoadClass = new DexClassLoader(zzfntVar.zzc().getAbsolutePath(), fileZzb.getAbsolutePath(), null, this.a.getClassLoader()).loadClass("com.google.ccc.abuse.droidguard.DroidGuard");
                map.put(strZzk, clsLoadClass);
                return clsLoadClass;
            } catch (ClassNotFoundException | IllegalArgumentException | SecurityException e) {
                throw new zzfoc(AdError.REMOTE_ADS_SERVICE_ERROR, e);
            }
        } catch (GeneralSecurityException e2) {
            throw new zzfoc(2026, e2);
        }
    }

    public final zzfmi zza() {
        ma5 ma5Var;
        synchronized (this.f) {
            ma5Var = this.e;
        }
        return ma5Var;
    }

    public final zzfnt zzb() {
        synchronized (this.f) {
            try {
                ma5 ma5Var = this.e;
                if (ma5Var == null) {
                    return null;
                }
                return (zzfnt) ma5Var.x;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean zzc(zzfnt zzfntVar) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            try {
                ma5 ma5Var = new ma5(a(zzfntVar).getDeclaredConstructor(Context.class, String.class, byte[].class, Object.class, Bundle.class, Integer.TYPE).newInstance(this.a, "msa-r", zzfntVar.zze(), null, new Bundle(), 2), zzfntVar, this.b, this.c);
                if (!ma5Var.i()) {
                    throw new zzfoc(4000, "init failed");
                }
                int iE = ma5Var.e();
                if (iE != 0) {
                    throw new zzfoc(4001, "ci: " + iE);
                }
                synchronized (this.f) {
                    ma5 ma5Var2 = this.e;
                    if (ma5Var2 != null) {
                        try {
                            ma5Var2.g();
                        } catch (zzfoc e) {
                            this.c.zzc(e.zza(), -1L, e);
                        }
                        this.e = ma5Var;
                    } else {
                        this.e = ma5Var;
                    }
                    throw th;
                }
                this.c.zzd(3000, System.currentTimeMillis() - jCurrentTimeMillis);
                return true;
            } catch (Exception e2) {
                throw new zzfoc(AdError.INTERNAL_ERROR_2004, e2);
            }
        } catch (zzfoc e3) {
            this.c.zzc(e3.zza(), System.currentTimeMillis() - jCurrentTimeMillis, e3);
            return false;
        } catch (Exception e4) {
            this.c.zzc(4010, System.currentTimeMillis() - jCurrentTimeMillis, e4);
            return false;
        }
    }
}
