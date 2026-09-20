package androidx.media2.session;

import android.content.ComponentName;
import android.os.Bundle;
import android.support.v4.media.session.MediaSessionCompat;
import androidx.versionedparcelable.CustomVersionedParcelable;
import defpackage.uq2;

/* JADX INFO: loaded from: classes.dex */
final class SessionTokenImplLegacy extends CustomVersionedParcelable implements SessionToken.SessionTokenImpl {
    public MediaSessionCompat.Token a;
    public Bundle b;
    public int c;
    public int d;
    public ComponentName e;
    public String f;
    public Bundle g;

    public final boolean equals(Object obj) {
        if (!(obj instanceof SessionTokenImplLegacy)) {
            return false;
        }
        SessionTokenImplLegacy sessionTokenImplLegacy = (SessionTokenImplLegacy) obj;
        int i = this.d;
        if (i != sessionTokenImplLegacy.d) {
            return false;
        }
        if (i == 100) {
            return uq2.a(this.a, sessionTokenImplLegacy.a);
        }
        if (i != 101) {
            return false;
        }
        return uq2.a(this.e, sessionTokenImplLegacy.e);
    }

    public final int hashCode() {
        return uq2.b(Integer.valueOf(this.d), this.e, this.a);
    }

    public final String toString() {
        return "SessionToken {legacyToken=" + this.a + "}";
    }
}
