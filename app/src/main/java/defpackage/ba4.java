package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class ba4 extends fp1 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class CQf<T> extends cx1 implements h81<T> {
        public final /* synthetic */ T w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CQf(T t) {
            super(0);
            this.w = t;
        }

        @Override // defpackage.h81
        public final T invoke() {
            return this.w;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class QnHx<T> implements x94<T> {
        public final /* synthetic */ Iterator a;

        public QnHx(Iterator it) {
            this.a = it;
        }

        @Override // defpackage.x94
        public final Iterator<T> iterator() {
            return this.a;
        }
    }

    public static final <T> x94<T> F0(Iterator<? extends T> it) {
        QnHx qnHx = new QnHx(it);
        return qnHx instanceof v60 ? qnHx : new v60(qnHx);
    }

    public static final <T> x94<T> G0(T t, j81<? super T, ? extends T> j81Var) {
        return t == null ? gs0.a : new z91(new CQf(t), j81Var);
    }

    public static final <T> x94<T> H0(T... tArr) {
        boolean z = tArr.length == 0;
        gs0 gs0Var = gs0.a;
        if (z) {
            return gs0Var;
        }
        return tArr.length == 0 ? gs0Var : new HPnW(tArr);
    }
}
