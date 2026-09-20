package com.google.android.gms.ads.internal.util;

import android.R;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.AlertDialog;
import android.app.KeyguardManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.PowerManager;
import android.os.Process;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import com.google.android.gms.ads.nativead.NativeAdView;
import com.google.android.gms.internal.ads.zzbiq;
import com.google.android.gms.internal.ads.zzbiy;
import com.google.android.gms.internal.ads.zzbjw;
import com.google.android.gms.internal.ads.zzbkw;
import com.google.android.gms.internal.ads.zzcbo;
import com.google.android.gms.internal.ads.zzcgm;
import com.google.android.gms.internal.ads.zzcgn;
import com.google.android.gms.internal.ads.zzcha;
import com.google.android.gms.internal.ads.zzcme;
import com.google.android.gms.internal.ads.zzcnk;
import com.google.android.gms.internal.ads.zzduz;
import com.google.android.gms.internal.ads.zzfcs;
import com.google.android.gms.internal.ads.zzfcv;
import com.google.android.gms.internal.ads.zzfph;
import com.google.android.gms.internal.ads.zzfyo;
import com.google.android.gms.internal.ads.zzfyx;
import com.google.android.gms.internal.ads.zzgvf;
import defpackage.LPt6Fixed;
import defpackage.aa7;
import defpackage.bb0;
import defpackage.h57;
import defpackage.j87;
import defpackage.li;
import defpackage.r80;
import defpackage.ra1;
import defpackage.so5;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: loaded from: classes.dex */
public final class zzs {
    public static final zzfph zza = new zzf(Looper.getMainLooper());

    @GuardedBy("userAgentLock")
    public String e;
    public final AtomicReference a = new AtomicReference(null);
    public final AtomicReference b = new AtomicReference(null);
    public boolean c = true;
    public final Object d = new Object();
    public boolean f = false;
    public boolean g = false;
    public final ExecutorService h = Executors.newSingleThreadExecutor();

    public static String a(Bundle bundle) {
        if (bundle == null) {
            return "";
        }
        String string = bundle.getString("com.google.android.gms.ads.APPLICATION_ID");
        if (TextUtils.isEmpty(string)) {
            return "";
        }
        return (string.matches("^ca-app-pub-[0-9]{16}~[0-9]{10}$") || string.matches("^/\\d+~.+$")) ? string : "";
    }

