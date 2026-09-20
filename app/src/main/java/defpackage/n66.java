package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes3.dex */
public final class n66 {
    public static String a;

    public static synchronized String a(Context context) {
        String str;
        if (a == null) {
            ContentResolver contentResolver = context.getContentResolver();
            String string = contentResolver == null ? null : Settings.Secure.getString(contentResolver, "android_id");
            if (string == null || b()) {
                string = "emulator";
            }
            int i = 0;
            while (true) {
                str = "";
                if (i >= 3) {
                    break;
                }
                try {
                    MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                    messageDigest.update(string.getBytes());
                    str = String.format("%032X", new BigInteger(1, messageDigest.digest()));
                    break;
                } catch (ArithmeticException unused) {
                } catch (NoSuchAlgorithmException unused2) {
                    i++;
                }
            }
            a = str;
        }
        return a;
    }

    public static boolean b() {
        String str = Build.FINGERPRINT;
        if (str.startsWith("generic") || str.startsWith("unknown")) {
            return true;
        }
        String str2 = Build.MODEL;
        if (str2.contains("google_sdk") || str2.contains("Emulator") || str2.contains("Android SDK built for x86") || Build.MANUFACTURER.contains("Genymotion")) {
            return true;
        }
        return (Build.BRAND.startsWith("generic") && Build.DEVICE.startsWith("generic")) || "google_sdk".equals(Build.PRODUCT);
    }
}
