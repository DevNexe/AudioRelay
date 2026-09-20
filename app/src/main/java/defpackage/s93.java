package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class s93<T> extends QX<T> {
    public final fv1<T> a;
    public final cs0 b = cs0.w;
    public final oz1 c = qLd.h(2, new QnHx(this));

    public static final class QnHx extends cx1 implements h81<pa4> {
        public final /* synthetic */ s93<T> w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QnHx(s93<T> s93Var) {
            super(0);
            this.w = s93Var;
        }

        @Override // defpackage.h81
        public final pa4 invoke() {
            s93<T> s93Var = this.w;
            return new t80(FWT.r("p93", q93.QnHx.a, new pa4[0], new r93(s93Var)), s93Var.a);
        }
    }

    public s93(fv1<T> fv1Var) {
        this.a = fv1Var;
    }

    @Override // defpackage.rv1, defpackage.db4, defpackage.zj0
    public final pa4 a() {
        return (pa4) this.c.getValue();
    }

    @Override // defpackage.QX
    public final fv1<T> h() {
        return this.a;
    }

    public final String toString() {
        return "kotlinx.serialization.PolymorphicSerializer(baseClass: " + this.a + ')';
    }
}
