package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ce0 {
    public final lKy3 a;
    public final un2 b;

    public static final class CQf {
        public final x45 a;
        public final x45 b;
        public final Integer c;
        public final Integer d;

        public CQf() {
            this(null, null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CQf)) {
                return false;
            }
            CQf cQf = (CQf) obj;
            return ur1.a(this.a, cQf.a) && ur1.a(this.b, cQf.b);
        }

        public final int hashCode() {
            x45 x45Var = this.a;
            int iHashCode = (x45Var == null ? 0 : x45Var.hashCode()) * 31;
            x45 x45Var2 = this.b;
            return iHashCode + (x45Var2 != null ? x45Var2.hashCode() : 0);
        }

        public final String toString() {
            return "FormValues(minimum=" + this.a + ", maximum=" + this.b + ")";
        }

        public CQf(x45 x45Var, x45 x45Var2) {
            String str;
            String string;
            String str2;
            String string2;
            this.a = x45Var;
            this.b = x45Var2;
            Integer numO = null;
            this.c = (x45Var == null || (str2 = x45Var.a.w) == null || (string2 = mv4.W(str2).toString()) == null) ? null : hv4.o(string2);
            if (x45Var2 != null && (str = x45Var2.a.w) != null && (string = mv4.W(str).toString()) != null) {
                numO = hv4.o(string);
            }
            this.d = numO;
        }
    }

    public static final class F1 {
        public final int a;
        public final int b;

        public F1(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof F1)) {
                return false;
            }
            F1 f1 = (F1) obj;
            return this.a == f1.a && this.b == f1.b;
        }

        public final int hashCode() {
            return (this.a * 31) + this.b;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ValidatedFormValues(minimum=");
            sb.append(this.a);
            sb.append(", maximum=");
            return ex0.c(sb, this.b, ")");
        }
    }

    public static abstract class QnHx {

        public static final class CQf extends QnHx {
            public static final CQf a = new CQf();
        }

        /* JADX INFO: renamed from: ce0$QnHx$QnHx, reason: collision with other inner class name */
        public static final class C0065QnHx extends QnHx {
            public static final C0065QnHx a = new C0065QnHx();
        }
    }

    public ce0(lKy3 lky3, un2 un2Var) {
        this.a = lky3;
        this.b = un2Var;
    }

    public static xq0 a(CQf cQf) {
        Integer num;
        Integer num2 = cQf.d;
        if (num2 == null || (num = cQf.c) == null) {
            return new xq0.QnHx(QnHx.CQf.a);
        }
        return num2.intValue() <= num.intValue() ? new xq0.QnHx(QnHx.C0065QnHx.a) : new xq0.CQf(new F1(num.intValue(), num2.intValue()));
    }
}
