package defpackage;

import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "com.azefsw.audioconnect.ads.ui.banner.AdBannerContainerInputHandler$handleInput$$inlined$observeFlows$1", f = "AdBannerContainerInputHandler.kt", l = {}, m = "invokeSuspend")
public final class nv extends px4 implements x81<gk4<x8W, GKz7, MW>, z80<? super sd5>, Object> {
    public /* synthetic */ Object A;
    public final /* synthetic */ CGo B;

    @if0(c = "com.copperleaf.ballast.UtilsKt$observeFlows$2$1", f = "utils.kt", l = {62}, m = "invokeSuspend")
    public static final class QnHx extends px4 implements x81<x8W, z80<? super sd5>, Object> {
        public int A;
        public /* synthetic */ Object B;
        public final /* synthetic */ gk4<x8W, GKz7, MW> C;

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
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type z80 to nv$QnHx for r3v1 'this'  z80
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
                gk4<x8W, GKz7, MW> r1 = r3.C
                java.lang.Object r4 = r1.n(r4, r3)
                if (r4 != r0) goto L25
                return r0
            L25:
                sd5 r4 = defpackage.sd5.a
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: nv.QnHx.i(java.lang.Object):java.lang.Object");
        }

        @Override // defpackage.x81
        public final Object invoke(x8W x8w, z80<? super sd5> z80Var) {
            return ((QnHx) a(x8w, z80Var)).i(sd5.a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nv(CGo cGo, z80 z80Var) {
        super(2, z80Var);
        this.B = cGo;
    }

    @Override // defpackage.m8
    public final z80<sd5> a(Object obj, z80<?> z80Var) {
        nv nvVar = new nv(this.B, z80Var);
        nvVar.A = obj;
        return nvVar;
    }

    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        C0239D.H(obj);
        gk4 gk4Var = (gk4) this.A;
        CGo cGo = this.B;
        cGo.getClass();
        c54 c54Var = j54.c;
        P_xB p_xB = cGo.a;
        vq2<dd3> vq2VarH = ((wc3) p_xB.w).h(c54Var);
        int i = 3;
        Acr acr = new Acr(i);
        vq2VarH.getClass();
        vq2 vq2VarB = new hr2(new cs2(vq2VarH, acr)).B(new Ot0r(p_xB, i)).B(new NFo7(p_xB, 5));
        vq2VarB.getClass();
        kd.r(new r01(new QnHx(gk4Var, null), kd.s(Collections.singletonList(kd.G(iE.b(new hr2(vq2VarB)), new rKUZ(cGo, null))))), gk4Var);
        return sd5.a;
    }

    @Override // defpackage.x81
    public final Object invoke(gk4<x8W, GKz7, MW> gk4Var, z80<? super sd5> z80Var) {
        return ((nv) a(gk4Var, z80Var)).i(sd5.a);
    }
}
