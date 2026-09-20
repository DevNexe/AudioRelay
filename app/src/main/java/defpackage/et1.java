package defpackage;

import java.lang.annotation.Annotation;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class et1 implements rv1<dt1> {
    public static final et1 a = new et1();
    public static final QnHx b = QnHx.b;

    public static final class QnHx implements pa4 {
        public static final QnHx b = new QnHx();
        public static final String c = "dt1";
        public final /* synthetic */ pa4 a = ii.a(cu1.a).c;

        @Override // defpackage.pa4
        public final String a() {
            return c;
        }

        @Override // defpackage.pa4
        public final boolean c() {
            return this.a.c();
        }

        @Override // defpackage.pa4
        public final int d(String str) {
            return this.a.d(str);
        }

        @Override // defpackage.pa4
        public final xa4 e() {
            return this.a.e();
        }

        @Override // defpackage.pa4
        public final int f() {
            return this.a.f();
        }

        @Override // defpackage.pa4
        public final String g(int i) {
            return this.a.g(i);
        }

        @Override // defpackage.pa4
        public final List<Annotation> getAnnotations() {
            return this.a.getAnnotations();
        }

        @Override // defpackage.pa4
        public final boolean h() {
            return this.a.h();
        }

        @Override // defpackage.pa4
        public final List<Annotation> i(int i) {
            return this.a.i(i);
        }

        @Override // defpackage.pa4
        public final pa4 j(int i) {
            return this.a.j(i);
        }

        @Override // defpackage.pa4
        public final boolean k(int i) {
            return this.a.k(i);
        }
    }

    @Override // defpackage.rv1, defpackage.db4, defpackage.zj0
    public final pa4 a() {
        return b;
    }

    @Override // defpackage.zj0
    public final Object c(pf0 pf0Var) {
        qe0.c(pf0Var);
        return new dt1((List) ii.a(cu1.a).c(pf0Var));
    }

    @Override // defpackage.db4
    public final void e(ls0 ls0Var, Object obj) {
        qe0.b(ls0Var);
        ii.a(cu1.a).e(ls0Var, (dt1) obj);
    }
}
