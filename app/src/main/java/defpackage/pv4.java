package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public class pv4 extends nv4 {
    public static final ArrayList X(String str) {
        int length = str.length();
        ArrayList arrayList = new ArrayList((length / 16) + (length % 16 == 0 ? 0 : 1));
        int i = 0;
        while (true) {
            if (!(i >= 0 && i < length)) {
                return arrayList;
            }
            int i2 = i + 16;
            arrayList.add(ov4.w.invoke(str.subSequence(i, (i2 < 0 || i2 > length) ? length : i2)));
            i = i2;
        }
    }

    public static final String Y(int i, String str) {
        if (!(i >= 0)) {
            throw new IllegalArgumentException(ex0.b("Requested character count ", i, " is less than zero.").toString());
        }
        int length = str.length();
        if (i > length) {
            i = length;
        }
        return str.substring(i);
    }

    public static final String Z(int i, String str) {
        if (!(i >= 0)) {
            throw new IllegalArgumentException(ex0.b("Requested character count ", i, " is less than zero.").toString());
        }
        int length = str.length();
        if (i > length) {
            i = length;
        }
        return str.substring(0, i);
    }
}
