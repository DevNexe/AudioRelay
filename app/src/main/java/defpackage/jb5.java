package defpackage;

import kotlinx.serialization.SerializationException;

/* JADX INFO: loaded from: classes3.dex */
public final class jb5<A, B, C> implements rv1<ib5<? extends A, ? extends B, ? extends C>> {
    public final rv1<A> a;
    public final rv1<B> b;
    public final rv1<C> c;
    public final ra4 d = FWT.q("ib5", new pa4[0], new QnHx(this));

    public static final class QnHx extends cx1 implements j81<br, sd5> {
        public final /* synthetic */ jb5<A, B, C> w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QnHx(jb5<A, B, C> jb5Var) {
            super(1);
            this.w = jb5Var;
        }

        @Override // defpackage.j81
        public final sd5 invoke(br brVar) {
            br brVar2 = brVar;
            jb5<A, B, C> jb5Var = this.w;
            br.a(brVar2, "first", jb5Var.a.a());
            br.a(brVar2, "second", jb5Var.b.a());
            br.a(brVar2, "third", jb5Var.c.a());
            return sd5.a;
        }
    }

    public jb5(rv1<A> rv1Var, rv1<B> rv1Var2, rv1<C> rv1Var3) {
        this.a = rv1Var;
        this.b = rv1Var2;
        this.c = rv1Var3;
    }

    @Override // defpackage.rv1, defpackage.db4, defpackage.zj0
    public final pa4 a() {
        return this.d;
    }

    @Override // defpackage.zj0
    public final Object c(pf0 pf0Var) {
        ra4 ra4Var = this.d;
        g40 g40VarB = pf0Var.b(ra4Var);
        g40VarB.b0();
        Object objJ = mb5.a;
        Object objJ2 = objJ;
        Object objJ3 = objJ2;
        while (true) {
            int iP = g40VarB.p(ra4Var);
            if (iP == -1) {
                g40VarB.G(ra4Var);
                Object obj = mb5.a;
                if (objJ == obj) {
                    throw new SerializationException("Element 'first' is missing");
                }
                if (objJ2 == obj) {
                    throw new SerializationException("Element 'second' is missing");
                }
                if (objJ3 != obj) {
                    return new ib5(objJ, objJ2, objJ3);
                }
                throw new SerializationException("Element 'third' is missing");
            }
            if (iP == 0) {
                objJ = g40VarB.J(ra4Var, 0, this.a, null);
            } else if (iP == 1) {
                objJ2 = g40VarB.J(ra4Var, 1, this.b, null);
            } else {
                if (iP != 2) {
                    throw new SerializationException(GM.a("Unexpected index ", iP));
                }
                objJ3 = g40VarB.J(ra4Var, 2, this.c, null);
            }
        }
    }

    @Override // defpackage.db4
    public final void e(ls0 ls0Var, Object obj) {
        ib5 ib5Var = (ib5) obj;
        ra4 ra4Var = this.d;
        eu1 eu1VarB = ls0Var.b(ra4Var);
        eu1VarB.k0(ra4Var, 0, this.a, ib5Var.w);
        eu1VarB.k0(ra4Var, 1, this.b, ib5Var.x);
        eu1VarB.k0(ra4Var, 2, this.c, ib5Var.y);
        eu1VarB.k();
    }
}
