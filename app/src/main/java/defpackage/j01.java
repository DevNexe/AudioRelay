package defpackage;

import kotlinx.coroutines.flow.internal.AbortFlowException;

/* JADX INFO: loaded from: classes3.dex */
public final class j01 implements nz0<Object> {
    public final /* synthetic */ jl3 w;

    public j01(jl3 jl3Var) {
        this.w = jl3Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.nz0
    public final Object f(Object obj, z80<? super sd5> z80Var) {
        this.w.w = obj;
        throw new AbortFlowException(this);
    }
}
