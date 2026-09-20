package defpackage;

import android.annotation.SuppressLint;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final class p32 {
    public static p32 e;
    public Locale a = d;
    public final g52 b;
    public final he5 c;
    public static final QnHx f = new QnHx();

    @SuppressLint({"ConstantLocale"})
    public static final Locale d = Locale.getDefault();

    public static final class QnHx {
        public static p32 a() {
            p32 p32Var = p32.e;
            if (!(p32Var != null)) {
                throw new IllegalStateException("Lingver should be initialized first".toString());
            }
            if (p32Var != null) {
                return p32Var;
            }
            ur1.e("instance");
            throw null;
        }
    }

    public p32(va3 va3Var, he5 he5Var) {
        this.b = va3Var;
        this.c = he5Var;
    }
}
