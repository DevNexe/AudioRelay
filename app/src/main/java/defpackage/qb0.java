package defpackage;

import android.os.Bundle;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final class qb0 implements Callable<Void> {
    public final /* synthetic */ long w;
    public final /* synthetic */ rb0 x;

    public qb0(rb0 rb0Var, long j) {
        this.x = rb0Var;
        this.w = j;
    }

    @Override // java.util.concurrent.Callable
    public final Void call() {
        Bundle bundle = new Bundle();
        bundle.putInt("fatal", 1);
        bundle.putLong("timestamp", this.w);
        this.x.k.b(bundle);
        return null;
    }
}
