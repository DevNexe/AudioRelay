package defpackage;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final class eb0 implements Callable<Void> {
    public final /* synthetic */ Runnable w;

    public eb0(ob0 ob0Var) {
        this.w = ob0Var;
    }

    @Override // java.util.concurrent.Callable
    public final Void call() {
        this.w.run();
        return null;
    }
}
