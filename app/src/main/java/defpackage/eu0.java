package defpackage;

import com.google.auto.value.AutoValue;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
@AutoValue
public abstract class eu0 {

    @AutoValue.Builder
    public static abstract class QnHx {
        public final void a(String str, String str2) {
            Map<String, String> map = ((o3.QnHx) this).f;
            if (map == null) {
                throw new IllegalStateException("Property \"autoMetadata\" has not been set");
            }
            map.put(str, str2);
        }
    }

    public final String a(String str) {
        String str2 = b().get(str);
        return str2 == null ? "" : str2;
    }

    public abstract Map<String, String> b();

    public abstract Integer c();

    public abstract ks0 d();

    public abstract long e();

    public final int f(String str) {
        String str2 = b().get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    public abstract String g();

    public abstract long h();

    public final o3.QnHx i() {
        o3.QnHx qnHx = new o3.QnHx();
        qnHx.d(g());
        qnHx.b = c();
        qnHx.c(d());
        qnHx.d = Long.valueOf(e());
        qnHx.e = Long.valueOf(h());
        qnHx.f = new HashMap(b());
        return qnHx;
    }
}
