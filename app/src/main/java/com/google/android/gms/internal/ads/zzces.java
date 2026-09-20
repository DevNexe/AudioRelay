package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import defpackage.a86;
import defpackage.b86;
import defpackage.z76;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.reflect.Method;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: loaded from: classes3.dex */
@ParametersAreNonnullByDefault
public final class zzces {
    public final AtomicReference a = new AtomicReference(null);
    public final Object b = new Object();

    @GuardedBy("gmpAppIdLock")
    public String c = null;

    @GuardedBy("gmpAppIdLock")
    public String d = null;
    public final AtomicBoolean e = new AtomicBoolean(false);
    public final AtomicInteger f = new AtomicInteger(-1);
    public final AtomicReference g = new AtomicReference(null);
    public final AtomicReference h = new AtomicReference(null);
    public final ConcurrentHashMap i = new ConcurrentHashMap(9);
    public final AtomicReference j = new AtomicReference(null);

    @GuardedBy("proxyReference")
    public final ArrayBlockingQueue k = new ArrayBlockingQueue(20);
    public final Object l = new Object();

    public static final boolean f(Context context) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzaf)).booleanValue()) {
            return false;
        }
        if (DynamiteModule.a(context, ModuleDescriptor.MODULE_ID) < ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzag)).intValue()) {
            return false;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzah)).booleanValue()) {
            try {
                context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
                return false;
            } catch (ClassNotFoundException unused) {
            }
        }
        return true;
    }

    public final void a(Context context, String str, String str2) {
        AtomicReference atomicReference = this.g;
        if (e(context, "com.google.android.gms.measurement.AppMeasurement", atomicReference, true)) {
            ConcurrentHashMap concurrentHashMap = this.i;
            Method declaredMethod = (Method) concurrentHashMap.get(str2);
            if (declaredMethod == null) {
                try {
                    declaredMethod = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod(str2, String.class);
                    concurrentHashMap.put(str2, declaredMethod);
                } catch (Exception unused) {
                    c(str2, false);
                    declaredMethod = null;
                }
            }
            try {
                declaredMethod.invoke(atomicReference.get(), str);
                com.google.android.gms.ads.internal.util.zze.zza("Invoke Firebase method " + str2 + ", Ad Unit Id: " + str);
            } catch (Exception unused2) {
                c(str2, false);
            }
        }
    }

    public final void b(Context context, final String str, String str2, Bundle bundle) {
        if (zzu(context)) {
            final Bundle bundle2 = new Bundle();
            try {
                bundle2.putLong("_aeid", Long.parseLong(str2));
            } catch (NullPointerException | NumberFormatException e) {
                zzcgn.zzh("Invalid event ID: ".concat(String.valueOf(str2)), e);
            }
            if ("_ac".equals(str)) {
                bundle2.putInt("_r", 1);
            }
            if (bundle != null) {
                bundle2.putAll(bundle);
            }
            if (f(context)) {
                d(new b86() { // from class: com.google.android.gms.internal.ads.zzcee
                    @Override // defpackage.b86
                    public final void zza(zzcoe zzcoeVar) {
                        zzcoeVar.zzo("am", str, bundle2);
                    }
                }, "logEventInternal");
                return;
            }
            AtomicReference atomicReference = this.g;
            if (e(context, "com.google.android.gms.measurement.AppMeasurement", atomicReference, true)) {
                ConcurrentHashMap concurrentHashMap = this.i;
                Method declaredMethod = (Method) concurrentHashMap.get("logEventInternal");
                if (declaredMethod == null) {
                    try {
                        declaredMethod = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod("logEventInternal", String.class, String.class, Bundle.class);
                        concurrentHashMap.put("logEventInternal", declaredMethod);
                    } catch (Exception unused) {
                        c("logEventInternal", true);
                        declaredMethod = null;
                    }
                }
                try {
                    declaredMethod.invoke(atomicReference.get(), "am", str, bundle2);
                } catch (Exception unused2) {
                    c("logEventInternal", true);
                }
            }
        }
    }

    public final void c(String str, boolean z) {
        AtomicBoolean atomicBoolean = this.e;
        if (atomicBoolean.get()) {
            return;
        }
        zzcgn.zzj("Invoke Firebase method " + str + " error.");
        if (z) {
            zzcgn.zzj("The Google Mobile Ads SDK will not integrate with Firebase. Admob/Firebase integration requires the latest Firebase SDK jar, but Firebase SDK is either missing or out of date");
            atomicBoolean.set(true);
        }
    }

    public final void d(final b86 b86Var, final String str) {
        synchronized (this.j) {
            FutureTask futureTask = new FutureTask(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcef
                @Override // java.lang.Runnable
                public final void run() {
                    zzces zzcesVar = this.zza;
                    b86 b86Var2 = b86Var;
                    String str2 = str;
                    AtomicReference atomicReference = zzcesVar.j;
                    if (((zzcoe) atomicReference.get()) != null) {
                        try {
                            b86Var2.zza((zzcoe) atomicReference.get());
                        } catch (Exception unused) {
                            zzcesVar.c(str2, false);
                        }
                    }
                }
            }, null);
            if (this.j.get() != null) {
                futureTask.run();
            } else {
                this.k.offer(futureTask);
            }
        }
    }

    public final boolean e(Context context, String str, AtomicReference atomicReference, boolean z) {
        if (atomicReference.get() == null) {
            try {
                zzceb.zza(atomicReference, null, context.getClassLoader().loadClass(str).getDeclaredMethod("getInstance", Context.class).invoke(null, context));
            } catch (Exception unused) {
                c("getInstance", z);
                return false;
            }
        }
        return true;
    }

    public final Object g(String str, String str2, a86 a86Var) {
        synchronized (this.j) {
            if (((zzcoe) this.j.get()) != null) {
                try {
                    return a86Var.zza((zzcoe) this.j.get());
                } catch (Exception unused) {
                    c(str, false);
                }
            }
            return str2;
        }
    }

    public final Object h(Context context, String str) {
        AtomicReference atomicReference = this.g;
        if (!e(context, "com.google.android.gms.measurement.AppMeasurement", atomicReference, true)) {
            return null;
        }
        try {
            return i(context, str).invoke(atomicReference.get(), new Object[0]);
        } catch (Exception unused) {
            c(str, true);
            return null;
        }
    }

    public final Method i(Context context, String str) {
        ConcurrentHashMap concurrentHashMap = this.i;
        Method method = (Method) concurrentHashMap.get(str);
        if (method != null) {
            return method;
        }
        try {
            Method declaredMethod = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod(str, new Class[0]);
            concurrentHashMap.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception unused) {
            c(str, false);
            return null;
        }
    }

    public final ExecutorService j() {
        AtomicReference atomicReference = this.a;
        if (atomicReference.get() == null) {
            zzbiq zzbiqVar = zzbiy.zzae;
            zzceb.zza(atomicReference, null, new ThreadPoolExecutor(((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiqVar)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiqVar)).intValue(), 1L, TimeUnit.MINUTES, new LinkedBlockingQueue(), new z76()));
        }
        return (ExecutorService) atomicReference.get();
    }

    public final String zza(Context context) {
        if (!zzu(context)) {
            return null;
        }
        if (f(context)) {
            Long l = (Long) g("getAdEventId", null, new a86() { // from class: com.google.android.gms.internal.ads.zzceg
                @Override // defpackage.a86
                public final Object zza(zzcoe zzcoeVar) {
                    return Long.valueOf(zzcoeVar.zzc());
                }
            });
            if (l != null) {
                return Long.toString(l.longValue());
            }
            return null;
        }
        Object objH = h(context, "generateEventId");
        if (objH != null) {
            return objH.toString();
        }
        return null;
    }

    public final String zzb(Context context) {
        if (!zzu(context)) {
            return null;
        }
        synchronized (this.b) {
            String str = this.d;
            if (str != null) {
                return str;
            }
            if (f(context)) {
                this.d = (String) g("getAppIdOrigin", this.d, new a86() { // from class: com.google.android.gms.internal.ads.zzcek
                    @Override // defpackage.a86
                    public final Object zza(zzcoe zzcoeVar) {
                        return zzcoeVar.zze();
                    }
                });
            } else {
                this.d = "fa";
            }
            return this.d;
        }
    }

    public final String zzc(final Context context) {
        if (!zzu(context)) {
            return null;
        }
        long jLongValue = ((Long) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzad)).longValue();
        if (f(context)) {
            try {
                return jLongValue < 0 ? (String) g("getAppInstanceId", null, zzcel.zza) : (String) j().submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzcem
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        zzces zzcesVar = this.zza;
                        zzcesVar.getClass();
                        return (String) zzcesVar.g("getAppInstanceId", null, zzcel.zza);
                    }
                }).get(jLongValue, TimeUnit.MILLISECONDS);
            } catch (TimeoutException unused) {
                return "TIME_OUT";
            } catch (Exception unused2) {
                return null;
            }
        }
        if (jLongValue < 0) {
            return (String) h(context, "getAppInstanceId");
        }
        try {
            return (String) j().submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzcen
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return (String) this.zza.h(context, "getAppInstanceId");
                }
            }).get(jLongValue, TimeUnit.MILLISECONDS);
        } catch (TimeoutException unused3) {
            return "TIME_OUT";
        } catch (Exception unused4) {
            return null;
        }
    }

    public final String zzd(Context context) {
        if (!zzu(context)) {
            return "";
        }
        if (f(context)) {
            return (String) g("getCurrentScreenNameOrScreenClass", "", new a86() { // from class: com.google.android.gms.internal.ads.zzceh
                @Override // defpackage.a86
                public final Object zza(zzcoe zzcoeVar) {
                    String strZzh = zzcoeVar.zzh();
                    return (strZzh == null && (strZzh = zzcoeVar.zzg()) == null) ? "" : strZzh;
                }
            });
        }
        AtomicReference atomicReference = this.g;
        if (!e(context, "com.google.android.gms.measurement.AppMeasurement", atomicReference, true)) {
            return "";
        }
        try {
            String str = (String) i(context, "getCurrentScreenName").invoke(atomicReference.get(), new Object[0]);
            if (str == null) {
                str = (String) i(context, "getCurrentScreenClass").invoke(atomicReference.get(), new Object[0]);
            }
            return str != null ? str : "";
        } catch (Exception unused) {
            c("getCurrentScreenName", false);
            return "";
        }
    }

    public final String zze(Context context) {
        if (!zzu(context)) {
            return null;
        }
        synchronized (this.b) {
            String str = this.c;
            if (str != null) {
                return str;
            }
            if (f(context)) {
                this.c = (String) g("getGmpAppId", this.c, new a86() { // from class: com.google.android.gms.internal.ads.zzced
                    @Override // defpackage.a86
                    public final Object zza(zzcoe zzcoeVar) {
                        return zzcoeVar.zzi();
                    }
                });
            } else {
                this.c = (String) h(context, "getGmpAppId");
            }
            return this.c;
        }
    }

    public final void zzh(Context context, final String str) {
        if (zzu(context)) {
            if (f(context)) {
                d(new b86() { // from class: com.google.android.gms.internal.ads.zzcec
                    @Override // defpackage.b86
                    public final void zza(zzcoe zzcoeVar) {
                        zzcoeVar.zzl(str);
                    }
                }, "beginAdUnitExposure");
            } else {
                a(context, str, "beginAdUnitExposure");
            }
        }
    }

    public final void zzi(Context context, final String str) {
        if (zzu(context)) {
            if (f(context)) {
                d(new b86() { // from class: com.google.android.gms.internal.ads.zzcej
                    @Override // defpackage.b86
                    public final void zza(zzcoe zzcoeVar) {
                        zzcoeVar.zzn(str);
                    }
                }, "endAdUnitExposure");
            } else {
                a(context, str, "endAdUnitExposure");
            }
        }
    }

    public final void zzk(Context context, String str) {
        b(context, "_aa", str, null);
    }

    public final void zzl(Context context, String str) {
        b(context, "_aq", str, null);
    }

    public final void zzm(Context context, String str) {
        b(context, "_ac", str, null);
    }

    public final void zzn(Context context, String str) {
        b(context, "_ai", str, null);
    }

    public final void zzo(Context context, String str, String str2, String str3, int i) {
        if (zzu(context)) {
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str2);
            bundle.putString("reward_type", str3);
            bundle.putInt("reward_value", i);
            b(context, "_ar", str, bundle);
            com.google.android.gms.ads.internal.util.zze.zza("Log a Firebase reward video event, reward type: " + str3 + ", reward value: " + i);
        }
    }

    public final void zzp(Context context, com.google.android.gms.ads.internal.client.zzl zzlVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzak)).booleanValue() && zzu(context) && f(context)) {
            synchronized (this.l) {
            }
        }
    }

    public final void zzq(Context context, com.google.android.gms.ads.internal.client.zzez zzezVar) {
        zzcet.zzd(context).a().zzd(zzezVar);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzak)).booleanValue() && zzu(context) && f(context)) {
            synchronized (this.l) {
            }
        }
    }

    public final void zzr(final Bundle bundle) {
        d(new b86() { // from class: com.google.android.gms.internal.ads.zzceo
            @Override // defpackage.b86
            public final void zza(zzcoe zzcoeVar) {
                zzcoeVar.zzr(bundle);
            }
        }, "setConsent");
    }

    @Deprecated
    public final void zzs(final Context context, final String str) {
        if (zzu(context) && (context instanceof Activity)) {
            if (f(context)) {
                d(new b86() { // from class: com.google.android.gms.internal.ads.zzcei
                    @Override // defpackage.b86
                    public final void zza(zzcoe zzcoeVar) {
                        Context context2 = context;
                        zzcoeVar.zzs(new ObjectWrapper(context2), str, context2.getPackageName());
                    }
                }, "setScreenName");
                return;
            }
            AtomicReference atomicReference = this.h;
            if (e(context, "com.google.firebase.analytics.FirebaseAnalytics", atomicReference, false)) {
                ConcurrentHashMap concurrentHashMap = this.i;
                Method declaredMethod = (Method) concurrentHashMap.get("setCurrentScreen");
                if (declaredMethod == null) {
                    try {
                        declaredMethod = context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics").getDeclaredMethod("setCurrentScreen", Activity.class, String.class, String.class);
                        concurrentHashMap.put("setCurrentScreen", declaredMethod);
                    } catch (Exception unused) {
                        c("setCurrentScreen", false);
                        declaredMethod = null;
                    }
                }
                try {
                    declaredMethod.invoke(atomicReference.get(), (Activity) context, str, context.getPackageName());
                } catch (Exception unused2) {
                    c("setCurrentScreen", false);
                }
            }
        }
    }

    public final boolean zzt() {
        synchronized (this.l) {
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0057  */
    public final boolean zzu(Context context) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzY)).booleanValue() && !this.e.get()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzai)).booleanValue()) {
                return true;
            }
            AtomicInteger atomicInteger = this.f;
            if (atomicInteger.get() == -1) {
                com.google.android.gms.ads.internal.client.zzaw.zzb();
                if (zzcgg.zzr(context, 12451000)) {
                    atomicInteger.set(1);
                } else {
                    com.google.android.gms.ads.internal.client.zzaw.zzb();
                    if (zzcgg.zzs(context)) {
                        zzcgn.zzj("Google Play Service is out of date, the Google Mobile Ads SDK will not integrate with Firebase. Admob/Firebase integration requires updated Google Play Service.");
                        atomicInteger.set(0);
                    } else {
                        atomicInteger.set(1);
                    }
                }
            }
            if (atomicInteger.get() == 1) {
                return true;
            }
        }
        return false;
    }
}
