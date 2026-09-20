package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class cm3 extends cx1 implements h81<Object> {
    public final /* synthetic */ is4<d34<Object, Object>> w;
    public final /* synthetic */ is4<Object> x;
    public final /* synthetic */ m24 y;

    public static final class QnHx implements g34 {
        public final /* synthetic */ m24 a;

        public QnHx(m24 m24Var) {
            this.a = m24Var;
        }

        @Override // defpackage.g34
        public final boolean a(Object obj) {
            return this.a.a(obj);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public cm3(is4<? extends d34<Object, Object>> is4Var, is4<Object> is4Var2, m24 m24Var) {
        super(0);
        this.w = is4Var;
        this.x = is4Var2;
        this.y = m24Var;
    }

    @Override // defpackage.h81
    public final Object invoke() {
        return this.w.getValue().b(new QnHx(this.y), this.x.getValue());
    }
}
