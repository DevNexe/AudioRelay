package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class wk2 implements bm2 {
    public final rk2 a;

    @if0(c = "com.azefsw.audioconnect.ui.navigation.NavControllerNavigator$navigateTo$2", f = "NavControllerNavigator.kt", l = {}, m = "invokeSuspend")
    public static final class CQf extends px4 implements x81<ua0, z80<? super sd5>, Object> {
        public final /* synthetic */ ou3 B;
        public final /* synthetic */ j81<ul2, sd5> C;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public CQf(ou3 ou3Var, j81<? super ul2, sd5> j81Var, z80<? super CQf> z80Var) {
            super(2, z80Var);
            this.B = ou3Var;
            this.C = j81Var;
        }

        @Override // defpackage.m8
        public final z80<sd5> a(Object obj, z80<?> z80Var) {
            return wk2.this.new CQf(this.B, this.C, z80Var);
        }

        @Override // defpackage.m8
        public final Object i(Object obj) throws Throwable {
            C0239D.H(obj);
            rk2 rk2Var = wk2.this.a;
            if (rk2Var != null) {
                String str = this.B.a;
                dl2 dl2VarE = rk2Var.e();
                if (!ur1.a(dl2VarE != null ? dl2VarE.D : null, str)) {
                    rk2Var.i(str, new vk2(this.C));
                } else {
                    a62.a.l("Can't navigate to " + str);
                }
            }
            return sd5.a;
        }

        @Override // defpackage.x81
        public final Object invoke(ua0 ua0Var, z80<? super sd5> z80Var) {
            return ((CQf) a(ua0Var, z80Var)).i(sd5.a);
        }
    }

    @if0(c = "com.azefsw.audioconnect.ui.navigation.NavControllerNavigator$goBack$2", f = "NavControllerNavigator.kt", l = {}, m = "invokeSuspend")
    public static final class QnHx extends px4 implements x81<ua0, z80<? super Boolean>, Object> {
        public QnHx(z80<? super QnHx> z80Var) {
            super(2, z80Var);
        }

        @Override // defpackage.m8
        public final z80<sd5> a(Object obj, z80<?> z80Var) {
            return wk2.this.new QnHx(z80Var);
        }

        @Override // defpackage.m8
        public final Object i(Object obj) throws Throwable {
            C0239D.H(obj);
            return Boolean.valueOf(wk2.this.a.j());
        }

        @Override // defpackage.x81
        public final Object invoke(ua0 ua0Var, z80<? super Boolean> z80Var) {
            return ((QnHx) a(ua0Var, z80Var)).i(sd5.a);
        }
    }

    public wk2(il2 il2Var) {
        this.a = il2Var;
    }

    @Override // defpackage.bm2
    public final Object a(z80<? super sd5> z80Var) {
        qh0 qh0Var = rl0.a;
        Object objD0 = fp1.D0(n72.a, new QnHx(null), z80Var);
        return objD0 == va0.COROUTINE_SUSPENDED ? objD0 : sd5.a;
    }

    @Override // defpackage.bm2
    public final Object b(ou3 ou3Var, j81<? super ul2, sd5> j81Var, z80<? super sd5> z80Var) {
        qh0 qh0Var = rl0.a;
        Object objD0 = fp1.D0(n72.a, new CQf(ou3Var, j81Var, null), z80Var);
        return objD0 == va0.COROUTINE_SUSPENDED ? objD0 : sd5.a;
    }
}
