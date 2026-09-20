package defpackage;

import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public abstract class s52 {
    public static s52 a;

    public static class QnHx extends s52 {
        public final int b;

        public QnHx(int i) {
            this.b = i;
        }

        @Override // defpackage.s52
        public final void a(String str, String str2, Throwable... thArr) {
            if (this.b <= 3) {
                if (thArr.length >= 1) {
                    Log.d(str, str2, thArr[0]);
                } else {
                    Log.d(str, str2);
                }
            }
        }

        @Override // defpackage.s52
        public final void b(String str, String str2, Throwable... thArr) {
            if (this.b <= 6) {
                if (thArr.length >= 1) {
                    Log.e(str, str2, thArr[0]);
                } else {
                    Log.e(str, str2);
                }
            }
        }

        @Override // defpackage.s52
        public final void d(String str, String str2, Throwable... thArr) {
            if (this.b <= 4) {
                if (thArr.length >= 1) {
                    Log.i(str, str2, thArr[0]);
                } else {
                    Log.i(str, str2);
                }
            }
        }

        @Override // defpackage.s52
        public final void f(String str, String str2, Throwable... thArr) {
            if (this.b <= 5) {
                if (thArr.length >= 1) {
                    Log.w(str, str2, thArr[0]);
                } else {
                    Log.w(str, str2);
                }
            }
        }
    }

    public static synchronized s52 c() {
        if (a == null) {
            a = new QnHx(3);
        }
        return a;
    }

    public static String e(String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(23);
        sb.append("WM-");
        if (length >= 20) {
            sb.append(str.substring(0, 20));
        } else {
            sb.append(str);
        }
        return sb.toString();
    }

    public abstract void a(String str, String str2, Throwable... thArr);

    public abstract void b(String str, String str2, Throwable... thArr);

    public abstract void d(String str, String str2, Throwable... thArr);

    public abstract void f(String str, String str2, Throwable... thArr);
}
