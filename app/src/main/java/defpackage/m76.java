package defpackage;

import android.content.Context;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes3.dex */
public final class m76 {
    public static o36 a(Context context, String str) {
        String strConcat;
        String str2;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] strArrSplit = str.split("/", -1);
        int length = strArrSplit.length;
        if (length != 1) {
            if (length == 2) {
                strConcat = strArrSplit[0];
                str2 = strArrSplit[1];
            }
            return null;
        }
        strConcat = String.valueOf(context.getPackageName()).concat("_preferences");
        str2 = strArrSplit[0];
        if (!TextUtils.isEmpty(strConcat) && !TextUtils.isEmpty(str2)) {
            return new o36(strConcat, str2);
        }
        return null;
    }
}
