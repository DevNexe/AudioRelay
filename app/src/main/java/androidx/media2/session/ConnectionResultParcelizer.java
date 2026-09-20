package androidx.media2.session;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import androidx.media2.common.MediaItem;
import androidx.media2.common.MediaMetadata;
import androidx.media2.common.ParcelImplListSlice;
import androidx.media2.common.SessionPlayer$TrackInfo;
import androidx.media2.common.VideoSize;
import androidx.versionedparcelable.VersionedParcel;
import defpackage.nc2;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ConnectionResultParcelizer {
    public static ConnectionResult read(VersionedParcel versionedParcel) {
        IMediaSession proxy;
        ConnectionResult connectionResult = new ConnectionResult();
        connectionResult.a = versionedParcel.o(connectionResult.a, 0);
        IBinder iBinderV = connectionResult.c;
        if (versionedParcel.l(1)) {
            iBinderV = versionedParcel.v();
        }
        connectionResult.c = iBinderV;
        connectionResult.m = versionedParcel.o(connectionResult.m, 10);
        connectionResult.n = versionedParcel.o(connectionResult.n, 11);
        connectionResult.o = (ParcelImplListSlice) versionedParcel.s(connectionResult.o, 12);
        connectionResult.p = (SessionCommandGroup) versionedParcel.x(connectionResult.p, 13);
        connectionResult.q = versionedParcel.o(connectionResult.q, 14);
        connectionResult.r = versionedParcel.o(connectionResult.r, 15);
        connectionResult.s = versionedParcel.o(connectionResult.s, 16);
        connectionResult.t = versionedParcel.h(17, connectionResult.t);
        connectionResult.u = (VideoSize) versionedParcel.x(connectionResult.u, 18);
        List<SessionPlayer$TrackInfo> list = connectionResult.v;
        if (versionedParcel.l(19)) {
            list = (List) versionedParcel.k(new ArrayList());
        }
        connectionResult.v = list;
        connectionResult.d = (PendingIntent) versionedParcel.s(connectionResult.d, 2);
        connectionResult.w = (SessionPlayer$TrackInfo) versionedParcel.x(connectionResult.w, 20);
        connectionResult.x = (SessionPlayer$TrackInfo) versionedParcel.x(connectionResult.x, 21);
        connectionResult.y = (SessionPlayer$TrackInfo) versionedParcel.x(connectionResult.y, 23);
        connectionResult.z = (SessionPlayer$TrackInfo) versionedParcel.x(connectionResult.z, 24);
        connectionResult.A = (MediaMetadata) versionedParcel.x(connectionResult.A, 25);
        connectionResult.B = versionedParcel.o(connectionResult.B, 26);
        connectionResult.e = versionedParcel.o(connectionResult.e, 3);
        connectionResult.g = (MediaItem) versionedParcel.x(connectionResult.g, 4);
        connectionResult.h = versionedParcel.q(5, connectionResult.h);
        connectionResult.i = versionedParcel.q(6, connectionResult.i);
        float fM = connectionResult.j;
        if (versionedParcel.l(7)) {
            fM = versionedParcel.m();
        }
        connectionResult.j = fM;
        connectionResult.k = versionedParcel.q(8, connectionResult.k);
        connectionResult.l = (MediaController$PlaybackInfo) versionedParcel.x(connectionResult.l, 9);
        IBinder iBinder = connectionResult.c;
        int i = IMediaSession.Stub.w;
        if (iBinder == null) {
            proxy = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("androidx.media2.session.IMediaSession");
            proxy = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IMediaSession)) ? new IMediaSession.Stub.Proxy(iBinder) : (IMediaSession) iInterfaceQueryLocalInterface;
        }
        connectionResult.b = proxy;
        connectionResult.f = connectionResult.g;
        return connectionResult;
    }

    public static void write(ConnectionResult connectionResult, VersionedParcel versionedParcel) {
        versionedParcel.getClass();
        synchronized (connectionResult.b) {
            if (connectionResult.c == null) {
                connectionResult.c = (IBinder) connectionResult.b;
                connectionResult.g = nc2.a(connectionResult.f);
            }
        }
        versionedParcel.I(connectionResult.a, 0);
        IBinder iBinder = connectionResult.c;
        versionedParcel.y(1);
        versionedParcel.P(iBinder);
        versionedParcel.I(connectionResult.m, 10);
        versionedParcel.I(connectionResult.n, 11);
        versionedParcel.M(connectionResult.o, 12);
        versionedParcel.R(connectionResult.p, 13);
        versionedParcel.I(connectionResult.q, 14);
        versionedParcel.I(connectionResult.r, 15);
        versionedParcel.I(connectionResult.s, 16);
        versionedParcel.B(17, connectionResult.t);
        versionedParcel.R(connectionResult.u, 18);
        versionedParcel.F(19, connectionResult.v);
        versionedParcel.M(connectionResult.d, 2);
        versionedParcel.R(connectionResult.w, 20);
        versionedParcel.R(connectionResult.x, 21);
        versionedParcel.R(connectionResult.y, 23);
        versionedParcel.R(connectionResult.z, 24);
        versionedParcel.R(connectionResult.A, 25);
        versionedParcel.I(connectionResult.B, 26);
        versionedParcel.I(connectionResult.e, 3);
        versionedParcel.R(connectionResult.g, 4);
        versionedParcel.J(5, connectionResult.h);
        versionedParcel.J(6, connectionResult.i);
        float f = connectionResult.j;
        versionedParcel.y(7);
        versionedParcel.G(f);
        versionedParcel.J(8, connectionResult.k);
        versionedParcel.R(connectionResult.l, 9);
    }
}
