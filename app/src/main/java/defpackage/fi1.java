package defpackage;

import com.azefsw.audioconnect.R;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "com.azefsw.audioconnect.player.ui.idle.IdlePlayerInputHandler$handleInput$$inlined$observeFlows$1", f = "IdlePlayerInputHandler.kt", l = {}, m = "invokeSuspend")
public final class fi1 extends px4 implements x81<gk4<bi1, ai1, ci1>, z80<? super sd5>, Object> {
    public /* synthetic */ Object A;
    public final /* synthetic */ ii1 B;

    @if0(c = "com.copperleaf.ballast.UtilsKt$observeFlows$2$1", f = "utils.kt", l = {62}, m = "invokeSuspend")
    public static final class QnHx extends px4 implements x81<bi1, z80<? super sd5>, Object> {
        public int A;
        public /* synthetic */ Object B;
        public final /* synthetic */ gk4<bi1, ai1, ci1> C;

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
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type z80 to fi1$QnHx for r3v1 'this'  z80
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
                gk4<bi1, ai1, ci1> r1 = r3.C
                java.lang.Object r4 = r1.n(r4, r3)
                if (r4 != r0) goto L25
                return r0
            L25:
                sd5 r4 = defpackage.sd5.a
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: fi1.QnHx.i(java.lang.Object):java.lang.Object");
        }

        @Override // defpackage.x81
        public final Object invoke(bi1 bi1Var, z80<? super sd5> z80Var) {
            return ((QnHx) a(bi1Var, z80Var)).i(sd5.a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fi1(z80 z80Var, ii1 ii1Var) {
        super(2, z80Var);
        this.B = ii1Var;
    }

    @Override // defpackage.m8
    public final z80<sd5> a(Object obj, z80<?> z80Var) {
        fi1 fi1Var = new fi1(z80Var, this.B);
        fi1Var.A = obj;
        return fi1Var;
    }

    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        C0239D.H(obj);
        gk4 gk4Var = (gk4) this.A;
        ii1 ii1Var = this.B;
        lKy3 lky3 = ii1Var.a.a;
        lky3.getClass();
        kd.r(new r01(new QnHx(gk4Var, null), kd.s(Collections.singletonList(kd.f(iE.b(lky3.j(lky3.d(R.string.pref_show_setup_card_key), null, new DB(lky3))), iE.b(ii1Var.b.a.q().B(new k71(15))), iE.b(new cs2(ii1Var.c.a(), new Acr(11))), new hi1(null))))), gk4Var);
        return sd5.a;
    }

    @Override // defpackage.x81
    public final Object invoke(gk4<bi1, ai1, ci1> gk4Var, z80<? super sd5> z80Var) {
        return ((fi1) a(gk4Var, z80Var)).i(sd5.a);
    }
}
