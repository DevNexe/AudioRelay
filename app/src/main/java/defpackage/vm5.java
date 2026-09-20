package defpackage;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
public final class vm5 extends ContentObserver {
    public final /* synthetic */ jo<sd5> a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vm5(NUlFixed nUl, Handler handler) {
        super(handler);
        this.a = nUl;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z, Uri uri) {
        this.a.H(sd5.a);
    }
}
