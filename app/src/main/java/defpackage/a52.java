package defpackage;

import android.os.Build;
import android.os.LocaleList;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class a52 {
    public static final /* synthetic */ int b = 0;
    public final d52 a;

    public static class QnHx {
        public static LocaleList a(Locale... localeArr) {
            return new LocaleList(localeArr);
        }

        public static LocaleList b() {
            return LocaleList.getAdjustedDefault();
        }

        public static LocaleList c() {
            return LocaleList.getDefault();
        }
    }

    static {
        Locale[] localeArr = new Locale[0];
        if (Build.VERSION.SDK_INT >= 24) {
            QnHx.a(localeArr);
        } else {
            new b52(localeArr);
        }
    }

    public a52(d52 d52Var) {
        this.a = d52Var;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a52) {
            if (this.a.equals(((a52) obj).a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }
}
