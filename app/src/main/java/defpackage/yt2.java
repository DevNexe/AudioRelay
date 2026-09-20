package defpackage;

import io.ktor.client.network.sockets.SocketTimeoutException;
import java.io.Closeable;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
@if0(c = "io.ktor.client.engine.okhttp.OkHttpEngineKt$toChannel$1", f = "OkHttpEngine.kt", l = {165}, m = "invokeSuspend")
public final class yt2 extends px4 implements x81<uo5, z80<? super sd5>, Object> {
    public Closeable A;
    public la0 B;
    public jg1 C;
    public yh D;
    public hl3 E;
    public int F;
    public /* synthetic */ Object G;
    public final /* synthetic */ yh H;
    public final /* synthetic */ la0 I;
    public final /* synthetic */ jg1 J;

    public static final class QnHx extends cx1 implements j81<ByteBuffer, sd5> {
        public final /* synthetic */ hl3 w;
        public final /* synthetic */ yh x;
        public final /* synthetic */ jg1 y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QnHx(hl3 hl3Var, yh yhVar, jg1 jg1Var) {
            super(1);
            this.w = hl3Var;
            this.x = yhVar;
            this.y = jg1Var;
        }

        @Override // defpackage.j81
        public final sd5 invoke(ByteBuffer byteBuffer) throws SocketTimeoutException {
            try {
                this.w.w = this.x.read(byteBuffer);
                return sd5.a;
            } catch (Throwable th) {
                if (th instanceof java.net.SocketTimeoutException) {
                    throw X.b(this.y, th);
                }
                throw th;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yt2(yh yhVar, la0 la0Var, jg1 jg1Var, z80<? super yt2> z80Var) {
        super(2, z80Var);
        this.H = yhVar;
        this.I = la0Var;
        this.J = jg1Var;
    }

    @Override // defpackage.m8
    public final z80<sd5> a(Object obj, z80<?> z80Var) {
        yt2 yt2Var = new yt2(this.H, this.I, this.J, z80Var);
        yt2Var.G = obj;
        return yt2Var;
    }

    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        uo5 uo5Var;
        yh yhVar;
        Closeable closeable;
        hl3 hl3Var;
        la0 la0Var;
        jg1 jg1Var;
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i = this.F;
        if (i == 0) {
            C0239D.H(obj);
            uo5Var = (uo5) this.G;
            yhVar = this.H;
            try {
                hl3Var = new hl3();
                la0Var = this.I;
                jg1Var = this.J;
                closeable = yhVar;
            } catch (Throwable th) {
                th = th;
                closeable = yhVar;
                throw th;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            hl3Var = this.E;
            yhVar = this.D;
            jg1Var = this.C;
            la0Var = this.B;
            closeable = this.A;
            uo5Var = (uo5) this.G;
            try {
                C0239D.H(obj);
            } catch (Throwable th2) {
                th = th2;
                try {
                    throw th;
                } catch (Throwable th3) {
                    Th.d(closeable, th);
                    throw th3;
                }
            }
        }
        while (yhVar.isOpen() && AY.F(la0Var) && hl3Var.w >= 0) {
            oj ojVarL0 = uo5Var.l0();
            QnHx qnHx = new QnHx(hl3Var, yhVar, jg1Var);
            this.G = uo5Var;
            this.A = closeable;
            this.B = la0Var;
            this.C = jg1Var;
            this.D = yhVar;
            this.E = hl3Var;
            this.F = 1;
            if (ojVarL0.e(1, qnHx, this) == va0Var) {
                return va0Var;
            }
        }
        sd5 sd5Var = sd5.a;
        Th.d(closeable, null);
        return sd5.a;
    }

    @Override // defpackage.x81
    public final Object invoke(uo5 uo5Var, z80<? super sd5> z80Var) {
        return ((yt2) a(uo5Var, z80Var)).i(sd5.a);
    }
}
