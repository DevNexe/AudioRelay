package androidx.media2.session;

import androidx.versionedparcelable.VersionedParcel;
import defpackage.Q6g;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class SessionCommandGroupParcelizer {
    public static SessionCommandGroup read(VersionedParcel versionedParcel) {
        SessionCommandGroup sessionCommandGroup = new SessionCommandGroup();
        Set<SessionCommand> set = sessionCommandGroup.a;
        if (versionedParcel.l(1)) {
            set = (Set) versionedParcel.k(new Q6g());
        }
        sessionCommandGroup.a = set;
        return sessionCommandGroup;
    }

    public static void write(SessionCommandGroup sessionCommandGroup, VersionedParcel versionedParcel) {
        versionedParcel.getClass();
        versionedParcel.F(1, sessionCommandGroup.a);
    }
}
