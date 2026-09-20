package defpackage;

import java.lang.annotation.Annotation;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ge3 implements pa4 {
    public final String a;
    public final ee3 b;

    public ge3(String str, ee3 ee3Var) {
        this.a = str;
        this.b = ee3Var;
    }

    @Override // defpackage.pa4
    public final String a() {
        return this.a;
    }

    @Override // defpackage.pa4
    public final boolean c() {
        return false;
    }

    @Override // defpackage.pa4
    public final int d(String str) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // defpackage.pa4
    public final xa4 e() {
        return this.b;
    }

    @Override // defpackage.pa4
    public final int f() {
        return 0;
    }

    @Override // defpackage.pa4
    public final String g(int i) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
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
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // defpackage.pa4
    public final pa4 j(int i) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // defpackage.pa4
    public final boolean k(int i) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    public final String toString() {
        return bl2.c(new StringBuilder("PrimitiveDescriptor("), this.a, ')');
    }
}
