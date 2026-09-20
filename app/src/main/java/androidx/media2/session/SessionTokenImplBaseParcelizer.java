package androidx.media2.session;

import android.content.ComponentName;
import android.os.IBinder;
import androidx.versionedparcelable.VersionedParcel;

/* JADX INFO: loaded from: classes.dex */
public final class SessionTokenImplBaseParcelizer {
    public static SessionTokenImplBase read(VersionedParcel versionedParcel) {
        SessionTokenImplBase sessionTokenImplBase = new SessionTokenImplBase();
        sessionTokenImplBase.a = versionedParcel.o(sessionTokenImplBase.a, 1);
        sessionTokenImplBase.b = versionedParcel.o(sessionTokenImplBase.b, 2);
        sessionTokenImplBase.c = versionedParcel.u(3, sessionTokenImplBase.c);
        sessionTokenImplBase.d = versionedParcel.u(4, sessionTokenImplBase.d);
        IBinder iBinderV = sessionTokenImplBase.e;
        if (versionedParcel.l(5)) {
            iBinderV = versionedParcel.v();
        }
        sessionTokenImplBase.e = iBinderV;
        sessionTokenImplBase.f = (ComponentName) versionedParcel.s(sessionTokenImplBase.f, 6);
        sessionTokenImplBase.g = versionedParcel.h(7, sessionTokenImplBase.g);
        return sessionTokenImplBase;
    }

    public static void write(SessionTokenImplBase sessionTokenImplBase, VersionedParcel versionedParcel) {
        versionedParcel.getClass();
        versionedParcel.I(sessionTokenImplBase.a, 1);
        versionedParcel.I(sessionTokenImplBase.b, 2);
        versionedParcel.N(3, sessionTokenImplBase.c);
        versionedParcel.N(4, sessionTokenImplBase.d);
        IBinder iBinder = sessionTokenImplBase.e;
        versionedParcel.y(5);
        versionedParcel.P(iBinder);
        versionedParcel.M(sessionTokenImplBase.f, 6);
        versionedParcel.B(7, sessionTokenImplBase.g);
    }
}
