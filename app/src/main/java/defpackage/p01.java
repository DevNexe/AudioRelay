package defpackage;

/* JADX INFO: loaded from: classes3.dex */
@if0(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1", f = "Share.kt", l = {214, 218, 219, 225}, m = "invokeSuspend")
public final class p01 extends px4 implements x81<ua0, z80<? super sd5>, Object> {
    public int A;
    public final /* synthetic */ vj4 B;
    public final /* synthetic */ mz0<Object> C;
    public final /* synthetic */ pi2<Object> D;
    public final /* synthetic */ Object E;

    @if0(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$2", f = "Share.kt", l = {227}, m = "invokeSuspend")
    public static final class CQf extends px4 implements x81<tj4, z80<? super sd5>, Object> {
        public int A;
        public /* synthetic */ Object B;
        public final /* synthetic */ mz0<Object> C;
        public final /* synthetic */ pi2<Object> D;
        public final /* synthetic */ Object E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CQf(mz0<Object> mz0Var, pi2<Object> pi2Var, Object obj, z80<? super CQf> z80Var) {
            super(2, z80Var);
            this.C = mz0Var;
            this.D = pi2Var;
            this.E = obj;
        }

        @Override // defpackage.m8
        public final z80<sd5> a(Object obj, z80<?> z80Var) {
            CQf cQf = new CQf(this.C, this.D, this.E, z80Var);
            cQf.B = obj;
            return cQf;
        }

        @Override // defpackage.m8
        public final Object i(Object obj) throws Throwable {
            va0 va0Var = va0.COROUTINE_SUSPENDED;
            int i = this.A;
            if (i == 0) {
                C0239D.H(obj);
                int iOrdinal = ((tj4) this.B).ordinal();
                pi2<Object> pi2Var = this.D;
                if (iOrdinal == 0) {
                    this.A = 1;
                    if (this.C.a(pi2Var, this) == va0Var) {
                        return va0Var;
                    }
                } else if (iOrdinal == 2) {
                    py4 py4Var = OW8.I;
                    Object obj2 = this.E;
                    if (obj2 == py4Var) {
                        pi2Var.d();
                    } else {
                        pi2Var.e(obj2);
                    }
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C0239D.H(obj);
            }
            return sd5.a;
        }

        @Override // defpackage.x81
        public final Object invoke(tj4 tj4Var, z80<? super sd5> z80Var) {
            return ((CQf) a(tj4Var, z80Var)).i(sd5.a);
        }
    }

    @if0(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$1", f = "Share.kt", l = {}, m = "invokeSuspend")
    public static final class QnHx extends px4 implements x81<Integer, z80<? super Boolean>, Object> {
        public /* synthetic */ int A;

        public QnHx(z80<? super QnHx> z80Var) {
            super(2, z80Var);
        }

        @Override // defpackage.m8
        public final z80<sd5> a(Object obj, z80<?> z80Var) {
            QnHx qnHx = new QnHx(z80Var);
            qnHx.A = ((Number) obj).intValue();
            return qnHx;
        }

        @Override // defpackage.m8
        public final Object i(Object obj) throws Throwable {
            C0239D.H(obj);
            return Boolean.valueOf(this.A > 0);
        }

        @Override // defpackage.x81
        public final Object invoke(Integer num, z80<? super Boolean> z80Var) {
            return ((QnHx) a(Integer.valueOf(num.intValue()), z80Var)).i(sd5.a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p01(vj4 vj4Var, mz0<Object> mz0Var, pi2<Object> pi2Var, Object obj, z80<? super p01> z80Var) {
        super(2, z80Var);
        this.B = vj4Var;
        this.C = mz0Var;
        this.D = pi2Var;
        this.E = obj;
    }

    @Override // defpackage.m8
    public final z80<sd5> a(Object obj, z80<?> z80Var) {
        return new p01(this.B, this.C, this.D, this.E, z80Var);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type z80 to p01 for r8v2 'this'  z80
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // defpackage.m8
    public final java.lang.Object i(java.lang.Object r9) {
        /*
            r8 = this;
            va0 r0 = defpackage.va0.COROUTINE_SUSPENDED
            int r1 = r8.A
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            mz0<java.lang.Object> r6 = r8.C
            pi2<java.lang.Object> r7 = r8.D
            if (r1 == 0) goto L27
            if (r1 == r5) goto L23
            if (r1 == r4) goto L1f
            if (r1 == r3) goto L23
            if (r1 != r2) goto L17
            goto L23
        L17:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1f:
            defpackage.C0239D.H(r9)
            goto L50
        L23:
            defpackage.C0239D.H(r9)
            goto L75
        L27:
            defpackage.C0239D.H(r9)
            ur4 r9 = vj4.QnHx.a
            vj4 r1 = r8.B
            if (r1 != r9) goto L39
            r8.A = r5
            java.lang.Object r9 = r6.a(r7, r8)
            if (r9 != r0) goto L75
            return r0
        L39:
            vr4 r9 = vj4.QnHx.b
            r5 = 0
            if (r1 != r9) goto L59
            pw4 r9 = r7.g()
            p01$QnHx r1 = new p01$QnHx
            r1.<init>(r5)
            r8.A = r4
            java.lang.Object r9 = defpackage.kd.m(r9, r1, r8)
            if (r9 != r0) goto L50
            return r0
        L50:
            r8.A = r3
            java.lang.Object r9 = r6.a(r7, r8)
            if (r9 != r0) goto L75
            return r0
        L59:
            pw4 r9 = r7.g()
            mz0 r9 = r1.a(r9)
            mz0 r9 = defpackage.kd.i(r9)
            p01$CQf r1 = new p01$CQf
            java.lang.Object r3 = r8.E
            r1.<init>(r6, r7, r3, r5)
            r8.A = r2
            java.lang.Object r9 = defpackage.kd.e(r9, r1, r8)
            if (r9 != r0) goto L75
            return r0
        L75:
            sd5 r9 = defpackage.sd5.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p01.i(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.x81
    public final Object invoke(ua0 ua0Var, z80<? super sd5> z80Var) {
        return ((p01) a(ua0Var, z80Var)).i(sd5.a);
    }
}
