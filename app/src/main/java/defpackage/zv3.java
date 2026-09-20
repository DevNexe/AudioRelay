package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class zv3 implements mz0<ev3.RBi> {
    public final /* synthetic */ mz0 w;
    public final /* synthetic */ gx3 x;

    public static final class QnHx<T> implements nz0 {
        public final /* synthetic */ nz0 w;
        public final /* synthetic */ gx3 x;

        /* JADX INFO: renamed from: zv3$QnHx$QnHx, reason: collision with other inner class name */
        @if0(c = "com.azefsw.audioconnect.server.ui.running.RunningAndroidServerInputHandler$getInitializationFlows$$inlined$map$12$2", f = "RunningAndroidServerInputHandler.kt", l = {224}, m = "emit")
        public static final class C0237QnHx extends b90 {
            public int A;
            public /* synthetic */ Object z;

            public C0237QnHx(z80 z80Var) {
                super(z80Var);
            }

            @Override // defpackage.m8
            public final Object i(Object obj) {
                this.z = obj;
                this.A |= Integer.MIN_VALUE;
                return QnHx.this.f(null, this);
            }
        }

        public QnHx(nz0 nz0Var, gx3 gx3Var) {
            this.w = nz0Var;
            this.x = gx3Var;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.nz0
        public final Object f(Object obj, z80 z80Var) throws Throwable {
            C0237QnHx c0237QnHx;
            if (z80Var instanceof C0237QnHx) {
                c0237QnHx = (C0237QnHx) z80Var;
                int i = c0237QnHx.A;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c0237QnHx.A = i - Integer.MIN_VALUE;
                } else {
                    c0237QnHx = new C0237QnHx(z80Var);
                }
            } else {
                c0237QnHx = new C0237QnHx(z80Var);
            }
            Object obj2 = c0237QnHx.z;
            va0 va0Var = va0.COROUTINE_SUSPENDED;
            int i2 = c0237QnHx.A;
            if (i2 == 0) {
                C0239D.H(obj2);
                oe2 oe2Var = (oe2) obj;
                this.x.getClass();
                List<oe2> list = (List) oe2.c.getValue();
                ArrayList arrayList = new ArrayList(mu.w0(list, 10));
                for (oe2 oe2Var2 : list) {
                    boolean zA = ur1.a(oe2Var, oe2Var2);
                    pe2 pe2Var = hx3.c.get(oe2Var2);
                    arrayList.add(new qe2(oe2Var2, pe2Var.a, pe2Var.b, zA));
                }
                ev3.RBi rBi = new ev3.RBi(new re2(new kj1(arrayList)));
                c0237QnHx.A = 1;
                if (this.w.f(rBi, c0237QnHx) == va0Var) {
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

    public zv3(am amVar, gx3 gx3Var) {
        this.w = amVar;
        this.x = gx3Var;
    }

    @Override // defpackage.mz0
    public final Object a(nz0<? super ev3.RBi> nz0Var, z80 z80Var) {
        Object objA = this.w.a(new QnHx(nz0Var, this.x), z80Var);
        return objA == va0.COROUTINE_SUSPENDED ? objA : sd5.a;
    }
}
