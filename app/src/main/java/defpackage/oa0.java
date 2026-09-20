package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class oa0 extends FJCM implements c90 {
    public static final QnHx x = new QnHx();

    public static final class QnHx extends PRnFixed<c90, oa0> {

        /* JADX INFO: renamed from: oa0$QnHx$QnHx, reason: collision with other inner class name */
        public static final class C0177QnHx extends cx1 implements j81<la0.CQf, oa0> {
            public static final C0177QnHx w = new C0177QnHx();

            public C0177QnHx() {
                super(1);
            }

            @Override // defpackage.j81
            public final oa0 invoke(la0.CQf cQf) {
                la0.CQf cQf2 = cQf;
                if (cQf2 instanceof oa0) {
                    return (oa0) cQf2;
                }
                return null;
            }
        }

        public QnHx() {
            super(c90.QnHx.w, C0177QnHx.w);
        }
    }

    public oa0() {
        super(c90.QnHx.w);
    }

    @Override // defpackage.c90
    public final void A(z80<?> z80Var) {
        ((il0) z80Var).m();
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to oa0 for r3v1 'this'  java.lang.Object
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // defpackage.FJCM, la0.CQf, defpackage.la0
    public final defpackage.la0 e(la0.F1<?> r4) {
        /*
            r3 = this;
            boolean r0 = r4 instanceof defpackage.PRnFixed
            xr0 r1 = defpackage.xr0.w
            if (r0 == 0) goto L24
            PRnFixed r4 = (defpackage.PRnFixed) r4
            la0$F1<?> r0 = r3.w
            if (r0 == r4) goto L13
            la0$F1<?> r2 = r4.x
            if (r2 != r0) goto L11
            goto L16
        L11:
            r0 = 0
            goto L17
        L13:
            r4.getClass()
        L16:
            r0 = 1
        L17:
            if (r0 == 0) goto L29
            j81<la0$CQf, E extends B> r4 = r4.w
            java.lang.Object r4 = r4.invoke(r3)
            la0$CQf r4 = (la0.CQf) r4
            if (r4 == 0) goto L29
            goto L2a
        L24:
            c90$QnHx r0 = c90.QnHx.w
            if (r0 != r4) goto L29
            goto L2a
        L29:
            r1 = r3
        L2a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oa0.e(la0$F1):la0");
    }

    public abstract void g(la0 la0Var, Runnable runnable);

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to oa0 for r2v1 'this'  java.lang.Object
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // defpackage.FJCM, la0.CQf, defpackage.la0
    public final <E extends la0.CQf> E j(la0.F1<E> r3) {
        /*
            r2 = this;
            boolean r0 = r3 instanceof defpackage.PRnFixed
            if (r0 == 0) goto L24
            PRnFixed r3 = (defpackage.PRnFixed) r3
            la0$F1<?> r0 = r2.w
            if (r0 == r3) goto L11
            la0$F1<?> r1 = r3.x
            if (r1 != r0) goto Lf
            goto L14
        Lf:
            r0 = 0
            goto L15
        L11:
            r3.getClass()
        L14:
            r0 = 1
        L15:
            if (r0 == 0) goto L2a
            j81<la0$CQf, E extends B> r3 = r3.w
            java.lang.Object r3 = r3.invoke(r2)
            la0$CQf r3 = (la0.CQf) r3
            boolean r0 = r3 instanceof la0.CQf
            if (r0 == 0) goto L2a
            goto L2b
        L24:
            c90$QnHx r0 = c90.QnHx.w
            if (r0 != r3) goto L2a
            r3 = r2
            goto L2b
        L2a:
            r3 = 0
        L2b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oa0.j(la0$F1):la0$CQf");
    }

    public void n(la0 la0Var, Runnable runnable) {
        g(la0Var, runnable);
    }

    public boolean o() {
        return !(this instanceof md5);
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + lf0.a(this);
    }

    public oa0 v(int i) {
        ddf.f(i);
        return new j32(this, i);
    }

    @Override // defpackage.c90
    public final il0 y(b90 b90Var) {
        return new il0(this, b90Var);
    }
}
