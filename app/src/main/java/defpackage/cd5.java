package defpackage;

import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class cd5 {
    public static final cd5 c;
    public static final cd5 d;
    public static final LinkedHashMap e;
    public final String a;
    public final int b;

    public static final class QnHx {
        public static cd5 a(String str) {
            int length = str.length();
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                }
                char cCharAt = str.charAt(i);
                if (X.F(cCharAt) != cCharAt) {
                    break;
                }
                i++;
            }
            if (i != -1) {
                StringBuilder sb = new StringBuilder(str.length());
                sb.append((CharSequence) str, 0, i);
                int iB = mv4.B(str);
                if (i <= iB) {
                    while (true) {
                        sb.append(X.F(str.charAt(i)));
                        if (i == iB) {
                            break;
                        }
                        i++;
                    }
                }
                str = sb.toString();
            }
            cd5 cd5Var = (cd5) cd5.e.get(str);
            return cd5Var == null ? new cd5(str, 0) : cd5Var;
        }
    }

    static {
        cd5 cd5Var = new cd5("http", 80);
        c = cd5Var;
        cd5 cd5Var2 = new cd5("https", 443);
        cd5 cd5Var3 = new cd5("ws", 80);
        d = cd5Var3;
        List listM = ps0.M(cd5Var, cd5Var2, cd5Var3, new cd5("wss", 443), new cd5("socks", 1080));
        int iA = C0239D.A(mu.w0(listM, 10));
        if (iA < 16) {
            iA = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
        for (Object obj : listM) {
            linkedHashMap.put(((cd5) obj).a, obj);
        }
        e = linkedHashMap;
    }

    public cd5(String str, int i) {
        this.a = str;
        this.b = i;
        boolean z = false;
        int i2 = 0;
        while (true) {
            if (i2 >= str.length()) {
                z = true;
                break;
            }
            char cCharAt = str.charAt(i2);
            if (!(Character.toLowerCase(cCharAt) == cCharAt)) {
                break;
            } else {
                i2++;
            }
        }
        if (!z) {
            throw new IllegalArgumentException("All characters should be lower case".toString());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cd5)) {
            return false;
        }
        cd5 cd5Var = (cd5) obj;
        return ur1.a(this.a, cd5Var.a) && this.b == cd5Var.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("URLProtocol(name=");
        sb.append(this.a);
        sb.append(", defaultPort=");
        return qc0.a(sb, this.b, ')');
    }
}
