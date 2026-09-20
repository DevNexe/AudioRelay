package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class cw3 implements mz0<List<? extends qf4>> {
    public final /* synthetic */ mz0 w;

    public static final class QnHx<T> implements nz0 {
        public final /* synthetic */ nz0 w;

        /* JADX INFO: renamed from: cw3$QnHx$QnHx, reason: collision with other inner class name */
        @if0(c = "com.azefsw.audioconnect.server.ui.running.RunningAndroidServerInputHandler$getInitializationFlows$$inlined$map$2$2", f = "RunningAndroidServerInputHandler.kt", l = {224}, m = "emit")
        public static final class C0113QnHx extends b90 {
            public int A;
            public /* synthetic */ Object z;

            public C0113QnHx(z80 z80Var) {
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
            C0113QnHx c0113QnHx;
            if (z80Var instanceof C0113QnHx) {
                c0113QnHx = (C0113QnHx) z80Var;
                int i = c0113QnHx.A;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c0113QnHx.A = i - Integer.MIN_VALUE;
                } else {
                    c0113QnHx = new C0113QnHx(z80Var);
                }
            } else {
                c0113QnHx = new C0113QnHx(z80Var);
            }
            Object obj2 = c0113QnHx.z;
            va0 va0Var = va0.COROUTINE_SUSPENDED;
            int i2 = c0113QnHx.A;
            if (i2 == 0) {
                C0239D.H(obj2);
                List<no5> list = (List) obj;
                ArrayList arrayList = new ArrayList(mu.w0(list, 10));
                for (no5 no5Var : list) {
                    arrayList.add(new qf4(no5Var.a.getId(), no5Var.b.y0(), no5Var.a.n()));
                }
                c0113QnHx.A = 1;
                if (this.w.f(arrayList, c0113QnHx) == va0Var) {
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

    public cw3(am amVar) {
        this.w = amVar;
    }

    @Override // defpackage.mz0
    public final Object a(nz0<? super List<? extends qf4>> nz0Var, z80 z80Var) {
        Object objA = this.w.a(new QnHx(nz0Var), z80Var);
        return objA == va0.COROUTINE_SUSPENDED ? objA : sd5.a;
    }
}
