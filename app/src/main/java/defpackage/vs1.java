package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes3.dex */
public final class vs1 {
    private volatile /* synthetic */ Object _closeWaitJob;
    private volatile /* synthetic */ int closed;

    static {
        AtomicReferenceFieldUpdater.newUpdater(vs1.class, Object.class, "_closeWaitJob");
    }
}
