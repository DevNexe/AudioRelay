package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class dw3 implements mz0<ev3.lPt3Fixed> {
    public final /* synthetic */ mz0 w;

    public static final class QnHx<T> implements nz0 {
        public final /* synthetic */ nz0 w;

        /* JADX INFO: renamed from: dw3$QnHx$QnHx, reason: collision with other inner class name */
        @if0(c = "com.azefsw.audioconnect.server.ui.running.RunningAndroidServerInputHandler$getInitializationFlows$$inlined$map$3$2", f = "RunningAndroidServerInputHandler.kt", l = {224}, m = "emit")
        public static final class C0118QnHx extends b90 {
            public int A;
            public /* synthetic */ Object z;

            public C0118QnHx(z80 z80Var) {
                super(z80Var);
            }

            @Override // defpackage.m8
            public final Object i(Object obj) {
                this.z = obj;
                this.A |= Integer.MIN_VALUE;
                return QnHx.this.f(null, this);
            }
        }

        public QnHx(nz0 nz0Var) {
            this.w = nz0Var;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.nz0
        public final Object f(Object obj, z80 z80Var) throws Throwable {
            C0118QnHx c0118QnHx;
            if (z80Var instanceof C0118QnHx) {
                c0118QnHx = (C0118QnHx) z80Var;
                int i = c0118QnHx.A;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c0118QnHx.A = i - Integer.MIN_VALUE;
                } else {
                    c0118QnHx = new C0118QnHx(z80Var);
                }
            } else {
                c0118QnHx = new C0118QnHx(z80Var);
            }
            Object obj2 = c0118QnHx.z;
            va0 va0Var = va0.COROUTINE_SUSPENDED;
            int i2 = c0118QnHx.A;
            if (i2 == 0) {
                C0239D.H(obj2);
                ev3.lPt3Fixed lpt3 = new ev3.lPt3Fixed((List) obj);
                c0118QnHx.A = 1;
                if (this.w.f(lpt3, c0118QnHx) == va0Var) {
                    return va0Var;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C0239D.H(obj2);
            }
            return sd5.a;
        }
    }

    public dw3(cw3 cw3Var) {
        this.w = cw3Var;
    }

    @Override // defpackage.mz0
    public final Object a(nz0<? super ev3.lPt3Fixed> nz0Var, z80 z80Var) {
        Object objA = this.w.a(new QnHx(nz0Var), z80Var);
        return objA == va0.COROUTINE_SUSPENDED ? objA : sd5.a;
    }
}
