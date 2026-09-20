package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum i85 {
    TLS_1_3("TLSv1.3"),
    TLS_1_2("TLSv1.2"),
    TLS_1_1("TLSv1.1"),
    TLS_1_0("TLSv1"),
    SSL_3_0("SSLv3");

    public final String w;

    public static final class QnHx {
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public static i85 a(String str) {
            int iHashCode = str.hashCode();
            if (iHashCode != 79201641) {
                if (iHashCode != 79923350) {
                    switch (iHashCode) {
                        case -503070503:
                            if (str.equals("TLSv1.1")) {
                                return i85.TLS_1_1;
                            }
                            break;
                        case -503070502:
                            if (str.equals("TLSv1.2")) {
                                return i85.TLS_1_2;
                            }
                            break;
                        case -503070501:
                            if (str.equals("TLSv1.3")) {
                                return i85.TLS_1_3;
                            }
                            break;
                    }
                } else if (str.equals("TLSv1")) {
                    return i85.TLS_1_0;
                }
            } else if (str.equals("SSLv3")) {
                return i85.SSL_3_0;
            }
            throw new IllegalArgumentException(ur1.d(str, "Unexpected TLS version: "));
        }
    }

    i85(String str) {
        this.w = str;
    }
}
