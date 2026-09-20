package androidx.media2.session;

import androidx.versionedparcelable.VersionedParcel;

/* JADX INFO: loaded from: classes.dex */
public final class ConnectionRequestParcelizer {
    public static ConnectionRequest read(VersionedParcel versionedParcel) {
        ConnectionRequest connectionRequest = new ConnectionRequest();
        connectionRequest.a = versionedParcel.o(connectionRequest.a, 0);
        connectionRequest.b = versionedParcel.u(1, connectionRequest.b);
        connectionRequest.c = versionedParcel.o(connectionRequest.c, 2);
        connectionRequest.d = versionedParcel.h(3, connectionRequest.d);
        return connectionRequest;
    }

    public static void write(ConnectionRequest connectionRequest, VersionedParcel versionedParcel) {
        versionedParcel.getClass();
        versionedParcel.I(connectionRequest.a, 0);
        versionedParcel.N(1, connectionRequest.b);
        versionedParcel.I(connectionRequest.c, 2);
        versionedParcel.B(3, connectionRequest.d);
    }
}
