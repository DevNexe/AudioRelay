package defpackage;

import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class qa4 implements pa4, al {
    public final pa4 a;
    public final String b;
    public final Set<String> c;

    public qa4(pa4 pa4Var) {
        this.a = pa4Var;
        this.b = pa4Var.a() + '?';
        this.c = bx0.d(pa4Var);
    }

    @Override // defpackage.pa4
    public final String a() {
        return this.b;
    }

    @Override // defpackage.al
    public final Set<String> b() {
        return this.c;
    }

    @Override // defpackage.pa4
    public final boolean c() {
        return true;
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
        if (this == obj) {
            return true;
        }
        if (obj instanceof qa4) {
            return ur1.a(this.a, ((qa4) obj).a);
        }
        return false;
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
        return this.a.hashCode() * 31;
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
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append('?');
        return sb.toString();
    }
}
