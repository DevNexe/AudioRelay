package defpackage;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "com.azefsw.audioconnect.premium.ui.PremiumInputHandler$handleInput$$inlined$observeFlows$1", f = "PremiumInputHandler.kt", l = {}, m = "invokeSuspend")
public final class mb3 extends px4 implements x81<gk4<za3, ya3, fb3>, z80<? super sd5>, Object> {
    public /* synthetic */ Object A;
    public final /* synthetic */ uc3 B;

    @if0(c = "com.copperleaf.ballast.UtilsKt$observeFlows$2$1", f = "utils.kt", l = {62}, m = "invokeSuspend")
    public static final class QnHx extends px4 implements x81<za3, z80<? super sd5>, Object> {
        public int A;
        public /* synthetic */ Object B;
        public final /* synthetic */ gk4<za3, ya3, fb3> C;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QnHx(gk4 gk4Var, z80 z80Var) {
            super(2, z80Var);
            this.C = gk4Var;
        }

        @Override // defpackage.m8
        public final z80<sd5> a(Object obj, z80<?> z80Var) {
            QnHx qnHx = new QnHx(this.C, z80Var);
            qnHx.B = obj;
            return qnHx;
        }

        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type z80 to mb3$QnHx for r3v1 'this'  z80
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // defpackage.m8
        public final java.lang.Object i(java.lang.Object r4) {
            /*
                r3 = this;
                va0 r0 = defpackage.va0.COROUTINE_SUSPENDED
                int r1 = r3.A
                r2 = 1
                if (r1 == 0) goto L15
                if (r1 != r2) goto Ld
                defpackage.C0239D.H(r4)
                goto L25
            Ld:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r0)
                throw r4
            L15:
                defpackage.C0239D.H(r4)
                java.lang.Object r4 = r3.B
                r3.A = r2
                gk4<za3, ya3, fb3> r1 = r3.C
                java.lang.Object r4 = r1.n(r4, r3)
                if (r4 != r0) goto L25
                return r0
            L25:
                sd5 r4 = defpackage.sd5.a
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: mb3.QnHx.i(java.lang.Object):java.lang.Object");
        }

        @Override // defpackage.x81
        public final Object invoke(za3 za3Var, z80<? super sd5> z80Var) {
            return ((QnHx) a(za3Var, z80Var)).i(sd5.a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mb3(uc3 uc3Var, z80 z80Var) {
        super(2, z80Var);
        this.B = uc3Var;
    }

    @Override // defpackage.m8
    public final z80<sd5> a(Object obj, z80<?> z80Var) {
        mb3 mb3Var = new mb3(this.B, z80Var);
        mb3Var.A = obj;
        return mb3Var;
    }

    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        C0239D.H(obj);
        gk4 gk4Var = (gk4) this.A;
        uc3 uc3Var = this.B;
        uc3Var.getClass();
        a62.a.e("visited_premium_screen");
        c54 c54Var = j54.b;
        ad3 ad3Var = uc3Var.a;
        vq2<dd3> vq2VarH = ad3Var.h(c54Var);
        vq2VarH.getClass();
        vq2<Boolean> vq2VarA = ad3Var.a(c54Var);
        Acr acr = new Acr(14);
        vq2VarA.getClass();
        kd.r(new r01(new QnHx(gk4Var, null), kd.s(ps0.M(iE.b(new cs2(new rs2(vq2VarH), new KnU(18))), new xz0(new bc3(new d24(new dc3(uc3Var, null))), new ec3(null)), new cc3(new d24(new fc3(uc3Var, null))), iE.b(new cs2(vq2VarA, acr))))), gk4Var);
        return sd5.a;
    }

    @Override // defpackage.x81
    public final Object invoke(gk4<za3, ya3, fb3> gk4Var, z80<? super sd5> z80Var) {
        return ((mb3) a(gk4Var, z80Var)).i(sd5.a);
    }
}
