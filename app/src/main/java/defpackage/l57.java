package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.DisplayCutout;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.internal.consent_sdk.zzj;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class l57 {
    public final Application a;
    public final z26 b;
    public final gy5 c;

    public l57(Application application, z26 z26Var, gy5 gy5Var) {
        this.a = application;
        this.b = z26Var;
        this.c = gy5Var;
    }

    public final d66 a(Activity activity, s60 s60Var) throws zzj {
        Bundle bundle;
        String string;
        xh2 xh2Var;
        List<b56> listEmptyList;
        List listEmptyList2;
        PackageInfo packageInfo;
        String string2;
        ArrayList arrayList = new ArrayList();
        Application application = this.a;
        boolean z = n66.b() || arrayList.contains(n66.a(application.getApplicationContext()));
        d66 d66Var = new d66();
        if (TextUtils.isEmpty(null)) {
            try {
                bundle = application.getPackageManager().getApplicationInfo(application.getPackageName(), 128).metaData;
            } catch (PackageManager.NameNotFoundException unused) {
                bundle = null;
            }
            string = bundle != null ? bundle.getString("com.google.android.gms.ads.APPLICATION_ID") : null;
            if (TextUtils.isEmpty(string)) {
                throw new zzj(3, "The UMP SDK requires a valid application ID in your AndroidManifest.xml through a com.google.android.gms.ads.APPLICATION_ID meta-data tag.\nExample AndroidManifest:\n    <meta-data\n        android:name=\"com.google.android.gms.ads.APPLICATION_ID\"\n        android:value=\"ca-app-pub-0000000000000000~0000000000\">");
            }
        } else {
            string = null;
        }
        d66Var.a = string;
        z26 z26Var = this.b;
        z26Var.getClass();
        try {
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(z26Var.a);
            xh2Var = new xh2(advertisingIdInfo.getId(), advertisingIdInfo.isLimitAdTrackingEnabled());
        } catch (GooglePlayServicesNotAvailableException | GooglePlayServicesRepairableException | IOException e) {
            Log.d("UserMessagingPlatform", "Failed to get ad id.", e);
            xh2Var = null;
        }
        if (xh2Var != null) {
            d66Var.c = (String) xh2Var.b;
            d66Var.b = Boolean.valueOf(xh2Var.a);
        }
        if (z) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(b56.PREVIEWING_DEBUG_MESSAGES);
            listEmptyList = arrayList2;
        } else {
            listEmptyList = Collections.emptyList();
        }
        d66Var.k = listEmptyList;
        gy5 gy5Var = this.c;
        gy5Var.getClass();
        Set<String> stringSet = gy5Var.b.getStringSet("stored_info", Collections.emptySet());
        HashMap map = new HashMap();
        for (String str : stringSet) {
            Application application2 = gy5Var.a;
            o36 o36VarA = m76.a(application2, str);
            if (o36VarA == null) {
                String strValueOf = String.valueOf(str);
                Log.d("UserMessagingPlatform", strValueOf.length() != 0 ? "Fetching request info: failed for key: ".concat(strValueOf) : new String("Fetching request info: failed for key: "));
            } else {
                Object obj = application2.getSharedPreferences(o36VarA.a, 0).getAll().get(o36VarA.b);
                if (obj == null) {
                    String strValueOf2 = String.valueOf(str);
                    Log.d("UserMessagingPlatform", strValueOf2.length() != 0 ? "Stored info not exists: ".concat(strValueOf2) : new String("Stored info not exists: "));
                } else {
                    if (obj instanceof Boolean) {
                        string2 = true != ((Boolean) obj).booleanValue() ? "0" : "1";
                    } else if (obj instanceof Number) {
                        string2 = obj.toString();
                    } else if (obj instanceof String) {
                        string2 = (String) obj;
                    } else {
                        String strValueOf3 = String.valueOf(str);
                        Log.d("UserMessagingPlatform", strValueOf3.length() != 0 ? "Failed to fetch stored info: ".concat(strValueOf3) : new String("Failed to fetch stored info: "));
                    }
                    map.put(str, string2);
                }
            }
        }
        d66Var.g = map;
        d66Var.f = Boolean.valueOf(s60Var.a);
        int i = Build.VERSION.SDK_INT;
        d66Var.e = Locale.getDefault().toLanguageTag();
        uh1 uh1Var = new uh1(1);
        uh1Var.c = Integer.valueOf(i);
        uh1Var.b = Build.MODEL;
        uh1Var.a = 2;
        d66Var.d = uh1Var;
        Configuration configuration = application.getResources().getConfiguration();
        application.getResources().getConfiguration();
        j95 j95Var = new j95(9);
        j95Var.a = Integer.valueOf(configuration.screenWidthDp);
        j95Var.b = Integer.valueOf(configuration.screenHeightDp);
        j95Var.c = Double.valueOf(application.getResources().getDisplayMetrics().density);
        if (i < 28) {
            listEmptyList2 = Collections.emptyList();
        } else {
            Window window = activity == null ? null : activity.getWindow();
            View decorView = window == null ? null : window.getDecorView();
            WindowInsets rootWindowInsets = decorView == null ? null : decorView.getRootWindowInsets();
            DisplayCutout displayCutout = rootWindowInsets == null ? null : rootWindowInsets.getDisplayCutout();
            if (displayCutout == null) {
                listEmptyList2 = Collections.emptyList();
            } else {
                displayCutout.getSafeInsetBottom();
                ArrayList arrayList3 = new ArrayList();
                for (Rect rect : displayCutout.getBoundingRects()) {
                    if (rect != null) {
                        m56 m56Var = new m56();
                        m56Var.b = Integer.valueOf(rect.left);
                        m56Var.c = Integer.valueOf(rect.right);
                        m56Var.a = Integer.valueOf(rect.top);
                        m56Var.d = Integer.valueOf(rect.bottom);
                        arrayList3.add(m56Var);
                    }
                }
                listEmptyList2 = arrayList3;
            }
        }
        j95Var.d = listEmptyList2;
        d66Var.h = j95Var;
        try {
            packageInfo = application.getPackageManager().getPackageInfo(application.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException unused2) {
            packageInfo = null;
        }
        rx5 rx5Var = new rx5();
        rx5Var.a = application.getPackageName();
        CharSequence applicationLabel = application.getPackageManager().getApplicationLabel(application.getApplicationInfo());
        rx5Var.b = applicationLabel != null ? applicationLabel.toString() : null;
        if (packageInfo != null) {
            rx5Var.c = Long.toString(Build.VERSION.SDK_INT >= 28 ? packageInfo.getLongVersionCode() : packageInfo.versionCode);
        }
        d66Var.i = rx5Var;
        w56 w56Var = new w56();
        w56Var.w = "2.0.0";
        d66Var.j = w56Var;
        return d66Var;
    }
}
