package defpackage;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class cp3 {
    public final ch1 a;
    public final String b;
    public final nc1 c;
    public final B8C d;
    public final Map<Class<?>, Object> e;
    public tk f;

    public cp3(ch1 ch1Var, String str, nc1 nc1Var, B8C b8c, Map<Class<?>, ? extends Object> map) {
        this.a = ch1Var;
        this.b = str;
        this.c = nc1Var;
        this.d = b8c;
        this.e = map;
    }

    public final String a(String str) {
        return this.c.a(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        StringBuilder sb = new StringBuilder("Request{method=");
        sb.append(this.b);
        sb.append(", url=");
        sb.append(this.a);
        nc1 nc1Var = this.c;
        if (nc1Var.w.length / 2 != 0) {
            sb.append(", headers=[");
            int i = 0;
            for (uy2<? extends String, ? extends String> uy2Var : nc1Var) {
                int i2 = i + 1;
                if (i < 0) {
                    ps0.j0();
                    throw null;
                }
                uy2<? extends String, ? extends String> uy2Var2 = uy2Var;
                String str = (String) uy2Var2.w;
                String str2 = (String) uy2Var2.x;
                if (i > 0) {
                    sb.append(", ");
                }
                sb.append(str);
                sb.append(':');
                sb.append(str2);
                i = i2;
            }
            sb.append(']');
        }
        Map<Class<?>, Object> map = this.e;
        if (!map.isEmpty()) {
            sb.append(", tags=");
            sb.append(map);
        }
        sb.append('}');
        return sb.toString();
    }

    public static class QnHx {
        public ch1 a;
        public String b;
        public nc1.QnHx c;
        public B8C d;
        public final LinkedHashMap e;

        public QnHx() {
            this.e = new LinkedHashMap();
            this.b = "GET";
            this.c = new nc1.QnHx();
        }

        public final cp3 a() {
            ch1 ch1Var = this.a;
            if (ch1Var == null) {
                throw new IllegalStateException("url == null".toString());
            }
            String str = this.b;
            nc1 nc1VarB = this.c.b();
            B8C b8c = this.d;
            byte[] bArr = qf5.a;
            LinkedHashMap linkedHashMap = this.e;
            return new cp3(ch1Var, str, nc1VarB, b8c, linkedHashMap.isEmpty() ? ds0.w : Collections.unmodifiableMap(new LinkedHashMap(linkedHashMap)));
        }

        public final void b(String str, String str2) {
            this.c.d(str, str2);
        }

        public final void c(String str, B8C b8c) {
            if (!(str.length() > 0)) {
                throw new IllegalArgumentException("method.isEmpty() == true".toString());
            }
            if (b8c == null) {
                if (!(!(ur1.a(str, "POST") || ur1.a(str, "PUT") || ur1.a(str, "PATCH") || ur1.a(str, "PROPPATCH") || ur1.a(str, "REPORT")))) {
                    throw new IllegalArgumentException(fc2.a("method ", str, " must have a request body.").toString());
                }
            } else if (!eu.g(str)) {
                throw new IllegalArgumentException(fc2.a("method ", str, " must not have a request body.").toString());
            }
            this.b = str;
            this.d = b8c;
        }

        public final void d(String str) {
            this.c.c(str);
        }

        public QnHx(cp3 cp3Var) {
            LinkedHashMap linkedHashMap;
            this.e = new LinkedHashMap();
            this.a = cp3Var.a;
            this.b = cp3Var.b;
            this.d = cp3Var.d;
            Map<Class<?>, Object> map = cp3Var.e;
            if (map.isEmpty()) {
                linkedHashMap = new LinkedHashMap();
            } else {
                linkedHashMap = new LinkedHashMap(map);
            }
            this.e = linkedHashMap;
            this.c = cp3Var.c.c();
        }
    }
}
