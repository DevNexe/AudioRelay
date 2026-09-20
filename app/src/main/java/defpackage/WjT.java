package defpackage;

import com.azefsw.audioconnect.R;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "com.azefsw.audioconnect.settings.ui.audioquality.AudioQualitySettingsInputHandler$handleInput$$inlined$observeFlows$1", f = "AudioQualitySettingsInputHandler.kt", l = {}, m = "invokeSuspend")
public final class WjT extends px4 implements x81<gk4<wXc, G_W, QsF6>, z80<? super sd5>, Object> {
    public /* synthetic */ Object A;
    public final /* synthetic */ f0 B;

    @if0(c = "com.copperleaf.ballast.UtilsKt$observeFlows$2$1", f = "utils.kt", l = {62}, m = "invokeSuspend")
    public static final class QnHx extends px4 implements x81<wXc, z80<? super sd5>, Object> {
        public int A;
        public /* synthetic */ Object B;
        public final /* synthetic */ gk4<wXc, G_W, QsF6> C;

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
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type z80 to WjT$QnHx for r3v1 'this'  z80
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
                gk4<wXc, G_W, QsF6> r1 = r3.C
                java.lang.Object r4 = r1.n(r4, r3)
                if (r4 != r0) goto L25
                return r0
            L25:
                sd5 r4 = defpackage.sd5.a
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: WjT.QnHx.i(java.lang.Object):java.lang.Object");
        }

        @Override // defpackage.x81
        public final Object invoke(wXc wxc, z80<? super sd5> z80Var) {
            return ((QnHx) a(wxc, z80Var)).i(sd5.a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WjT(z80 z80Var, f0 f0Var) {
        super(2, z80Var);
        this.B = f0Var;
    }

    @Override // defpackage.m8
    public final z80<sd5> a(Object obj, z80<?> z80Var) {
        WjT wjT = new WjT(z80Var, this.B);
        wjT.A = obj;
        return wjT;
    }

    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        C0239D.H(obj);
        gk4 gk4Var = (gk4) this.A;
        f0 f0Var = this.B;
        lKy3 lky3 = f0Var.c;
        lky3.getClass();
        am amVarB = iE.b(new cs2(lky3.j(lky3.d(R.string.pref_enable_compression_key), null, new zm3(lky3)), new KnU(26)));
        am amVarB2 = iE.b(new cs2(lky3.j("OPUS_BITRATE", null, new lb1(lky3)), new Acr(23)));
        c54 c54Var = j54.b;
        kd.r(new r01(new QnHx(gk4Var, null), kd.s(ps0.M(kd.f(amVarB, amVarB2, iE.b(f0Var.b.c.u(c54Var)), new e0(null)), new d0(iE.b(f0Var.a.h(c54Var)))))), gk4Var);
        return sd5.a;
    }

    @Override // defpackage.x81
    public final Object invoke(gk4<wXc, G_W, QsF6> gk4Var, z80<? super sd5> z80Var) {
        return ((WjT) a(gk4Var, z80Var)).i(sd5.a);
    }
}
