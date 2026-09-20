package defpackage;

import java.lang.annotation.Annotation;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class qu1 implements rv1<pu1> {
    public static final qu1 a = new qu1();
    public static final QnHx b = QnHx.b;

    public static final class QnHx implements pa4 {
        public static final QnHx b = new QnHx();
        public static final String c = "pu1";
        public final /* synthetic */ u32 a = new u32(ii.serializer(pu4.a).a(), cu1.a.a());

        @Override // defpackage.pa4
        public final String a() {
            return c;
        }

        @Override // defpackage.pa4
        public final boolean c() {
            this.a.getClass();
            return false;
        }

        @Override // defpackage.pa4
        public final int d(String str) {
            return this.a.d(str);
        }

        @Override // defpackage.pa4
        public final xa4 e() {
            this.a.getClass();
            return uv4.F1.a;
        }

        @Override // defpackage.pa4
        public final int f() {
            return this.a.d;
        }

        @Override // defpackage.pa4
        public final String g(int i) {
            this.a.getClass();
            return String.valueOf(i);
        }

        @Override // defpackage.pa4
        public final List<Annotation> getAnnotations() {
            this.a.getClass();
            return cs0.w;
        }

        @Override // defpackage.pa4
        public final boolean h() {
            this.a.getClass();
            return false;
        }

        @Override // defpackage.pa4
        public final List<Annotation> i(int i) {
            this.a.i(i);
            return cs0.w;
        }

        @Override // defpackage.pa4
        public final pa4 j(int i) {
            return this.a.j(i);
        }

        @Override // defpackage.pa4
        public final boolean k(int i) {
            this.a.k(i);
            return false;
        }
    }

    @Override // defpackage.rv1, defpackage.db4, defpackage.zj0
    public final pa4 a() {
        return b;
    }

    @Override // defpackage.zj0
    public final Object c(pf0 pf0Var) {
        qe0.c(pf0Var);
        return new pu1(new v32(ii.serializer(pu4.a), cu1.a).c(pf0Var));
    }

    @Override // defpackage.db4
    public final void e(ls0 ls0Var, Object obj) {
        qe0.b(ls0Var);
        new v32(ii.serializer(pu4.a), cu1.a).e(ls0Var, (pu1) obj);
    }
}
