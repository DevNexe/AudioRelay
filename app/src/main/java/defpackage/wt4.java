package defpackage;

import java.net.ProtocolException;

/* JADX INFO: loaded from: classes3.dex */
public final class wt4 {
    public final kg3 a;
    public final int b;
    public final String c;

    public static final class QnHx {
        public static wt4 a(String str) throws ProtocolException {
            int i;
            String strSubstring;
            boolean zX = iv4.x(str, "HTTP/1.", false);
            kg3 kg3Var = kg3.HTTP_1_0;
            if (zX) {
                i = 9;
                if (str.length() < 9 || str.charAt(8) != ' ') {
                    throw new ProtocolException(ur1.d(str, "Unexpected status line: "));
                }
                int iCharAt = str.charAt(7) - '0';
                if (iCharAt != 0) {
                    if (iCharAt != 1) {
                        throw new ProtocolException(ur1.d(str, "Unexpected status line: "));
                    }
                    kg3Var = kg3.HTTP_1_1;
                }
            } else {
                if (!iv4.x(str, "ICY ", false)) {
                    throw new ProtocolException(ur1.d(str, "Unexpected status line: "));
                }
                i = 4;
            }
            int i2 = i + 3;
            if (str.length() < i2) {
                throw new ProtocolException(ur1.d(str, "Unexpected status line: "));
            }
            try {
                int i3 = Integer.parseInt(str.substring(i, i2));
                if (str.length() <= i2) {
                    strSubstring = "";
                } else {
                    if (str.charAt(i2) != ' ') {
                        throw new ProtocolException(ur1.d(str, "Unexpected status line: "));
                    }
                    strSubstring = str.substring(i + 4);
                }
                return new wt4(kg3Var, i3, strSubstring);
            } catch (NumberFormatException unused) {
                throw new ProtocolException(ur1.d(str, "Unexpected status line: "));
            }
        }
    }

    public wt4(kg3 kg3Var, int i, String str) {
        this.a = kg3Var;
        this.b = i;
        this.c = str;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.a == kg3.HTTP_1_0) {
            sb.append("HTTP/1.0");
        } else {
            sb.append("HTTP/1.1");
        }
        sb.append(' ');
        sb.append(this.b);
        sb.append(' ');
        sb.append(this.c);
        return sb.toString();
    }
}
