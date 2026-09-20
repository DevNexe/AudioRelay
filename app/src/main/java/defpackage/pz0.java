package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class pz0 implements mz0<Object> {
    public final /* synthetic */ Iterable w;

    @if0(c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3", f = "Builders.kt", l = {115}, m = "collect")
    public static final class QnHx extends b90 {
        public int A;
        public nz0 C;
        public Iterator D;
        public /* synthetic */ Object z;

        public QnHx(z80 z80Var) {
            super(z80Var);
        }

        @Override // defpackage.m8
        public final Object i(Object obj) {
            this.z = obj;
            this.A |= Integer.MIN_VALUE;
            return pz0.this.a(null, this);
        }
    }

    public pz0(ArrayList arrayList) {
        this.w = arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.mz0
    public final Object a(nz0<? super Object> nz0Var, z80<? super sd5> z80Var) throws Throwable {
        QnHx qnHx;
        nz0 nz0Var2;
        Iterator it;
        if (z80Var instanceof QnHx) {
            qnHx = (QnHx) z80Var;
            int i = qnHx.A;
            if ((i & Integer.MIN_VALUE) != 0) {
                qnHx.A = i - Integer.MIN_VALUE;
            } else {
                qnHx = new QnHx(z80Var);
            }
        } else {
            qnHx = new QnHx(z80Var);
        }
        Object obj = qnHx.z;
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i2 = qnHx.A;
        if (i2 == 0) {
            C0239D.H(obj);
            nz0Var2 = nz0Var;
            it = this.w.iterator();
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = qnHx.D;
            nz0Var2 = qnHx.C;
            C0239D.H(obj);
        }
        while (it.hasNext()) {
            Object next = it.next();
            qnHx.C = nz0Var2;
            qnHx.D = it;
            qnHx.A = 1;
            if (nz0Var2.f(next, qnHx) == va0Var) {
                return va0Var;
            }
        }
        return sd5.a;
    }
}
