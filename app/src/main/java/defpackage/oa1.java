package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.azefsw.audioconnect.R;
import com.facebook.ads.AdError;
import com.google.ads.mediation.facebook.FacebookAdapter;
import com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException;
import com.google.android.gms.common.GooglePlayServicesMissingManifestValueException;
import com.google.android.gms.common.QnHx;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public class oa1 {
    public static final int a;
    public static final oa1 b;

    static {
        AtomicBoolean atomicBoolean = ra1.a;
        a = 12451000;
        b = new oa1();
    }

    public static int a(Context context) {
        AtomicBoolean atomicBoolean = ra1.a;
        try {
            return context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            return 0;
        }
    }

    public Intent b(Context context, String str, int i) {
        if (i != 1 && i != 2) {
            if (i != 3) {
                return null;
            }
            int i2 = ab7.a;
            Uri uriFromParts = Uri.fromParts("package", "com.google.android.gms", null);
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(uriFromParts);
            return intent;
        }
        if (context != null && ik0.c(context)) {
            int i3 = ab7.a;
            Intent intent2 = new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
            intent2.setPackage("com.google.android.wearable.app");
            return intent2;
        }
        StringBuilder sb = new StringBuilder("gcore_");
        sb.append(a);
        sb.append("-");
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
        }
        sb.append("-");
        if (context != null) {
            sb.append(context.getPackageName());
        }
        sb.append("-");
        if (context != null) {
            try {
                sb.append(so5.a(context).b(0, context.getPackageName()).versionCode);
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        String string = sb.toString();
        int i4 = ab7.a;
        Intent intent3 = new Intent("android.intent.action.VIEW");
        Uri.Builder builderAppendQueryParameter = Uri.parse("market://details").buildUpon().appendQueryParameter(FacebookAdapter.KEY_ID, "com.google.android.gms");
        if (!TextUtils.isEmpty(string)) {
            builderAppendQueryParameter.appendQueryParameter("pcampaignid", string);
        }
        intent3.setData(builderAppendQueryParameter.build());
        intent3.setPackage("com.android.vending");
        intent3.addFlags(524288);
        return intent3;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x01ab A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:104:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:105:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:107:0x01b5 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:108:0x01b6 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:114:0x0176 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:73:0x0119  */
    /* JADX WARN: Code duplicated, block: B:81:0x0142  */
    /* JADX WARN: Code duplicated, block: B:82:0x0144  */
    /* JADX WARN: Code duplicated, block: B:85:0x0149  */
    /* JADX WARN: Code duplicated, block: B:87:0x014d  */
    /* JADX WARN: Code duplicated, block: B:88:0x0172  */
    /* JADX WARN: Code duplicated, block: B:96:0x0192  */
    /* JADX WARN: Code duplicated, block: B:97:0x0194  */
    /* JADX WARN: Instruction removed from duplicated block: B:87:0x014d, please report this as an issue */
    public int c(Context context, int i) {
        boolean z;
        PackageInfo packageInfo;
        int i2;
        int i3;
        int i4;
        ApplicationInfo applicationInfo;
        AtomicBoolean atomicBoolean = ra1.a;
        try {
            context.getResources().getString(R.string.common_google_play_services_unknown_issue);
        } catch (Throwable unused) {
            Log.e("GooglePlayServicesUtil", "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included.");
        }
        boolean zB = true;
        if (!"com.google.android.gms".equals(context.getPackageName()) && !ra1.d.get()) {
            synchronized (tv5.a) {
                if (!tv5.b) {
                    tv5.b = true;
                    try {
                        Bundle bundle = so5.a(context).a(128, context.getPackageName()).metaData;
                        if (bundle != null) {
                            bundle.getString("com.google.app.id");
                            tv5.c = bundle.getInt("com.google.android.gms.version");
                        }
                    } catch (PackageManager.NameNotFoundException e) {
                        Log.wtf("MetadataValueReader", "This should never happen.", e);
                    }
                }
            }
            int i5 = tv5.c;
            if (i5 == 0) {
                throw new GooglePlayServicesMissingManifestValueException();
            }
            if (i5 != 12451000) {
                throw new GooglePlayServicesIncorrectManifestValueException(i5);
            }
        }
        if (ik0.c(context)) {
            z = false;
        } else {
            if (ik0.d == null) {
                ik0.d = Boolean.valueOf(context.getPackageManager().hasSystemFeature("android.hardware.type.iot") || context.getPackageManager().hasSystemFeature("android.hardware.type.embedded"));
            }
            if (ik0.d.booleanValue()) {
                z = false;
            } else {
                z = true;
            }
        }
        oa3.b(i >= 0);
        String packageName = context.getPackageName();
        PackageManager packageManager = context.getPackageManager();
        if (z) {
            try {
                packageInfo = packageManager.getPackageInfo("com.android.vending", 8256);
            } catch (PackageManager.NameNotFoundException unused2) {
                Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires the Google Play Store, but it is missing."));
            }
        } else {
            packageInfo = null;
        }
        try {
            PackageInfo packageInfo2 = packageManager.getPackageInfo("com.google.android.gms", 64);
            QnHx.a(context);
            if (QnHx.d(packageInfo2, true)) {
                if (z) {
                    oa3.h(packageInfo);
                    if (!QnHx.d(packageInfo, true)) {
                        Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play Store, but its signature is invalid."));
                    } else if (z || packageInfo == null || packageInfo.signatures[0].equals(packageInfo2.signatures[0])) {
                        i3 = packageInfo2.versionCode;
                        if (i3 == -1) {
                            i4 = -1;
                        } else {
                            i4 = i3 / AdError.NETWORK_ERROR_CODE;
                        }
                        if (i4 < (i != -1 ? i / AdError.NETWORK_ERROR_CODE : -1)) {
                            Log.w("GooglePlayServicesUtil", "Google Play services out of date for " + packageName + ".  Requires " + i + " but found " + i3);
                            i2 = 2;
                        } else {
                            applicationInfo = packageInfo2.applicationInfo;
                            if (applicationInfo == null) {
                                try {
                                    applicationInfo = packageManager.getApplicationInfo("com.google.android.gms", 0);
                                } catch (PackageManager.NameNotFoundException e2) {
                                    Log.wtf("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but they're missing when getting application info."), e2);
                                    i2 = 1;
                                }
                            }
                            if (applicationInfo.enabled) {
                                i2 = 0;
                            } else {
                                i2 = 3;
                            }
                        }
                    } else {
                        Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play Store, but its signature doesn't match that of Google Play services."));
                    }
                } else {
                    if (z) {
                    }
                    i3 = packageInfo2.versionCode;
                    if (i3 == -1) {
                        i4 = -1;
                    } else {
                        i4 = i3 / AdError.NETWORK_ERROR_CODE;
                    }
                    if (i4 < (i != -1 ? i / AdError.NETWORK_ERROR_CODE : -1)) {
                        Log.w("GooglePlayServicesUtil", "Google Play services out of date for " + packageName + ".  Requires " + i + " but found " + i3);
                        i2 = 2;
                    } else {
                        applicationInfo = packageInfo2.applicationInfo;
                        if (applicationInfo == null) {
                            applicationInfo = packageManager.getApplicationInfo("com.google.android.gms", 0);
                        }
                        if (applicationInfo.enabled) {
                            i2 = 3;
                        } else {
                            i2 = 0;
                        }
                    }
                }
                if (i2 != 18) {
                    if (i2 == 1) {
                        zB = ra1.b(context);
                    } else {
                        zB = false;
                    }
                }
                if (zB) {
                    return 18;
                }
                return i2;
            }
            Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but their signature is invalid."));
            i2 = 9;
        } catch (PackageManager.NameNotFoundException unused3) {
            Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but they are missing."));
        }
        if (i2 != 18) {
            if (i2 == 1) {
                zB = ra1.b(context);
            } else {
                zB = false;
            }
        }
        if (zB) {
            return 18;
        }
        return i2;
    }
}
