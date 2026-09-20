package defpackage;

import androidx.lifecycle.LPt6Fixed;

/* JADX INFO: loaded from: classes.dex */
public final class ie0<T> extends LPt6Fixed {

    public static final class QnHx implements LPt6Fixed.CQf {
        public final /* synthetic */ h81<T> a;

        /* JADX WARN: Multi-variable type inference failed */
        public QnHx(h81<? extends T> h81Var) {
            this.a = h81Var;
        }

        /* JADX WARN: Incorrect return type in method signature: <T:Ljj5;>(Ljava/lang/Class<TT;>;)TT; */
        @Override // androidx.lifecycle.LPt6Fixed.CQf
        public final jj5 a(Class cls) {
            return (jj5) this.a.invoke();
        }

        @Override // androidx.lifecycle.LPt6Fixed.CQf
        public final jj5 b(Class cls, bi2 bi2Var) {
            return a(cls);
        }
    }

    public ie0(mj5 mj5Var, h81<? extends T> h81Var) {
        super(mj5Var, new QnHx(h81Var));
    }
}
