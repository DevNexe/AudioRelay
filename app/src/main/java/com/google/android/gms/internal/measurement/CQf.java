package com.google.android.gms.internal.measurement;

import android.app.Application;
import android.content.Context;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.NetworkOnMainThreadException;
import android.os.RemoteException;
import android.util.Log;
import android.util.Pair;
import defpackage.C0239D;
import defpackage.VV;
import defpackage.ge6;
import defpackage.hm6;
import defpackage.kw6;
import defpackage.oa3;
import defpackage.qg6;
import defpackage.vc6;
import defpackage.wa6;
import defpackage.xd6;
import defpackage.zd6;
import defpackage.ze6;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class CQf {
    public static volatile CQf h;
    public final ExecutorService a;
    public final VV b;
    public final ArrayList c;
    public int d;
    public boolean e;
    public final String f;
    public volatile zzcc g;

    public CQf(Context context, String str, String str2, String str3, Bundle bundle) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ge6());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.a = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.b = new VV(this);
        this.c = new ArrayList();
        try {
            C0239D.O(context, hm6.a(context));
        } catch (IllegalStateException unused) {
        }
        this.f = "fa";
        if (str2 == null || str3 == null) {
            if ((str3 == null) ^ (str2 == null)) {
                Log.w("FA", "Specified origin or custom app id is null. Both parameters will be ignored.");
            }
        } else {
            Log.v("FA", "Deferring to Google Analytics for Firebase for event data collection. https://goo.gl/J1sWQy");
        }
        c(new vc6(this, str2, str3, context, bundle));
        Application application = (Application) context.getApplicationContext();
        if (application == null) {
            Log.w("FA", "Unable to register lifecycle notifications. Application null.");
        } else {
            application.registerActivityLifecycleCallbacks(new qg6(this));
        }
    }

    public static CQf f(Context context, String str, String str2, String str3, Bundle bundle) {
        oa3.h(context);
        if (h == null) {
            synchronized (CQf.class) {
                if (h == null) {
                    h = new CQf(context, str, str2, str3, bundle);
                }
            }
        }
        return h;
    }

    public final void a(kw6 kw6Var) {
        synchronized (this.c) {
            int i = 0;
            for (int i2 = 0; i2 < this.c.size(); i2++) {
                if (kw6Var.equals(((Pair) this.c.get(i2)).first)) {
                    Log.w("FA", "OnEventListener already registered.");
                    return;
                }
            }
            zzdv zzdvVar = new zzdv(kw6Var);
            this.c.add(new Pair(kw6Var, zzdvVar));
            if (this.g != null) {
                try {
                    this.g.registerOnMeasurementEventListener(zzdvVar);
                    return;
                } catch (BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException unused) {
                    Log.w("FA", "Failed to register event listener on calling thread. Trying again on the dynamite thread.");
                }
            }
            c(new QnHx(this, zzdvVar, i));
        }
    }

    public final void b(Exception exc, boolean z, boolean z2) {
        this.e |= z;
        if (z) {
            Log.w("FA", "Data collection startup failed. No data will be collected.", exc);
            return;
        }
        if (z2) {
            c(new zd6(this, exc));
        }
        Log.w("FA", "Error with data collection. Data lost.", exc);
    }

    public final void c(ze6 ze6Var) {
        this.a.execute(ze6Var);
    }

    public final int d(String str) {
        zzbz zzbzVar = new zzbz();
        c(new zd6(this, str, zzbzVar));
        Integer num = (Integer) zzbz.N0(Integer.class, zzbzVar.L0(10000L));
        if (num == null) {
            return 25;
        }
        return num.intValue();
    }

    public final long e() {
        zzbz zzbzVar = new zzbz();
        c(new QnHx(this, zzbzVar, 3));
        Long l = (Long) zzbz.N0(Long.class, zzbzVar.L0(500L));
        if (l != null) {
            return l.longValue();
        }
        long jNextLong = new Random(System.nanoTime() ^ System.currentTimeMillis()).nextLong();
        int i = this.d + 1;
        this.d = i;
        return jNextLong + ((long) i);
    }

    public final List g(String str, String str2) {
        zzbz zzbzVar = new zzbz();
        c(new wa6(this, str, str2, zzbzVar));
        List list = (List) zzbz.N0(List.class, zzbzVar.L0(5000L));
        return list == null ? Collections.emptyList() : list;
    }

    public final Map h(String str, String str2, boolean z) {
        zzbz zzbzVar = new zzbz();
        c(new xd6(this, str, str2, z, zzbzVar));
        Bundle bundleL0 = zzbzVar.L0(5000L);
        if (bundleL0 == null || bundleL0.size() == 0) {
            return Collections.emptyMap();
        }
        HashMap map = new HashMap(bundleL0.size());
        for (String str3 : bundleL0.keySet()) {
            Object obj = bundleL0.get(str3);
            if ((obj instanceof Double) || (obj instanceof Long) || (obj instanceof String)) {
                map.put(str3, obj);
            }
        }
        return map;
    }
}
