package androidx.media2.session;

import androidx.versionedparcelable.VersionedParcel;

/* JADX INFO: loaded from: classes.dex */
public final class SessionCommandParcelizer {
    public static SessionCommand read(VersionedParcel versionedParcel) {
        SessionCommand sessionCommand = new SessionCommand();
        sessionCommand.a = versionedParcel.o(sessionCommand.a, 1);
        sessionCommand.b = versionedParcel.u(2, sessionCommand.b);
        sessionCommand.c = versionedParcel.h(3, sessionCommand.c);
        return sessionCommand;
    }

    public static void write(SessionCommand sessionCommand, VersionedParcel versionedParcel) {
        versionedParcel.getClass();
        versionedParcel.I(sessionCommand.a, 1);
        versionedParcel.N(2, sessionCommand.b);
        versionedParcel.B(3, sessionCommand.c);
    }
}
