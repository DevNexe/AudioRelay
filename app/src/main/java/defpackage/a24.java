package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class a24 {
    public static final y81<nz0<Object>, Object, z80<? super sd5>, Object> a;

    public /* synthetic */ class QnHx extends l91 implements y81<nz0<? super Object>, Object, z80<? super sd5>, Object> {
        public static final QnHx F = new QnHx();

        public QnHx() {
            super(3, nz0.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // defpackage.y81
        public final Object invoke(nz0<? super Object> nz0Var, Object obj, z80<? super sd5> z80Var) {
            return nz0Var.f(obj, z80Var);
        }
    }

    static {
        QnHx qnHx = QnHx.F;
        sb5.d(3, qnHx);
        a = qnHx;
    }
}
