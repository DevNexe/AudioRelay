package androidx.media2.session;

import android.os.Bundle;
import android.os.SystemClock;
import androidx.media2.common.MediaItem;
import androidx.versionedparcelable.CustomVersionedParcelable;

/* JADX INFO: loaded from: classes.dex */
public class SessionResult extends CustomVersionedParcelable {
    public int a;
    public long b;
    public Bundle c;
    public MediaItem d;
    public MediaItem e;

    public SessionResult(int i, Bundle bundle) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.a = i;
        this.c = bundle;
        this.d = null;
        this.b = jElapsedRealtime;
    }

    public SessionResult() {
    }
}
