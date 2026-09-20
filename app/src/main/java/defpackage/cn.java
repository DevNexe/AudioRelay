package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes3.dex */
public final class cn extends iy {
    public static final /* synthetic */ AtomicIntegerFieldUpdater c = AtomicIntegerFieldUpdater.newUpdater(cn.class, "_resumed");
    private volatile /* synthetic */ int _resumed;

    public cn(z80<?> z80Var, Throwable th, boolean z) {
        if (th == null) {
            th = new CancellationException("Continuation " + z80Var + " was cancelled normally");
        }
        super(th, z);
        this._resumed = 0;
    }
}
