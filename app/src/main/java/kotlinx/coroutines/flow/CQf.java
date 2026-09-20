package kotlinx.coroutines.flow;

import defpackage.FWT;
import defpackage.kK;
import defpackage.roZB;
import defpackage.z2n;
import defpackage.z80;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes3.dex */
public final class CQf extends z2n<QnHx<?>> {
    public static final /* synthetic */ AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(CQf.class, Object.class, "_state");
    volatile /* synthetic */ Object _state = null;

    @Override // defpackage.z2n
    public final boolean a(roZB rozb) {
        if (this._state != null) {
            return false;
        }
        this._state = FWT.y;
        return true;
    }

    @Override // defpackage.z2n
    public final z80[] b(roZB rozb) {
        this._state = null;
        return kK.w;
    }
}
