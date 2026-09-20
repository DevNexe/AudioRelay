package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Debug;
import android.text.TextUtils;
import android.util.Log;
import com.unity3d.services.core.request.metrics.MetricCommonTags;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public final class kw {
    public static final char[] a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static long b = -1;

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 kw$QnHx, still in use, count: 1, list:
  (r0v0 kw$QnHx) from 0x008c: INVOKE (r2v5 java.util.HashMap), ("x86"), (r0v0 kw$QnHx) VIRTUAL call: java.util.HashMap.put(java.lang.Object, java.lang.Object):java.lang.Object A[MD:(K, V):V (c)] (LINE:141)
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
    	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
    	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class QnHx {
        /* JADX INFO: Fake field, exist only in values array */
        X86_32,
        /* JADX INFO: Fake field, exist only in values array */
        X86_64,
        /* JADX INFO: Fake field, exist only in values array */
        ARM_UNKNOWN,
        /* JADX INFO: Fake field, exist only in values array */
        PPC,
        /* JADX INFO: Fake field, exist only in values array */
        PPC64,
        /* JADX INFO: Fake field, exist only in values array */
        ARMV6,
        /* JADX INFO: Fake field, exist only in values array */
        ARMV7,
        UNKNOWN,
        /* JADX INFO: Fake field, exist only in values array */
        ARMV7S,
        /* JADX INFO: Fake field, exist only in values array */
        ARM64;

        public static final HashMap x;

        static {
            HashMap map = new HashMap(4);
            x = map;
            map.put("armeabi-v7a", qnHx);
            map.put("armeabi", qnHx);
            map.put("arm64-v8a", qnHx);
            map.put("x86", qnHx);
        }

        public QnHx() {
            super(str, i);
        }

        public static QnHx valueOf(String str) {
            return (QnHx) Enum.valueOf(QnHx.class, str);
        }

        public static QnHx[] values() {
            return (QnHx[]) y.clone();
        }
    }

    public static void a(Closeable closeable, String str) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                Log.e("FirebaseCrashlytics", str, e);
            }
        }
    }

    public static long b(int i, String str, String str2) {
        return Long.parseLong(str.split(str2)[0].trim()) * ((long) i);
    }

    public static String c(File file) throws Throwable {
        BufferedReader bufferedReader;
        String str = null;
        str = null;
        str = null;
        BufferedReader bufferedReader2 = null;
        if (file.exists()) {
            try {
                bufferedReader = new BufferedReader(new FileReader(file), 1024);
                while (true) {
                    try {
                        try {
                            String line = bufferedReader.readLine();
                            if (line == null) {
                                break;
                            }
                            String[] strArrSplit = Pattern.compile("\\s*:\\s*").split(line, 2);
                            if (strArrSplit.length > 1 && strArrSplit[0].equals("MemTotal")) {
                                str = strArrSplit[1];
                                break;
                            }
                        } catch (Throwable th) {
                            th = th;
                            bufferedReader2 = bufferedReader;
                            a(bufferedReader2, "Failed to close system file reader.");
                            throw th;
                        }
                    } catch (Exception e) {
                        e = e;
                        Log.e("FirebaseCrashlytics", "Error parsing " + file, e);
                    }
                }
            } catch (Exception e2) {
                e = e2;
                bufferedReader = null;
            } catch (Throwable th2) {
                th = th2;
                a(bufferedReader2, "Failed to close system file reader.");
                throw th;
            }
            a(bufferedReader, "Failed to close system file reader.");
        }
        return str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    public static int d() {
        boolean zI = i();
        ?? r0 = zI;
        if (j()) {
            r0 = (zI ? 1 : 0) | 2;
        }
        return Debug.isDebuggerConnected() || Debug.waitingForDebugger() ? r0 | 4 : r0;
    }

    public static String e(Context context) {
        int iF = f(context, "com.google.firebase.crashlytics.mapping_file_id", "string");
        if (iF == 0) {
            iF = f(context, "com.crashlytics.android.build_id", "string");
        }
        if (iF != 0) {
            return context.getResources().getString(iF);
        }
        return null;
    }

    public static int f(Context context, String str, String str2) {
        String packageName;
        Resources resources = context.getResources();
        int i = context.getApplicationContext().getApplicationInfo().icon;
        if (i > 0) {
            try {
                packageName = context.getResources().getResourcePackageName(i);
                if (MetricCommonTags.METRIC_COMMON_TAG_PLATFORM_ANDROID.equals(packageName)) {
                    packageName = context.getPackageName();
                }
            } catch (Resources.NotFoundException unused) {
                packageName = context.getPackageName();
            }
        } else {
            packageName = context.getPackageName();
        }
        return resources.getIdentifier(str, str2, packageName);
    }

    public static synchronized long g() {
        long jB;
        if (b == -1) {
            String strC = c(new File("/proc/meminfo"));
            if (TextUtils.isEmpty(strC)) {
                jB = 0;
                b = jB;
            } else {
                String upperCase = strC.toUpperCase(Locale.US);
                try {
                    if (upperCase.endsWith("KB")) {
                        jB = b(1024, upperCase, "KB");
                    } else if (upperCase.endsWith("MB")) {
                        jB = b(1048576, upperCase, "MB");
                    } else if (upperCase.endsWith("GB")) {
                        jB = b(1073741824, upperCase, "GB");
                    } else {
                        Log.w("FirebaseCrashlytics", "Unexpected meminfo format while computing RAM: ".concat(upperCase), null);
                        jB = 0;
                    }
                } catch (NumberFormatException e) {
                    Log.e("FirebaseCrashlytics", "Unexpected meminfo format while computing RAM: " + upperCase, e);
                }
                b = jB;
            }
            throw th;
        }
        return b;
    }

    public static String h(byte[] bArr) {
        char[] cArr = new char[bArr.length * 2];
        for (int i = 0; i < bArr.length; i++) {
            int i2 = bArr[i] & 255;
            int i3 = i * 2;
            char[] cArr2 = a;
            cArr[i3] = cArr2[i2 >>> 4];
            cArr[i3 + 1] = cArr2[i2 & 15];
        }
        return new String(cArr);
    }

    public static boolean i() {
        if (!Build.PRODUCT.contains("sdk")) {
            String str = Build.HARDWARE;
            if (!str.contains("goldfish") && !str.contains("ranchu")) {
                return false;
            }
        }
        return true;
    }

    public static boolean j() {
        boolean zI = i();
        String str = Build.TAGS;
        if ((zI || str == null || !str.contains("test-keys")) && !new File("/system/app/Superuser.apk").exists()) {
            return !zI && new File("/system/xbin/su").exists();
        }
        return true;
    }

    public static String k(String str) {
        byte[] bytes = str.getBytes();
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            messageDigest.update(bytes);
            return h(messageDigest.digest());
        } catch (NoSuchAlgorithmException e) {
            Log.e("FirebaseCrashlytics", "Could not create hashing algorithm: SHA-1, returning empty string.", e);
            return "";
        }
    }

    public static String l(FileInputStream fileInputStream) {
        Scanner scannerUseDelimiter = new Scanner(fileInputStream).useDelimiter("\\A");
        return scannerUseDelimiter.hasNext() ? scannerUseDelimiter.next() : "";
    }
}
