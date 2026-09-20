package defpackage;

import android.annotation.TargetApi;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.android.gms.common.QnHx;

/* JADX INFO: loaded from: classes.dex */
public final class ld5 {
    public static boolean a(Context context, int i) {
        if (!b(context, "com.google.android.gms", i)) {
            return false;
        }
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.google.android.gms", 64);
            QnHx qnHxA = QnHx.a(context);
            qnHxA.getClass();
            if (packageInfo == null) {
                return false;
            }
            if (!QnHx.d(packageInfo, false)) {
                if (!QnHx.d(packageInfo, true)) {
                    return false;
                }
                if (!ra1.a(qnHxA.a)) {
                    Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
                    return false;
                }
            }
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            if (Log.isLoggable("UidVerifier", 3)) {
                Log.d("UidVerifier", "Package manager can't find google play services package, defaulting to false");
            }
            return false;
        }
    }

    @TargetApi(19)
    public static boolean b(Context context, String str, int i) {
        nx2 nx2VarA = so5.a(context);
        nx2VarA.getClass();
        try {
            AppOpsManager appOpsManager = (AppOpsManager) nx2VarA.a.getSystemService("appops");
            if (appOpsManager == null) {
                throw new NullPointerException("context.getSystemService(Context.APP_OPS_SERVICE) is null");
            }
            appOpsManager.checkPackage(i, str);
            return true;
        } catch (SecurityException unused) {
            return false;
        }
    }
}
