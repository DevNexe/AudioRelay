package defpackage;

import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class he3 {
    public static final Map<fv1<? extends Object>, rv1<? extends Object>> a = t92.Q(new uy2(nl3.a(String.class), ii.serializer(pu4.a)), new uy2(nl3.a(Character.TYPE), ii.serializer(ip.a)), new uy2(nl3.a(char[].class), gp.c), new uy2(nl3.a(Double.TYPE), ii.serializer(tm0.a)), new uy2(nl3.a(double[].class), rm0.c), new uy2(nl3.a(Float.TYPE), ii.serializer(yy0.a)), new uy2(nl3.a(float[].class), xy0.c), new uy2(nl3.a(Long.TYPE), ii.serializer(e62.a)), new uy2(nl3.a(long[].class), d62.c), new uy2(nl3.a(Integer.TYPE), ii.serializer(kp1.a)), new uy2(nl3.a(int[].class), jp1.c), new uy2(nl3.a(Short.TYPE), ii.serializer(ak4.a)), new uy2(nl3.a(short[].class), zj4.c), new uy2(nl3.a(Byte.TYPE), ii.serializer(dk.a)), new uy2(nl3.a(byte[].class), jj.c), new uy2(nl3.a(Boolean.TYPE), ii.serializer(wc.a)), new uy2(nl3.a(boolean[].class), vc.c), new uy2(nl3.a(sd5.class), ii.serializer(sd5.a)), new uy2(nl3.a(gq0.class), ii.serializer(gq0.x)));

    public static final String a(String str) {
        String strValueOf;
        if (!(str.length() > 0)) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        char cCharAt = str.charAt(0);
        if (Character.isLowerCase(cCharAt)) {
            String strValueOf2 = String.valueOf(cCharAt);
            Locale locale = Locale.ROOT;
            strValueOf = strValueOf2.toUpperCase(locale);
            if (strValueOf.length() <= 1) {
                strValueOf = String.valueOf(Character.toTitleCase(cCharAt));
            } else if (cCharAt != 329) {
                strValueOf = strValueOf.charAt(0) + strValueOf.substring(1).toLowerCase(locale);
            }
        } else {
            strValueOf = String.valueOf(cCharAt);
        }
        sb.append((Object) strValueOf);
        sb.append(str.substring(1));
        return sb.toString();
    }
}
