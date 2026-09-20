package defpackage;

import java.lang.annotation.Annotation;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class du1 implements pa4 {
    public final ry4 a;

    public du1(h81<? extends pa4> h81Var) {
        this.a = new ry4(h81Var);
    }

    @Override // defpackage.pa4
    public final String a() {
        return b().a();
    }

    public final pa4 b() {
        return (pa4) this.a.getValue();
    }

    @Override // defpackage.pa4
    public final boolean c() {
        return false;
    }

    @Override // defpackage.pa4
    public final int d(String str) {
        return b().d(str);
    }

    @Override // defpackage.pa4
    public final xa4 e() {
        return b().e();
    }

    @Override // defpackage.pa4
    public final int f() {
        return b().f();
    }

    @Override // defpackage.pa4
    public final String g(int i) {
        return b().g(i);
    }

    @Override // defpackage.pa4
    public final List<Annotation> getAnnotations() {
        return cs0.w;
    }

    @Override // defpackage.pa4
    public final boolean h() {
        return false;
    }

    @Override // defpackage.pa4
    public final List<Annotation> i(int i) {
        return b().i(i);
    }

    @Override // defpackage.pa4
    public final pa4 j(int i) {
        return b().j(i);
    }

    @Override // defpackage.pa4
    public final boolean k(int i) {
        return b().k(i);
    }
}
