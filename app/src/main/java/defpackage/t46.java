package defpackage;

import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzbjj;

/* JADX INFO: loaded from: classes3.dex */
public final class t46 extends zzbjj {
    public static final String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        int length = str.length();
        int i = 0;
        int i2 = 0;
        while (i2 < str.length() && str.charAt(i2) == ',') {
            i2++;
        }
        while (length > 0) {
            int i3 = length - 1;
            if (str.charAt(i3) != ',') {
                break;
            }
            length = i3;
        }
        if (length < i2) {
            return null;
        }
        if (i2 != 0) {
            i = i2;
        } else if (length == str.length()) {
            return str;
        }
        return str.substring(i, length);
    }

    @Override // com.google.android.gms.internal.ads.zzbjj
    public final String zza(String str, String str2) {
        String strA = a(str);
        String strA2 = a(str2);
        if (TextUtils.isEmpty(strA)) {
            return strA2;
        }
        return TextUtils.isEmpty(strA2) ? strA : LPt6Fixed.a(strA, ",", strA2);
    }
}
