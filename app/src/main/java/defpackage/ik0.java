package defpackage;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class ik0 {
    public static Boolean a;
    public static Boolean b;
    public static Boolean c;
    public static Boolean d;
    public static Boolean e;
    public static Boolean f;

    public static boolean a(Context context) {
        if (f == null) {
            boolean z = false;
            if (x53.b() && context.getPackageManager().hasSystemFeature("com.google.android.play.feature.HPE_EXPERIENCE")) {
                z = true;
            }
            f = Boolean.valueOf(z);
        }
        return f.booleanValue();
    }

    public static boolean b(Context context) {
        if (c == null) {
            PackageManager packageManager = context.getPackageManager();
            boolean z = false;
            if (packageManager.hasSystemFeature("com.google.android.feature.services_updater") && packageManager.hasSystemFeature("cn.google.services")) {
                z = true;
            }
            c = Boolean.valueOf(z);
        }
        return c.booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0029  */
    @TargetApi(26)
    public static boolean c(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (a == null) {
            a = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        if (a.booleanValue()) {
            if (Build.VERSION.SDK_INT >= 24) {
                if (d(context)) {
                }
                return false;
            }
        } else if (d(context) || (x53.a() && !x53.b())) {
            return false;
        }
        return true;
    }

    @TargetApi(21)
    public static boolean d(Context context) {
        if (b == null) {
            b = Boolean.valueOf(context.getPackageManager().hasSystemFeature("cn.google"));
        }
        return b.booleanValue();
    }
}
