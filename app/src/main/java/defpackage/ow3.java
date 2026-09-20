package defpackage;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "com.azefsw.audioconnect.server.ui.running.RunningAndroidServerInputHandler$handleInput$$inlined$observeFlows$1", f = "RunningAndroidServerInputHandler.kt", l = {}, m = "invokeSuspend")
public final class ow3 extends px4 implements x81<gk4<ev3, dv3, fv3>, z80<? super sd5>, Object> {
    public /* synthetic */ Object A;
    public final /* synthetic */ gx3 B;

    @if0(c = "com.copperleaf.ballast.UtilsKt$observeFlows$2$1", f = "utils.kt", l = {62}, m = "invokeSuspend")
    public static final class QnHx extends px4 implements x81<ev3, z80<? super sd5>, Object> {
        public int A;
        public /* synthetic */ Object B;
        public final /* synthetic */ gk4<ev3, dv3, fv3> C;

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
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type z80 to ow3$QnHx for r3v1 'this'  z80
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
                gk4<ev3, dv3, fv3> r1 = r3.C
                java.lang.Object r4 = r1.n(r4, r3)
                if (r4 != r0) goto L25
                return r0
            L25:
                sd5 r4 = defpackage.sd5.a
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: ow3.QnHx.i(java.lang.Object):java.lang.Object");
        }

        @Override // defpackage.x81
        public final Object invoke(ev3 ev3Var, z80<? super sd5> z80Var) {
            return ((QnHx) a(ev3Var, z80Var)).i(sd5.a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ow3(gx3 gx3Var, z80 z80Var) {
        super(2, z80Var);
        this.B = gx3Var;
    }

    @Override // defpackage.m8
    public final z80<sd5> a(Object obj, z80<?> z80Var) {
        ow3 ow3Var = new ow3(this.B, z80Var);
        ow3Var.A = obj;
        return ow3Var;
    }

    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        C0239D.H(obj);
        gk4 gk4Var = (gk4) this.A;
        gx3 gx3Var = this.B;
        gx3Var.getClass();
        c54 c54Var = j54.b;
        vq2<dd3> vq2VarH = gx3Var.r.h(c54Var);
        KnU knU = new KnU(25);
        vq2VarH.getClass();
        d7G d7g = gx3Var.b;
        v01 v01VarA = gx3Var.o.a();
        c54 c54Var2 = j54.c;
        uz4 uz4Var = gx3Var.m;
        uz4Var.getClass();
        pb pbVar = gx3Var.d;
        kd.r(new r01(new QnHx(gk4Var, null), kd.s(ps0.M(iE.b(new cs2(vq2VarH, knU)), new d24(new sa0(kd.f(iE.b(((ef4) d7g.x).b(c54Var).B(new j71(7, d7g, c54Var))), kd.i(new wv3(iE.b(gx3Var.k.b(c54Var)))), kd.i(kd.G(iE.b(gx3Var.i.b(c54Var)), new uv3(gx3Var, null))), new lw3(null)), hx3.a, null)), new dw3(new cw3(iE.b(gx3Var.c.E0(c54Var)))), new ew3(new w01(iE.b(new cs2(gx3Var.p.a.r.a(null), new k71(21))), kd.G(new d24(new mw3(gx3Var, null)), new vv3(gx3Var, null)), new nw3(null))), new fw3(gx3Var.n.a.a()), new w01(v01VarA, iE.b(gx3Var.q.c(c54Var2)), new kw3(null)), new hw3(new rv3(new gw3(iE.b(new gr2(new sz4(uz4Var, "CLIENT_LISTENER", c54Var)))))), new xv3(new jw3(new tv3(new iw3(new sv3(iE.b(gx3Var.g.b(c54Var))))))), new yv3(iE.b(vq2.k(pbVar.d.a, pbVar.b.n.a(c54Var), new nc4(pbVar, 3)))), new zv3(iE.b(gx3Var.l.a(c54Var)), gx3Var), new bw3(new aw3(iE.b(vq2.k(gx3Var.h.O0(c54Var), gx3Var.f.b(c54Var), xnX3.z)), gx3Var))))), gk4Var);
        return sd5.a;
    }

    @Override // defpackage.x81
    public final Object invoke(gk4<ev3, dv3, fv3> gk4Var, z80<? super sd5> z80Var) {
        return ((ow3) a(gk4Var, z80Var)).i(sd5.a);
    }
}
