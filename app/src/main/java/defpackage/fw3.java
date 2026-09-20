package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class fw3 implements mz0<ev3.LPt6Fixed> {
    public final /* synthetic */ mz0 w;

    public static final class QnHx<T> implements nz0 {
        public final /* synthetic */ nz0 w;

        /* JADX INFO: renamed from: fw3$QnHx$QnHx, reason: collision with other inner class name */
        @if0(c = "com.azefsw.audioconnect.server.ui.running.RunningAndroidServerInputHandler$getInitializationFlows$$inlined$map$5$2", f = "RunningAndroidServerInputHandler.kt", l = {224}, m = "emit")
        public static final class C0130QnHx extends b90 {
            public int A;
            public /* synthetic */ Object z;

            public C0130QnHx(z80 z80Var) {
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

        /* JADX WARN: Code duplicated, block: B:19:0x0048  */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.nz0
        public final Object f(Object obj, z80 z80Var) throws Throwable {
            C0130QnHx c0130QnHx;
            boolean z;
            if (z80Var instanceof C0130QnHx) {
                c0130QnHx = (C0130QnHx) z80Var;
                int i = c0130QnHx.A;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c0130QnHx.A = i - Integer.MIN_VALUE;
                } else {
                    c0130QnHx = new C0130QnHx(z80Var);
                }
            } else {
                c0130QnHx = new C0130QnHx(z80Var);
            }
            Object obj2 = c0130QnHx.z;
            va0 va0Var = va0.COROUTINE_SUSPENDED;
            int i2 = c0130QnHx.A;
            if (i2 == 0) {
                C0239D.H(obj2);
                zk5 zk5Var = (zk5) obj;
                if (zk5Var.a) {
                    if (ur1.a(zk5Var.b, zk5.QnHx.C0234QnHx.a)) {
                        z = true;
                    } else {
                        z = false;
                    }
                } else {
                    z = false;
                }
                ev3.LPt6Fixed lPt6 = new ev3.LPt6Fixed(new dg2(zk5Var.c, z));
                c0130QnHx.A = 1;
                if (this.w.f(lPt6, c0130QnHx) == va0Var) {
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

    public fw3(u01 u01Var) {
        this.w = u01Var;
    }

    @Override // defpackage.mz0
    public final Object a(nz0<? super ev3.LPt6Fixed> nz0Var, z80 z80Var) {
        Object objA = this.w.a(new QnHx(nz0Var), z80Var);
        return objA == va0.COROUTINE_SUSPENDED ? objA : sd5.a;
    }
}
