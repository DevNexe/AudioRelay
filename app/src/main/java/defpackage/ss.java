package defpackage;

import com.android.billingclient.api.CQf;
import com.android.billingclient.api.QnHx;
import java.io.Closeable;

/* JADX INFO: loaded from: classes.dex */
public final class ss implements Closeable {
    public final QnHx w;

    public ss(CQf cQf) {
        this.w = cQf;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.w.c();
    }
}
