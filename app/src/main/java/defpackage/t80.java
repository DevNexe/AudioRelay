package defpackage;

import java.lang.annotation.Annotation;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class t80 implements pa4 {
    public final pa4 a;
    public final fv1<?> b;
    public final String c;

    public t80(ra4 ra4Var, fv1 fv1Var) {
        this.a = ra4Var;
        this.b = fv1Var;
        this.c = ra4Var.a + '<' + fv1Var.a() + '>';
    }

    @Override // defpackage.pa4
    public final String a() {
        return this.c;
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

    public final boolean equals(Object obj) {
        t80 t80Var = obj instanceof t80 ? (t80) obj : null;
        return t80Var != null && ur1.a(this.a, t80Var.a) && ur1.a(t80Var.b, this.b);
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

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
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

    public final String toString() {
        return "ContextDescriptor(kClass: " + this.b + ", original: " + this.a + ')';
    }
}
