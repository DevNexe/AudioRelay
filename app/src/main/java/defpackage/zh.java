package defpackage;

import android.annotation.SuppressLint;
import android.os.Build;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class zh {
    /* JADX WARN: Code duplicated, block: B:12:0x002b  */
    @SuppressLint({"RestrictedApi"})
    @Deprecated
    public static boolean a() {
        boolean z;
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            return true;
        }
        if (i >= 30) {
            String str = Build.VERSION.CODENAME;
            if ("REL".equals(str)) {
                z = false;
            } else {
                Locale locale = Locale.ROOT;
                if (str.toUpperCase(locale).compareTo("S".toUpperCase(locale)) >= 0) {
                    z = true;
                } else {
                    z = false;
                }
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002b  */
    public static boolean b() {
        boolean z;
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            return true;
        }
        if (i >= 32) {
            String str = Build.VERSION.CODENAME;
            if ("REL".equals(str)) {
                z = false;
            } else {
                Locale locale = Locale.ROOT;
                if (str.toUpperCase(locale).compareTo("Tiramisu".toUpperCase(locale)) >= 0) {
                    z = true;
                } else {
                    z = false;
                }
            }
            if (z) {
                return true;
            }
        }
        return false;
    }
}