    public static boolean b(String str, AtomicReference atomicReference, String str2) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Pattern patternCompile = (Pattern) atomicReference.get();
            if (patternCompile == null || !str2.equals(patternCompile.pattern())) {
                patternCompile = Pattern.compile(str2);
                atomicReference.set(patternCompile);
            }
            return patternCompile.matcher(str).matches();
        } catch (PatternSyntaxException unused) {
            return false;
        }
    }

    public static final String c() {
        StringBuilder sb = new StringBuilder(256);
        sb.append("Mozilla/5.0 (Linux; U; Android");
        String str = Build.VERSION.RELEASE;
        if (str != null) {
            sb.append(" ");
            sb.append(str);
        }
        sb.append("; ");
        sb.append(Locale.getDefault());
        String str2 = Build.DEVICE;
        if (str2 != null) {
            sb.append("; ");
            sb.append(str2);
            String str3 = Build.DISPLAY;
            if (str3 != null) {
                sb.append(" Build/");
                sb.append(str3);
            }
        }
        sb.append(") AppleWebKit/533 Version/4.0 Safari/533");
        return sb.toString();
    }

    public static final boolean zzA(Context context) {
        try {
            context.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi");
            return false;
        } catch (ClassNotFoundException unused) {
            return true;
        } catch (Throwable th) {
            zzcgn.zzh("Error loading class.", th);
            com.google.android.gms.ads.internal.zzt.zzp().zzt(th, "AdUtil.isLiteSdk");
            return false;
        }
    }

    public static final boolean zzB() {
        int iMyUid = Process.myUid();
        return iMyUid == 0 || iMyUid == 1000;
    }

    public static final boolean zzC(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        PowerManager powerManager;
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService("keyguard");
            if (activityManager == null || keyguardManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
                return false;
            }
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (Process.myPid() == runningAppProcessInfo.pid) {
                    return runningAppProcessInfo.importance != 100 || keyguardManager.inKeyguardRestrictedInputMode() || (powerManager = (PowerManager) context.getSystemService("power")) == null || !powerManager.isScreenOn();
                }
            }
            return true;
        } catch (Throwable unused) {
        }
        return false;
    }

    public static final boolean zzD(Context context) {
        Bundle bundle;
        try {
            bundle = so5.a(context).a(128, context.getPackageName()).metaData;
        } catch (PackageManager.NameNotFoundException | NullPointerException e) {
            zze.zzb("Error getting metadata", e);
            bundle = null;
        }
        return TextUtils.isEmpty(a(bundle)) && !TextUtils.isEmpty(bundle.getString("com.google.android.gms.ads.INTEGRATION_MANAGER"));
    }

    public static final boolean zzE(Context context) {
        Window window;
        if ((context instanceof Activity) && (window = ((Activity) context).getWindow()) != null && window.getDecorView() != null) {
            Rect rect = new Rect();
            Rect rect2 = new Rect();
            window.getDecorView().getGlobalVisibleRect(rect, null);
            window.getDecorView().getWindowVisibleDisplayFrame(rect2);
            if (rect.bottom != 0 && rect2.bottom != 0 && rect.top == rect2.top) {
                return true;
            }
        }
        return false;
    }

    public static final void zzF(View view, int i, MotionEvent motionEvent) {
        String strZza;
        int i2;
        int iHeight;
        int iWidth;
        String str;
        zzfcs zzfcsVarZzF;
        zzfcv zzfcvVarZzR;
        View childAt = view;
        int[] iArr = new int[2];
        Rect rect = new Rect();
        try {
            String packageName = view.getContext().getPackageName();
            if (childAt instanceof zzduz) {
                childAt = ((zzduz) childAt).getChildAt(0);
            }
            if ((childAt instanceof com.google.android.gms.ads.formats.zzg) || (childAt instanceof NativeAdView)) {
                strZza = "NATIVE";
                i2 = 1;
            } else {
                strZza = "UNKNOWN";
                i2 = 0;
            }
            if (childAt.getLocalVisibleRect(rect)) {
                iWidth = rect.width();
                iHeight = rect.height();
            } else {
                iHeight = 0;
                iWidth = 0;
            }
            com.google.android.gms.ads.internal.zzt.zzq();
            long jZzt = zzt(childAt);
            childAt.getLocationOnScreen(iArr);
            int i3 = iArr[0];
            int i4 = iArr[1];
            String str2 = "none";
            if (!(childAt instanceof zzcnk) || (zzfcvVarZzR = ((zzcnk) childAt).zzR()) == null) {
                str = "none";
            } else {
                str = zzfcvVarZzR.zzb;
                childAt.setContentDescription(str + ":" + childAt.hashCode());
            }
            if ((childAt instanceof zzcme) && (zzfcsVarZzF = ((zzcme) childAt).zzF()) != null) {
                strZza = zzfcs.zza(zzfcsVarZzF.zzb);
                i2 = zzfcsVarZzF.zzf;
                str2 = zzfcsVarZzF.zzF;
            }
            zzcgn.zzi(String.format(Locale.US, "<Ad hashCode=%d, package=%s, adNetCls=%s, gwsQueryId=%s, format=%s, impType=%d, class=%s, x=%d, y=%d, width=%d, height=%d, vWidth=%d, vHeight=%d, alpha=%d, state=%s>", Integer.valueOf(childAt.hashCode()), packageName, str2, str, strZza, Integer.valueOf(i2), childAt.getClass().getName(), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(childAt.getWidth()), Integer.valueOf(childAt.getHeight()), Integer.valueOf(iWidth), Integer.valueOf(iHeight), Long.valueOf(jZzt), Integer.toString(i, 2)));
        } catch (Exception e) {
            zzcgn.zzh("Failure getting view location.", e);
        }
    }

    public static final AlertDialog.Builder zzG(Context context) {
        return new AlertDialog.Builder(context, com.google.android.gms.ads.internal.zzt.zzr().zza());
    }

    public static final void zzH(Context context, String str, String str2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(str2);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            new zzby(context, str, (String) it.next()).zzb();
        }
    }

    public static final void zzI(Context context, Throwable th) {
        if (context != null) {
            try {
                if (((Boolean) zzbkw.zzb.zze()).booleanValue()) {
                    bb0.a(context, th);
                }
            } catch (IllegalStateException unused) {
            }
        }
    }

    public static final void zzJ(Context context, Intent intent) {
        try {
            context.startActivity(intent);
        } catch (Throwable unused) {
            intent.addFlags(268435456);
            context.startActivity(intent);
        }
    }

    public static final int zzK(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            zzcgn.zzj("Could not parse value:".concat(e.toString()));
            return 0;
        }
    }

    public static final Map zzL(Uri uri) {
        if (uri == null) {
            return null;
        }
        HashMap map = new HashMap();
        for (String str : uri.getQueryParameterNames()) {
            if (!TextUtils.isEmpty(str)) {
                map.put(str, uri.getQueryParameter(str));
            }
        }
        return map;
    }

    public static final WebResourceResponse zzM(HttpURLConnection httpURLConnection) {
        com.google.android.gms.ads.internal.zzt.zzq();
        String contentType = httpURLConnection.getContentType();
        String strTrim = "";
        String strTrim2 = TextUtils.isEmpty(contentType) ? "" : contentType.split(";")[0].trim();
        com.google.android.gms.ads.internal.zzt.zzq();
        String contentType2 = httpURLConnection.getContentType();
        if (!TextUtils.isEmpty(contentType2)) {
            String[] strArrSplit = contentType2.split(";");
            if (strArrSplit.length != 1) {
                for (int i = 1; i < strArrSplit.length; i++) {
                    if (strArrSplit[i].trim().startsWith("charset")) {
                        String[] strArrSplit2 = strArrSplit[i].trim().split("=");
                        if (strArrSplit2.length > 1) {
                            strTrim = strArrSplit2[1].trim();
                            break;
                        }
                    }
                }
            }
        }
        String str = strTrim;
        Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
        HashMap map = new HashMap(headerFields.size());
        for (Map.Entry<String, List<String>> entry : headerFields.entrySet()) {
            if (entry.getKey() != null && entry.getValue() != null && !entry.getValue().isEmpty()) {
                map.put(entry.getKey(), entry.getValue().get(0));
            }
        }
        return com.google.android.gms.ads.internal.zzt.zzr().zzc(strTrim2, str, httpURLConnection.getResponseCode(), httpURLConnection.getResponseMessage(), map, httpURLConnection.getInputStream());
    }

    public static final int[] zzN(Activity activity) {
        View viewFindViewById;
        Window window = activity.getWindow();
        return (window == null || (viewFindViewById = window.findViewById(R.id.content)) == null) ? new int[]{0, 0} : new int[]{viewFindViewById.getWidth(), viewFindViewById.getHeight()};
    }

    public static final int[] zzO(Activity activity) {
        View viewFindViewById;
        Window window = activity.getWindow();
        int[] iArr = (window == null || (viewFindViewById = window.findViewById(R.id.content)) == null) ? new int[]{0, 0} : new int[]{viewFindViewById.getTop(), viewFindViewById.getBottom()};
        return new int[]{com.google.android.gms.ads.internal.client.zzaw.zzb().zzb(activity, iArr[0]), com.google.android.gms.ads.internal.client.zzaw.zzb().zzb(activity, iArr[1])};
    }

    public static final boolean zzP(View view, PowerManager powerManager, KeyguardManager keyguardManager) {
        boolean z = com.google.android.gms.ads.internal.zzt.zzq().c || keyguardManager == null || !keyguardManager.inKeyguardRestrictedInputMode() || zzl(view);
        long jZzt = zzt(view);
        if (view.getVisibility() == 0 && view.isShown() && ((powerManager == null || powerManager.isScreenOn()) && z)) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzbe)).booleanValue() || view.getLocalVisibleRect(new Rect()) || view.getGlobalVisibleRect(new Rect())) {
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzih)).booleanValue()) {
                    return true;
                }
                if (jZzt >= ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzij)).intValue()) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final void zzQ(Context context, Uri uri) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", uri);
            Bundle bundle = new Bundle();
            intent.putExtras(bundle);
            zzm(context, intent);
            bundle.putString("com.android.browser.application_id", context.getPackageName());
            context.startActivity(intent);
            zzcgn.zze("Opening " + uri.toString() + " in a new browser.");
        } catch (ActivityNotFoundException e) {
            zzcgn.zzh("No browser is found.", e);
        }
    }

    public static final int[] zzR(Activity activity) {
        int[] iArrZzN = zzN(activity);
        return new int[]{com.google.android.gms.ads.internal.client.zzaw.zzb().zzb(activity, iArrZzN[0]), com.google.android.gms.ads.internal.client.zzaw.zzb().zzb(activity, iArrZzN[1])};
    }

    public static final boolean zzS(View view, Context context) {
        Context applicationContext = context.getApplicationContext();
        KeyguardManager keyguardManager = null;
        PowerManager powerManager = applicationContext != null ? (PowerManager) applicationContext.getSystemService("power") : null;
        Object systemService = context.getSystemService("keyguard");
        if (systemService != null && (systemService instanceof KeyguardManager)) {
            keyguardManager = (KeyguardManager) systemService;
        }
        return zzP(view, powerManager, keyguardManager);
    }

    public static int zza(int i) {
        if (i >= 5000) {
            return i;
        }
        if (i <= 0) {
            return 60000;
        }
        zzcgn.zzj("HTTP timeout too low: " + i + " milliseconds. Reverting to default timeout: 60000 milliseconds.");
        return 60000;
    }

    public static void zzf(Runnable runnable) {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            runnable.run();
        } else {
            zzcha.zza.execute(runnable);
        }
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0007  */
    public static final boolean zzl(View view) {
        Activity activity;
        View rootView = view.getRootView();
        if (rootView == null) {
            activity = null;
        } else {
            Context context = rootView.getContext();
            if (context instanceof Activity) {
                activity = (Activity) context;
            } else {
                activity = null;
            }
        }
        if (activity == null) {
            return false;
        }
        Window window = activity.getWindow();
        WindowManager.LayoutParams attributes = window != null ? window.getAttributes() : null;
        return (attributes == null || (attributes.flags & 524288) == 0) ? false : true;
    }

    public static final void zzm(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        Bundle extras = intent.getExtras() != null ? intent.getExtras() : new Bundle();
        extras.putBinder("android.support.customtabs.extra.SESSION", null);
        extras.putString("com.android.browser.application_id", context.getPackageName());
        intent.putExtras(extras);
    }

    public static final ViewGroup.LayoutParams zzn() {
        return new ViewGroup.LayoutParams(-1, -1);
    }

    public static final String zzo(Context context) {
        Bundle bundle;
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        try {
            bundle = so5.a(context).a(128, context.getPackageName()).metaData;
        } catch (PackageManager.NameNotFoundException | NullPointerException e) {
            zze.zzb("Error getting metadata", e);
            bundle = null;
        }
        return a(bundle);
    }

    public static final String zzq() {
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        return str2.startsWith(str) ? str2 : LPt6Fixed.a(str, " ", str2);
    }

    public static final DisplayMetrics zzr(WindowManager windowManager) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v6, types: [android.view.ViewParent] */
    public static final long zzt(View view) {
        float fMin = Float.MAX_VALUE;
        do {
            if (!(view instanceof View)) {
                break;
            }
            View view2 = (View) view;
            fMin = Math.min(fMin, view2.getAlpha());
            view = view2.getParent();
        } while (fMin > 0.0f);
        return Math.round((fMin >= 0.0f ? fMin : 0.0f) * 100.0f);
    }

    public static final WebResourceResponse zzu(Context context, String str, String str2) {
        try {
            HashMap map = new HashMap();
            map.put("User-Agent", com.google.android.gms.ads.internal.zzt.zzq().zzc(context, str));
            map.put("Cache-Control", "max-stale=3600");
            String str3 = (String) new zzbo(context).zzb(0, str2, map, null).get(60L, TimeUnit.SECONDS);
            if (str3 != null) {
                return new WebResourceResponse("application/javascript", "UTF-8", new ByteArrayInputStream(str3.getBytes("UTF-8")));
            }
        } catch (IOException | InterruptedException | ExecutionException | TimeoutException e) {
            zzcgn.zzk("Could not fetch MRAID JS.", e);
        }
        return null;
    }

    public static final String zzv() {
        Resources resourcesZzd = com.google.android.gms.ads.internal.zzt.zzp().zzd();
        return resourcesZzd != null ? resourcesZzd.getString(com.google.android.gms.ads.impl.R.string.s7) : "Test Ad";
    }

    public static final zzbr zzw(Context context) {
        try {
            Object objNewInstance = context.getClassLoader().loadClass("com.google.android.gms.ads.internal.util.WorkManagerUtil").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            if (!(objNewInstance instanceof IBinder)) {
                zzcgn.zzg("Instantiated WorkManagerUtil not instance of IBinder.");
                return null;
            }
            IBinder iBinder = (IBinder) objNewInstance;
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.util.IWorkManagerUtil");
            return iInterfaceQueryLocalInterface instanceof zzbr ? (zzbr) iInterfaceQueryLocalInterface : new zzbp(iBinder);
        } catch (Exception e) {
            com.google.android.gms.ads.internal.zzt.zzp().zzt(e, "Failed to instantiate WorkManagerUtil");
            return null;
        }
    }

    public static final boolean zzx(Context context, String str) {
        Context contextZza = zzcbo.zza(context);
        return so5.a(contextZza).a.getPackageManager().checkPermission(str, contextZza.getPackageName()) == 0;
    }

    public static final boolean zzy(String str) {
        if (!zzcgm.zzl()) {
            return false;
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzdZ)).booleanValue()) {
            return false;
        }
        String str2 = (String) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzeb);
        if (!str2.isEmpty()) {
            for (String str3 : str2.split(";")) {
                if (str3.equals(str)) {
                    return false;
                }
            }
        }
        String str4 = (String) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzea);
        if (str4.isEmpty()) {
            return true;
        }
        for (String str5 : str4.split(";")) {
            if (str5.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean zzz(Context context) {
        if (context == null) {
            return false;
        }
        Object systemService = context.getSystemService("keyguard");
        KeyguardManager keyguardManager = (systemService == null || !(systemService instanceof KeyguardManager)) ? null : (KeyguardManager) systemService;
        return keyguardManager != null && keyguardManager.isKeyguardLocked();
    }

    public final zzfyx zzb(final Uri uri) {
        return zzfyo.zzk(new Callable() { // from class: com.google.android.gms.ads.internal.util.zzl
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Uri uri2 = uri;
                zzfph zzfphVar = zzs.zza;
                com.google.android.gms.ads.internal.zzt.zzq();
                return zzs.zzL(uri2);
            }
        }, this.h);
    }

    public final String zzc(final Context context, String str) {
        final Context contextCreatePackageContext;
        synchronized (this.d) {
            String str2 = this.e;
            if (str2 != null) {
                return str2;
            }
            if (str == null) {
                return c();
            }
            try {
                zzce zzceVarZza = zzce.zza();
                if (TextUtils.isEmpty(zzceVarZza.a)) {
                    AtomicBoolean atomicBoolean = ra1.a;
                    try {
                        contextCreatePackageContext = context.createPackageContext("com.google.android.gms", 3);
                    } catch (PackageManager.NameNotFoundException unused) {
                        contextCreatePackageContext = null;
                    }
                    zzceVarZza.a = (String) zzcb.zza(context, new Callable() { // from class: com.google.android.gms.ads.internal.util.zzcd
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            SharedPreferences sharedPreferences;
                            Context context2 = contextCreatePackageContext;
                            Context context3 = context;
                            boolean z = false;
                            if (context2 != null) {
                                zze.zza("Attempting to read user agent from Google Play Services.");
                                sharedPreferences = context2.getSharedPreferences("admob_user_agent", 0);
                            } else {
                                zze.zza("Attempting to read user agent from local cache.");
                                sharedPreferences = context3.getSharedPreferences("admob_user_agent", 0);
                                z = true;
                            }
                            String string = sharedPreferences.getString("user_agent", "");
                            if (TextUtils.isEmpty(string)) {
                                zze.zza("Reading user agent from WebSettings");
                                string = WebSettings.getDefaultUserAgent(context3);
                                if (z) {
                                    sharedPreferences.edit().putString("user_agent", string).apply();
                                    zze.zza("Persisting user agent.");
                                }
                            }
                            return string;
                        }
                    });
                }
                this.e = zzceVarZza.a;
            } catch (Exception unused2) {
            }
            if (TextUtils.isEmpty(this.e)) {
                this.e = WebSettings.getDefaultUserAgent(context);
            }
            if (TextUtils.isEmpty(this.e)) {
                this.e = c();
            }
            this.e = this.e + " (Mobile; " + str;
            try {
                if (so5.a(context).c()) {
                    this.e = this.e + ";aia";
                }
            } catch (Exception e) {
                com.google.android.gms.ads.internal.zzt.zzp().zzt(e, "AdUtil.getUserAgent");
            }
            String str3 = this.e + ")";
            this.e = str3;
            return str3;
        }
    }

    public final void zze(Context context, String str, boolean z, HttpURLConnection httpURLConnection, boolean z2, int i) {
        int iZza = zza(i);
        zzcgn.zzi("HTTP timeout: " + iZza + " milliseconds.");
        httpURLConnection.setConnectTimeout(iZza);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setReadTimeout(iZza);
        httpURLConnection.setRequestProperty("User-Agent", zzc(context, str));
        httpURLConnection.setUseCaches(false);
    }

    public final boolean zzg(String str) {
        return b(str, this.a, (String) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzZ));
    }

    public final boolean zzh(String str) {
        return b(str, this.b, (String) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzaa));
    }

    @SuppressLint({"UnprotectedReceiver"})
    public final boolean zzi(Context context) {
        if (this.g) {
            return false;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.ads.intent.DEBUG_LOGGING_ENABLEMENT_CHANGED");
        zzbiy.zzc(context);
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zziy)).booleanValue() || Build.VERSION.SDK_INT < 33) {
            context.getApplicationContext().registerReceiver(new j87(), intentFilter);
        } else {
            context.getApplicationContext().registerReceiver(new j87(), intentFilter, 4);
        }
        this.g = true;
        return true;
    }

    @SuppressLint({"UnprotectedReceiver"})
    public final boolean zzj(Context context) {
        if (this.f) {
            return false;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        zzbiy.zzc(context);
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zziy)).booleanValue() || Build.VERSION.SDK_INT < 33) {
            context.getApplicationContext().registerReceiver(new aa7(this), intentFilter);
        } else {
            context.getApplicationContext().registerReceiver(new aa7(this), intentFilter, 4);
        }
        this.f = true;
        return true;
    }

    public final int zzk(Context context, Uri uri) {
        int i;
        if (context == null) {
            zze.zza("Trying to open chrome custom tab on a null context");
            return 3;
        }
        if (context instanceof Activity) {
            i = 0;
        } else {
            zze.zza("Chrome Custom Tabs can only work with Activity context.");
            i = 2;
        }
        zzbiq zzbiqVar = zzbiy.zzdF;
        Boolean bool = (Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiqVar);
        zzbiq zzbiqVar2 = zzbiy.zzdG;
        if (true == bool.equals(com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiqVar2))) {
            i = 9;
        }
        if (i != 0) {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(uri);
            intent.addFlags(268435456);
            context.startActivity(intent);
            return i;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiqVar)).booleanValue()) {
            zzbjw zzbjwVar = new zzbjw();
            zzbjwVar.zze(new h57(zzbjwVar, context, uri));
            zzbjwVar.zzb((Activity) context);
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiqVar2)).booleanValue()) {
            return 5;
        }
        Intent intent2 = new Intent("android.intent.action.VIEW");
        if (!intent2.hasExtra("android.support.customtabs.extra.SESSION")) {
            Bundle bundle = new Bundle();
            li.b(bundle, "android.support.customtabs.extra.SESSION", null);
            intent2.putExtras(bundle);
        }
        intent2.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", true);
        intent2.putExtras(new Bundle());
        intent2.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", 0);
        intent2.setPackage(zzgvf.zza(context));
        intent2.setData(uri);
        Object obj = r80.a;
        r80.QnHx.b(context, intent2, null);
        return 5;
    }
}
