package androidx.media2.session;

import androidx.versionedparcelable.VersionedParcel;

/* JADX INFO: loaded from: classes.dex */
public final class SessionTokenParcelizer {
    public static SessionToken read(VersionedParcel versionedParcel) {
        SessionToken sessionToken = new SessionToken();
        sessionToken.a = (SessionToken.SessionTokenImpl) versionedParcel.x(sessionToken.a, 1);
        return sessionToken;
    }

    public static void write(SessionToken sessionToken, VersionedParcel versionedParcel) {
        versionedParcel.getClass();
        versionedParcel.R(sessionToken.a, 1);
    }
}
