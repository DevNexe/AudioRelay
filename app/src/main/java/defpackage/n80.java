package defpackage;

import io.ktor.http.BadContentTypeFormatException;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final class n80 extends kc1 {
    public static final n80 e;
    public final String c;
    public final String d;

    public static final class CQf {
        public static n80 a(String str) throws BadContentTypeFormatException {
            if (iv4.s(str)) {
                return n80.e;
            }
            ic1 ic1Var = (ic1) wu.N0(o70.f(str));
            String str2 = ic1Var.a;
            int iE = mv4.E(str2, '/', 0, false, 6);
            if (iE == -1) {
                if (ur1.a(mv4.W(str2).toString(), "*")) {
                    return n80.e;
                }
                throw new BadContentTypeFormatException(str);
            }
            String string = mv4.W(str2.substring(0, iE)).toString();
            if (string.length() == 0) {
                throw new BadContentTypeFormatException(str);
            }
            String string2 = mv4.W(str2.substring(iE + 1)).toString();
            if (mv4.z(string, ' ') || mv4.z(string2, ' ')) {
                throw new BadContentTypeFormatException(str);
            }
            if ((string2.length() == 0) || mv4.z(string2, '/')) {
                throw new BadContentTypeFormatException(str);
            }
            return new n80(string, string2, ic1Var.b);
        }
    }

    public static final class F1 {
        public static final n80 a;

        static {
            String str = "text";
            new n80(str, "*");
            a = new n80(str, "plain");
            new n80(str, "css");
            new n80(str, "csv");
            new n80(str, "html");
            new n80(str, "javascript");
            new n80(str, "vcard");
            new n80(str, "xml");
            new n80(str, "event-stream");
        }
    }

    public static final class QnHx {
        public static final n80 a;
        public static final n80 b;

        static {
            String str = "application";
            new n80(str, "*");
            new n80(str, "atom+xml");
            new n80(str, "cbor");
            a = new n80(str, "json");
            new n80(str, "hal+json");
            new n80(str, "javascript");
            b = new n80(str, "octet-stream");
            new n80(str, "font-woff");
            new n80(str, "rss+xml");
            new n80(str, "xml");
            new n80(str, "xml-dtd");
            new n80(str, "zip");
            new n80(str, "gzip");
            new n80(str, "x-www-form-urlencoded");
            new n80(str, "pdf");
            new n80(str, "vnd.openxmlformats-officedocument.spreadsheetml.sheet");
            new n80(str, "vnd.openxmlformats-officedocument.wordprocessingml.document");
            new n80(str, "vnd.openxmlformats-officedocument.presentationml.presentation");
            new n80(str, "protobuf");
            new n80(str, "wasm");
            new n80(str, "problem+json");
            new n80(str, "problem+xml");
        }
    }

    static {
        String str = "*";
        e = new n80(str, str);
    }

    public n80(String str, String str2, String str3, List<jc1> list) {
        super(str3, list);
        this.c = str;
        this.d = str2;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0081  */
    public final boolean b(n80 n80Var) {
        boolean zR;
        String str = n80Var.c;
        if (!ur1.a(str, "*") && !iv4.r(str, this.c)) {
            return false;
        }
        String str2 = n80Var.d;
        if (!ur1.a(str2, "*") && !iv4.r(str2, this.d)) {
            return false;
        }
        Iterator<jc1> it = n80Var.b.iterator();
        do {
            zR = true;
            if (!it.hasNext()) {
                return true;
            }
            jc1 next = it.next();
            String str3 = next.a;
            boolean zA = ur1.a(str3, "*");
            String str4 = next.b;
            if (!zA) {
                String strA = a(str3);
                if (!ur1.a(str4, "*")) {
                    zR = iv4.r(strA, str4);
                } else if (strA == null) {
                    zR = false;
                    break;
                    break;
                }
            } else if (!ur1.a(str4, "*")) {
                List<jc1> list = this.b;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator<T> it2 = list.iterator();
                    do {
                        if (!it2.hasNext()) {
                            zR = false;
                            break;
                        }
                    } while (!iv4.r(((jc1) it2.next()).b, str4));
                } else {
                    zR = false;
                    break;
                    break;
                }
            }
        } while (zR);
        return false;
    }

    public final n80 c(String str) {
        List<jc1> list = this.b;
        int size = list.size();
        boolean z = false;
        if (size != 0) {
            if (size != 1) {
                List<jc1> list2 = list;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    for (jc1 jc1Var : list2) {
                        if (iv4.r(jc1Var.a, "charset") && iv4.r(jc1Var.b, str)) {
                            z = true;
                            break;
                        }
                    }
                }
            } else {
                jc1 jc1Var2 = list.get(0);
                if (iv4.r(jc1Var2.a, "charset") && iv4.r(jc1Var2.b, str)) {
                    z = true;
                    break;
                }
            }
        }
        if (z) {
            return this;
        }
        return new n80(this.c, this.d, this.a, wu.V0(new jc1("charset", str), list));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof n80) {
            n80 n80Var = (n80) obj;
            if (iv4.r(this.c, n80Var.c) && iv4.r(this.d, n80Var.d)) {
                if (ur1.a(this.b, n80Var.b)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Locale locale = Locale.ROOT;
        int iHashCode = this.c.toLowerCase(locale).hashCode();
        return (this.b.hashCode() * 31) + this.d.toLowerCase(locale).hashCode() + (iHashCode * 31) + iHashCode;
    }

    public /* synthetic */ n80(String str, String str2) {
        this(str, str2, cs0.w);
    }

    public n80(String str, String str2, List<jc1> list) {
        this(str, str2, str + '/' + str2, list);
    }
}
