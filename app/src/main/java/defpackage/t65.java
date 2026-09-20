package defpackage;

import com.azefsw.audioconnect.R;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "com.azefsw.audioconnect.settings.ui.theme.ThemePickerInputHandler$handleInput$$inlined$observeFlows$1", f = "ThemePickerInputHandler.kt", l = {}, m = "invokeSuspend")
public final class t65 extends px4 implements x81<gk4<p65, Object, q65>, z80<? super sd5>, Object> {
    public /* synthetic */ Object A;
    public final /* synthetic */ v65 B;

    @if0(c = "com.copperleaf.ballast.UtilsKt$observeFlows$2$1", f = "utils.kt", l = {62}, m = "invokeSuspend")
    public static final class QnHx extends px4 implements x81<p65, z80<? super sd5>, Object> {
        public int A;
        public /* synthetic */ Object B;
        public final /* synthetic */ gk4<p65, Object, q65> C;

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
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type z80 to t65$QnHx for r3v1 'this'  z80
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
                gk4<p65, java.lang.Object, q65> r1 = r3.C
                java.lang.Object r4 = r1.n(r4, r3)
                if (r4 != r0) goto L25
                return r0
            L25:
                sd5 r4 = defpackage.sd5.a
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: t65.QnHx.i(java.lang.Object):java.lang.Object");
        }

        @Override // defpackage.x81
        public final Object invoke(p65 p65Var, z80<? super sd5> z80Var) {
            return ((QnHx) a(p65Var, z80Var)).i(sd5.a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t65(z80 z80Var, v65 v65Var) {
        super(2, z80Var);
        this.B = v65Var;
    }

    @Override // defpackage.m8
    public final z80<sd5> a(Object obj, z80<?> z80Var) {
        t65 t65Var = new t65(z80Var, this.B);
        t65Var.A = obj;
        return t65Var;
    }

    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        C0239D.H(obj);
        gk4 gk4Var = (gk4) this.A;
        v65 v65Var = this.B;
        v65Var.getClass();
        List listM = ps0.M(new r65(R.string.theme_chooser_system, Integer.valueOf(R.string.theme_chooser_system_description), l65.System, false), new r65(R.string.theme_chooser_dark, l65.Dark), new r65(R.string.theme_chooser_light, l65.Light));
        lKy3 lky3 = v65Var.a;
        lky3.getClass();
        kd.r(new r01(new QnHx(gk4Var, null), kd.s(Collections.singletonList(new s65(iE.b(lky3.j("THEME_PREF", null, new dKlF(lky3))), listM)))), gk4Var);
        return sd5.a;
    }

    @Override // defpackage.x81
    public final Object invoke(gk4<p65, Object, q65> gk4Var, z80<? super sd5> z80Var) {
        return ((t65) a(gk4Var, z80Var)).i(sd5.a);
    }
}
