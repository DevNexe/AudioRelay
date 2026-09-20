package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class jl4<T> extends vk4<T> {
    public final T w;

    public jl4(T t) {
        this.w = t;
    }

    @Override // defpackage.vk4
    public final void i(ml4<? super T> ml4Var) {
        ml4Var.c(yr0.INSTANCE);
        ml4Var.onSuccess(this.w);
    }
}
