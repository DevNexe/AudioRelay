package defpackage;

import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class hm1 extends cx1 implements h81<n60> {
    public final /* synthetic */ em1 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hm1(em1 em1Var) {
        super(0);
        this.w = em1Var;
    }

    @Override // defpackage.h81
    public final n60 invoke() {
        em1 em1Var = this.w;
        Set setSingleton = Collections.singleton(new d63(em1Var.g()));
        aw0 aw0Var = em1Var.c;
        return new n60(setSingleton, aw0Var.e(), new pq2((es) aw0Var.f()), em1Var.a.b(), em1Var.m(), em1Var.a());
    }
}
