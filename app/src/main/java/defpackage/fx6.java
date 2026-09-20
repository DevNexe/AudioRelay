package defpackage;

import android.database.ContentObserver;

/* JADX INFO: loaded from: classes3.dex */
public final class fx6 extends ContentObserver {
    public fx6() {
        super(null);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        ay6.h.incrementAndGet();
    }
}
