package defpackage;

import android.util.Log;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class sw1 {
    public final HashMap a = new HashMap();
    public final int b = 64;
    public final int c;

    public sw1(int i) {
        this.c = i;
    }

    public static String a(int i, String str) {
        if (str == null) {
            return str;
        }
        String strTrim = str.trim();
        return strTrim.length() > i ? strTrim.substring(0, i) : strTrim;
    }

    public final synchronized boolean b(String str, String str2) {
        boolean zEquals;
        try {
            if (str == null) {
                throw new IllegalArgumentException("Custom attribute key must not be null.");
            }
            String strA = a(this.c, str);
            if (this.a.size() >= this.b && !this.a.containsKey(strA)) {
                Log.w("FirebaseCrashlytics", "Ignored entry \"" + str + "\" when adding custom keys. Maximum allowable: " + this.b, null);
                return false;
            }
            String strA2 = a(this.c, str2);
            String str3 = (String) this.a.get(strA);
            if (str3 == null) {
                zEquals = strA2 == null;
            } else {
                zEquals = str3.equals(strA2);
            }
            if (zEquals) {
                return false;
            }
            HashMap map = this.a;
            if (str2 == null) {
                strA2 = "";
            }
            map.put(strA, strA2);
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void c(Map<String, String> map) {
        int i = 0;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            if (key == null) {
                throw new IllegalArgumentException("Custom attribute key must not be null.");
            }
            String strA = a(this.c, key);
            if (this.a.size() < this.b || this.a.containsKey(strA)) {
                String value = entry.getValue();
                this.a.put(strA, value == null ? "" : a(this.c, value));
            } else {
                i++;
            }
        }
        if (i > 0) {
            Log.w("FirebaseCrashlytics", "Ignored " + i + " entries when adding custom keys. Maximum allowable: " + this.b, null);
        }
    }
}
