package defpackage;

import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class j40<T> implements kg4<T> {
    public final kg4<T> a;
    public final h81<Set<T>> b;

    /* JADX WARN: Multi-variable type inference failed */
    public j40(kg4<T> kg4Var, h81<? extends Set<? extends T>> h81Var) {
        this.a = kg4Var;
        this.b = h81Var;
    }

    @Override // defpackage.kg4
    public final Set<T> a() {
        return og4.c0(this.a.a(), this.b.invoke());
    }
}
