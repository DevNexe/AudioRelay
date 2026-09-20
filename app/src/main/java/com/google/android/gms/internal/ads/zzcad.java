package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.text.TextUtils;
import com.google.ads.mediation.facebook.FacebookAdapter;
import defpackage.n76;
import defpackage.o76;
import defpackage.oa1;
import defpackage.so5;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.annotation.ParametersAreNonnullByDefault;

/* JADX INFO: loaded from: classes3.dex */
@ParametersAreNonnullByDefault
public final class zzcad implements zzcaf {
    public static final Object f = new Object();
    public static zzcaf g;
    public static zzcaf h;
    public final Context b;
    public final ExecutorService d;
    public final zzcgt e;
    public final Object a = new Object();
    public final WeakHashMap c = new WeakHashMap();

    public zzcad(Context context, zzcgt zzcgtVar) {
        zzfpg.zza();
        this.d = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool());
        this.b = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.e = zzcgtVar;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0033 A[Catch: all -> 0x003e, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x0015, B:10:0x0027, B:11:0x0033, B:12:0x003a), top: B:18:0x0003 }] */
    public static zzcaf zza(Context context) {
        synchronized (f) {
            if (g == null) {
                if (((Boolean) zzbkw.zze.zze()).booleanValue()) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzgD)).booleanValue()) {
                        g = new zzcae();
                    } else {
                        g = new zzcad(context, zzcgt.zza());
                    }
                } else {
                    g = new zzcae();
                }
            }
        }
        return g;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0060 A[Catch: all -> 0x006b, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x0015, B:10:0x0027, B:12:0x0036, B:13:0x0038, B:16:0x0041, B:20:0x0050, B:21:0x0051, B:22:0x0060, B:23:0x0067, B:14:0x0039, B:15:0x0040), top: B:29:0x0003, inners: #1 }] */
    public static zzcaf zzb(Context context, zzcgt zzcgtVar) {
        synchronized (f) {
            if (h == null) {
                if (((Boolean) zzbkw.zze.zze()).booleanValue()) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzgD)).booleanValue()) {
                        h = new zzcae();
                    } else {
                        zzcad zzcadVar = new zzcad(context, zzcgtVar);
                        Thread thread = Looper.getMainLooper().getThread();
                        if (thread != null) {
                            synchronized (zzcadVar.a) {
                                zzcadVar.c.put(thread, Boolean.TRUE);
                            }
                            thread.setUncaughtExceptionHandler(new o76(zzcadVar, thread.getUncaughtExceptionHandler()));
                        }
                        Thread.setDefaultUncaughtExceptionHandler(new n76(zzcadVar, Thread.getDefaultUncaughtExceptionHandler()));
                        h = zzcadVar;
                    }
                } else {
                    h = new zzcae();
                }
            }
        }
        return h;
    }

    public final void a(Throwable th) {
        if (th != null) {
            boolean zZzn = false;
            boolean zEquals = false;
            for (Throwable cause = th; cause != null; cause = cause.getCause()) {
                for (StackTraceElement stackTraceElement : cause.getStackTrace()) {
                    zZzn |= zzcgg.zzn(stackTraceElement.getClassName());
                    zEquals |= zzcad.class.getName().equals(stackTraceElement.getClassName());
                }
            }
            if (!zZzn || zEquals) {
                return;
            }
            zze(th, "", 1.0f);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcaf
    public final void zzd(Throwable th, String str) {
        zze(th, str, 1.0f);
    }

    @Override // com.google.android.gms.internal.ads.zzcaf
    public final void zze(Throwable th, String str, float f2) {
        boolean zC;
        String packageName;
        Context context = this.b;
        if (zzcgg.zzf(th) == null) {
            return;
        }
        String name = th.getClass().getName();
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        String string = stringWriter.toString();
        double d = f2;
        double dRandom = Math.random();
        int i = f2 > 0.0f ? (int) (1.0f / f2) : 1;
        if (dRandom < d) {
            ArrayList<String> arrayList = new ArrayList();
            try {
                zC = so5.a(context).c();
            } catch (Throwable th2) {
                zzcgn.zzh("Error fetching instant app info", th2);
                zC = false;
            }
            try {
                packageName = context.getPackageName();
            } catch (Throwable unused) {
                zzcgn.zzj("Cannot obtain package name, proceeding.");
                packageName = "unknown";
            }
            Uri.Builder builderAppendQueryParameter = new Uri.Builder().scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("is_aia", Boolean.toString(zC)).appendQueryParameter(FacebookAdapter.KEY_ID, "gmob-apps-report-exception").appendQueryParameter("os", Build.VERSION.RELEASE).appendQueryParameter("api", String.valueOf(Build.VERSION.SDK_INT));
            String str2 = Build.MANUFACTURER;
            String strA = Build.MODEL;
            if (!strA.startsWith(str2)) {
                strA = defpackage.LPt6Fixed.a(str2, " ", strA);
            }
            Uri.Builder builderAppendQueryParameter2 = builderAppendQueryParameter.appendQueryParameter("device", strA);
            zzcgt zzcgtVar = this.e;
            Uri.Builder builderAppendQueryParameter3 = builderAppendQueryParameter2.appendQueryParameter("js", zzcgtVar.zza).appendQueryParameter("appid", packageName).appendQueryParameter("exceptiontype", name).appendQueryParameter("stacktrace", string).appendQueryParameter("eids", TextUtils.join(",", zzbiy.zza())).appendQueryParameter("exceptionkey", str).appendQueryParameter("cl", "470884269").appendQueryParameter("rc", "dev").appendQueryParameter("sampling_rate", Integer.toString(i)).appendQueryParameter("pb_tm", String.valueOf(zzbkw.zzc.zze()));
            oa1.b.getClass();
            arrayList.add(builderAppendQueryParameter3.appendQueryParameter("gmscv", String.valueOf(oa1.a(context))).appendQueryParameter("lite", true != zzcgtVar.zze ? "0" : "1").toString());
            for (final String str3 : arrayList) {
                final zzcgs zzcgsVar = new zzcgs(null);
                this.d.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcaa
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzcgsVar.zza(str3);
                    }
                });
            }
        }
    }
}
