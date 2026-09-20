package defpackage;

import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class bj0 {
    public static String a(String str, int i, String str2, int i2, String str3) {
        return str + i + str2 + i2 + str3;
    }

    public static void b(String str, int i, String str2) {
        Log.w(str2, str + i);
    }

    public static /* synthetic */ String c(int i) {
        if (i == 1) {
            return "InMeasureBlock";
        }
        if (i == 2) {
            return "InLayoutBlock";
        }
        return i == 3 ? "NotUsed" : "null";
    }
}
