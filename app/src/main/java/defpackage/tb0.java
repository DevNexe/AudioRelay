package defpackage;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final class tb0 implements Callable<w05<Void>> {
    public final /* synthetic */ rh4 w;
    public final /* synthetic */ vb0 x;

    public tb0(vb0 vb0Var, xg4 xg4Var) {
        this.x = vb0Var;
        this.w = xg4Var;
    }

    @Override // java.util.concurrent.Callable
    public final w05<Void> call() {
        return vb0.a(this.x, this.w);
    }
}
