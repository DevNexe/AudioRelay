package defpackage;

/* JADX INFO: loaded from: classes.dex */
public interface h25 {

    public static final class QnHx implements h25 {
        public static final QnHx a = new QnHx();

        @Override // defpackage.h25
        public final long a() {
            int i = yu.i;
            return yu.h;
        }

        @Override // defpackage.h25
        public final /* synthetic */ h25 b(h25 h25Var) {
            return ry0.a(this, h25Var);
        }

        @Override // defpackage.h25
        public final h25 c(h81 h81Var) {
            return !ur1.a(this, a) ? this : (h25) h81Var.invoke();
        }

        @Override // defpackage.h25
        public final void d() {
        }
    }

    long a();

    h25 b(h25 h25Var);

    h25 c(h81<? extends h25> h81Var);

    void d();
}
