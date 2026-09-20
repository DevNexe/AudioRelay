package defpackage;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final class pb0 implements Callable<Void> {
    public final /* synthetic */ String w;
    public final /* synthetic */ rb0 x;

    public pb0(rb0 rb0Var, String str) {
        this.x = rb0Var;
        this.w = str;
    }

    @Override // java.util.concurrent.Callable
    public final Void call() {
        rb0.a(this.x, this.w);
        return null;
    }
}
