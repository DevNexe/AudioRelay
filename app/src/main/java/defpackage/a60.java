package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class a60 implements c73 {
    public final i60 a;
    public final pq2 b;

    public static final class QnHx extends cx1 implements h81<qw> {
        public final /* synthetic */ e61 x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QnHx(e61 e61Var) {
            super(0);
            this.x = e61Var;
        }

        @Override // defpackage.h81
        public final qw invoke() {
            return a60.this.a.a(this.x, j54.c);
        }
    }

    public a60(i60 i60Var, pq2 pq2Var) {
        this.a = i60Var;
        this.b = pq2Var;
    }

    @Override // defpackage.c73
    public final qw b(e61 e61Var) {
        QnHx qnHx = new QnHx(e61Var);
        this.b.getClass();
        return pq2.i("Player:Connection", qnHx);
    }
}
