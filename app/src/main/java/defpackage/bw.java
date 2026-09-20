package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class bw implements la0, Serializable {
    public final la0 w;
    public final la0.CQf x;

    public static final class QnHx extends cx1 implements x81<String, la0.CQf, String> {
        public static final QnHx w = new QnHx();

        public QnHx() {
            super(2);
        }

        @Override // defpackage.x81
        public final String invoke(String str, la0.CQf cQf) {
            String str2 = str;
            la0.CQf cQf2 = cQf;
            if (str2.length() == 0) {
                return cQf2.toString();
            }
            return str2 + ", " + cQf2;
        }
    }

    public bw(la0.CQf cQf, la0 la0Var) {
        this.w = la0Var;
        this.x = cQf;
    }

    @Override // defpackage.la0
    public final la0 e(la0.F1<?> f1) {
        la0.CQf cQf = this.x;
        la0.CQf cQfJ = cQf.j(f1);
        la0 la0Var = this.w;
        if (cQfJ != null) {
            return la0Var;
        }
        la0 la0VarE = la0Var.e(f1);
        if (la0VarE == la0Var) {
            return this;
        }
        return la0VarE == xr0.w ? cQf : new bw(cQf, la0VarE);
    }

    public final boolean equals(Object obj) {
        boolean zA;
        if (this != obj) {
            if (!(obj instanceof bw)) {
                return false;
            }
            bw bwVar = (bw) obj;
            bwVar.getClass();
            int i = 2;
            bw bwVar2 = bwVar;
            int i2 = 2;
            while (true) {
                la0 la0Var = bwVar2.w;
                bwVar2 = la0Var instanceof bw ? (bw) la0Var : null;
                if (bwVar2 == null) {
                    break;
                }
                i2++;
            }
            bw bwVar3 = this;
            while (true) {
                la0 la0Var2 = bwVar3.w;
                bwVar3 = la0Var2 instanceof bw ? (bw) la0Var2 : null;
                if (bwVar3 == null) {
                    break;
                }
                i++;
            }
            if (i2 != i) {
                return false;
            }
            bw bwVar4 = this;
            while (true) {
                la0.CQf cQf = bwVar4.x;
                if (!ur1.a(bwVar.j(cQf.getKey()), cQf)) {
                    zA = false;
                    break;
                }
                la0 la0Var3 = bwVar4.w;
                if (!(la0Var3 instanceof bw)) {
                    la0.CQf cQf2 = (la0.CQf) la0Var3;
                    zA = ur1.a(bwVar.j(cQf2.getKey()), cQf2);
                    break;
                }
                bwVar4 = (bw) la0Var3;
            }
            if (!zA) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.la0
    public final la0 g0(la0 la0Var) {
        return la0.QnHx.a(this, la0Var);
    }

    public final int hashCode() {
        return this.x.hashCode() + this.w.hashCode();
    }

    @Override // defpackage.la0
    public final <R> R i(R r, x81<? super R, ? super la0.CQf, ? extends R> x81Var) {
        return x81Var.invoke((Object) this.w.i(r, x81Var), this.x);
    }

    @Override // defpackage.la0
    public final <E extends la0.CQf> E j(la0.F1<E> f1) {
        bw bwVar = this;
        while (true) {
            E e = (E) bwVar.x.j(f1);
            if (e != null) {
                return e;
            }
            la0 la0Var = bwVar.w;
            if (!(la0Var instanceof bw)) {
                return (E) la0Var.j(f1);
            }
            bwVar = (bw) la0Var;
        }
    }

    public final String toString() {
        return bl2.c(new StringBuilder("["), (String) i("", QnHx.w), ']');
    }
}
