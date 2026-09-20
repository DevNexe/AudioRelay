package androidx.media2.session;

import android.content.ComponentName;
import android.os.Bundle;
import android.support.v4.media.session.MediaSessionCompat;
import androidx.versionedparcelable.VersionedParcel;
import defpackage.jz2;
import defpackage.li;
import defpackage.sh5;

/* JADX INFO: loaded from: classes.dex */
public final class SessionTokenImplLegacyParcelizer {
    /* JADX WARN: Code duplicated, block: B:7:0x0063  */
    public static SessionTokenImplLegacy read(VersionedParcel versionedParcel) {
        MediaSessionCompat.Token token;
        SessionTokenImplLegacy sessionTokenImplLegacy = new SessionTokenImplLegacy();
        sessionTokenImplLegacy.b = versionedParcel.h(1, sessionTokenImplLegacy.b);
        sessionTokenImplLegacy.c = versionedParcel.o(sessionTokenImplLegacy.c, 2);
        sessionTokenImplLegacy.d = versionedParcel.o(sessionTokenImplLegacy.d, 3);
        sessionTokenImplLegacy.e = (ComponentName) versionedParcel.s(sessionTokenImplLegacy.e, 4);
        sessionTokenImplLegacy.f = versionedParcel.u(5, sessionTokenImplLegacy.f);
        sessionTokenImplLegacy.g = versionedParcel.h(6, sessionTokenImplLegacy.g);
        Bundle bundle = sessionTokenImplLegacy.b;
        if (bundle == null) {
            token = null;
        } else {
            bundle.setClassLoader(MediaSessionCompat.Token.class.getClassLoader());
            android.support.v4.media.session.IMediaSession iMediaSessionK0 = android.support.v4.media.session.IMediaSession.Stub.K0(li.a(bundle, "android.support.v4.media.session.EXTRA_BINDER"));
            sh5 sh5VarB = jz2.b(bundle);
            MediaSessionCompat.Token token2 = (MediaSessionCompat.Token) bundle.getParcelable("android.support.v4.media.session.TOKEN");
            if (token2 == null) {
                token = null;
            } else {
                token = new MediaSessionCompat.Token(token2.x, iMediaSessionK0, sh5VarB);
            }
        }
        sessionTokenImplLegacy.a = token;
        return sessionTokenImplLegacy;
    }

    public static void write(SessionTokenImplLegacy sessionTokenImplLegacy, VersionedParcel versionedParcel) {
        sh5 sh5Var;
        versionedParcel.getClass();
        MediaSessionCompat.Token token = sessionTokenImplLegacy.a;
        if (token != null) {
            synchronized (token) {
                MediaSessionCompat.Token token2 = sessionTokenImplLegacy.a;
                synchronized (token2.w) {
                    sh5Var = token2.z;
                }
                MediaSessionCompat.Token token3 = sessionTokenImplLegacy.a;
                synchronized (token3.w) {
                    token3.z = null;
                }
                sessionTokenImplLegacy.b = sessionTokenImplLegacy.a.a();
                MediaSessionCompat.Token token4 = sessionTokenImplLegacy.a;
                synchronized (token4.w) {
                    token4.z = sh5Var;
                }
            }
        } else {
            sessionTokenImplLegacy.b = null;
        }
        versionedParcel.B(1, sessionTokenImplLegacy.b);
        versionedParcel.I(sessionTokenImplLegacy.c, 2);
        versionedParcel.I(sessionTokenImplLegacy.d, 3);
        versionedParcel.M(sessionTokenImplLegacy.e, 4);
        versionedParcel.N(5, sessionTokenImplLegacy.f);
        versionedParcel.B(6, sessionTokenImplLegacy.g);
    }
}
