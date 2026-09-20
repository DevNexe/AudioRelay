package defpackage;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "com.azefsw.audioconnect.server.ui.running.RunningAndroidServerInputHandler$stopServer$2", f = "RunningAndroidServerInputHandler.kt", l = {318}, m = "invokeSuspend")
public final class dx3 extends px4 implements x81<gk4<ev3, dv3, fv3>, z80<? super sd5>, Object> {
    public int A;
    public final /* synthetic */ gx3 B;

    @if0(c = "com.azefsw.audioconnect.server.ui.running.RunningAndroidServerInputHandler$stopServer$2$1", f = "RunningAndroidServerInputHandler.kt", l = {}, m = "invokeSuspend")
    public static final class QnHx extends px4 implements x81<ua0, z80<? super sd5>, Object> {
        public final /* synthetic */ gx3 A;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QnHx(gx3 gx3Var, z80<? super QnHx> z80Var) {
            super(2, z80Var);
            this.A = gx3Var;
        }

        @Override // defpackage.m8
        public final z80<sd5> a(Object obj, z80<?> z80Var) {
            return new QnHx(this.A, z80Var);
        }

        @Override // defpackage.m8
        public final Object i(Object obj) throws Throwable {
            C0239D.H(obj);
            this.A.a.a(gf4.F1.b);
            return sd5.a;
        }

        @Override // defpackage.x81
        public final Object invoke(ua0 ua0Var, z80<? super sd5> z80Var) {
            return ((QnHx) a(ua0Var, z80Var)).i(sd5.a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dx3(gx3 gx3Var, z80<? super dx3> z80Var) {
        super(2, z80Var);
        this.B = gx3Var;
    }

    @Override // defpackage.m8
    public final z80<sd5> a(Object obj, z80<?> z80Var) {
        return new dx3(this.B, z80Var);
    }

    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i = this.A;
        if (i == 0) {
            C0239D.H(obj);
            fh0 fh0Var = rl0.c;
            QnHx qnHx = new QnHx(this.B, null);
            this.A = 1;
            if (fp1.D0(fh0Var, qnHx, this) == va0Var) {
                return va0Var;
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
    public final Object invoke(gk4<ev3, dv3, fv3> gk4Var, z80<? super sd5> z80Var) {
        return ((dx3) a(gk4Var, z80Var)).i(sd5.a);
    }
}
