package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class zo<T> extends oo<T> {
    public final Iterable<mz0<T>> z;

    @if0(c = "kotlinx.coroutines.flow.internal.ChannelLimitedFlowMerge$collectTo$2$1", f = "Merge.kt", l = {96}, m = "invokeSuspend")
    public static final class QnHx extends px4 implements x81<ua0, z80<? super sd5>, Object> {
        public int A;
        public final /* synthetic */ mz0<T> B;
        public final /* synthetic */ v94<T> C;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public QnHx(mz0<? extends T> mz0Var, v94<T> v94Var, z80<? super QnHx> z80Var) {
            super(2, z80Var);
            this.B = mz0Var;
            this.C = v94Var;
        }

        @Override // defpackage.m8
        public final z80<sd5> a(Object obj, z80<?> z80Var) {
            return new QnHx(this.B, this.C, z80Var);
        }

        @Override // defpackage.m8
        public final Object i(Object obj) throws Throwable {
            va0 va0Var = va0.COROUTINE_SUSPENDED;
            int i = this.A;
            if (i == 0) {
                C0239D.H(obj);
                this.A = 1;
                if (this.B.a(this.C, this) == va0Var) {
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
        public final Object invoke(ua0 ua0Var, z80<? super sd5> z80Var) {
            return ((QnHx) a(ua0Var, z80Var)).i(sd5.a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public zo(Iterable<? extends mz0<? extends T>> iterable, la0 la0Var, int i, lg lgVar) {
        super(la0Var, i, lgVar);
        this.z = iterable;
    }

    @Override // defpackage.oo
    public final Object h(te3<? super T> te3Var, z80<? super sd5> z80Var) {
        v94 v94Var = new v94(te3Var);
        Iterator<mz0<T>> it = this.z.iterator();
        while (it.hasNext()) {
            fp1.k0(te3Var, null, 0, new QnHx(it.next(), v94Var, null), 3);
        }
        return sd5.a;
    }

    @Override // defpackage.oo
    public final oo<T> i(la0 la0Var, int i, lg lgVar) {
        return new zo(this.z, la0Var, i, lgVar);
    }

    @Override // defpackage.oo
    public final nk3<T> k(ua0 ua0Var) {
        x81 noVar = new no(this, null);
        se3 se3Var = new se3(ma0.b(ua0Var, this.w), AY.a(this.x, lg.SUSPEND, 4));
        se3Var.W0(1, se3Var, noVar);
        return se3Var;
    }
}
