package defpackage;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final class fb0 implements a90<Void, Object> {
    public final /* synthetic */ Callable w;

    public fb0(Callable callable) {
        this.w = callable;
    }

    @Override // defpackage.a90
    public final Object then(w05<Void> w05Var) {
        return this.w.call();
    }
}
