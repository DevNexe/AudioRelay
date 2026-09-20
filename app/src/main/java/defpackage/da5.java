package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class da5 {

    public static final class QnHx extends cx1 implements j81<zl0, yl0> {
        public final /* synthetic */ t95<T> w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QnHx(t95<T> t95Var) {
            super(1);
            this.w = t95Var;
        }

        @Override // defpackage.j81
        public final yl0 invoke(zl0 zl0Var) {
            return new ca5(this.w);
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public static final t95.QnHx a(t95 t95Var, qb5 qb5Var, String str, g30 g30Var) {
        t95<S>.C0204QnHx<T, V>.C0007QnHx<T, V> c0204QnHx;
        g30Var.e(-1714122528);
        g30Var.e(1157296644);
        boolean zI = g30Var.I(t95Var);
        Object objF = g30Var.f();
        if (zI || objF == g30.QnHx.a) {
            objF = new t95.QnHx(qb5Var, str);
            g30Var.B(objF);
        }
        g30Var.G();
        t95.QnHx qnHx = (t95.QnHx) objF;
        wq0.a(qnHx, new z95(t95Var, qnHx), g30Var);
        if (t95Var.e() && (c0204QnHx = qnHx.b) != 0) {
            j81<? super S, ? extends T> j81Var = c0204QnHx.y;
            t95<S> t95Var2 = t95.this;
            c0204QnHx.w.d((T) j81Var.invoke((Object) t95Var2.c().a()), (T) c0204QnHx.y.invoke((Object) t95Var2.c().c()), (lx0<T>) ((lx0) c0204QnHx.x.invoke(t95Var2.c())));
        }
        g30Var.G();
        return qnHx;
    }

    public static final t95.LPt8Fixed b(t95 t95Var, Object obj, Object obj2, lx0 lx0Var, pb5 pb5Var, String str, g30 g30Var) {
        g30Var.e(-304821198);
        g30Var.e(1157296644);
        boolean zI = g30Var.I(t95Var);
        Object objF = g30Var.f();
        if (zI || objF == g30.QnHx.a) {
            objF = new t95.LPt8Fixed(obj, ((z_Mm) pb5Var.a().invoke(obj2)).c(), pb5Var);
            g30Var.B(objF);
        }
        g30Var.G();
        t95.LPt8Fixed lPt8 = (t95.LPt8Fixed) objF;
        if (t95Var.e()) {
            lPt8.d(obj, obj2, lx0Var);
        } else {
            lPt8.e(obj2, lx0Var);
        }
        wq0.a(lPt8, new ba5(t95Var, lPt8), g30Var);
        g30Var.G();
        return lPt8;
    }

    public static final <T> t95<T> c(T t, String str, g30 g30Var, int i, int i2) {
        g30Var.e(2029166765);
        if ((i2 & 2) != 0) {
            str = null;
        }
        g30Var.e(-492369756);
        Object objF = g30Var.f();
        if (objF == g30.QnHx.a) {
            objF = new t95(new ti2(t), str);
            g30Var.B(objF);
        }
        g30Var.G();
        t95<T> t95Var = (t95) objF;
        t95Var.a(t, g30Var, (i & 8) | 48 | (i & 14));
        wq0.a(t95Var, new QnHx(t95Var), g30Var);
        g30Var.G();
        return t95Var;
    }
}
