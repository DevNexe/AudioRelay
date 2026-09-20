package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class jf0<TSubject, TContext> extends k33<TSubject, TContext> {
    public int A;
    public final List<y81<k33<TSubject, TContext>, TSubject, z80<? super sd5>, Object>> x;
    public final la0 y;
    public TSubject z;

    @if0(c = "io.ktor.util.pipeline.DebugPipelineContext", f = "DebugPipelineContext.kt", l = {80}, m = "proceedLoop")
    public static final class QnHx extends b90 {
        public /* synthetic */ Object A;
        public final /* synthetic */ jf0<TSubject, TContext> B;
        public int C;
        public jf0 z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QnHx(jf0<TSubject, TContext> jf0Var, z80<? super QnHx> z80Var) {
            super(z80Var);
            this.B = jf0Var;
        }

        @Override // defpackage.m8
        public final Object i(Object obj) {
            this.A = obj;
            this.C |= Integer.MIN_VALUE;
            return this.B.h(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public jf0(TContext tcontext, List<? extends y81<? super k33<TSubject, TContext>, ? super TSubject, ? super z80<? super sd5>, ? extends Object>> list, TSubject tsubject, la0 la0Var) {
        super(tcontext);
        this.x = list;
        this.y = la0Var;
        this.z = tsubject;
    }

    @Override // defpackage.k33
    public final Object a(TSubject tsubject, z80<? super TSubject> z80Var) {
        this.A = 0;
        this.z = tsubject;
        return d(z80Var);
    }

    @Override // defpackage.k33
    public final TSubject c() {
        return this.z;
    }

    @Override // defpackage.k33
    public final Object d(z80<? super TSubject> z80Var) {
        int i = this.A;
        if (i < 0) {
            return this.z;
        }
        if (i < this.x.size()) {
            return h(z80Var);
        }
        this.A = -1;
        return this.z;
    }

    @Override // defpackage.k33
    public final Object e(TSubject tsubject, z80<? super TSubject> z80Var) {
        this.z = tsubject;
        return d(z80Var);
    }

    @Override // defpackage.ua0
    public final la0 g() {
        return this.y;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object h(z80<? super TSubject> z80Var) throws Throwable {
        QnHx qnHx;
        jf0<TSubject, TContext> jf0Var;
        y81<k33<TSubject, TContext>, TSubject, z80<? super sd5>, Object> y81Var;
        TSubject tsubject;
        if (z80Var instanceof QnHx) {
            qnHx = (QnHx) z80Var;
            int i = qnHx.C;
            if ((i & Integer.MIN_VALUE) != 0) {
                qnHx.C = i - Integer.MIN_VALUE;
            } else {
                qnHx = new QnHx(this, z80Var);
            }
        } else {
            qnHx = new QnHx(this, z80Var);
        }
        Object obj = qnHx.A;
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i2 = qnHx.C;
        if (i2 == 0) {
            C0239D.H(obj);
            jf0Var = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jf0Var = qnHx.z;
            C0239D.H(obj);
        }
        do {
            int i3 = jf0Var.A;
            if (i3 != -1) {
                List<y81<k33<TSubject, TContext>, TSubject, z80<? super sd5>, Object>> list = jf0Var.x;
                if (i3 >= list.size()) {
                    jf0Var.A = -1;
                } else {
                    y81Var = list.get(i3);
                    jf0Var.A = i3 + 1;
                    tsubject = jf0Var.z;
                    qnHx.z = jf0Var;
                    qnHx.C = 1;
                }
            }
            return jf0Var.z;
        } while (y81Var.invoke(jf0Var, tsubject, qnHx) != va0Var);
        return va0Var;
    }
}
