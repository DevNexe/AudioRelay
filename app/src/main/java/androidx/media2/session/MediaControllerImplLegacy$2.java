package androidx.media2.session;

import android.os.Bundle;
import android.os.ResultReceiver;

/* JADX INFO: loaded from: classes.dex */
class MediaControllerImplLegacy$2 extends ResultReceiver {
    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i, Bundle bundle) {
        new SessionResult(i, bundle);
        throw null;
    }
}
