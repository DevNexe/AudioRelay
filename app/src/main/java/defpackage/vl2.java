package defpackage;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public abstract class vl2<T> {
    public static final EQ b;
    public final boolean a;

    public static final class CQf extends vl2<Boolean> {
        public CQf() {
            super(false);
        }

        @Override // defpackage.vl2
        public final Boolean a(Bundle bundle, String str) {
            return (Boolean) bundle.get(str);
        }

        @Override // defpackage.vl2
        public final String b() {
            return "boolean";
        }

        @Override // defpackage.vl2
        public final Boolean c(String str) {
            boolean z;
            if (ur1.a(str, "true")) {
                z = true;
            } else {
                if (!ur1.a(str, "false")) {
                    throw new IllegalArgumentException("A boolean NavType only accepts \"true\" or \"false\" values.");
                }
                z = false;
            }
            return Boolean.valueOf(z);
        }

        @Override // defpackage.vl2
        public final void d(Bundle bundle, String str, Boolean bool) {
            bundle.putBoolean(str, bool.booleanValue());
        }
    }

    public static final class EQ extends vl2<String> {
        public EQ() {
            super(true);
        }

        @Override // defpackage.vl2
        public final String a(Bundle bundle, String str) {
            return (String) bundle.get(str);
        }

        @Override // defpackage.vl2
        public final String b() {
            return "string";
        }

        @Override // defpackage.vl2
        public final String c(String str) {
            return str;
        }

        @Override // defpackage.vl2
        public final void d(Bundle bundle, String str, String str2) {
            bundle.putString(str, str2);
        }
    }

    public static final class F1 extends vl2<float[]> {
        public F1() {
            super(true);
        }

        @Override // defpackage.vl2
        public final float[] a(Bundle bundle, String str) {
            return (float[]) bundle.get(str);
        }

        @Override // defpackage.vl2
        public final String b() {
            return "float[]";
        }

        @Override // defpackage.vl2
        public final float[] c(String str) {
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        @Override // defpackage.vl2
        public final void d(Bundle bundle, String str, float[] fArr) {
            bundle.putFloatArray(str, fArr);
        }
    }

    public static final class LPt8Fixed extends vl2<Float> {
        public LPt8Fixed() {
            super(false);
        }

        @Override // defpackage.vl2
        public final Float a(Bundle bundle, String str) {
            Object obj = bundle.get(str);
            if (obj != null) {
                return Float.valueOf(((Float) obj).floatValue());
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
        }

        @Override // defpackage.vl2
        public final String b() {
            return "float";
        }

        @Override // defpackage.vl2
        public final Float c(String str) {
            return Float.valueOf(Float.parseFloat(str));
        }

        @Override // defpackage.vl2
        public final void d(Bundle bundle, String str, Float f) {
            bundle.putFloat(str, f.floatValue());
        }
    }

    public static final class NUlFixed extends vl2<int[]> {
        public NUlFixed() {
            super(true);
        }

        @Override // defpackage.vl2
        public final int[] a(Bundle bundle, String str) {
            return (int[]) bundle.get(str);
        }

        @Override // defpackage.vl2
        public final String b() {
            return "integer[]";
        }

        @Override // defpackage.vl2
        public final int[] c(String str) {
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        @Override // defpackage.vl2
        public final void d(Bundle bundle, String str, int[] iArr) {
            bundle.putIntArray(str, iArr);
        }
    }

    public static final class QnHx extends vl2<boolean[]> {
        public QnHx() {
            super(true);
        }

        @Override // defpackage.vl2
        public final boolean[] a(Bundle bundle, String str) {
            return (boolean[]) bundle.get(str);
        }

        @Override // defpackage.vl2
        public final String b() {
            return "boolean[]";
        }

        @Override // defpackage.vl2
        public final boolean[] c(String str) {
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        @Override // defpackage.vl2
        public final void d(Bundle bundle, String str, boolean[] zArr) {
            bundle.putBooleanArray(str, zArr);
        }
    }

    public static final class T23 extends vl2<Long> {
        public T23() {
            super(false);
        }

        @Override // defpackage.vl2
        public final Long a(Bundle bundle, String str) {
            Object obj = bundle.get(str);
            if (obj != null) {
                return Long.valueOf(((Long) obj).longValue());
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Long");
        }

        @Override // defpackage.vl2
        public final String b() {
            return "long";
        }

        @Override // defpackage.vl2
        public final Long c(String str) {
            long j;
            String strSubstring = str.endsWith("L") ? str.substring(0, str.length() - 1) : str;
            if (iv4.x(str, "0x", false)) {
                String strSubstring2 = strSubstring.substring(2);
                Th.c(16);
                j = Long.parseLong(strSubstring2, 16);
            } else {
                j = Long.parseLong(strSubstring);
            }
            return Long.valueOf(j);
        }

        @Override // defpackage.vl2
        public final void d(Bundle bundle, String str, Long l) {
            bundle.putLong(str, l.longValue());
        }
    }

    public static final class YKK extends vl2<Integer> {
        public YKK() {
            super(false);
        }

        @Override // defpackage.vl2
        public final Integer a(Bundle bundle, String str) {
            Object obj = bundle.get(str);
            if (obj != null) {
                return Integer.valueOf(((Integer) obj).intValue());
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
        }

        @Override // defpackage.vl2
        public final String b() {
            return "integer";
        }

        @Override // defpackage.vl2
        public final Integer c(String str) {
            int i;
            if (iv4.x(str, "0x", false)) {
                String strSubstring = str.substring(2);
                Th.c(16);
                i = Integer.parseInt(strSubstring, 16);
            } else {
                i = Integer.parseInt(str);
            }
            return Integer.valueOf(i);
        }

        @Override // defpackage.vl2
        public final void d(Bundle bundle, String str, Integer num) {
            bundle.putInt(str, num.intValue());
        }
    }

    public static final class auxFixed extends vl2<long[]> {
        public auxFixed() {
            super(true);
        }

        @Override // defpackage.vl2
        public final long[] a(Bundle bundle, String str) {
            return (long[]) bundle.get(str);
        }

        @Override // defpackage.vl2
        public final String b() {
            return "long[]";
        }

        @Override // defpackage.vl2
        public final long[] c(String str) {
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        @Override // defpackage.vl2
        public final void d(Bundle bundle, String str, long[] jArr) {
            bundle.putLongArray(str, jArr);
        }
    }

    public static final class byN extends vl2<String[]> {
        public byN() {
            super(true);
        }

        @Override // defpackage.vl2
        public final String[] a(Bundle bundle, String str) {
            return (String[]) bundle.get(str);
        }

        @Override // defpackage.vl2
        public final String b() {
            return "string[]";
        }

        @Override // defpackage.vl2
        public final String[] c(String str) {
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        @Override // defpackage.vl2
        public final void d(Bundle bundle, String str, String[] strArr) {
            bundle.putStringArray(str, strArr);
        }
    }

    static {
        new YKK();
        new NUlFixed();
        new T23();
        new auxFixed();
        new LPt8Fixed();
        new F1();
        new CQf();
        new QnHx();
        b = new EQ();
        new byN();
    }

    public vl2(boolean z) {
        this.a = z;
    }

    public abstract T a(Bundle bundle, String str);

    public abstract String b();

    public abstract T c(String str);

    public abstract void d(Bundle bundle, String str, T t);

    public final String toString() {
        return b();
    }
}
