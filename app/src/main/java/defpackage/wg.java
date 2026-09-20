package defpackage;

import com.azefsw.audioconnect.R;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "com.azefsw.audioconnect.settings.ui.buffersize.BufferSizeSettingsInputHandler$handleInput$$inlined$observeFlows$1", f = "BufferSizeSettingsInputHandler.kt", l = {}, m = "invokeSuspend")
public final class wg extends px4 implements x81<gk4<sg, qg, ug>, z80<? super sd5>, Object> {
    public /* synthetic */ Object A;
    public final /* synthetic */ ch B;

    @if0(c = "com.copperleaf.ballast.UtilsKt$observeFlows$2$1", f = "utils.kt", l = {62}, m = "invokeSuspend")
    public static final class QnHx extends px4 implements x81<sg, z80<? super sd5>, Object> {
        public int A;
        public /* synthetic */ Object B;
        public final /* synthetic */ gk4<sg, qg, ug> C;

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
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type z80 to wg$QnHx for r3v1 'this'  z80
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
                gk4<sg, qg, ug> r1 = r3.C
                java.lang.Object r4 = r1.n(r4, r3)
                if (r4 != r0) goto L25
                return r0
            L25:
                sd5 r4 = defpackage.sd5.a
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: wg.QnHx.i(java.lang.Object):java.lang.Object");
        }

        @Override // defpackage.x81
        public final Object invoke(sg sgVar, z80<? super sd5> z80Var) {
            return ((QnHx) a(sgVar, z80Var)).i(sd5.a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wg(z80 z80Var, ch chVar) {
        super(2, z80Var);
        this.B = chVar;
    }

    @Override // defpackage.m8
    public final z80<sd5> a(Object obj, z80<?> z80Var) {
        wg wgVar = new wg(z80Var, this.B);
        wgVar.A = obj;
        return wgVar;
    }

    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        C0239D.H(obj);
        gk4 gk4Var = (gk4) this.A;
        dh dhVar = this.B.a;
        lKy3 lky3 = dhVar.c;
        lky3.getClass();
        hr2 hr2VarJ = lky3.j(lky3.d(R.string.pref_custom_buffer_mode_key), null, new Nl(lky3));
        hr2 hr2VarJ2 = lky3.j(lky3.d(R.string.pref_buffer_size_mode_key), null, new czK(lky3));
        c54 c54Var = j54.b;
        vq2<dd3> vq2VarH = dhVar.a.h(c54Var);
        KnU knU = new KnU(27);
        vq2VarH.getClass();
        vq2 vq2VarH2 = vq2.h(hr2VarJ, hr2VarJ2, new hr2(new cs2(vq2VarH, knU)), dhVar.b.c.u(c54Var), new m57());
        k71 k71Var = new k71(25);
        vq2VarH2.getClass();
        kd.r(new r01(new QnHx(gk4Var, null), kd.s(Collections.singletonList(iE.b(new cs2(vq2VarH2, k71Var))))), gk4Var);
        return sd5.a;
    }

    @Override // defpackage.x81
    public final Object invoke(gk4<sg, qg, ug> gk4Var, z80<? super sd5> z80Var) {
        return ((wg) a(gk4Var, z80Var)).i(sd5.a);
    }
}
