package defpackage;

import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class zd2 {
    public static final Charset b = Charset.forName("UTF-8");
    public final fx0 a;

    public zd2(fx0 fx0Var) {
        this.a = fx0Var;
    }

    public static HashMap a(String str) {
        JSONObject jSONObject = new JSONObject(str);
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String strOptString = null;
            if (!jSONObject.isNull(next)) {
                strOptString = jSONObject.optString(next, null);
            }
            map.put(next, strOptString);
        }
        return map;
    }

    public static void d(File file) {
        if (file.exists() && file.delete()) {
            Log.i("FirebaseCrashlytics", "Deleted corrupt file: " + file.getAbsolutePath(), null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [long] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r8v7 */
    public final Map<String, String> b(String str, boolean z) throws Throwable {
        FileInputStream fileInputStream;
        Exception e;
        fx0 fx0Var = this.a;
        File fileC = z ? fx0Var.c(str, "internal-keys") : fx0Var.c(str, "keys");
        if (fileC.exists()) {
            ?? length = fileC.length();
            if (length != 0) {
                ?? r8 = 0;
                try {
                    try {
                        fileInputStream = new FileInputStream(fileC);
                        try {
                            HashMap mapA = a(kw.l(fileInputStream));
                            kw.a(fileInputStream, "Failed to close user metadata file.");
                            return mapA;
                        } catch (Exception e2) {
                            e = e2;
                            Log.w("FirebaseCrashlytics", "Error deserializing user metadata.", e);
                            d(fileC);
                            kw.a(fileInputStream, "Failed to close user metadata file.");
                            return Collections.emptyMap();
                        }
                    } catch (Exception e3) {
                        fileInputStream = null;
                        e = e3;
                    } catch (Throwable th) {
                        th = th;
                        kw.a(r8, "Failed to close user metadata file.");
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    r8 = length;
                    kw.a(r8, "Failed to close user metadata file.");
                    throw th;
                }
            }
        }
        d(fileC);
        return Collections.emptyMap();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [int] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.io.Closeable] */
    public final String c(String str) {
        FileInputStream fileInputStream;
        File fileC = this.a.c(str, "user-data");
        ?? r4 = 0;
        if (fileC.exists()) {
            ?? r3 = (fileC.length() > 0L ? 1 : (fileC.length() == 0L ? 0 : -1));
            try {
                if (r3 != 0) {
                    try {
                        fileInputStream = new FileInputStream(fileC);
                        try {
                            JSONObject jSONObject = new JSONObject(kw.l(fileInputStream));
                            String strOptString = !jSONObject.isNull("userId") ? jSONObject.optString("userId", null) : null;
                            String str2 = "Loaded userId " + strOptString + " for session " + str;
                            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                Log.d("FirebaseCrashlytics", str2, null);
                            }
                            kw.a(fileInputStream, "Failed to close user metadata file.");
                            return strOptString;
                        } catch (Exception e) {
                            e = e;
                            Log.w("FirebaseCrashlytics", "Error deserializing user metadata.", e);
                            d(fileC);
                            kw.a(fileInputStream, "Failed to close user metadata file.");
                            return null;
                        }
                    } catch (Exception e2) {
                        e = e2;
                        fileInputStream = null;
                    } catch (Throwable th) {
                        th = th;
                        kw.a(r4, "Failed to close user metadata file.");
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                r4 = r3;
            }
        }
        String strA = b70.a("No userId set for session ", str);
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", strA, null);
        }
        d(fileC);
        return null;
    }
}
