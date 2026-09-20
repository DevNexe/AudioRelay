package defpackage;

import android.database.ContentObserver;

/* JADX INFO: loaded from: classes3.dex */
public final class jw6 extends ContentObserver {
    public jw6() {
        super(null);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        lw6.d.set(true);
    }
}
