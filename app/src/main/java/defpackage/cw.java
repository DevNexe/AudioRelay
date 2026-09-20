package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class cw implements pg2 {
    public final pg2 w;
    public final pg2 x;

    public static final class QnHx extends cx1 implements x81<String, pg2.CQf, String> {
        public static final QnHx w = new QnHx();

        public QnHx() {
            super(2);
        }

        @Override // defpackage.x81
        public final String invoke(String str, pg2.CQf cQf) {
            String str2 = str;
            pg2.CQf cQf2 = cQf;
            if (str2.length() == 0) {
                return cQf2.toString();
            }
            return str2 + ", " + cQf2;
        }
    }

    public cw(pg2 pg2Var, pg2 pg2Var2) {
        this.w = pg2Var;
        this.x = pg2Var2;
    }

    @Override // defpackage.pg2
    public final boolean B(f30.F1 f1) {
        return this.w.B(f1) && this.x.B(f1);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof cw) {
            cw cwVar = (cw) obj;
            if (ur1.a(this.w, cwVar.w) && ur1.a(this.x, cwVar.x)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.x.hashCode() * 31) + this.w.hashCode();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pg2
    public final <R> R m0(R r, x81<? super R, ? super pg2.CQf, ? extends R> x81Var) {
        return (R) this.x.m0(this.w.m0(r, x81Var), x81Var);
    }

    public final String toString() {
        return bl2.c(new StringBuilder("["), (String) m0("", QnHx.w), ']');
    }

    @Override // defpackage.pg2
    public final /* synthetic */ pg2 y(pg2 pg2Var) {
        return hj0.b(this, pg2Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pg2
    public final <R> R z(R r, x81<? super pg2.CQf, ? super R, ? extends R> x81Var) {
        return (R) this.w.z(this.x.z(r, x81Var), x81Var);
    }
}
