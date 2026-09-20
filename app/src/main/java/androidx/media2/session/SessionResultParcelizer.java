package androidx.media2.session;

import androidx.media2.common.MediaItem;
import androidx.versionedparcelable.VersionedParcel;
import defpackage.nc2;

/* JADX INFO: loaded from: classes.dex */
public final class SessionResultParcelizer {
    public static SessionResult read(VersionedParcel versionedParcel) {
        SessionResult sessionResult = new SessionResult();
        sessionResult.a = versionedParcel.o(sessionResult.a, 1);
        sessionResult.b = versionedParcel.q(2, sessionResult.b);
        sessionResult.c = versionedParcel.h(3, sessionResult.c);
        MediaItem mediaItem = (MediaItem) versionedParcel.x(sessionResult.e, 4);
        sessionResult.e = mediaItem;
        sessionResult.d = mediaItem;
        return sessionResult;
    }

    public static void write(SessionResult sessionResult, VersionedParcel versionedParcel) {
        versionedParcel.getClass();
        MediaItem mediaItem = sessionResult.d;
        if (mediaItem != null) {
            synchronized (mediaItem) {
                if (sessionResult.e == null) {
                    sessionResult.e = nc2.a(sessionResult.d);
                }
            }
        }
        versionedParcel.I(sessionResult.a, 1);
        versionedParcel.J(2, sessionResult.b);
        versionedParcel.B(3, sessionResult.c);
        versionedParcel.R(sessionResult.e, 4);
    }
}
